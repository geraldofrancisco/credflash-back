CREATE TABLE consulta.pan ( 
	oid BIGINT IDENTITY ( 1, 1 )  NOT NULL PRIMARY KEY, 
	oid_cliente BIGINT NOT NULL, 
	oid_usuario BIGINT NOT NULL, 
	data_consulta DATE,
	tipo NVARCHAR( 20 ),
	margem_livre DECIMAL(10,2),
	limite_saque_total DECIMAL(10,2),
	limite_saque_disponivel DECIMAL(10,2)
	CONSTRAINT FK_cliente FOREIGN KEY (oid_cliente) 
	REFERENCES cadastro.cliente (oid) 
	ON DELETE CASCADE    
    ON UPDATE CASCADE   
)