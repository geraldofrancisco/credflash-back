CREATE TABLE consulta.pan ( 
	oid BIGINT IDENTITY ( 1, 1 )  NOT NULL PRIMARY KEY, 
	oid_cliente BIGINT NOT NULL, 
	oid_usuario BIGINT NOT NULL, 
	data_consulta DATE,
	tipo NVARCHAR( 20 )	
	CONSTRAINT FK_pan_cliente FOREIGN KEY (oid_cliente) 
	REFERENCES cadastro.cliente (oid)
	ON DELETE CASCADE    
    ON UPDATE CASCADE, 
	CONSTRAINT FK_pan_usuario FOREIGN KEY (oid_usuario) 
	REFERENCES cadastro.usuario (oid) 
	ON DELETE CASCADE    
    ON UPDATE CASCADE   
)