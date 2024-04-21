create database banco1;

\c banco1;

create table product(id int primary key,
nome varchar (50),
preco float,
descricao varchar (50));

\d product
\dt

create sequence seq_product;
