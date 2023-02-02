# bank-pagos-clientes
Servicio que realiza el cobro de Pagos pendientes

Al ejecutarse el Endpoint: http://localhost:8082/api/getPagar

![image](https://user-images.githubusercontent.com/69737708/216451237-d986e668-93d7-4d9a-a24c-52f155ab3fb7.png)

El servicio recorre la Tabla cuentas_debito, con estatus Activa. Para realizar los Pagos con estatus Pendiente de la Tabla prestamos.

Filtro: Para que el Pago se realise, el Monto de la cuenta debe ser mayor al calculo del Pago.


select * from prestamos;
![image](https://user-images.githubusercontent.com/69737708/216452448-b8501bf3-69d7-482a-9686-8440c1e45e01.png)


select * from cuentas_debito
![image](https://user-images.githubusercontent.com/69737708/216452564-8d57c87b-406a-4ce7-938a-04700c8552d6.png)

Pagos Realizados:

![image](https://user-images.githubusercontent.com/69737708/216452863-68b56f7c-0551-4a03-ad46-ce4823209fb9.png)

![image](https://user-images.githubusercontent.com/69737708/216452962-0a99991e-b15e-493f-bd29-d69093c9de2f.png)

:)
