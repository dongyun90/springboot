/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50560
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50560
 File Encoding         : 65001

 Date: 23/07/2018 14:20:32
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for spring_boot_test
-- ----------------------------
DROP TABLE IF EXISTS `spring_boot_test`;
CREATE TABLE `spring_boot_test`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of spring_boot_test
-- ----------------------------
INSERT INTO `spring_boot_test` VALUES (1, '李刚刚');
INSERT INTO `spring_boot_test` VALUES (2, '赵蛋蛋');

SET FOREIGN_KEY_CHECKS = 1;
