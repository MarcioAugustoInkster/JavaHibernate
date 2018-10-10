DROP DATABASE IF EXISTS `exemplo_hibernate_00`;
CREATE DATABASE `exemplo_hibernate_00`;
USE `exemplo_hibernate_00`;

DROP TABLE IF EXISTS `sistemas`;
CREATE TABLE `sistemas` (
	id			INT PRIMARY KEY AUTO_INCREMENT,
	nome		VARCHAR(100) NOT NULL
) ENGINE=InnoDB;