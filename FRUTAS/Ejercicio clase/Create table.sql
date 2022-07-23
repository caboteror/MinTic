create table proveedor(
	prov_id 		int primary key,
	prov_nombre 	varchar(50) not null,
	prov_direccion 	varchar(50) not null,
    prov_telefono 	varchar(11)
);

create table fresa(
	fre_id 		int auto_increment primary key,
	fre_familia varchar(50) NOT NULL,
    fre_precio 	int NOT NULL,
    fre_anio 	int NOT NULL
);

create table uchuva(
	uch_id 				int auto_increment primary key,
	uch_familia 		varchar(50) NOT NULL,
	uch_precio 			int NOT NULL,
	uch_durabilidad 	int NOT NULL,
	uch_prov_id 		int references proveedor(prov_id)
);


create table consumidor(
	cons_alias 				varchar(50) primary key,
    cons_nombre 			varchar(50) NOT NULL,
    cons_apellido 			varchar(50) NOT NULL,
    cons_email 				varchar(50) NOT NULL,
    cons_celular 			varchar(20) NOT NULL,
    cons_contraseña 		int(8) NOT NULL,
    cons_fecha_nacimiento 	varchar(15)
);


create table registro(
	reg_id 				int auto_increment primary key,
    reg_cons_alias 		varchar(50) references consumidor(cons_alias),
    reg_familia_compra	varchar(50) NOT NULL,
	reg_fecha			datetime NOT NULL
    
);
