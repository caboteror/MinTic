CREATE SCHEMA FRUTAS;
USE FRUTAS;

create table Familia(
	fam_id int auto_increment primary key,
    fam_nombre varchar(50)
);

create table proveedor (
prov_id  int primary key,
prov_nombre  varchar(20),
prov_direccion varchar(45),
prov_telefono  varchar(11));


create table fresa(
fre_id int primary key,
fre_fam_id int references Familia(fam_id),
fre_precio int,
fre_anio int);

create table uchuva(
uch_id int primary key,
uch_fam_id int references Familia(fam_id),
uch_precio int,
uch_duracion int,
uch_id_proveedor int references proveedor(prov_id)
);

create table consumidor (
cons_alias  varchar(10) primary key,
cons_nombre  varchar(15),
cons_apellido varchar(20),
cons_email  varchar(25),
cons_celular varchar (20),
cons_contrasenia int (8),
cons_fecha_nacimiento varchar(15));

create table registro (
reg_id  int primary key,
reg_compra  varchar(20),
reg_fecha datetime,
reg_cons_alias varchar(20) references consumidor(cons_alias)
);






