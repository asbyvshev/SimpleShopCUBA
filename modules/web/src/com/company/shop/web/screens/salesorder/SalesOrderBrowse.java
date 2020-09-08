package com.company.shop.web.screens.salesorder;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.SalesOrder;

@UiController("shop_SalesOrder.browse")
@UiDescriptor("sales-order-browse.xml")
@LookupComponent("salesOrdersTable")
@LoadDataBeforeShow
public class SalesOrderBrowse extends StandardLookup<SalesOrder> {
}