package com.company.shop.web.screens.salesorder;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.SalesOrder;

@UiController("shop_SalesOrder.edit")
@UiDescriptor("sales-order-edit.xml")
@EditedEntityContainer("salesOrderDc")
@LoadDataBeforeShow
public class SalesOrderEdit extends StandardEditor<SalesOrder> {
}