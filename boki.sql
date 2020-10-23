/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50730
Source Host           : localhost:3307
Source Database       : boki

Target Server Type    : MYSQL
Target Server Version : 50730
File Encoding         : 65001

Date: 2020-10-23 16:57:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cilcklog
-- ----------------------------
DROP TABLE IF EXISTS `cilcklog`;
CREATE TABLE `cilcklog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pagename` varchar(150) DEFAULT NULL,
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `ip` varchar(150) DEFAULT NULL,
  `device` varchar(50) DEFAULT NULL,
  `appname` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `platform` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of cilcklog
-- ----------------------------
INSERT INTO `cilcklog` VALUES ('1', 'home', '2020-10-19 18:09:26', '113.89.238.177', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('2', 'home', '2020-10-19 18:09:26', '113.89.238.177', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('3', 'home', '2020-10-19 18:09:56', '113.89.238.177', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('4', 'home', '2020-10-19 18:10:16', '113.89.238.177', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('5', 'home', '2020-10-19 18:10:44', '113.89.238.177', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('6', 'home', '2020-10-20 16:36:28', '113.87.183.224', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('7', 'home', '2020-10-20 16:42:16', '113.87.183.224', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('8', 'home', '2020-10-20 16:44:40', '113.87.183.224', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('9', 'home', '2020-10-20 16:48:47', '113.87.183.224', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('10', 'home', '2020-10-20 16:51:13', '113.87.183.224', 'WindowsPC', 'chrome', '??????', 'win32');
INSERT INTO `cilcklog` VALUES ('11', 'home', '2020-10-20 17:05:29', '113.87.183.224', 'WindowsPC', 'chrome', '广东省深圳市', 'win32');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nickname` varchar(150) DEFAULT NULL COMMENT '昵称',
  `name` varchar(150) DEFAULT NULL COMMENT '用户名',
  `password` varchar(150) DEFAULT NULL COMMENT '密码',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `imei` varchar(255) DEFAULT NULL,
  `ip` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
