package com.company.shop.entity;

import com.haulmont.chile.core.annotations.MetaProperty;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Set;

@Table(name = "SHOP_SALES_ORDER")
@Entity(name = "shop_SalesOrder")
@NamePattern("%s|orderNumber")
public class SalesOrder extends StandardEntity {
    private static final long serialVersionUID = -1294918133430942049L;

    @Column(name = "ORDER_NUMBER")
    private Integer orderNumber;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @OneToMany(mappedBy = "salesOrder")
    private Set<OrderPosition> positions;

    public Set<OrderPosition> getPositions() {
        return positions;
    }

    public void setPositions(Set<OrderPosition> positions) {
        this.positions = positions;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Transient
    @MetaProperty(related = {"positions"})
    public BigDecimal getTotalCost(){
        BigDecimal totalCost = BigDecimal.ZERO;
        BigDecimal itemCost  = BigDecimal.ZERO;
        if (positions == null){
            return totalCost;
        }
        for (OrderPosition position : positions){
            itemCost = position.getProduct().getPrice().multiply(new BigDecimal(position.getQuantity()));
            totalCost = totalCost.add(itemCost);
        }
        return totalCost;
    }
}