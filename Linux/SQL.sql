create table clientes(
 id_clientes int  auto_increment not null primary key,
 nome varchar(100),
 telefone varchar(20),
 email varchar(100),
 endereco varchar(100),
 id_os int,
 id_equipamento int
 
);
alter table clientes 
	add constraint fk_id_os Foreign key (id_os) 
	references ordemdeservico (id_os);
    
alter table clientes 
	add constraint fk_id_equipamento Foreign key (id_equipamento) 
	references equipamentos (id_equipamento);
    
create table ordemdeservico (
 id_os int not null auto_increment primary key,
 dataa date,
 data_inicio varchar(10),
 data_fim varchar(10),
 servico varchar(200),
 situacao varchar(50),
 tecnico varchar(50),
 valor varchar(50),
 
 id_equipamento int,
 id_cliente int,
 
constraint fk_idcli foreign key (id_cliente) references clientes (id_clientes)

);
alter table ordemdeservico 
	add constraint fk_equipamento Foreign key (id_equipamento) 
	references equipamentos (id_equipamento);
    
    
create table equipamentos (
 id_equipamento int not null auto_increment primary key,
 marca varchar(100),
 modelo varchar(100),
 numeroserie varchar(100),
 sistemaop varchar(200),
 defeito varchar(200),
 observacao varchar(200),
 valor varchar(50),
 ano varchar(4),

 id_cliente int,
 id_os int,
 
 constraint fk_id_cli foreign key (id_cliente) references clientes (id_clientes),
 constraint fk_idos foreign key (id_os) references ordemdeservico (id_os)

);    


describe clientes;
describe equipamentos;
describe ordemdeservico;


alter table equipamentos add column tipo varchar(50);



select ordemdeservico.tecnico, ordemdeservico.servico, ordemdeservico.situacao,
equipamentos.defeito, equipamentos.marca, equipamentos.tipo
from ordemdeservico 
inner join equipamentos on ordemdeservico .id_os = equipamentos.id_os;




create table tb_usuarios(
 id_user int  auto_increment not null primary key,
 nome_usuario varchar(100),
 login varchar(20),
 senha varchar(100),
 fone varchar(100),
 perfil varchar(5)
 
);    


select * from tb_usuarios;
select * from clientes;
select * from equipamentos;
select * from ordemdeservico;




INSERT INTO `bd_lojapixie`.`equipamentos` (`marca`, `modelo`, `numeroserie`, `sistemaop`, `defeito`, `observacao`, `valor`, `ano`, `tipo`) VALUES ('Samsung', 'J4+', '12012035', 'Android 9.0', 'Tela Quebrada', 'Acabou a garantia', 100.00, '2017', 'Celular');
INSERT INTO `bd_lojapixie`.`ordemdeservico` (`id_os`, `data_inicio`, `data_fim`, `servico`, `situacao`, `tecnico`, `valor`, `id_equipamento`, `id_cliente`) VALUES ('1', '20/1/2020', '29/1/2020', 'Trocar Tela', 'Na bancada', 'Julio', '100.00', '1', '1');
INSERT INTO `bd_lojapixie`.`equipamentos` (`id_equipamento`, `marca`, `modelo`, `numeroserie`, `sistemaop`, `defeito`, `observacao`, `valor`, `ano`, `id_cliente`, `id_os`, `tipo`) VALUES ('2', 'Asus', 'Live Go 55', '2347657', 'Android 8.0', 'Erro: FastBot', 'Depois da atualização parou de funcionar', '200.00', '2015', '1', '1', 'Celular');
INSERT INTO `bd_lojapixie`.`equipamentos` (`id_equipamento`, `marca`, `modelo`, `numeroserie`, `sistemaop`, `defeito`, `observacao`, `valor`, `ano`, `id_cliente`, `id_os`, `tipo`) VALUES ('3', 'Iphone', 'Iphone 5s', '873573543', 'iOs', 'Erro ao iniciar', 'Depois da formatação', '1500.00', '2012', '1', '1', 'Celular');



alter table equipamentos drop column valor;
alter table ordemdeservico drop column dataa;