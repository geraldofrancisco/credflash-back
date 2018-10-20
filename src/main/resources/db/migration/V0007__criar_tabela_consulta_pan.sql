CREATE TABLE consulta.cartaopan ( 
	oid BIGINT IDENTITY ( 1, 1 )  NOT NULL PRIMARY KEY, 
	oid_consulta BIGINT NOT NULL, 
	margem_livre DECIMAL(10,2) NOT NULL, 
	limite_saque_total DECIMAL(10,2) NOT NULL, 
	limite_saque_disponivel DECIMAL(10,2) NOT NULL, 
	CONSTRAINT FK_cartaopan_consulta FOREIGN KEY (oid_consulta) 
	REFERENCES consulta.pan (oid)
	ON DELETE CASCADE          
)