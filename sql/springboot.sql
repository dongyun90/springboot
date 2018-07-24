DROP DATABASE IF EXISTS `springboot`;
CREATE DATABASE `springboot`;
DROP TABLE IF EXISTS `spring_boot_test`;
USE `springboot`;
CREATE TABLE `spring_boot_test`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

INSERT INTO `spring_boot_test`
VALUES (1, '李刚刚');

INSERT INTO `spring_boot_test`
VALUES (2, '赵蛋蛋');