create table reader(
    id serial primary key,
    username varchar(20) unique not null,
    password varchar(25) not null,
    fullname varchar (50) not null
);
create table book(
    id serial primary key,
    author varchar (50) not null,
    description varchar (1000) not null,
    isbn varchar (50) not null
);

insert reader(username,password,fullname) value ('希斯莱斯','xisilaisi','克里斯.希斯莱斯');