-- DAVID PEÑALVER Y ANTONIO SUÁREZ

-- SUBCONSULTAS

-- Debe haber al menos una subconsulta agrupada.
-- Describe lo que hace esta consulta:
/*
    Esta selección recupera el recuento de productos por provincia para un conjunto específico de productos. 
    Une las tablas cliente12, cliente11 y producto para obtener la información deseada. 
    La subconsulta se utiliza para filtrar los productos según sus nombres, buscando específicamente productos que contengan "CPU" o "GPU" en su nombre. 
    El resultado está agrupado por provincia.
*/
select c12.provincia, count(p.id_producto) as "Productos por provincia" from cliente12 c12 natural join cliente11 c11 natural join producto p where p.nombre in (
    select p_2.nombre from producto p_2 where p_2.nombre like "%CPU%" or "%GPU%"
) group by c12.provincia;

-- Debe haber al menos la llamada a una función de manipulación de cadenas.
/*
    Esta consulta recupera el nombre completo concatenado (nombre y apellido) de un empleado,
     junto con el ID de reparación y la descripción de las reparaciones en las que han trabajado.
     Une las tablas tecnico, empleado111, empleado12 y reparacion para establecer las relaciones.
     entre empleados y reparaciones.
*/
select CONCAT_WS(" ", empleado12.nombre, empleado12.apellido1),reparacion.id_reparacion, reparacion.descripcion_reparacion  from tecnico, empleado111, empleado12, reparacion where empleado111.dni = empleado12.dni and empleado111.id_empleado = tecnico.id_empleado and reparacion.id_empleado = tecnico.id_empleado;

-- Debe haber al menos una subconsulta que haga uso de los predicados in/not in, exist not exist.
/*
    Esta selección recupera la descripción, fecha de inicio y fecha de finalización de las reparaciones de la tabla 'reparación'.
    Utiliza uniones naturales con las tablas 'tarea', 'utiliza', 'pieza2' y 'compradas' para filtrar los resultados.
    La subconsulta dentro de la cláusula 'IN' recupera los valores 'id_pieza' de la tabla 'compradas',
    los cuales están asociados a proveedores (“proveedor”) que tienen una calificación mayor a 1.
*/
select r.descripcion_reparacion, r.fecha_inicio, r.fecha_final from reparacion r natural join tarea t natural join utiliza u natural join pieza2 natural join compradas where compradas.id_pieza in (
    select compradas.id_pieza from proveedor p natural join compradas where p.calificacion>1
);


-- VISTAS

-- Debe haber al menos una consulta con un group by condicionado (having)
/*
    Este código crea una vista llamada "vista2" que selecciona la columna "población" de la tabla "cliente11" y cuenta las apariciones de cada valor de "población". 
    Une las tablas "cliente11" y "cliente12" en la columna "poblacion" y filtra los resultados según el valor de la columna "provincia" de "Valencia" en la tabla "cliente12". 
    Luego, los resultados se agrupan por "población" y solo se incluyen en la vista los grupos con un recuento inferior a 2.
*/
CREATE VIEW vista2 AS SELECT cliente11.poblacion, COUNT(cliente11.poblacion) from cliente11 JOIN cliente12 ON cliente11.poblacion = cliente12.poblacion where cliente12.provincia = "Valencia" group by cliente11.poblacion HAVING COUNT(cliente11.poblacion) < 2;

-- Vista 2

/*
    Este código crea una vista llamada 'empleado_tecnico' que combina datos de tres tablas: 'empleado111', 'tecnico' y 'empleado112'.
    La vista selecciona las columnas 'id_empleado', 'dni', 'numero_ss', 'email', 'nombre_via', 'localidad' y 'departamento' de las tablas.
    Las condiciones de unión se basan en las columnas 'id_empleado' y 'localidad'.
*/

CREATE VIEW empleado_tecnico AS
SELECT e.id_empleado, e.dni, e.numero_ss, e.email, e.nombre_via, e.localidad, t.departamento
FROM empleado111 e
JOIN tecnico t ON e.id_empleado = t.id_empleado
JOIN empleado112 em ON e.localidad = em.localidad;
