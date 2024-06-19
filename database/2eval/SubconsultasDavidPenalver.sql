-- Active: 1705315489513@@127.0.0.1@3306@jardineria

-- DAVID PEÑALVER NAVARRO. MODELO DE EXAMEN B

-- EJERCICIO 1. Partiendo de la estructura de una subconsulta, encuentra los clientes que han
-- realizado ningún pedido y que como forma de pago predeterminada no han seleccionado
-- PAYPAL. En el resultado, se debe intercambiar el nombre del cliente para que aparezca en
-- mayúsculas
select distinct upper(c.nombre_cliente) from pago pa natural join cliente c natural join pedido p where pa.forma_pago not in (
    select pa2.forma_pago from pago pa2 where pa2.forma_pago="PayPal"
) and p.codigo_cliente not in (
    select p3.codigo_cliente from pedido p3 natural join cliente c3
);


-- EJERCICIO 2. Lista el nombre de los clientes que hayan realizado pagos superiores a la media
-- de todos los pagos. Se deben evitar duplicidades
select DISTINCT c.nombre_cliente from cliente c natural join pago p where p.total > (
    select avg(p2.total) from pago p2 natural join cliente c2
);


-- EJERCICIO 3. Partiendo de la estructura de una subconsulta, lista el código y la fecha de los
-- pedidos realizados en el año 2006 cuyo método de pago haya sido Transferencia
select p.codigo_pedido, p.fecha_pedido from pedido p natural join cliente c natural join pago pa 
where year(fecha_pedido) = 2006 and pa.forma_pago in (
    select pa2.forma_pago from pago pa2 where pa2.forma_pago="Transferencia"
);


-- EJERCICIO 4. Muestra el nombre y apellido de los empleados que trabajan en la misma oficina
-- que el empleado Takuma Nomura. En el resultado de dicha consulta, no debe aparecer el
-- nombre de dicho empleado
select e.nombre, e.apellido1 from empleado e where e.codigo_oficina = (
    select e2.codigo_oficina from empleado e2 where e2.nombre="Takuma" and e2.apellido1="Nomura" 
) and e.codigo_empleado not in (
    select e3.codigo_empleado from empleado e3 where e3.nombre="Takuma" and e3.apellido1="Nomura"
);


-- EJERCICIO 5. Partiendo de la estructura de una subconsulta, devuelve el nombre y el país de
-- los clientes que no tengan representantes de ventas que trabajan en oficinas cuyo nombre de
-- ciudad no contenga la letra e. El resultado deberá estar ordenado en función del país, y de
-- manera descendente
select c.nombre_cliente, c.pais from cliente c where c.codigo_empleado_rep_ventas not in (
    select c2.codigo_empleado_rep_ventas from cliente c2 inner join empleado e2 on 
    c2.codigo_empleado_rep_ventas=e2.codigo_empleado natural join oficina o2 
    where o2.ciudad like "%e%"
)
order by c.pais desc;

