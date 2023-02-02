
INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
        estado
)
VALUES
(
	'00103228',
	'1',
	'10-ene-21',
	'37500.00',
        'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'00103228',
	'2',
	'2021-01-19',
	'725.18',
	'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'00103228',
	'3',
	'2021-01-31',
	'1578.22',
	'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'00103228',
	'4',
	'2021-02-04',
	'380.00',
	'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'70099925',
	'1',
	'2021-01-07',
	'2175.25',
	'Pagado'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'70099925',
	'2',
	'2021-01-13',
	'499.99',
	'Pagado'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'70099925',
	'3',
	'2021-01-24',
	'5725.18',
	'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'70099925',
	'4',
	'2021-02-07',
	'876.13',
	'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'00298185',
	'1',
	'2021-02-04',
	'545.55',
	'Pendiente'
);

INSERT INTO prestamos (
	cliente,
	id,
	fecha,
	monto,
	estado
)
VALUES
(
	'15000125',
	'1',
	'2020-12-31',
	'15220.00',
	'Pagado'
);


INSERT INTO cuentas_debito (
	cliente,
	monto,
	estado
)
VALUES
(
	'00103228',
	'15375.28',
	'Activa'
);

INSERT INTO cuentas_debito (
	cliente,
	monto,
	estado
)
VALUES
(
	'70099925',
	'3728.51',
	'Bloqueada'
);

INSERT INTO cuentas_debito (
	cliente,
	monto,
	estado
)
VALUES
(
	'00298185',
	'00.00',
	'Cancelada'
);

INSERT INTO cuentas_debito (
	cliente,
	monto,
	estado
)
VALUES
(
	'15000125',
	'235.28',
	'Activa'
);
