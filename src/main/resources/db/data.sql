insert into PRODUCT (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_QUANTITY) values ('MacBook Pro', '900000', '10');
insert into PRODUCT (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_QUANTITY) values ('IPhone 12', '200000', '8');
insert into PRODUCT (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_QUANTITY) values ('IPad Pro', '4500000', '3');
insert into PRODUCT (PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_QUANTITY) values ('Apple Watch', '160000', '7');

insert into CLIENT (NAME, PRODUCT_ID, EMAIL) values ('Bob', '1', 'bob@gmail.com');
insert into CLIENT (NAME, PRODUCT_ID, EMAIL) values ('Sara', '3', 'sara@gmail.com');
insert into CLIENT (NAME, PRODUCT_ID, EMAIL) values ('Anna', '2', 'anna@gmail.com');
insert into CLIENT (NAME, PRODUCT_ID, EMAIL) values ('Tim', '1', 'tim@gmail.com');

insert into SERVICE (TASK, PRODUCT_NAME, CLIENT_NAME, COST) VALUES ('Repair MacBook Pro Screen', 'MacBook Pro', 'Bob', 20000);
insert into SERVICE (TASK, PRODUCT_NAME, CLIENT_NAME, COST) VALUES ('Install necessary software', 'Apple Watch', 'Sam', 10000);
insert into SERVICE (TASK, PRODUCT_NAME, CLIENT_NAME, COST) VALUES ('Update settings','IPhone 10', 'Peter', 15000);
insert into SERVICE (TASK, PRODUCT_NAME, CLIENT_NAME, COST) VALUES ('Change the battery', 'MacBook Pro', 'Anna', 20000);


