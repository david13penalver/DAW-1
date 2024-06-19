-- DAVID PEÑALVER NAVARRO. OPCIÓN B

-- EJERCICIO 1

select e.nomeq, e.director from ciclista c, equipo e where (e.nomeq = c.nomeq) and (AVG(c.edad) > 31) group by e.nomeq;

-- EJERCICIO 2

select reverse(et.llegada) as "transformacion1", SUBSTRING(et.salida, 3, 3) as "transformacion2" from etapa et where (et.salida LIKE "%a%") and (et.llegada LIKE "%a%");

-- EJERCICIO 3

select UPPER(REPLACE(color, "a", "aaa")) from maillot where (color <> "rojo") and (color <> "verde") order by color desc;

-- EJERCICIO 4

select distinct c.nombre from maillot m, ciclista c, llevar l where (l.codigo = m.codigo) and (l.dorsal = c.dorsal) and (m.color = "rosa") and (c.nombre like "%i%");

-- EJERCICIO 5. Entendí que había que cambiar el nombre del equipo, no del director. Ahora soy el title sponsor del equipo (afecta al ejercicio 6 y 7).

update equipo set nomeq="David" where nomeq="Wordperfect";

-- EJERCICIO 6 

insert into ciclista values(1111, "David", null, "David");

-- EJERCICIO 7

delete from ciclista where dorsal="1111";
