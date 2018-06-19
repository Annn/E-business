# --- !Ups

create table "category" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null
);

create table "product" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null,
  "description" text not null,
  "category" int not null,
  foreign key(category) references category(id)
);

create table "user" (
  "id" integer not null primary key autoincrement,
  "fullName" varchar not null
);

create table "cart" (
  "id" integer not null primary key autoincrement,
  "user" integer not null,
  foreign key(user) references User(id)
);

create table "productcart" (
  "id" integer not null primary key autoincrement,
  "cart" integer not null,
  "product" integer not null,
  "number" integer not null,
  foreign key(cart) references Cart(id),
  foreign key(product) references product(id)
);

create table "opinion" (
  "id" integer not null primary key autoincrement,
  "product" integer not null,
  "opin" text not null,
  foreign key(product) references product(id)
);

create table "order" (
  "id" integer not null primary key autoincrement,
  "cart" integer not null,
  "order_date" varchar not null,
  "address" varchar not null,
  "cost" float not null,
  foreign key(cart) references cart(id)
);



# --- !Downs
drop table if exists "product" ;
drop table if exists "category" ;
drop table if exists "user" ;
drop table if exists "cart" ;
drop table if exists "productcart" ;
drop table if exists "product" ;
drop table if exists "opinion" ;


-- drop table "product" if exists;
-- drop table "category" if exists;
-- drop table "user" if exists;
-- drop table "cart" if exists;
-- drop table "productcart" if exists;
-- drop table "order" if exists;
-- drop table "opinion" if exists;
