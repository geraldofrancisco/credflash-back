CREATE TABLE cadastro.cliente ( 
	oid BIGINT IDENTITY ( 1, 1 )  NOT NULL PRIMARY KEY, 
	cpf NVARCHAR( 11 ) NOT NULL, 
	nome NVARCHAR( 100 ),
	matricula NVARCHAR( 20 ),
	data_nascimento DATE,
	falecido BIT DEFAULT 0
	CONSTRAINT cadastro_cliente_unique_cpf UNIQUE ( cpf ) )