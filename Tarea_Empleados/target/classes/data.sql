DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario int,
    PRIMARY KEY(id)
);

insert into empleado (trabajo, nombre,salario)values('Director','Antonio',0);
insert into empleado (trabajo, nombre,salario)values('Pintor','Isaac',0);
insert into empleado (trabajo, nombre,salario)values('Informatico','Carlos',0);
insert into empleado (trabajo, nombre,salario)values('Secretario','Juan',0);
insert into empleado (trabajo, nombre,salario)values('Director','Joel',0);