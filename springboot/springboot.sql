/*
Navicat MySQL Data Transfer

Source Server         : 阿里云数据库
Source Server Version : 50634
Source Host           : 121.42.172.30:3306
Source Database       : springboot

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-01-02 20:27:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_tbl
-- ----------------------------
DROP TABLE IF EXISTS `user_tbl`;
CREATE TABLE `user_tbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user_tbl
-- ----------------------------
INSERT INTO `user_tbl` VALUES ('1', 'tanc', '34');
