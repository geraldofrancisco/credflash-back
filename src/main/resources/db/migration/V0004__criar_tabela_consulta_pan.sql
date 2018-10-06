CREATE TABLE consulta.pan ( 
	oid BIGINT IDENTITY ( 1, 1 )  NOT NULL PRIMARY KEY, 
	oid_cliente BIGINT, 
	data_consulta DATE,
	tipo NVARCHAR( 100 )	
	CONSTRAINT FK_cliente FOREIGN KEY (oid_cliente) 
	REFERENCES cadastro.cliente (oid) 
	ON DELETE CASCADE    
    ON UPDATE CASCADE   
)