/*
Navicat MySQL Data Transfer

Source Server         : LinuxMysql
Source Server Version : 50173
Source Host           : 192.168.74.136:3306
Source Database       : cloudDB01

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2019-01-13 12:04:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `deptno` bigint(20) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) DEFAULT NULL COMMENT '部门名称',
  `db_source` varchar(255) DEFAULT NULL COMMENT '来自那个数据库',
  PRIMARY KEY (`deptno`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发部', 'cloudDB01');
INSERT INTO `dept` VALUES ('2', '人事部', 'cloudDB01');
INSERT INTO `dept` VALUES ('3', '财务部', 'cloudDB01');
INSERT INTO `dept` VALUES ('4', '销售部', 'cloudDB01');
INSERT INTO `dept` VALUES ('5', '测试部', 'cloudDB01');
