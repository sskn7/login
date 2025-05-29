set names utf8;
set foreign_key_checks = 0;

//もしデータベースがあれば削除する
drop database if exists logindb_yamada;
create database logindb_yamada;
use logindb_yamada;

//新たにデータベースを作る
create table user (
id int,
user_name varcher(255),
password varcher(255)
);

//作成したデータベースに移動する
insert into user values
(1,"taro","123"),
(2,"jiro","123"),
(3,"hanako","123"),
(4,"saburo","123");