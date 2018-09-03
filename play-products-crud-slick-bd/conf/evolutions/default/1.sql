# --- !Ups

create table "category" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null
);

create table "product" (
  "id" integer not null primary key autoincrement,
  "name" varchar not null,
  "price" int not null,
  "description" text not null,
  "category" int not null,
  foreign key(category) references category(id)
);

create table "user" (
  "id" integer not null primary key autoincrement,
  "fullName" varchar not null
);

create table "ordered_product" (
  "id" integer not null primary key autoincrement,
  "product" integer not null,
  "number" integer not null,
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
  "ordered_product_id" integer not null,
--   "user_id" integer not null,
  "order_date" varchar not null,
  "address" varchar not null,
  "cost" integer not null,
  foreign key(ordered_product_id) references ordered_product(id)
--   foreign key(user_id) references user(id)
);



# --- !Downs
drop table if exists main."product" ;
drop table if exists main."category" ;
drop table if exists main."user" ;
drop table if exists main.ordered_product ;
drop table if exists main."product" ;
drop table if exists main."opinion" ;
drop table if exists main."order" ;


-- drop table "product" if exists;
-- drop table "category" if exists;
-- drop table "user" if exists;
-- drop table "cart" if exists;
-- drop table "productcart" if exists;
-- drop table "order" if exists;
-- drop table "opinion" if exists;
