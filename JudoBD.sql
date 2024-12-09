CREATE DATABASE IF NOT EXISTS judo;
USE  judo;

CREATE TABLE IF NOT EXISTS arbitro (
	id_arbi INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS competicion (
	id_copa INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL,
	ciudad VARCHAR(30) NOT NULL,
    mes VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS arbicompe (
	id_arbi INT ,
	id_copa INT ,
    FOREIGN KEY (id_arbi) REFERENCES arbitro (id_arbi),
	FOREIGN KEY (id_copa) REFERENCES competicion (id_copa),
    PRIMARY KEY (id_arbi, id_copa)
);

CREATE TABLE IF NOT EXISTS peso (
	id_peso INT AUTO_INCREMENT PRIMARY KEY,
    kilos INT NOT NULL
);

CREATE TABLE IF NOT EXISTS club (
	id_club INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL,
	ciudad VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS competidor (
	id_competidor INT AUTO_INCREMENT PRIMARY KEY,
    usuario VARCHAR(30) DEFAULT NULL,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
    clave VARCHAR(10) NOT NULL,
    puntos INT,
	id_club INT,
    id_peso INT,
	FOREIGN KEY (id_club) REFERENCES club (id_club),
	FOREIGN KEY (id_peso) REFERENCES peso (id_peso)
);

CREATE TABLE IF NOT EXISTS competicioncompetidor (
	id_competidor INT ,
	id_copa INT ,
    FOREIGN KEY (id_competidor) REFERENCES competidor (id_competidor),
	FOREIGN KEY (id_copa) REFERENCES competicion (id_copa),
    PRIMARY KEY (id_competidor, id_copa)
);

CREATE TABLE IF NOT EXISTS entrenador (
	id_entrenador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(50) NOT NULL,
	id_club INT,
	FOREIGN KEY (id_club) REFERENCES club (id_club)
);


INSERT INTO competicion(nombre, ciudad, mes) VALUES ("Copa Galicia", "Vigo", "Septiembre");
INSERT INTO competicion(nombre, ciudad, mes) VALUES ("Copa Asturias", "Aviles", "Octubre");
INSERT INTO competicion(nombre, ciudad, mes) VALUES ("Copa Castilla y Leon", "Valladolid", "Noviembre");
INSERT INTO competicion(nombre, ciudad, mes) VALUES ("Copa Navarra", "Pamplona", "Diciembre");
INSERT INTO competicion(nombre, ciudad, mes) VALUES ("Copa Cataluña", "Tarragona", "Febrero");
INSERT INTO competicion(nombre, ciudad, mes) VALUES ("Copa Alicante", "Alicante", "Marzo");

INSERT INTO arbitro(nombre, apellido) VALUES ("Belen", "Esteban");
INSERT INTO arbitro(nombre, apellido) VALUES ("Lidia", "Lozano");
INSERT INTO arbitro(nombre, apellido) VALUES ("Aramis", "Fuster");
INSERT INTO arbitro(nombre, apellido) VALUES ("Mario", "Vaquerizo");
INSERT INTO arbitro(nombre, apellido) VALUES ("Yolanda", "Ramos");


INSERT INTO peso(kilos) VALUES ("66");
INSERT INTO peso(kilos) VALUES ("73");
INSERT INTO peso(kilos) VALUES ("81");
INSERT INTO peso(kilos) VALUES ("91");
INSERT INTO peso(kilos) VALUES ("100");
INSERT INTO peso(kilos) VALUES ("101");

INSERT INTO peso(kilos) VALUES ("52");
INSERT INTO peso(kilos) VALUES ("57");
INSERT INTO peso(kilos) VALUES ("63");
INSERT INTO peso(kilos) VALUES ("70");
INSERT INTO peso(kilos) VALUES ("78");
INSERT INTO peso(kilos) VALUES ("79");


INSERT INTO club(nombre, ciudad) VALUES ("Budokan", "Valladolid");
INSERT INTO club(nombre, ciudad) VALUES ("Mederre", "Madrid");
INSERT INTO club(nombre, ciudad) VALUES ("Ronnin", "Albacete");
INSERT INTO club(nombre, ciudad) VALUES ("Tsukiru", "Gijon");
INSERT INTO club(nombre, ciudad) VALUES ("Okami", "Madrid");
INSERT INTO club(nombre, ciudad) VALUES ("Jushirokan", "Vigo");
INSERT INTO club(nombre, ciudad) VALUES ("Bezana", "Santander");
INSERT INTO club(nombre, ciudad) VALUES ("Mislata", "Valencia");

INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Lola", "Lolita", "1");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Maria", "Patiño", "2");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Belen", "Aguilera", "3");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Henry", "Mendez", "4");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Raw", "Alejandro", "5");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Pitbull", "MrWorldWide", "6");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Miley", "Cyrus", "7");
INSERT INTO entrenador(nombre, apellido, id_club) VALUES ("Ryan", "Reynolds", "8");



INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Rosalia01", "Rosalia", "Perez", "1234", "0", "1", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Maria02", "Maria", "Lopez", "1234", "0", "2", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Lucia03", "Lucia", "Garcia", "1234", "0", "4", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Ana04", "Ana", "Martinez", "1234", "0", "5", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Sofia05", "Sofia", "Hernandez", "1234", "0", "6", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Elena06", "Elena", "Diaz", "1234", "0", "7", "12");


INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Laura01", "Laura", "Escanes", "1234", "0", "1", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Clara02", "Clara", "Fernandez", "1234", "0", "2", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Marta03", "Marta", "Gomez", "1234", "0", "3", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Irene04", "Irene", "Sanchez", "1234", "0", "4", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Carmen05", "Carmen", "Perez", "1234", "0", "5", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Vera06", "Vera", "Lopez", "1234", "0", "6", "12");


INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Lorena02", "Lorena", "Ramirez", "1234", "0", "2", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Sofia05", "Sofia", "Martinez", "1234", "0", "5", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Ana03", "Ana", "Lopez", "1234", "0", "3", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Paula04", "Paula", "Hernandez", "1234", "0", "4", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Maria07", "Maria", "Garcia", "1234", "0", "7", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Carla08", "Carla", "Gonzalez", "1234", "0", "8", "12");


INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Lola01", "Lola", "Flores", "1234", "0", "1", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Carmen05", "Carmen", "Perez", "1234", "0", "5", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Isabel03", "Isabel", "Diaz", "1234", "0", "3", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Elena04", "Elena", "Sanchez", "1234", "0", "4", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Marta07", "Marta", "Martinez", "1234", "0", "7", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Lucia08", "Lucia", "Gomez", "1234", "0", "8", "12");


INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Elena02", "Elena", "Gomez", "1234", "0", "2", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Ana05", "Ana", "Lopez", "1234", "0", "5", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Maria06", "Maria", "Hernandez", "1234", "0", "6", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Julia04", "Julia", "Garcia", "1234", "0", "4", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Sofia01", "Sofia", "Martinez", "1234", "0", "1", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("Carla08", "Carla", "Perez", "1234", "0", "8", "12");


INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("IsabellaR", "Isabella", "Rivera", "1234", "0", "2", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MayaJ", "Maya", "Johnson", "1234", "0", "5", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("SophieM", "Sophie", "Miller", "1234", "0", "3", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("EvaL", "Eva", "Lopez", "1234", "0", "4", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("LilaP", "Lila", "Perez", "1234", "0", "7", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("ZoeT", "Zoe", "Taylor", "1234", "0", "8", "12");

INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("ChloeW", "Chloe", "Williams", "1234", "0", "1", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("LanaG", "Lana", "Green", "1234", "0", "5", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("TinaF", "Tina", "Fisher", "1234", "0", "2", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("RitaH", "Rita", "Harris", "1234", "0", "4", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MiaC", "Mia", "Clarke", "1234", "0", "8", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("JadeB", "Jade", "Brooks", "1234", "0", "7", "12");

INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("AvaL", "Ava", "Lewis", "1234", "0", "2", "7");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("NinaS", "Nina", "Scott", "1234", "0", "6", "8");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MayaD", "Maya", "Davis", "1234", "0", "8", "9");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("EllaK", "Ella", "King", "1234", "0", "8", "10");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MayaB", "Maya", "Bennett", "1234", "0", "1", "11");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("LunaM", "Luna", "Mason", "1234", "0", "3", "12");





INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("DavidR", "David", "Romero", "1234", "0", "1", "1");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("LiamJ", "Liam", "Jones", "1234", "0", "2", "2");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("EthanS", "Ethan", "Smith", "1234", "0", "4", "3");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("OliverB", "Oliver", "Brown", "1234", "0", "5", "4");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("JackH", "Jack", "Harris", "1234", "0", "7", "5");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("LucasM", "Lucas", "Martinez", "1234", "0", "6", "6");

INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MaxW", "Max", "Wilson", "1234", "0", "1", "1");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("NoahD", "Noah", "Davis", "1234", "0", "2", "2");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("JamesP", "James", "Patel", "1234", "0", "3", "3");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MatthewC", "Matthew", "Carter", "1234", "0", "4", "4");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("DanielT", "Daniel", "Taylor", "1234", "0", "5", "5");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("HenryL", "Henry", "Lewis", "1234", "0", "6", "6");

INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("SamuelG", "Samuel", "Garcia", "1234", "0", "1", "1");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("BenjaminF", "Benjamin", "Fernandez", "1234", "0", "3", "2");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("OliverA", "Oliver", "Adams", "1234", "0", "5", "3");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("JacobK", "Jacob", "King", "1234", "0", "8", "4");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("ElijahN", "Elijah", "Nelson", "1234", "0", "2", "5");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("WilliamZ", "William", "Zhang", "1234", "0", "6", "6");

INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("GabrielV", "Gabriel", "Vega", "1234", "0", "5", "1");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MatthewX", "Matthew", "Xu", "1234", "0", "1", "2");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("CalebR", "Caleb", "Roberts", "1234", "0", "2", "3");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("ZacharyJ", "Zachary", "Johnson", "1234", "0", "4", "4");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("RyanC", "Ryan", "Chang", "1234", "0", "8", "5");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MatthewM", "Matthew", "Miller", "1234", "0", "7", "6");

INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("AdrianS", "Adrian", "Scott", "1234", "0", "5", "1");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("ChristianH", "Christian", "Hernandez", "1234", "0", "3", "2");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("JoshuaL", "Joshua", "Lee", "1234", "0", "4", "3");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("MichaelT", "Michael", "Thompson", "1234", "0", "7", "4");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("AnthonyC", "Anthony", "Clark", "1234", "0", "8", "5");
INSERT INTO competidor(usuario, nombre, apellido, clave, puntos, id_club, id_peso) VALUES ("ElliotP", "Elliot", "Perez", "1234", "0", "6", "6");




