CREATE TABLE prestamos (
    cliente INT NOT NULL,
    id INT NOT NULL,
    fecha DATE NOT NULL,
    monto DOUBLE(20, 2) NOT NULL,
    estado varchar(50) NOT NULL,
    PRIMARY KEY (cliente, id)
);

CREATE TABLE cuentas_debito (
    cliente INT NOT NULL,
    monto DOUBLE(20, 2) NOT NULL,
    estado varchar(50) NOT NULL,
    PRIMARY KEY (cliente)
);
