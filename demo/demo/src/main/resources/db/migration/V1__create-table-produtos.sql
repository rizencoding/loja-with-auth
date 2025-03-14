create table Produtos(
    id bigint not null auto_increment,
    nome varchar(100) not null,
    preco float not null,
    quantidade int not null,
    primary key(id)
);