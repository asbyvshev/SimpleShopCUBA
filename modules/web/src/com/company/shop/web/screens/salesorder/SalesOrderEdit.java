package com.company.shop.web.screens.salesorder;

import com.company.shop.entity.OrderPosition;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.SalesOrder;

import javax.inject.Inject;

@UiController("shop_SalesOrder.edit")
@UiDescriptor("sales-order-edit.xml")
@EditedEntityContainer("salesOrderDc")
public class SalesOrderEdit extends StandardEditor<SalesOrder> {
    @Inject
    private CollectionLoader<OrderPosition> orderPositionsDl;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        orderPositionsDl.setParameter("salesOrder", getEditedEntity());
        getScreenData().loadAll();
    }
}