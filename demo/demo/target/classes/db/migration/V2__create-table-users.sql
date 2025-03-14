create table users(
    id varchar(36) unique not null,
    login varchar(40) not null unique,
    password text not null,
    role text not null,
    primary key(id)
)