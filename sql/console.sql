create database mvc;
use mvc;

create table account(
    id int primary key auto_increment,
    actno varchar(20) not null default '',
    balance decimal(10,2) not null default 0
);

insert into account values(null,'act001', 50000)
,(null,'act002', 0);

create user 'mvc'@'%' identified by '123456';
grant all on mvc.*  to 'mvc'@'%';

