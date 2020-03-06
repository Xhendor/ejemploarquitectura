DROP TABLE IF EXISTS EMPLEADO;

CREATE TABLE EMPLEADO(
id_empleado INT AUTO_INCREMENT PRIMARY KEY,
nombre varchar(35) NOT NULL ,
apellido_materno varchar(100) NOT NULL,
apellido_paterno varchar(100) NOT NULL,
correo varchar(100) NOT NULL);

