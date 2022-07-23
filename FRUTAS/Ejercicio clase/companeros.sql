
select 'Consulta 1';

select fam.familia
from	(SELECT   fre_familia as familia
		from	  fresa 			
		group by  fre_familia
		union
		SELECT 	  uch_familia as familia
		from	  uchuva
		group by  uch_familia) as fam
order by fam.familia;

select 'Consulta 2';
select 	fre_familia, fre_precio, fre_anio from	fresa where	fre_anio > 2019 order by fre_familia;

select 'Consulta 3';
select 	uch_familia
from	uchuva,
		proveedor
where	proveedor.prov_id = uchuva.uch_prov_id
and		proveedor.prov_nombre = 'Toño';

SELECT 'Consulta 4';
select 	reg_familia_compra
from	registro
where	reg_cons_alias = 'lucky'
order by reg_fecha;

SELECT 'Consulta 5';
select 	cons_alias, cons_nombre, cons_apellido, reg_familia_compra
from	consumidor,
		registro
where	consumidor.cons_alias = registro.reg_cons_alias
and		upper(reg_familia_compra) = 'MONTERREY';

select 'Consulta 6';
select count(1) from fresa where fre_anio > 2019;

