CREATE DATABASE IF NOT EXISTS PAPELARIA;
USE PAPELARIA;
CREATE TABLE FUNCIONARIO (
IDMATRICULA INT NOT NULL AUTO_INCREMENT,
NOMEFUNCIONARIO VARCHAR (100) NOT NULL,
FUNCAO VARCHAR (50) NOT NULL,
EMAIL VARCHAR (100),

CONSTRAINT FUNCIONARIO_PK PRIMARY KEY ( IDMATRICULA ) 
 
)ENGINE=INNODB, AUTO_INCREMENT = 1000;

CREATE TABLE CLIENTE (
NOMECLIENTE VARCHAR (50),
CPF DECIMAL(11) NOT NULL,
EMAIL VARCHAR (50) NOT NULL,
ENDERECO VARCHAR  (100),

CONSTRAINT CLIENTE_PK PRIMARY KEY (CPF)

)ENGINE= INNODB ;

CREATE TABLE FORNECEDOR (
CNPJ VARCHAR (18) NOT NULL,
NOMEFORNECEDOR VARCHAR ( 100 ) NOT NULL,
TELEFOFORNECEDOR DECIMAL (11) NOT NULL,
EMAILFORNECEDOR  VARCHAR (50) NOT NULL, 
ENDERECOFORNECEDOR VARCHAR (200 ) NOT NULL,

CONSTRAINT FORNECEDOR_PK PRIMARY KEY (CNPJ) 
) ENGINE = INNODB;

CREATE TABLE PRODUTO ( 
IDPRODUTO INT NOT NULL AUTO_INCREMENT,
PRECO DECIMAL (7,2) NOT NULL,
VALIDADE DATE,
NOMEPRODUTO VARCHAR (50) NOT NULL,
DESCRICAO VARCHAR (100) NOT NULL,
QUANTIDADE INT NOT NULL,
CNPJ VARCHAR (18) NOT NULL,

CONSTRAINT PRODUTO_PK PRIMARY KEY (IDPRODUTO),
CONSTRAINT PRODUTO_FORNECEDOR_FK FOREIGN KEY (CNPJ)
REFERENCES FORNECEDOR (CNPJ)
ON DELETE CASCADE 

) ENGINE = INNODB, AUTO_INCREMENT = 100;

 CREATE TABLE VENDAS (
 IDVENDA INT NOT NULL AUTO_INCREMENT,
 IDMATRICULA INT NOT NULL,
 CPF DECIMAL (11) NOT NULL,
 
  CONSTRAINT VENDAS_PK PRIMARY KEY (IDVENDA),
  CONSTRAINT VENDAS_FUNCIONARIO_FK FOREIGN KEY (IDMATRICULA)
  REFERENCES FUNCIONARIO (IDMATRICULA)
  ON DELETE CASCADE,
  
  CONSTRAINT VENDAS_CLIENTE_FK FOREIGN KEY (CPF)
  REFERENCES CLIENTE (CPF)
  ON DELETE CASCADE 
 
 )ENGINE= INNODB, AUTO_INCREMENT = 10000 ;


CREATE TABLE LISTAPRODUTOS (
IDVENDA INT NOT NULL,
IDPRODUTO INT NOT NULL,
QNTVENDIDO INT NOT NULL,

CONSTRAINT LISTAPRODUTOS_VENDAS_FK FOREIGN KEY (IDVENDA)
 REFERENCES VENDAS (IDVENDA)
 ON DELETE CASCADE,
 
 CONSTRAINT LISTAPRODUTOS_PRODUTOS_FK FOREIGN KEY (IDPRODUTO)
 REFERENCES PRODUTO (IDPRODUTO)
 ON DELETE CASCADE 
 

) ENGINE = INNODB ;