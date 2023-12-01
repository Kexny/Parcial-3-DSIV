create database Parcial3;

use Parcial3;
create table Parrafo
(
	id_parrafo int primary key,
    fuente varchar (300) not null
);

create table Imagenes
(
	id_img int primary key,
    foto varchar(255) not null
);

insert into Imagenes (id_img,foto) values (1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqx8IZFLTcRiPzdN-eVSOm0A2_STCeD0Y-sXp4ZJdro7BnFPwoGqGcTW16A1BLq5DMEro&usqp=CAU');
insert into Imagenes (id_img,foto) values (2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRhEHTPPcWzY7VWQa_FmhHVSBbb6LrcroMfeAJJ3s5kdkPshuKhZhOG1UyR7IY_pPFVLs&usqp=CAU');
insert into Imagenes (id_img,foto) values (3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3sdKPn6zDUDxxsXBhLi2FhfH4mDKiWuhLThgHC5m3Pq2U94kbhLreAHuhIY3DtxY8EUo&usqp=CAU');
insert into Imagenes (id_img,foto) values (4, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTZximhzMIedsdhPsv6UK6Q0VfzifHjt3IE4fCHinSxl6v90UsveK-WMfhOJ4AuF6fwKCU&usqp=CAU');
