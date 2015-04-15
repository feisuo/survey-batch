drop table if exists employee cascade

drop table if exists leaders cascade

drop table if exists managers cascade

drop table if exists surveys cascade

create table employee (
    id  serial not null,
    fullname varchar(128) not null,
    team int4 not null,
    primary key (id)
)

create table leaders (
    id  serial not null,
    email varchar(256) not null,
    fullname varchar(128) not null,
    team int4 not null,
    primary key (id)
)

create table managers (
    id  serial not null,
    email varchar(256) not null,
    fullname varchar(128) not null,
    primary key (id)
)

create table surveys (
    id  serial not null,
    createDate date,
    description varchar(128) not null,
    employee_id int4 not null,
    s1 char(1) not null,
    s2 char(1),
    s3 char(1),
    primary key (id)
)