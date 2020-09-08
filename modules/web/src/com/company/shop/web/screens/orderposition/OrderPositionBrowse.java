package com.company.shop.web.screens.orderposition;

import com.haulmont.cuba.gui.screen.*;
import com.company.shop.entity.OrderPosition;

@UiController("shop_OrderPosition.browse")
@UiDescriptor("order-position-browse.xml")
@LookupComponent("orderPositionsTable")
@LoadDataBeforeShow
public class OrderPositionBrowse extends StandardLookup<OrderPosition> {
}