/*
 Navicat Premium Data Transfer

 Source Server         : JavaEE20软本1
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : longtermroom

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 26/05/2022 08:34:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for band
-- ----------------------------
DROP TABLE IF EXISTS `band`;
CREATE TABLE `band`  (
  `bandid` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `bandname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bandicon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `banddetail` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bandremark` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`bandid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of band
-- ----------------------------
INSERT INTO `band` VALUES (45, '如家1111', 'images\\Band\\homelogo.png', '的', '嗯嗯');
INSERT INTO `band` VALUES (46, '皇冠假期11', 'images\\Band\\homelogo.png', '特别舒适，非常好', '都在繁华地段，大城市');
INSERT INTO `band` VALUES (48, 'eererererer', 'images\\Band\\homelogo.png', 'eeerreererer', 'reererererer');

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `cityid` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `cityname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`cityid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 80 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (60, '深圳');
INSERT INTO `city` VALUES (61, '长春');
INSERT INTO `city` VALUES (62, '澳门');
INSERT INTO `city` VALUES (66, '南京');
INSERT INTO `city` VALUES (77, 'ssddfdfgfg');
INSERT INTO `city` VALUES (78, 'gffggfgfgffggffggfgfgf');
INSERT INTO `city` VALUES (79, 'gfghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh');

-- ----------------------------
-- Table structure for hotel
-- ----------------------------
DROP TABLE IF EXISTS `hotel`;
CREATE TABLE `hotel`  (
  `hotelid` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `hotelname` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelcity` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelband` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelstar` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelstatus` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelordertime` datetime(0) NOT NULL,
  `hotelconfirmtime` datetime(0) NOT NULL,
  `hoteladdr` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hoteldesc` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelcontact` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`hotelid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of hotel
-- ----------------------------
INSERT INTO `hotel` VALUES (12, '香格里拉', '上海', '汉庭酒店', '5', '1', '2022-05-26 01:01:00', '2022-05-26 11:11:00', '上海虹桥1', '高档', '1233333');
INSERT INTO `hotel` VALUES (14, '如家11111', '北京', '汉庭酒店', '5', '1', '2021-06-17 10:24:00', '2021-06-17 10:22:00', '北京顺义', '快捷酒店', '13521505142');
INSERT INTO `hotel` VALUES (15, 'w', 'e', 'e', '1', '1', '2021-06-12 08:29:33', '2021-06-18 08:29:38', '1', '1', '1');

-- ----------------------------
-- Table structure for housestyle
-- ----------------------------
DROP TABLE IF EXISTS `housestyle`;
CREATE TABLE `housestyle`  (
  `housestyleid` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `housestylename` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `housestylecount` int(11) UNSIGNED NOT NULL,
  `housestylelocate` int(11) UNSIGNED NOT NULL,
  `housestylespace` float NOT NULL,
  `housestyleaddbed` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `housestylewindow` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `housestyleprice` float NOT NULL,
  `houseStyleType` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `houseStyleMaxPeople` int(11) UNSIGNED NOT NULL,
  `houseStyleInternet` int(11) UNSIGNED NOT NULL,
  `houseStyleSmoke` int(11) UNSIGNED NOT NULL,
  `houseStyleKeyInfo` varchar(1024) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `hotelid` int(11) UNSIGNED NOT NULL,
  PRIMARY KEY (`housestyleid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of housestyle
-- ----------------------------
INSERT INTO `housestyle` VALUES (1, '总统套房', 10, 5, 125, '不可加床', '有窗', 1500, '双床', 0, 2, 2, 'www', 12);
INSERT INTO `housestyle` VALUES (4, '标准间1', 10, 6, 25, '可以加床', '无窗', 45011, '大床', 2, 1, 1, '比较通风，经济实惠', 2);
INSERT INTO `housestyle` VALUES (5, '总统套房', 10, 5, 125, '不可加床', '有窗', 1500, '大床', 0, 1, 1, '222', 8);
INSERT INTO `housestyle` VALUES (6, ' 大套房', 3, 1, 100, '可以加', '无窗', 10000, '大床', 4, 1, 1, '通气好', 2);
INSERT INTO `housestyle` VALUES (7, '总统套房', 10, 5, 11, '不可加床', '无窗', 2222, '大床', 3, 1, 1, '挺好', 1);
INSERT INTO `housestyle` VALUES (8, '3', 3, 3, 3, '3', '无窗', 3, '大床', 3, 1, 1, '3', 1);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `orderid` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `hotelid` int(11) UNSIGNED NOT NULL COMMENT '酒店Id',
  `housestyleid` int(11) UNSIGNED NOT NULL COMMENT '售卖房型ID',
  `checkindate` datetime(0) NOT NULL COMMENT '入住时间',
  `checkoutdate` datetime(0) NOT NULL COMMENT '离店时间',
  `contactusername` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '入住人姓名',
  `phone` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '电话',
  `status` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单状态',
  `order_number` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单号',
  `create_time` datetime(0) NOT NULL COMMENT '创建时间',
  `openid` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户唯一标识',
  `deposit` float NOT NULL COMMENT '押金',
  `payable` float NOT NULL COMMENT '应付金额',
  `payment` float NOT NULL COMMENT '实付金额',
  `refund_reason` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '退款理由',
  `refuse_refund_reason` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '拒绝退款理由',
  `refund_deposit` float NOT NULL COMMENT ' 退押金金额',
  `drefund_eposit_reason` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT ' 扣押金理由',
  `refund_time` datetime(0) NOT NULL COMMENT '申请退款时间',
  PRIMARY KEY (`orderid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 1, 1, '2020-02-01 00:00:00', '2020-02-02 00:00:00', '邵秀凤', '13521505145', '离店', '1001000111', '2020-02-02 00:00:00', 'sxf111122', 200, 1800, 1800, '改变行程', '特价房不能退', 180, '特价房不能退', '2020-02-01 00:00:00');
INSERT INTO `orders` VALUES (2, 2, 1, '2020-02-01 00:00:00', '2020-02-01 00:00:00', '李李', '111', '嗯嗯', '22', '2020-02-01 00:00:00', '问我', 23, 44, 44, '22', '22', 33, '33', '2020-02-01 00:00:00');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `uid` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `email` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `addr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `birthday` datetime(0) NOT NULL,
  `gender` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123', '张三', '375435307@qq.com', '13521505145', '北京市海淀区', '1976-04-02 00:00:00', 'femaile');

SET FOREIGN_KEY_CHECKS = 1;
