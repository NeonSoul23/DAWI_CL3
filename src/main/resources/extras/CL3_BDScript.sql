-- Creación de la base de datos --
DROP DATABASE IF EXISTS bd_reyna;
CREATE DATABASE bd_reyna;
USE bd_reyna;

create table tb_clasificacion(
codclas int not null primary key auto_increment,
nombreclas varchar(45),
desclas varchar(80)
);

create table tb_generos(
codgenero int not null primary key auto_increment,
nomgenero varchar(45),
subgenero varchar(45)
);

create table tb_peliculas(
codpelicula int not null primary key auto_increment,
nompelicula varchar(45),
codgenero int,
codclas int,
paispelicula varchar(45),
populpelicula varchar(45),
constraint fk_generos foreign key (codgenero) references tb_generos(codgenero),
constraint fk_clasificacion foreign key (codclas) references tb_clasificacion(codclas)
);


-- Inserción de registros --
insert into tb_clasificacion values(null, '7+', 'Recomendada para niños a partir de los 7 años');
insert into tb_clasificacion values(null, '13+', 'Recomendada para niños a partir de los 13 años');
insert into tb_clasificacion values(null, '16+', 'Recomendada para adolescentes a partir de los 16 años');
insert into tb_clasificacion values(null, '18+', 'Recomendada para jóvenes a partir de los 18 años');

insert into tb_generos values(null, 'Acción', 'Policial');
insert into tb_generos values(null, 'Acción', 'Futurista');
insert into tb_generos values(null, 'SciFi', 'Espacial');
insert into tb_generos values(null, 'SciFi', 'Suspenso');
insert into tb_generos values(null, 'Animado', '2D');
insert into tb_generos values(null, 'Animado', '3D');
insert into tb_generos values(null, 'Documental', 'Música');
insert into tb_generos values(null, 'Documental', 'Política');

insert into tb_peliculas values(null, 'Interstellar', 3, 2, 'USA', 'Muy popular');
insert into tb_peliculas values(null, 'Whiplash', 7, 1, 'Inglaterra', 'Poco popular');
insert into tb_peliculas values(null, 'La era de hielo 2', 6, 1, 'México', 'Muy popular');
insert into tb_peliculas values(null, 'Akira', 5, 3, 'Japón', 'Poco popular');
insert into tb_peliculas values(null, 'Zeitgeist Addendum', 8, 3, 'Desconocido', 'Nada popular');
insert into tb_peliculas values(null, 'Odisea en el espacio', 4, 2, 'USA', 'Medianamente popular');


-- Consultas --
select * from tb_clasificacion;
select * from tb_generos;
select * from tb_peliculas
