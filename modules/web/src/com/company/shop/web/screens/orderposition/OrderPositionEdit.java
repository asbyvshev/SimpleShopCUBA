package com.company.shop.web.screens.orderposition;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.OrderPosition;

@UiController("shop_OrderPosition.edit")
@UiDescriptor("order-position-edit.xml")
@EditedEntityContainer("orderPositionDc")
@LoadDataBeforeShow
public class OrderPositionEdit extends StandardEditor<OrderPosition> {
}