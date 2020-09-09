package com.company.shop.web.screens.salesorder;

import com.company.shop.entity.OrderPosition;
import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.SalesOrder;

import javax.inject.Inject;

@UiController("shop_SalesOrder.browse")
@UiDescriptor("sales-order-browse.xml")
@LookupComponent("salesOrdersTable")
public class SalesOrderBrowse extends StandardLookup<SalesOrder> {
    @Inject
    private CollectionLoader<OrderPosition> orderPositionsDl;
}
