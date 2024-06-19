DROP DATABASE IF EXISTS proyecto;

CREATE DATABASE IF NOT EXISTS proyecto;
USE proyecto;
SHOW TABLES;
-- CREATE table empleado111(id_empleado int primary key, dni char(9) not null UNIQUE key, numero_ss char(12) UNIQUE KEY, email VARCHAR, nombre_via varchar not NULL   );
-- CREATE table empleado111(id_empleado int primary key, dni char(9) not null UNIQUE, numero_ss char(12) UNIQUE not null, email VARCHAR not null, nombre_via varchar not NULL);

CREATE table empleado111(id_empleado int primary key, dni char(9) not null UNIQUE, numero_ss char(12) UNIQUE, email VARCHAR(50), nombre_via varchar(20) not NULL);

alter TABLE empleado111 add localidad varchar(50);
DESCRIBE empleado111;
alter table empleado111 MODIFY email VARCHAR(50) not NULL;
alter table empleado111 MODIFY numero_ss char(12) UNIQUE not NULL;
-- alter table empleado111 MODIFY  localidad varchar(50) not NULL;
create table empleado112(localidad varchar(50) primary key, provincia varchar(20) not null);
SHOW TABLES;
DESC empleado112;
CREATE table empleado12(dni varchar(9) primary key, nombre varchar(50) not null, apellido1 varchar(50) not null, apellido2 varchar(50));
create table empleado2(telefono int(9), id_empleado int, PRIMARY key(telefono, id_empleado));
CREATE Table tecnico(id_empleado int PRIMARY key, departamento varchar(20) not null);
CREATE Table atencion_cliente(id_empleado int PRIMARY key, turnop_trabajo varchar(20) not null);
CREATE Table transportista(id_empleado int PRIMARY key, area varchar(20) not null);
CREATE table reparacion(id_reparacion int PRIMARY key, descripcion_reparacion varchar(200) NULL, fecha_inicio DATETIME not null, fecha_final DATETIME not NULL, id_empleado int);
create table tarea(id_tarea int, id_reparacion int, descripcion_tarea varchar(500) not NULL, PRIMARY key(id_tarea,id_reparacion));
create table producto(id_producto int PRIMARY key, nombre VARCHAR(50) not NULL, descripcion varchar(500) NOT null, id_empleado int);
CREATE table cliente11(id_cliente int PRIMARY key, tipo_via varchar(15) not null, nombre_via varchar(50) not null, poblacion varchar(40) references poblacion, email varchar(40) not null, id_producto int references id_producto, dni varchar(9), telefono int(9));
create table cliente12(poblacion varchar(40) PRIMARY key, provincia varchar(40) not null);

create table cliente2(dni char(9) PRIMARY key, nombre varchar(50) not null, apellido1 varchar(50) not null, apellido2 varchar(50));
create table pieza1(nombre varchar(50) primary key, tipo varchar(50) not null);
create Table pieza2(id_pieza int primary key, codigo_barras varchar(30) not null, nombre varchar(150) not null, precio DECIMAL(6,2) not null);
create table proveedor(id_proveedor int primary key, cif char(9), calificacion int, nombre varchar(50) not null );
create Table adquiere(id_pieza int, id_empleado int, primary key(id_pieza,id_empleado));
create table consulta(id_cliente int, id_empleado int, primary key(id_cliente,id_empleado));
CREATE table utiliza(id_pieza int, id_tarea int, primary key(id_pieza,id_tarea));
create table compradas(id_pieza int, id_proveedor int, primary key(id_pieza,id_proveedor));
show TABLES;
alter table empleado111 add CONSTRAINT foreign key(dni) references empleado12(dni);
alter table empleado111 add CONSTRAINT foreign key(localidad) references empleado112(localidad);
alter table tecnico add CONSTRAINT foreign key(id_empleado) references empleado111(id_empleado);
alter table atencion_cliente add CONSTRAINT foreign key(id_empleado) references empleado111(id_empleado);
alter table transportista add CONSTRAINT foreign key(id_empleado) references empleado111(id_empleado);
desc table transportista;
alter table compradas add CONSTRAINT foreign key(id_pieza) references pieza2(id_pieza);
alter table compradas add CONSTRAINT foreign key(id_proveedor) references proveedor(id_proveedor);
drop table pieza1;
create table pieza1(nombre varchar(150) PRIMARY key, tipo varchar(50) not null, descripcion varchar(500) not null);
desc pieza2;
desc adquiere;
alter table pieza2 add constraint FOREIGN key(nombre) REFERENCES pieza1(nombre);
alter table adquiere add CONSTRAINT foreign key(id_pieza) references pieza2(id_pieza);
alter table adquiere add CONSTRAINT foreign key(id_empleado) references tecnico(id_empleado);
alter table utiliza add CONSTRAINT foreign key(id_pieza) references pieza2(id_pieza);
desc utiliza;
alter table empleado2 add CONSTRAINT foreign key(id_empleado) references empleado111(id_empleado);
alter TABLE utiliza add CONSTRAINT FOREIGN KEY(id_pieza) REFERENCES pieza2(id_pieza);
alter TABLE utiliza add CONSTRAINT FOREIGN KEY(id_tarea) REFERENCES tarea(id_tarea);
DESCRIBE reparacion;
alter TABLE reparacion add CONSTRAINT FOREIGN KEY(id_empleado) REFERENCES empleado111(id_empleado);
alter TABLE reparacion modify descripcion_reparacion varchar(500) not null;
alter table producto add constraint foreign key(id_empleado) references empleado111(id_empleado);
alter table cliente11 add CONSTRAINT FOREIGN KEY(dni) REFERENCES cliente2(dni);

INSERT INTO empleado112 VALUES("Aldaia", "Valencia");
INSERT INTO empleado112 VALUES("Villarreal", "Valencia");
INSERT INTO empleado112 VALUES("Castellon", "Castellon");
INSERT INTO empleado112 VALUES("Teruel", "Teruel");
INSERT INTO empleado112 VALUES("Valencia", "Valencia");
INSERT INTO empleado112 VALUES("Alicante", "Alicante");
INSERT INTO empleado112 VALUES("Albacete", "Albacete");

INSERT INTO empleado12 VALUES("11111111A", "Mariano", "Rajoy", "Brey");
INSERT INTO empleado12 VALUES("22222222B", "Pedro", "Sanchez", "Perez");
INSERT INTO empleado12 VALUES("33333333C", "Pablo", "Iglesias", "Turion");
INSERT INTO empleado12 VALUES("44444444D", "Albert", "Rivera", "Diaz");
INSERT INTO empleado12 VALUES("55555555E", "Santiago", "Abascal", "Conde");
INSERT INTO empleado12 VALUES("66666666F", "Pablo", "Casado", "Blanco");
INSERT INTO empleado12 VALUES("77777777G", "Inigo", "Errejon", "Galvan");
INSERT INTO empleado12 VALUES("88888888H", "Pablo", "Motos", "Motos");
INSERT INTO empleado12 VALUES("99999999I", "Jorge", "Javier", "Vazquez");
INSERT INTO empleado12 VALUES("10101010J", "Isabel", "Diaz", "Ayuso");

INSERT INTO empleado111 VALUES(1, "11111111A", "123123123123", "empleado1@mail.com", "Plaza", "Aldaia");
INSERT INTO empleado111 VALUES(2, "22222222B", "456456456456", "empleado2@mail.com", "Calle", "Valencia");
INSERT INTO empleado111 VALUES(3, "33333333C", "789789789789", "empleado3@mail.com", "Plazuela", "Villarreal");
INSERT INTO empleado111 VALUES(4, "44444444D", "012012012012", "empleado4@mail.com", "Callejon", "Castellon");
INSERT INTO empleado111 VALUES(5, "55555555E", "345345345345", "empleado5@mail.com", "Callejon", "Castellon");
INSERT INTO empleado111 VALUES(6, "66666666F", "678678678678", "empleado6@mail.com", "Avenida", "Teruel");
INSERT INTO empleado111 VALUES(7, "77777777G", "901901901901", "empleado7@mail.com", "Calle", "Valencia");
INSERT INTO empleado111 VALUES(8, "88888888H", "234234234234", "empleado8@mail.com", "Calle", "Alicante");
INSERT INTO empleado111 VALUES(9, "99999999I", "567567567567", "empleado9@mail.com", "Plaza", "Albacete");
INSERT INTO empleado111 VALUES(10, "10101010J", "890890890890", "empleado10@mail.com", "Avenida", "Albacete");

INSERT INTO empleado2 VALUES(612345678, 1);
INSERT INTO empleado2 VALUES(612345679, 2);
INSERT INTO empleado2 VALUES(612345680, 3);
INSERT INTO empleado2 VALUES(612345681, 4);
INSERT INTO empleado2 VALUES(612345682, 5);
INSERT INTO empleado2 VALUES(612345683, 6);
INSERT INTO empleado2 VALUES(612345684, 7);
INSERT INTO empleado2 VALUES(612345685, 8);
INSERT INTO empleado2 VALUES(612345686, 9);
INSERT INTO empleado2 VALUES(612345687, 10);

INSERT INTO tecnico VALUES (1, "hardware");
INSERT INTO tecnico VALUES (2, "software");
INSERT INTO tecnico VALUES (3, "moviles");
INSERT INTO tecnico VALUES (4, "soldadura");
INSERT INTO tecnico VALUES (5, "servidores");
INSERT INTO atencion_cliente VALUES (6, "mañanas");
INSERT INTO atencion_cliente VALUES (7, "tardes");
INSERT INTO transportista VALUES (8, "Alicante");
INSERT INTO transportista VALUES (9, "Navarra");
INSERT INTO transportista VALUES (10, "Sevilla");

INSERT INTO cliente12 VALUES ("Aldaya", "Valencia");
INSERT INTO cliente12 VALUES ("Valencia", "Valencia");
INSERT INTO cliente12 VALUES ("Villarreal", "Castellón");
INSERT INTO cliente12 VALUES ("Bilbao", "Bilbao");
INSERT INTO cliente12 VALUES ("Caudete", "Albacete");
INSERT INTO cliente12 VALUES ("Requena", "Valencia");
INSERT INTO cliente12 VALUES ("Manises", "Valencia");
INSERT INTO cliente12 VALUES ("Las Rozas", "Madrid");

INSERT INTO cliente2 VALUES("12345678A", "David", "Peñalver", "Navarro");
INSERT INTO cliente2 VALUES("23456789B", "Gabi", "Tendero", "Gallego");
INSERT INTO cliente2 VALUES("34567890C", "Toni", "Suárez", "Delciclo");
INSERT INTO cliente2 VALUES("45678901D", "María", "González", "Vivó");
INSERT INTO cliente2 VALUES("56789012D", "Alba", "Cuenca", "López");
INSERT INTO cliente2 VALUES("67890123E", "Verónica", "Gómez", "Gómez");
INSERT INTO cliente2 VALUES("78901234F", "Carlos", "García", "Carmona");
INSERT INTO cliente2 VALUES("89012345G", "Noelia", "Chova", "Junior");
INSERT INTO cliente2 VALUES("90123456H", "Alejandro", "García", "Carmona");
INSERT INTO cliente2 VALUES("12345678I", "Gabriela", "Iraola", "Dimitru");

INSERT INTO cliente11 VALUES (1, "Plaza", "Cortes Valencianas", "Aldaya", "davpennav@email.com", 1, "12345678A", 697647701);
INSERT INTO cliente11 VALUES (2, "Calle", "Buenavista", "Valencia", "gabtengal@email.com", 2, "23456789B", 697647702);
INSERT INTO cliente11 VALUES (3, "Plazuela", "Grande", "Villarreal", "tonsuadel@email.com", 3, "34567890C", 697647703);
INSERT INTO cliente11 VALUES (4, "Avenida", "Ancha", "Bilbao", "margonviv@email.com", 4, "45678901D", 697647704);
INSERT INTO cliente11 VALUES (5, "Glorieta", "Central", "Caudete", "albcuelop@email.com", 5, "56789012D", 697647705);
INSERT INTO cliente11 VALUES (6, "Paseo", "Requenense", "Requena", "vergomgom@email.com", 6, "67890123E", 697647706);
INSERT INTO cliente11 VALUES (7, "Paseo", "Requenense", "Requena", "cargarcar@email.com", 7, "78901234F", 697647707);
INSERT INTO cliente11 VALUES (8, "Calle", "Pipas", "Manises", "noechojun@email.com", null, "89012345G", 697647708);
INSERT INTO cliente11 VALUES (9, "Paseo", "Requenense", "Requena", "alegarcar@email.com", null, "90123456H", 697647709);
INSERT INTO cliente11 VALUES (10, "Calle", "Cupido", "Las Rozas", "gabiradim@email.com", null, "12345678I", 697647710);

INSERT INTO producto VALUES (1, "CPU Intel i5", "No enciende", 1);
INSERT INTO producto VALUES (2, "CPU Intel i7", "Falta pasta térmica", 2);
INSERT INTO producto VALUES (3, "Ratón Logitech MX Master 3", "Clic izquierdo averiado", 3);
INSERT INTO producto VALUES (4, "GPU Nvidia RTX 3050", "No va el ventilador", 1);
INSERT INTO producto VALUES (5, "Teclado Keycron V3", "Cambiar tipo tecla a marrón", 2);
INSERT INTO producto VALUES(6, "Altavoz Logitech GH4", "Cable pelado", 3);
INSERT INTO producto VALUES(7, "Monitor LG 27GL850", "No enciende", 1);

INSERT INTO reparacion VALUES (1, "no funciona la fuente de alimentacion", "2019-01-01 00:00:00", "2019-01-02 00:00:00", 1);
INSERT INTO reparacion VALUES (2, "no funciona la carcasa", "2019-01-02 00:00:00", "2019-01-03 00:00:00", 1);
INSERT INTO reparacion VALUES (3, "no funciona el ventilador", "2019-01-03 00:00:00", "2019-01-04 00:00:00", 2);
INSERT INTO reparacion VALUES (4, "no funciona el dac", "2019-01-04 00:00:00", "2019-01-05 00:00:00", 2);
INSERT INTO reparacion VALUES (5, "no funciona el disco duro", "2019-01-05 00:00:00", "2019-01-06 00:00:00", 3);
INSERT INTO reparacion VALUES (6, "no funciona la placa base", "2019-01-06 00:00:00", "2019-01-07 00:00:00", 3);
INSERT INTO reparacion VALUES (7, "no funciona la placa base", "2019-01-07 00:00:00", "2019-01-08 00:00:00", 4);
INSERT INTO reparacion VALUES (8, "no funciona la tarjeta grafica", "2019-01-08 00:00:00", "2019-01-09 00:00:00", 4);
INSERT INTO reparacion VALUES (9, "no funciona la tarjeta grafica", "2019-01-09 00:00:00", "2019-01-10 00:00:00", 5);
INSERT INTO reparacion VALUES (10, "no funciona la tarjeta de red", "2019-01-10 00:00:00", "2019-01-11 00:00:00", 5);

insert INTO tarea VALUES (1, 1, "no funciona la fuente de alimentacion");
INSERT INTO tarea VALUES (2, 1, "no funciona la carcasa");
insert into tarea VALUES (3, 2, "no funciona el ventilador");
INSERT INTO tarea VALUES (4, 2, "no funciona el dac");
insert into tarea VALUES (5, 3, "no funciona el disco duro");
insert into tarea VALUES (6, 3, "no funciona la placa base");
insert into tarea VALUES (7, 4, "no funciona la placa base");
insert into tarea VALUES (8, 4, "no funciona la tarjeta grafica");
insert into tarea VALUES (9, 5, "no funciona la tarjeta grafica");
insert INTO tarea VALUES (10, 5, "no funciona la tarjeta de red");
insert into tarea VALUES (11, 6, "no funciona la tarjeta de red");
insert into tarea VALUES (12, 6, "no funciona la tarjeta de sonido");
insert into tarea VALUES (13, 7, "no funciona la tarjeta de sonido");
INSERT INTO tarea VALUES (14, 7, "no funciona el procesador");
insert into tarea VALUES (15, 8, "no funciona el procesador");
insert into tarea VALUES (16, 8, "no funciona el raton");
insert into tarea VALUES (17, 9, "no funciona el raton");
insert INTO tarea VALUES (18, 9, "no funciona el teclado");
insert into tarea VALUES (19, 10, "no funciona el sistema operativo");
insert INTO tarea VALUES (20, 10, "no funciona nada");

INSERT INTO pieza1 VALUES ("fuente de alimentacion", "fuente", "fuente de alimentacion de 500w");
INSERT INTO pieza1 VALUES ("carcasa", "carcasa", "carcasa de ordenador");
INSERT INTO pieza1 VALUES ("ventilador", "ventilador", "ventilador de 12cm");
INSERT INTO pieza1 VALUES ("dac", "tarjeta de sonido", "tarjeta de sonido");
INSERT INTO pieza1 VALUES ("disco duro", "disco duro", "disco duro de 1tb");
INSERT INTO pieza1 VALUES ("placa base", "placa base", "placa base de 1151");
INSERT INTO pieza1 VALUES ("tarjeta grafica", "tarjeta grafica", "tarjeta grafica de 4gb");
INSERT INTO pieza1 VALUES ("tarjeta de red", "tarjeta de red", "tarjeta de red");
INSERT INTO pieza1 VALUES ("tarjeta de sonido", "tarjeta de sonido", "tarjeta de sonido");
INSERT INTO pieza1 VALUES ("procesador", "procesador", "procesador de 4 nucleos");

INSERT INTO pieza2 VALUES (1, 1111111, "fuente de alimentacion", 10);
INSERT INTO pieza2 VALUES (2, 2222222, "carcasa", 20);
INSERT INTO pieza2 VALUES (3, 3333333, "ventilador", 15);
INSERT INTO pieza2 VALUES (4, 4444444, "dac", 30);
INSERT INTO pieza2 VALUES (5, 5555555, "disco duro", 40);
INSERT INTO pieza2 VALUES (6, 6666666, "placa base", 50);
INSERT INTO pieza2 VALUES (7, 7777777, "tarjeta grafica", 60);
INSERT INTO pieza2 VALUES (8, 8888888, "tarjeta de red", 70);
INSERT INTO pieza2 VALUES (9, 9999999, "tarjeta de sonido", 80);
INSERT INTO pieza2 VALUES (10, 1010101, "procesador", 90);

INSERT INTO proveedor VALUES (1, 1111111, 5, "jose");
INSERT INTO proveedor VALUES (2, 2222222, 4, "juan");
INSERT INTO proveedor VALUES (3, 3333333, 3, "pedro");
INSERT INTO proveedor VALUES (4, 4444444, 2, "luis");
INSERT INTO proveedor VALUES (5, 5555555, 1, "jorge");
INSERT INTO proveedor VALUES (6, 6666666, 5, "jose");
INSERT INTO proveedor VALUES (7, 7777777, 4, "juan");
INSERT INTO proveedor VALUES (8, 8888888, 3, "pedro");
INSERT INTO proveedor VALUES (9, 9999999, 2, "luis");
INSERT INTO proveedor VALUES (10, 1010101, 1, "jorge");
INSERT INTO proveedor VALUES(11, "A2585338D", 3, "PacoExpress");
INSERT INTO proveedor VALUES(12, "W58396730", 4, "ErnestFunesto");
INSERT INTO proveedor VALUES(13, "T2391650R", 2, "HasamShop");
INSERT INTO proveedor VALUES(14, "L8967335C", 5, "IWP Technology");
INSERT INTO proveedor VALUES(15, "S68004732", 5, "PC Ready");
INSERT INTO proveedor VALUES(16, "G92374615", 1, "FrWT");
INSERT INTO proveedor VALUES(17, "J7436580A", 3, "Ching Ching");
INSERT INTO proveedor VALUES(18, "N4237641K", 2, "PacoExpress");
INSERT INTO proveedor VALUES(19, "X75389310", 4, "ElCorteFrances");
INSERT INTO proveedor VALUES(20, "U7534821C", 5, "Compuworld");

INSERT INTO adquiere VALUES (1, 1);
INSERT INTO adquiere VALUES (2, 1);
INSERT INTO adquiere VALUES (3, 2);
INSERT INTO adquiere VALUES (4, 2);
INSERT INTO adquiere VALUES (5, 3);
INSERT INTO adquiere VALUES (6, 3);
INSERT INTO adquiere VALUES (7, 4);
INSERT INTO adquiere VALUES (8, 4);
INSERT INTO adquiere VALUES (9, 5);
INSERT INTO adquiere VALUES (10, 5);

INSERT INTO utiliza VALUES (1, 1);
INSERT INTO utiliza VALUES (2, 1);
INSERT INTO utiliza VALUES (3, 2);
INSERT INTO utiliza VALUES (4, 2);
INSERT INTO utiliza VALUES (5, 3);
INSERT INTO utiliza VALUES (6, 3);
INSERT INTO utiliza VALUES (7, 4);
INSERT INTO utiliza VALUES (8, 4);
INSERT INTO utiliza VALUES (9, 5);
INSERT INTO utiliza VALUES (10, 5);

INSERT INTO consulta VALUES (1, 1);
INSERT INTO consulta VALUES (2, 1);
INSERT INTO consulta VALUES (3, 2);
INSERT INTO consulta VALUES (4, 2);
INSERT INTO consulta VALUES (5, 3);
INSERT INTO consulta VALUES (6, 3);
INSERT INTO consulta VALUES (7, 4);
INSERT INTO consulta VALUES (8, 4);
INSERT INTO consulta VALUES (9, 5);
INSERT INTO consulta VALUES (10, 5);

insert INTO compradas (id_pieza, id_proveedor) VALUES (1, 1);
insert INTO compradas (id_pieza, id_proveedor) VALUES (2, 2);
insert INTO compradas (id_pieza, id_proveedor) VALUES (3, 3);
insert INTO compradas (id_pieza, id_proveedor) VALUES (4, 4);
insert INTO compradas (id_pieza, id_proveedor) VALUES (5, 5);
insert INTO compradas (id_pieza, id_proveedor) VALUES (6, 6);
insert INTO compradas (id_pieza, id_proveedor) VALUES (7, 7);
insert INTO compradas (id_pieza, id_proveedor) VALUES (8, 8);
insert INTO compradas (id_pieza, id_proveedor) VALUES (9, 9);
insert INTO compradas (id_pieza, id_proveedor) VALUES (10, 10);

-- CONSULTAS

-- Muéstrame la cantidad de clientes de la provincia de Valencia agrupados por municipio

select cliente11.poblacion, COUNT(cliente11.poblacion) from cliente11 JOIN cliente12 ON cliente11.poblacion = cliente12.poblacion where cliente12.provincia = "Valencia" group by cliente11.poblacion HAVING COUNT(cliente11.poblacion) > 1;

select cliente11.poblacion, COUNT(cliente11.poblacion) from cliente11 JOIN cliente12 ON cliente11.poblacion = cliente12.poblacion where cliente12.provincia = "Valencia" group by cliente11.poblacion HAVING COUNT(cliente11.poblacion) > 1;

-- Muéstrame qué reparaciones tiene que hacer cada técnico

select CONCAT_WS(" ", empleado12.nombre, empleado12.apellido1), reparacion.descripcion_reparacion from tecnico, empleado111, empleado12, reparacion where empleado111.dni = empleado12.dni and empleado111.id_empleado = tecnico.id_empleado and reparacion.id_empleado = tecnico.id_empleado;

SELECT CONCAT_WS(" ", empleado12.nombre, empleado12.apellido1), reparacion.descripcion_reparacion FROM empleado12 NATURAL JOIN empleado111 NATURAL JOIN tecnico NATURAL JOIN reparacion;

-- Muéstrame las piezas usadas en cada tarea y de qué proveedor son

select pieza1.nombre FROM pieza1, pieza2, utiliza, compradas WHERE pieza1.nombre = pieza2.nombre and pieza2.id_pieza = utiliza.id_pieza and pieza2.id_pieza = compradas.id_pieza;

SELECT pieza1.nombre FROM pieza1 NATURAL JOIN pieza2 NATURAL JOIN utiliza NATURAL JOIN compradas;

-- Muéstrame el nombre de las piezas usadas en las tareas ordenado por el precio de la pieza y, si tienen el mismo precio, por el nombre

select p2.nombre, p2.precio from pieza2 p2, tarea t, utiliza u where p2.id_pieza = u.id_pieza and u.id_tarea = t.id_tarea order by p2.precio, p2.nombre;

SELECT p2.nombre, p2.precio FROM pieza2 p2 NATURAL JOIN utiliza u NATURAL JOIN tarea t ORDER BY p2.precio, p2.nombre;

-- Muéstrame los productos que sean una CPU o una GPU

select producto.nombre from producto WHERE nombre like "%CPU%" or nombre like "%GPU%";

SELECT producto.nombre FROM producto WHERE nombre like "%CPU%" or nombre like "%GPU%";