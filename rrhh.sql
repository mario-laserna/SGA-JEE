/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50141
Source Host           : localhost:3306
Source Database       : rrhh

Target Server Type    : MYSQL
Target Server Version : 50141
File Encoding         : 65001

Date: 2015-04-14 15:55:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for persona
-- ----------------------------
DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido_paterno` varchar(45) NOT NULL,
  `apellido_materno` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_persona`),
  UNIQUE KEY `email` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of persona
-- ----------------------------
INSERT INTO `persona` VALUES ('1', 'mario', 'laserna', null, 'laserna.mario@gmail.com', null);
INSERT INTO `persona` VALUES ('2', 'aa', 'bb', 'cc', 'aa@bb.com', '123456');
INSERT INTO `persona` VALUES ('3', 'aa', 'bb', 'cc', 'aa2@bb.com', '123456');
