CREATE DATABASE AVALIACAO;
USE AVALIACAO;

CREATE TABLE INSTRUMENTO
	(ID				BIGINT			NOT NULL	PRIMARY KEY,
	 INSTRUMENTO	VARCHAR(70)		NOT NULL,
     TIPO			VARCHAR(100)	NOT NULL,
     MARCA			VARCHAR(50)		NOT NULL,
     PRECO			DECIMAL			NOT NULL);

