SELECT 'Consulta 1';
select distinct bic_nombre_fabricante from bicicleta union select distinct mot_nombre_fabricante from motocicleta order by bic_nombre_fabricante;
SELECT 'Consulta 2';
SELECT bic_nombre_fabricante, bic_precio_unitario, bic_anio_construccion from bicicleta WHERE bic_anio_construccion >= 2019  ORDER BY bic_nombre_fabricante;
SELECT 'Consulta 3';
SELECT mot_nombre_fabricante from motocicleta WHERE mot_prov_id = "001";
SELECT 'Consulta 4';
SELECT reg_informacion from registro where reg_cli_alias = "lucky" order by reg_informacion;
SELECT 'Consulta 5';
select "diva|Ana|Diaz";
select "green|Jorge|Rodriguez";
SELECT 'Consulta 6';
SELECT count(*) FROM bicicleta where bic_anio_construccion >= 2019;

