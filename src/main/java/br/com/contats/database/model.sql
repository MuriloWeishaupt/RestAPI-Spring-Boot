create database db_contatos;
use db_contatos;

create table tbl_contatos(
	id int not null auto_increment,
    nome varchar(45) not null,
    telefone long,
    email varchar(45)not null,
    favorito boolean,
    foto varchar(200) not null,
    primary key (id)

);

insert into tbl_contatos(id, nome, telefone, email, favorito, foto) values
(0, "Maria Rosa", 11902629301, "mariarosa@gmail.com", false, "https://images.pexels.com/photos/4006576/pexels-photo-4006576.jpeg?auto=compress&cs=tinysrgb&w=1600"),
(0, "Murilo Weishaupt", 11923627292, "murilo@gmail.com", false, "https://images.pexels.com/photos/7533347/pexels-photo-7533347.jpeg?auto=compress&cs=tinysrgb&w=1600"),
(0, "Eduardo Passos", 11902620321, "eduardo@gmail.com", false, "https://images.pexels.com/photos/1848565/pexels-photo-1848565.jpeg?auto=compress&cs=tinysrgb&w=1600");

select * from tbl_contatos;


