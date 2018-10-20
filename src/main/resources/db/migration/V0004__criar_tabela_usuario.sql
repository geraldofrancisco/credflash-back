CREATE TABLE cadastro.usuario ( 
	oid BIGINT IDENTITY ( 1, 1 )  NOT NULL PRIMARY KEY, 
	cpf NVARCHAR(11) NOT NULL,
	nome NVARCHAR(50) NOT NULL, 
	email NVARCHAR(100) NOT NULL,
	master BIT DEFAULT 0
)