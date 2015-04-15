DROP TABLE IF EXISTS employee CASCADE;


DROP TABLE IF EXISTS leaders CASCADE;


DROP TABLE IF EXISTS managers CASCADE;


DROP TABLE IF EXISTS surveys CASCADE;


CREATE TABLE employee ( id serial NOT NULL, fullname varchar(128) NOT NULL, team int4 NOT NULL, PRIMARY KEY (id));


CREATE TABLE leaders ( id serial NOT NULL, email varchar(256) NOT NULL, fullname varchar(128) NOT NULL, team int4 NOT NULL, PRIMARY KEY (id));


CREATE TABLE managers ( id serial NOT NULL, email varchar(256) NOT NULL, fullname varchar(128) NOT NULL, PRIMARY KEY (id));


CREATE TABLE surveys ( id serial NOT NULL, createDate date, description varchar(128) NOT NULL, employee_id int4 NOT NULL, s1 char(1) NOT NULL, s2 char(1), s3 char(1), PRIMARY KEY (id));


INSERT INTO leaders(email, fullname, team)
VALUES('le.dong@mulodo.com', 'Dong Le', 1),
		('tran.nha@mulodo.com', 'Nha Tran', 2),
		('dang.huy@mulodo.com', 'Huy Dang', 3);


INSERT INTO managers(email, fullname)
VALUES('le.tri@mulodo.com', 'Tri Le'),
		('vo.quang@mulodo.com', 'Quang Vo');


INSERT INTO employee(fullname,team)
VALUES('AAAAA', 1),
		('BBBB', 2),
		('CCCC', 1),
		('DDDD', 2),
		('cccb', 3),
		('rrrt', 3),
		('bdbd', 3);