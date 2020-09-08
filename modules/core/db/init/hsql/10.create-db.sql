-- begin SHOP_PRODUCT
create table SHOP_PRODUCT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    PRICE decimal(19, 2),
    --
    primary key (ID)
)^
-- end SHOP_PRODUCT
-- begin SHOP_SALES_ORDER
create table SHOP_SALES_ORDER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ORDER_NUMBER integer,
    CUSTOMER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end SHOP_SALES_ORDER
-- begin SHOP_CUSTOMER
create table SHOP_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255),
    LAST_NAME varchar(255),
    MIDDLE_NAME varchar(255),
    PHONE varchar(255),
    EMAIL varchar(255),
    DISCOUNT integer,
    --
    primary key (ID)
)^
-- end SHOP_CUSTOMER
-- begin SHOP_ORDER_POSITION
create table SHOP_ORDER_POSITION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_ID varchar(36) not null,
    QUANTITY integer,
    SALES_ORDER_ID varchar(36),
    --
    primary key (ID)
)^
-- end SHOP_ORDER_POSITION
