create table if not exists sys_user(
 id  char(15) not null,
 username varchar(20) not null ,
 password varchar (20) not null,
 emai  varchar (20) not null,
 phonenumber varchar(20) not null ,
 loginstate tinyint(1) default null,
 createtime datetime  not null,

 primary key (id),
 unique key username (username)

);

