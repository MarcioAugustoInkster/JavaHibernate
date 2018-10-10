DROP DATABASE IF EXISTS `exemplo_hibernate_00`;
CREATE DATABASE `exemplo_hibernate_00`;
USE `exemplo_hibernate_00`;

DROP TABLE IF EXISTS `sistemas`;
CREATE TABLE `sistemas` (
	id			INT PRIMARY KEY AUTO_INCREMENT,
	nome		VARCHAR(100) NOT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `alunos`;
CREATE TABLE `alunos` (
	id					INT PRIMARY KEY AUTO_INCREMENT,
	nome				VARCHAR(100) NOT NULL,
	nota1				DOUBLE NOT NULL DEFAULT 0,
	nota2				DOUBLE NOT NULL DEFAULT 0,
	nota3				DOUBLE NOT NULL DEFAULT 0,
	nota4				DOUBLE NOT NULL DEFAULT 0,
	quantidade_faltas	INT NOT NULL
) ENGINE=InnoDB;

