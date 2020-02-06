/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : threebody

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-10-14 08:55:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admins
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `adminId` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `adminAccount` varchar(20) NOT NULL COMMENT '管理员账号',
  `adminPetName` varchar(30) DEFAULT NULL COMMENT '管理昵称',
  `adminPassword` varchar(20) NOT NULL DEFAULT '123456' COMMENT '管理员密码',
  `adminIdentify` varchar(20) NOT NULL DEFAULT '商家' COMMENT '身份:管理员、商家',
  `adminGrade` int(11) NOT NULL DEFAULT '1' COMMENT '星级:1级-5级',
  `adminState` varchar(10) DEFAULT '正常' COMMENT '店铺状态:正常、冻结',
  `adminTel` varchar(11) NOT NULL COMMENT '手机号',
  `adminIdcard` varchar(18) DEFAULT NULL COMMENT '身份证号码',
  `adminEmail` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `adminAge` int(11) DEFAULT '1' COMMENT '年龄',
  `adminBirth` date DEFAULT NULL COMMENT '生日',
  `adminIcon` varchar(40) DEFAULT NULL COMMENT '头像',
  `adminIntegral` int(11) NOT NULL DEFAULT '0' COMMENT '积分',
  `adminLoginTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最近登录时间',
  `adminRegisterTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`adminId`),
  UNIQUE KEY `uq_adminid` (`adminId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', '李白', '欧莱雅', '123456', '商家', '5', '正常', '18312321855', '445281199708294612', '2458892691@qq.com', '20', '2019-09-25', null, '10', '2019-10-14 01:18:19', '2019-09-25 14:04:42');
INSERT INTO `admins` VALUES ('2', '杜甫', '碧欧泉', '123456', '商家', '1', '正常', '15358548857', '442548854885485785', 'asdjunasd@qqqcom', '1', '2019-10-11', null, '10', '2019-10-12 15:41:17', '2019-10-24 20:35:29');
INSERT INTO `admins` VALUES ('3', '白居易', '珀莱雅', '123456', '商家', '1', '正常', '18065592462', '562980161649801619', '201984641@qq.com', '32', '1980-02-10', null, '11', '2019-10-07 10:20:09', '2019-10-07 11:20:18');
INSERT INTO `admins` VALUES ('4', '齐白石', '兰蔻', '123456', '商家', '1', '正常', '15870919161', '629206516551961061', '1226589166@qq.com', '40', '1970-05-20', null, '12', '2019-10-08 06:21:27', '2019-10-08 09:21:42');
INSERT INTO `admins` VALUES ('5', '陆游', 'Dior', '123456', '商家', '1', '正常', '13284964104', '329290894619613016', '1054591151@qq.com', '28', '1990-03-08', null, '0', '2019-10-08 00:23:14', '2019-10-08 17:23:22');
INSERT INTO `admins` VALUES ('6', 'admin', 'admin', '123456', '管理员', '1', '正常', '15363393959', '445281199708294611', '2458892691@qq.com', '11', '2019-10-03', null, '12', '2019-10-14 01:22:50', '2019-10-12 10:54:55');

-- ----------------------------
-- Table structure for delivery
-- ----------------------------
DROP TABLE IF EXISTS `delivery`;
CREATE TABLE `delivery` (
  `ordersId` varchar(20) NOT NULL COMMENT '订单编号',
  `trackNum` varchar(20) NOT NULL COMMENT '快递单号',
  `expressCompany` varchar(40) NOT NULL COMMENT '快递公司',
  KEY `fk_ordersId_delivery` (`ordersId`),
  CONSTRAINT `fk_ordersId_delivery` FOREIGN KEY (`ordersId`) REFERENCES `userorders` (`ordersId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of delivery
-- ----------------------------
INSERT INTO `delivery` VALUES ('201909300933313288', '201909300933313288', '三体快递');
INSERT INTO `delivery` VALUES ('201909300933313288', '201909300934195218', '三体快递');
INSERT INTO `delivery` VALUES ('201909300933313288', '201909300934195218', '三体快递');
INSERT INTO `delivery` VALUES ('201909300933313288', '201909300933313288', '11');
INSERT INTO `delivery` VALUES ('201909300933313288', '7888888', '三体');
INSERT INTO `delivery` VALUES ('201910121101179677', '77777777', '啊哈哈');
INSERT INTO `delivery` VALUES ('201910121414425308', '444444444', '4444444444444');
INSERT INTO `delivery` VALUES ('201910121414425308', '444444444', '4444444444444');
INSERT INTO `delivery` VALUES ('201910132100103744', '201910132100103744', '三体快递');
INSERT INTO `delivery` VALUES ('201910140105115984', '201910140105115984', '201910140105115984');

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品编号',
  `goodsName` varchar(50) NOT NULL COMMENT '商品名称',
  `adminId` int(11) NOT NULL COMMENT '管理员编号',
  `goodsState` varchar(10) NOT NULL DEFAULT '上架' COMMENT '商品状态:上架、下架',
  `goodsPrice` double NOT NULL DEFAULT '0' COMMENT '商品价格',
  `goodsBrand` varchar(30) NOT NULL COMMENT '商品品牌',
  `goodsStock` int(11) NOT NULL DEFAULT '0' COMMENT '商品库存',
  `gfId` int(11) NOT NULL COMMENT '功能编号',
  `gtypeId` int(11) NOT NULL COMMENT '类型编号',
  `gsId` int(11) NOT NULL COMMENT '系列编号',
  `goodsInfo` varchar(255) DEFAULT '商品简介' COMMENT '商品简介',
  `goodsRegisterTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '商品上架时间',
  PRIMARY KEY (`goodsId`),
  UNIQUE KEY `uq_goodsId` (`goodsId`),
  KEY `fk_adminId_goods` (`adminId`),
  KEY `fk_gfId_goods` (`gfId`),
  KEY `fk_gsId_goods` (`gsId`),
  KEY `fk_gtypeId_goods` (`gtypeId`),
  CONSTRAINT `fk_adminId_goods` FOREIGN KEY (`adminId`) REFERENCES `admins` (`adminId`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_gfId_goods` FOREIGN KEY (`gfId`) REFERENCES `goodsfunction` (`gfId`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_gsId_goods` FOREIGN KEY (`gsId`) REFERENCES `goodsserie` (`gsId`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_gtypeId_goods` FOREIGN KEY (`gtypeId`) REFERENCES `goodstype` (`gtypeId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '男士补水精华液', '1', '上架', '125', '欧莱雅', '456', '1', '1', '1', '商品简介', '2019-09-26 16:30:06');
INSERT INTO `goods` VALUES ('2', '男士洗面奶', '1', '上架', '50', '欧莱雅', '200', '1', '1', '1', '商品简介', '2019-09-26 22:43:14');
INSERT INTO `goods` VALUES ('3', '碧欧泉爽肤水', '1', '上架', '78', '欧莱雅', '500', '1', '1', '1', '商品简介', '2019-09-27 09:46:53');
INSERT INTO `goods` VALUES ('4', '碧欧泉黑魔法面膜', '2', '上架', '85', '碧欧泉', '526', '1', '1', '1', '商品简介', '2019-09-27 09:47:38');
INSERT INTO `goods` VALUES ('5', '碧欧泉清透版[奇迹水]', '1', '上架', '350', '欧莱雅', '100', '1', '1', '1', '商品简介', '2019-10-05 13:55:47');
INSERT INTO `goods` VALUES ('6', '碧欧泉奇迹日夜修护愈颜礼盒', '2', '上架', '1180', '碧欧泉', '200', '2', '2', '2', '商品简介', '2019-10-05 13:58:19');
INSERT INTO `goods` VALUES ('9', '碧欧泉奇迹面膜', '2', '上架', '390', '碧欧泉', '250', '3', '3', '2', '商品简介', '2019-10-05 14:00:24');
INSERT INTO `goods` VALUES ('10', '碧欧泉黑魔法面膜', '2', '上架', '425', '碧欧泉', '300', '3', '3', '2', '商品简介', '2019-10-05 14:00:34');
INSERT INTO `goods` VALUES ('11', '碧欧泉蓝源眼霜', '2', '上架', '480', '碧欧泉', '210', '3', '3', '2', '商品简介', '2019-10-08 14:01:50');
INSERT INTO `goods` VALUES ('12', '碧欧泉绿薄荷眼霜', '2', '上架', '390', '碧欧泉', '300', '1', '1', '1', '商品简介', '2019-10-08 14:02:53');
INSERT INTO `goods` VALUES ('13', '碧欧泉暖活泉', '2', '上架', '385', '碧欧泉', '213', '1', '1', '1', '商品简介', '2019-10-08 14:03:35');
INSERT INTO `goods` VALUES ('14', '碧欧泉蓝源面霜', '2', '上架', '580', '碧欧泉', '210', '1', '1', '1', '商品简介', '2019-10-08 14:04:16');
INSERT INTO `goods` VALUES ('15', '碧欧泉奇迹面膜刷', '2', '上架', '100', '碧欧泉', '500', '1', '1', '1', '商品简介', '2019-10-05 14:06:54');
INSERT INTO `goods` VALUES ('17', '欧莱雅清洁面膜', '1', '上架', '79.99', '欧莱雅', '700', '9', '2', '1', '商品简介', '2019-09-11 18:21:10');
INSERT INTO `goods` VALUES ('18', '经典999口红', '5', '上架', '199', 'Dior', '1000', '10', '6', '5', '商品简介', '2019-03-14 06:23:55');
INSERT INTO `goods` VALUES ('19', '兰蔻日用眼霜', '4', '上架', '49.28', '兰蔻', '20', '4', '8', '4', '商品简介', '2019-10-01 18:25:26');
INSERT INTO `goods` VALUES ('20', '珀莱雅保湿霜', '3', '上架', '218.8', '珀莱雅', '60', '5', '3', '3', '商品简介', '2019-08-07 18:29:59');
INSERT INTO `goods` VALUES ('21', '欧莱雅精华', '1', '上架', '399', '欧莱雅', '500', '4', '1', '1', '商品简介', '2019-09-02 10:56:06');
INSERT INTO `goods` VALUES ('22', '欧莱雅粉底液', '1', '上架', '150', '欧莱雅', '500', '8', '6', '1', '商品简介', '2019-09-02 10:58:39');
INSERT INTO `goods` VALUES ('23', '欧莱雅男士洗面奶', '1', '上架', '39', '欧莱雅', '500', '3', '2', '1', '商品简介', '2019-08-14 10:00:03');
INSERT INTO `goods` VALUES ('24', '欧莱雅护发精油', '1', '上架', '38.9', '欧莱雅', '1200', '2', '5', '1', '商品简介', '2019-10-06 10:01:33');
INSERT INTO `goods` VALUES ('25', '眼唇卸妆', '1', '上架', '129', '欧莱雅', '1500', '9', '2', '1', '商品简介', '2019-10-06 10:03:03');
INSERT INTO `goods` VALUES ('26', '碧欧泉保湿套装', '2', '上架', '480', '碧欧泉', '1500', '5', '3', '2', '商品简介', '2019-10-02 10:04:51');
INSERT INTO `goods` VALUES ('27', '碧欧泉男士洁面乳', '1', '上架', '240', '碧欧泉', '2000', '3', '2', '2', '商品简介', '2019-10-02 19:06:44');
INSERT INTO `goods` VALUES ('28', '奇迹眼霜', '2', '上架', '410', '碧欧泉', '1000', '4', '8', '2', '商品简介', '2019-10-02 19:08:07');
INSERT INTO `goods` VALUES ('29', '蓝源面霜', '2', '上架', '580', '碧欧泉', '1200', '5', '3', '2', '商品简介', '2019-10-08 19:09:43');
INSERT INTO `goods` VALUES ('30', '珀莱雅气垫CC', '3', '上架', '129', '珀莱雅', '1500', '9', '6', '3', '商品简介', '2019-08-07 19:11:37');
INSERT INTO `goods` VALUES ('31', '珀莱雅妆前隔离', '3', '上架', '128', '珀莱雅', '1500', '10', '7', '3', '商品简介', '2019-10-14 19:13:58');
INSERT INTO `goods` VALUES ('32', '珀莱雅防晒美白乳', '3', '上架', '79', '珀莱雅', '5000', '10', '7', '3', '商品简介', '2019-10-14 19:15:44');
INSERT INTO `goods` VALUES ('33', '珀莱雅素颜霜', '3', '上架', '99', '珀莱雅', '5000', '8', '6', '3', '商品简介', '2019-10-08 19:17:02');
INSERT INTO `goods` VALUES ('34', '兰蔻去痘印套装', '4', '上架', '995', '兰蔻', '3000', '7', '3', '4', '商品简介', '2019-09-16 19:19:42');
INSERT INTO `goods` VALUES ('35', '兰蔻身体乳', '4', '上架', '480', '兰蔻', '2000', '5', '5', '4', '商品简介', '2019-10-07 19:22:00');
INSERT INTO `goods` VALUES ('36', '兰蔻小嫩膜', '4', '上架', '600', '兰蔻', '30000', '6', '4', '4', '紧致肌肤面膜', '2019-09-03 19:23:44');
INSERT INTO `goods` VALUES ('37', '兰蔻身体磨砂膏', '4', '上架', '350', '兰蔻', '5000', '9', '5', '4', '清滢玫瑰蜜糖磨砂啫喱', '2019-10-02 19:26:21');
INSERT INTO `goods` VALUES ('38', '花漾香水', '5', '上架', '358', 'Dior', '5000', '10', '5', '5', '商品简介', '2019-10-01 19:28:40');
INSERT INTO `goods` VALUES ('39', '777852', '2', '上架', '777', '777', '77', '1', '4', '1', '7777', '2019-10-12 15:05:20');

-- ----------------------------
-- Table structure for goodsevaluation
-- ----------------------------
DROP TABLE IF EXISTS `goodsevaluation`;
CREATE TABLE `goodsevaluation` (
  `gevaId` int(11) NOT NULL AUTO_INCREMENT COMMENT '评价编号',
  `goodsId` int(11) NOT NULL COMMENT '商品编号',
  `gevaText` varchar(255) DEFAULT NULL COMMENT '评价内容',
  `userId` int(11) NOT NULL COMMENT '用户编号',
  `gevaLevel` int(11) NOT NULL DEFAULT '1' COMMENT '评价星级',
  `gevaDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评价日期',
  PRIMARY KEY (`gevaId`),
  UNIQUE KEY `uq_gevaId_goodsevaluation` (`gevaId`),
  KEY `fk_goodsId` (`goodsId`),
  KEY `fk_userId_goodsevaluation` (`userId`),
  CONSTRAINT `fk_goodsId` FOREIGN KEY (`goodsId`) REFERENCES `goods` (`goodsId`) ON DELETE NO ACTION ON UPDATE CASCADE,
  CONSTRAINT `fk_userId_goodsevaluation` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=155 DEFAULT CHARSET=utf8 COMMENT='商品评价表';

-- ----------------------------
-- Records of goodsevaluation
-- ----------------------------
INSERT INTO `goodsevaluation` VALUES ('1', '1', '这个真好用', '1', '5', '2019-09-26 16:30:38');
INSERT INTO `goodsevaluation` VALUES ('2', '1', '自从用了这个产品我感觉都要飞起来了', '2', '1', '2019-10-08 18:52:54');
INSERT INTO `goodsevaluation` VALUES ('3', '1', '给我蓝朋友买的，真好用', '3', '5', '2019-10-08 18:53:11');
INSERT INTO `goodsevaluation` VALUES ('4', '4', '杨小辉用了，他说不错', '1', '1', '2019-10-11 20:22:52');
INSERT INTO `goodsevaluation` VALUES ('5', '1', '丘彪用了，他也觉得不错', '2', '1', '2019-10-11 20:23:01');
INSERT INTO `goodsevaluation` VALUES ('6', '1', '杨小辉用了，他说不错', '3', '1', '2019-10-12 00:35:08');
INSERT INTO `goodsevaluation` VALUES ('7', '1', '徐奕海用了，他觉得OK，但是他喜欢给差评', '4', '1', '2019-10-12 00:35:30');
INSERT INTO `goodsevaluation` VALUES ('8', '2', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:47:50');
INSERT INTO `goodsevaluation` VALUES ('9', '1', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:49:21');
INSERT INTO `goodsevaluation` VALUES ('10', '1', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('11', '1', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('12', '1', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('13', '2', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('14', '2', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('15', '2', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('16', '2', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('17', '3', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('18', '3', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('19', '3', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('20', '3', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:49:22');
INSERT INTO `goodsevaluation` VALUES ('21', '4', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:50:01');
INSERT INTO `goodsevaluation` VALUES ('22', '4', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:50:01');
INSERT INTO `goodsevaluation` VALUES ('23', '4', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:50:01');
INSERT INTO `goodsevaluation` VALUES ('24', '4', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:50:01');
INSERT INTO `goodsevaluation` VALUES ('25', '5', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('26', '5', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('27', '5', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('28', '5', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('29', '6', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('30', '6', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('31', '6', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('32', '6', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:50:02');
INSERT INTO `goodsevaluation` VALUES ('33', '9', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('34', '9', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('35', '9', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('36', '9', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('37', '10', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('38', '10', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('39', '10', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('40', '10', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('41', '11', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('42', '11', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('43', '11', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('44', '11', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:50:38');
INSERT INTO `goodsevaluation` VALUES ('45', '12', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('46', '12', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('47', '12', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('48', '12', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('49', '13', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('50', '13', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('51', '13', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('52', '13', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:51:14');
INSERT INTO `goodsevaluation` VALUES ('53', '14', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:51:15');
INSERT INTO `goodsevaluation` VALUES ('54', '14', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:51:15');
INSERT INTO `goodsevaluation` VALUES ('55', '14', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:51:15');
INSERT INTO `goodsevaluation` VALUES ('56', '14', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:51:15');
INSERT INTO `goodsevaluation` VALUES ('57', '15', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('58', '15', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('59', '15', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('60', '15', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('61', '17', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('62', '17', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('63', '17', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('64', '17', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('65', '18', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('66', '18', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('67', '18', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('68', '18', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:52:06');
INSERT INTO `goodsevaluation` VALUES ('69', '19', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('70', '19', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('71', '19', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('72', '19', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('73', '20', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('74', '20', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('75', '20', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('76', '20', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('77', '21', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('78', '21', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('79', '21', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('80', '21', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:52:33');
INSERT INTO `goodsevaluation` VALUES ('81', '22', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('82', '22', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('83', '22', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('84', '22', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('85', '23', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('86', '23', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('87', '23', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('88', '23', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('89', '24', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('90', '24', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('91', '24', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('92', '24', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:53:15');
INSERT INTO `goodsevaluation` VALUES ('93', '25', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('94', '25', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('95', '25', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('96', '25', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('97', '26', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('98', '26', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('99', '26', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('100', '26', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('101', '27', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('102', '27', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('103', '27', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('104', '27', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:53:33');
INSERT INTO `goodsevaluation` VALUES ('105', '28', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('106', '28', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('107', '28', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('108', '28', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('109', '29', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('110', '29', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('111', '29', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('112', '29', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('113', '30', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('114', '30', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('115', '30', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('116', '30', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:54:00');
INSERT INTO `goodsevaluation` VALUES ('117', '31', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:54:37');
INSERT INTO `goodsevaluation` VALUES ('118', '31', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:54:37');
INSERT INTO `goodsevaluation` VALUES ('119', '31', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:54:37');
INSERT INTO `goodsevaluation` VALUES ('120', '31', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:54:37');
INSERT INTO `goodsevaluation` VALUES ('121', '32', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:54:37');
INSERT INTO `goodsevaluation` VALUES ('122', '32', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:54:37');
INSERT INTO `goodsevaluation` VALUES ('123', '32', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:54:38');
INSERT INTO `goodsevaluation` VALUES ('124', '32', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:54:38');
INSERT INTO `goodsevaluation` VALUES ('125', '33', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:54:38');
INSERT INTO `goodsevaluation` VALUES ('126', '33', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:54:38');
INSERT INTO `goodsevaluation` VALUES ('127', '33', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:54:38');
INSERT INTO `goodsevaluation` VALUES ('128', '33', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:54:38');
INSERT INTO `goodsevaluation` VALUES ('129', '34', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('130', '34', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('131', '34', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('132', '34', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('133', '35', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('134', '35', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('135', '35', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('136', '35', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('137', '36', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('138', '36', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('139', '36', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('140', '36', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:55:01');
INSERT INTO `goodsevaluation` VALUES ('141', '37', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:55:20');
INSERT INTO `goodsevaluation` VALUES ('142', '37', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:55:20');
INSERT INTO `goodsevaluation` VALUES ('143', '37', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:55:20');
INSERT INTO `goodsevaluation` VALUES ('144', '37', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:55:20');
INSERT INTO `goodsevaluation` VALUES ('145', '38', '杨小辉用了，他说不错', '2', '4', '2019-10-12 00:55:20');
INSERT INTO `goodsevaluation` VALUES ('146', '38', '丘彪用了，他也觉得不错', '2', '4', '2019-10-12 00:55:20');
INSERT INTO `goodsevaluation` VALUES ('147', '38', '徐奕海用了，他觉得OK，但是他喜欢给差评', '2', '4', '2019-10-12 00:55:21');
INSERT INTO `goodsevaluation` VALUES ('148', '38', '何佳佳是女的，所以买了这个男妆很浪费', '2', '4', '2019-10-12 00:55:21');
INSERT INTO `goodsevaluation` VALUES ('149', '18', 'aaaaa', '1', '4', '2019-10-12 11:02:38');
INSERT INTO `goodsevaluation` VALUES ('150', '4', 'aaaaaa', '1', '0', '2019-10-12 11:03:06');
INSERT INTO `goodsevaluation` VALUES ('151', '24', '我说非常66666', '1', '5', '2019-10-13 21:14:53');
INSERT INTO `goodsevaluation` VALUES ('152', '4', '真好用', '1', '5', '2019-10-14 00:20:39');
INSERT INTO `goodsevaluation` VALUES ('153', '1', '46465465464', '30', '5', '2019-10-14 01:05:32');
INSERT INTO `goodsevaluation` VALUES ('154', '27', '6666666464646', '31', '5', '2019-10-14 01:18:01');

-- ----------------------------
-- Table structure for goodsfunction
-- ----------------------------
DROP TABLE IF EXISTS `goodsfunction`;
CREATE TABLE `goodsfunction` (
  `gfId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品功能编号',
  `gfName` varchar(20) NOT NULL COMMENT '商品功能名称',
  PRIMARY KEY (`gfId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsfunction
-- ----------------------------
INSERT INTO `goodsfunction` VALUES ('1', '补水');
INSERT INTO `goodsfunction` VALUES ('2', '去屑');
INSERT INTO `goodsfunction` VALUES ('3', '修复');
INSERT INTO `goodsfunction` VALUES ('4', '抗衰老');
INSERT INTO `goodsfunction` VALUES ('5', '保湿');
INSERT INTO `goodsfunction` VALUES ('6', '紧致肌肤');
INSERT INTO `goodsfunction` VALUES ('7', '祛痘');
INSERT INTO `goodsfunction` VALUES ('8', '美白');
INSERT INTO `goodsfunction` VALUES ('9', '去角质');
INSERT INTO `goodsfunction` VALUES ('10', '淡化雀斑');
INSERT INTO `goodsfunction` VALUES ('11', '提升气色');

-- ----------------------------
-- Table structure for goodsphoto
-- ----------------------------
DROP TABLE IF EXISTS `goodsphoto`;
CREATE TABLE `goodsphoto` (
  `goodsPhotoId` int(8) NOT NULL AUTO_INCREMENT,
  `goodsId` int(11) NOT NULL,
  `gphotoCode` varchar(50) NOT NULL COMMENT 'gphotoCode',
  PRIMARY KEY (`goodsPhotoId`),
  KEY `FK_goodsIdA` (`goodsId`) USING BTREE,
  CONSTRAINT `FK_goodsIdA` FOREIGN KEY (`goodsId`) REFERENCES `goods` (`goodsId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3416 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsphoto
-- ----------------------------
INSERT INTO `goodsphoto` VALUES ('1', '1', 'images/pdetail5.jpg');
INSERT INTO `goodsphoto` VALUES ('2', '1', 'images/pdetail2.jpg');
INSERT INTO `goodsphoto` VALUES ('3', '1', 'images/pdetail3.jpg');
INSERT INTO `goodsphoto` VALUES ('4', '1', 'images/pdetail4.jpg');
INSERT INTO `goodsphoto` VALUES ('5', '4', 'images/pdetail5.jpg');
INSERT INTO `goodsphoto` VALUES ('6', '4', 'images/pdetail2.jpg');
INSERT INTO `goodsphoto` VALUES ('7', '4', 'images/pdetail3.jpg');
INSERT INTO `goodsphoto` VALUES ('8', '4', 'images/pdetail4.jpg');
INSERT INTO `goodsphoto` VALUES ('101', '1', 'images/goods/101.jpg');
INSERT INTO `goodsphoto` VALUES ('102', '1', 'images/goods/102.jpg');
INSERT INTO `goodsphoto` VALUES ('1701', '17', 'images/goods/1701.jpg');
INSERT INTO `goodsphoto` VALUES ('1702', '17', 'images/goods/1702.jpg');
INSERT INTO `goodsphoto` VALUES ('1703', '17', 'images/goods/1703.jpg');
INSERT INTO `goodsphoto` VALUES ('1801', '18', 'images/goods/1801.jpg');
INSERT INTO `goodsphoto` VALUES ('1802', '18', 'images/goods/1802.jpg');
INSERT INTO `goodsphoto` VALUES ('1803', '18', 'images/goods/1803.jpg');
INSERT INTO `goodsphoto` VALUES ('1901', '19', 'images/goods/1901.jpg');
INSERT INTO `goodsphoto` VALUES ('1902', '19', 'images/goods/1902.jpg');
INSERT INTO `goodsphoto` VALUES ('1903', '19', 'images/goods/1903.jpg');
INSERT INTO `goodsphoto` VALUES ('2001', '20', 'images/goods/2001.jpg');
INSERT INTO `goodsphoto` VALUES ('2002', '20', 'images/goods/2002.jpg');
INSERT INTO `goodsphoto` VALUES ('2003', '20', 'images/goods/2003.jpg');
INSERT INTO `goodsphoto` VALUES ('2101', '21', 'images/goods/2101.jpg');
INSERT INTO `goodsphoto` VALUES ('2102', '21', 'images/goods/2102.jpg');
INSERT INTO `goodsphoto` VALUES ('2103', '21', 'images/goods/2103.jpg');
INSERT INTO `goodsphoto` VALUES ('2201', '22', 'images/goods/2201.jpg');
INSERT INTO `goodsphoto` VALUES ('2202', '22', 'images/goods/2202.jpg');
INSERT INTO `goodsphoto` VALUES ('2203', '22', 'images/goods/2203.jpg');
INSERT INTO `goodsphoto` VALUES ('2301', '23', 'images/goods/2301.jpg');
INSERT INTO `goodsphoto` VALUES ('2302', '23', 'images/goods/2302.jpg');
INSERT INTO `goodsphoto` VALUES ('2303', '23', 'images/goods/2303.jpg');
INSERT INTO `goodsphoto` VALUES ('2401', '24', 'images/goods/2401.jpg');
INSERT INTO `goodsphoto` VALUES ('2402', '24', 'images/goods/2402.jpg');
INSERT INTO `goodsphoto` VALUES ('2403', '24', 'images/goods/2403.jpg');
INSERT INTO `goodsphoto` VALUES ('2601', '26', 'images/goods/2601.jpg');
INSERT INTO `goodsphoto` VALUES ('2602', '26', 'images/goods/2602.jpg');
INSERT INTO `goodsphoto` VALUES ('2603', '26', 'images/goods/2603.jpg');
INSERT INTO `goodsphoto` VALUES ('2701', '27', 'images/goods/2701.jpg');
INSERT INTO `goodsphoto` VALUES ('2702', '27', 'images/goods/2702.jpg');
INSERT INTO `goodsphoto` VALUES ('2703', '27', 'images/goods/2703.jpg');
INSERT INTO `goodsphoto` VALUES ('2801', '28', 'images/goods/2801.jpg');
INSERT INTO `goodsphoto` VALUES ('2802', '28', 'images/goods/2802.jpg');
INSERT INTO `goodsphoto` VALUES ('2803', '28', 'images/goods/2803.jpg');
INSERT INTO `goodsphoto` VALUES ('2901', '29', 'images/goods/2901.jpg');
INSERT INTO `goodsphoto` VALUES ('2902', '29', 'images/goods/2902.jpg');
INSERT INTO `goodsphoto` VALUES ('2903', '29', 'images/goods/2903.jpg');
INSERT INTO `goodsphoto` VALUES ('3001', '30', 'images/goods/3001.jpg');
INSERT INTO `goodsphoto` VALUES ('3002', '30', 'images/goods/3002.jpg');
INSERT INTO `goodsphoto` VALUES ('3003', '30', 'images/goods/3003.jpg');
INSERT INTO `goodsphoto` VALUES ('3101', '31', 'images/goods/3101.jpg');
INSERT INTO `goodsphoto` VALUES ('3102', '31', 'images/goods/3102.jpg');
INSERT INTO `goodsphoto` VALUES ('3103', '31', 'images/goods/3103.jpg');
INSERT INTO `goodsphoto` VALUES ('3201', '32', 'images/goods/3201.jpg');
INSERT INTO `goodsphoto` VALUES ('3202', '32', 'images/goods/3202.jpg');
INSERT INTO `goodsphoto` VALUES ('3203', '32', 'images/goods/3203.jpg');
INSERT INTO `goodsphoto` VALUES ('3301', '33', 'images/goods/3301.jpg');
INSERT INTO `goodsphoto` VALUES ('3302', '33', 'images/goods/3302.jpg');
INSERT INTO `goodsphoto` VALUES ('3303', '33', 'images/goods/3303.jpg');
INSERT INTO `goodsphoto` VALUES ('3401', '34', 'images/goods/3401.jpg');
INSERT INTO `goodsphoto` VALUES ('3402', '34', 'images/goods/3402.jpg');
INSERT INTO `goodsphoto` VALUES ('3403', '34', 'images/goods/3403.jpg');
INSERT INTO `goodsphoto` VALUES ('3408', '6', 'images/goods/BIO20124.jpg');
INSERT INTO `goodsphoto` VALUES ('3409', '9', 'images/goods/BIO00035.jpg');
INSERT INTO `goodsphoto` VALUES ('3410', '10', 'images/goods/BIO00078.jpg');
INSERT INTO `goodsphoto` VALUES ('3411', '11', 'images/goods/BIO00030.jpg');
INSERT INTO `goodsphoto` VALUES ('3412', '12', 'images/goods/BIO00057.jpg');
INSERT INTO `goodsphoto` VALUES ('3413', '13', 'images/goods/BIO00052.jpg');
INSERT INTO `goodsphoto` VALUES ('3414', '14', 'images/goods/BIO00028.jpg');
INSERT INTO `goodsphoto` VALUES ('3415', '15', 'images/goods/BIO00036.jpg');

-- ----------------------------
-- Table structure for goodsserie
-- ----------------------------
DROP TABLE IF EXISTS `goodsserie`;
CREATE TABLE `goodsserie` (
  `gsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品系列编号',
  `gsName` varchar(20) NOT NULL COMMENT '商品系列名称',
  PRIMARY KEY (`gsId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodsserie
-- ----------------------------
INSERT INTO `goodsserie` VALUES ('1', '欧莱雅系列');
INSERT INTO `goodsserie` VALUES ('2', '碧欧泉系列');
INSERT INTO `goodsserie` VALUES ('3', '珀莱雅系列');
INSERT INTO `goodsserie` VALUES ('4', '兰蔻系列');
INSERT INTO `goodsserie` VALUES ('5', 'Dior系列');

-- ----------------------------
-- Table structure for goodstype
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `gtypeId` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品类型编号',
  `gtypeName` varchar(20) NOT NULL COMMENT '商品类型名称',
  PRIMARY KEY (`gtypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goodstype
-- ----------------------------
INSERT INTO `goodstype` VALUES ('1', '补水');
INSERT INTO `goodstype` VALUES ('2', '洁面');
INSERT INTO `goodstype` VALUES ('3', '保湿');
INSERT INTO `goodstype` VALUES ('4', '面膜');
INSERT INTO `goodstype` VALUES ('5', '身体护理');
INSERT INTO `goodstype` VALUES ('6', '美妆工具');
INSERT INTO `goodstype` VALUES ('7', '防晒隔离');
INSERT INTO `goodstype` VALUES ('8', '眼部护理');

-- ----------------------------
-- Table structure for orderitems
-- ----------------------------
DROP TABLE IF EXISTS `orderitems`;
CREATE TABLE `orderitems` (
  `itemsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单详情编号',
  `ordersId` varchar(20) NOT NULL,
  `goodId` int(11) NOT NULL,
  `itemsNum` int(11) NOT NULL,
  PRIMARY KEY (`itemsId`),
  UNIQUE KEY `uq_itemsId_orderitems` (`itemsId`),
  KEY `fk_gordersId_orderitems` (`ordersId`),
  KEY `fk_goodsId_orderitems` (`goodId`),
  CONSTRAINT `fk_goodsId_orderitems` FOREIGN KEY (`goodId`) REFERENCES `goods` (`goodsId`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_gordersId_orderitems` FOREIGN KEY (`ordersId`) REFERENCES `userorders` (`ordersId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='订单详情表';

-- ----------------------------
-- Records of orderitems
-- ----------------------------
INSERT INTO `orderitems` VALUES ('1', '201909300933313288', '1', '222');
INSERT INTO `orderitems` VALUES ('2', '201910102004064492', '18', '52');
INSERT INTO `orderitems` VALUES ('3', '201910102004064492', '23', '1');
INSERT INTO `orderitems` VALUES ('4', '201910102007394912', '24', '2');
INSERT INTO `orderitems` VALUES ('5', '201910102004064492', '19', '2');
INSERT INTO `orderitems` VALUES ('6', '201910102011180483', '27', '3');
INSERT INTO `orderitems` VALUES ('7', '201910102010110130', '22', '3');
INSERT INTO `orderitems` VALUES ('8', '201910102007394912', '28', '1');
INSERT INTO `orderitems` VALUES ('9', '201910102007394912', '17', '2');
INSERT INTO `orderitems` VALUES ('10', '201910102009093100', '38', '2');
INSERT INTO `orderitems` VALUES ('11', '201910102009093100', '30', '1');
INSERT INTO `orderitems` VALUES ('12', '201910102011180483', '25', '2');
INSERT INTO `orderitems` VALUES ('13', '201910121048572605', '1', '19');
INSERT INTO `orderitems` VALUES ('14', '201910121100389216', '4', '1');
INSERT INTO `orderitems` VALUES ('15', '201910121100389216', '1', '21');
INSERT INTO `orderitems` VALUES ('16', '201910121101179677', '4', '1');
INSERT INTO `orderitems` VALUES ('17', '201910121101179677', '1', '21');
INSERT INTO `orderitems` VALUES ('18', '201910121406384238', '24', '1');
INSERT INTO `orderitems` VALUES ('19', '201910121410401971', '24', '1');
INSERT INTO `orderitems` VALUES ('20', '201910121411051615', '24', '1');
INSERT INTO `orderitems` VALUES ('21', '201910121414425308', '24', '1');
INSERT INTO `orderitems` VALUES ('22', '201910121539453766', '24', '1');
INSERT INTO `orderitems` VALUES ('23', '201910132012399731', '1', '21');
INSERT INTO `orderitems` VALUES ('24', '201910132012399731', '23', '16');
INSERT INTO `orderitems` VALUES ('25', '201910132012399731', '24', '10');
INSERT INTO `orderitems` VALUES ('26', '201910132012553660', '1', '21');
INSERT INTO `orderitems` VALUES ('27', '201910132012553660', '23', '16');
INSERT INTO `orderitems` VALUES ('28', '201910132012553660', '24', '10');
INSERT INTO `orderitems` VALUES ('29', '201910132014002190', '1', '21');
INSERT INTO `orderitems` VALUES ('30', '201910132014002190', '23', '16');
INSERT INTO `orderitems` VALUES ('31', '201910132014002190', '24', '10');
INSERT INTO `orderitems` VALUES ('32', '201910132014253025', '1', '21');
INSERT INTO `orderitems` VALUES ('33', '201910132014253025', '23', '16');
INSERT INTO `orderitems` VALUES ('34', '201910132014253025', '24', '10');
INSERT INTO `orderitems` VALUES ('35', '201910132018314015', '1', '21');
INSERT INTO `orderitems` VALUES ('36', '201910132018314015', '23', '16');
INSERT INTO `orderitems` VALUES ('37', '201910132018314015', '24', '10');
INSERT INTO `orderitems` VALUES ('38', '201910132019223056', '1', '21');
INSERT INTO `orderitems` VALUES ('39', '201910132019223056', '23', '16');
INSERT INTO `orderitems` VALUES ('40', '201910132019223056', '24', '10');
INSERT INTO `orderitems` VALUES ('41', '201910132021332245', '1', '21');
INSERT INTO `orderitems` VALUES ('42', '201910132021332245', '23', '16');
INSERT INTO `orderitems` VALUES ('43', '201910132021332245', '24', '10');
INSERT INTO `orderitems` VALUES ('44', '201910132025046273', '1', '21');
INSERT INTO `orderitems` VALUES ('45', '201910132025046273', '23', '16');
INSERT INTO `orderitems` VALUES ('46', '201910132025046273', '24', '10');
INSERT INTO `orderitems` VALUES ('47', '201910132025565245', '1', '21');
INSERT INTO `orderitems` VALUES ('48', '201910132025565245', '23', '16');
INSERT INTO `orderitems` VALUES ('49', '201910132025565245', '24', '10');
INSERT INTO `orderitems` VALUES ('50', '201910132030198610', '1', '21');
INSERT INTO `orderitems` VALUES ('51', '201910132030198610', '23', '16');
INSERT INTO `orderitems` VALUES ('52', '201910132030198610', '24', '10');
INSERT INTO `orderitems` VALUES ('53', '201910132030475265', '1', '21');
INSERT INTO `orderitems` VALUES ('54', '201910132030475265', '23', '16');
INSERT INTO `orderitems` VALUES ('55', '201910132030475265', '24', '10');
INSERT INTO `orderitems` VALUES ('56', '201910132031241658', '1', '21');
INSERT INTO `orderitems` VALUES ('57', '201910132031241658', '23', '16');
INSERT INTO `orderitems` VALUES ('58', '201910132031241658', '24', '10');
INSERT INTO `orderitems` VALUES ('59', '201910132031308800', '1', '21');
INSERT INTO `orderitems` VALUES ('60', '201910132031308800', '23', '16');
INSERT INTO `orderitems` VALUES ('61', '201910132031308800', '24', '10');
INSERT INTO `orderitems` VALUES ('62', '201910132032007955', '1', '21');
INSERT INTO `orderitems` VALUES ('63', '201910132032007955', '23', '16');
INSERT INTO `orderitems` VALUES ('64', '201910132032007955', '24', '10');
INSERT INTO `orderitems` VALUES ('65', '201910132032174771', '1', '21');
INSERT INTO `orderitems` VALUES ('66', '201910132032174771', '23', '16');
INSERT INTO `orderitems` VALUES ('67', '201910132032174771', '24', '10');
INSERT INTO `orderitems` VALUES ('68', '201910132032291125', '1', '21');
INSERT INTO `orderitems` VALUES ('69', '201910132032291125', '23', '16');
INSERT INTO `orderitems` VALUES ('70', '201910132032291125', '24', '10');
INSERT INTO `orderitems` VALUES ('71', '201910132033102774', '1', '21');
INSERT INTO `orderitems` VALUES ('72', '201910132033102774', '23', '16');
INSERT INTO `orderitems` VALUES ('73', '201910132033102774', '24', '10');
INSERT INTO `orderitems` VALUES ('74', '201910132033485638', '1', '21');
INSERT INTO `orderitems` VALUES ('75', '201910132033485638', '23', '16');
INSERT INTO `orderitems` VALUES ('76', '201910132033485638', '24', '10');
INSERT INTO `orderitems` VALUES ('77', '201910132034080930', '1', '21');
INSERT INTO `orderitems` VALUES ('78', '201910132034080930', '23', '16');
INSERT INTO `orderitems` VALUES ('79', '201910132034080930', '24', '10');
INSERT INTO `orderitems` VALUES ('80', '201910132035163864', '1', '21');
INSERT INTO `orderitems` VALUES ('81', '201910132035163864', '23', '16');
INSERT INTO `orderitems` VALUES ('82', '201910132035163864', '24', '10');
INSERT INTO `orderitems` VALUES ('83', '201910132036183385', '1', '21');
INSERT INTO `orderitems` VALUES ('84', '201910132036183385', '23', '16');
INSERT INTO `orderitems` VALUES ('85', '201910132036183385', '24', '10');
INSERT INTO `orderitems` VALUES ('86', '201910132038486576', '1', '21');
INSERT INTO `orderitems` VALUES ('87', '201910132038486576', '23', '16');
INSERT INTO `orderitems` VALUES ('88', '201910132038486576', '24', '10');
INSERT INTO `orderitems` VALUES ('89', '201910132044071867', '1', '21');
INSERT INTO `orderitems` VALUES ('90', '201910132046434150', '1', '21');
INSERT INTO `orderitems` VALUES ('91', '201910132100103744', '1', '21');
INSERT INTO `orderitems` VALUES ('92', '201910132100103744', '23', '16');
INSERT INTO `orderitems` VALUES ('93', '201910132100103744', '24', '10');
INSERT INTO `orderitems` VALUES ('94', '201910140003234510', '1', '31');
INSERT INTO `orderitems` VALUES ('95', '201910140003234510', '23', '16');
INSERT INTO `orderitems` VALUES ('96', '201910140003234510', '24', '10');
INSERT INTO `orderitems` VALUES ('97', '201910140004383627', '1', '31');
INSERT INTO `orderitems` VALUES ('98', '201910140004383627', '23', '16');
INSERT INTO `orderitems` VALUES ('99', '201910140004383627', '24', '10');
INSERT INTO `orderitems` VALUES ('100', '201910140004489459', '1', '31');
INSERT INTO `orderitems` VALUES ('101', '201910140004489459', '23', '16');
INSERT INTO `orderitems` VALUES ('102', '201910140004489459', '24', '10');
INSERT INTO `orderitems` VALUES ('103', '201910140005290260', '1', '31');
INSERT INTO `orderitems` VALUES ('104', '201910140005290260', '23', '16');
INSERT INTO `orderitems` VALUES ('105', '201910140005290260', '24', '10');
INSERT INTO `orderitems` VALUES ('106', '201910140006112353', '1', '31');
INSERT INTO `orderitems` VALUES ('107', '201910140006112353', '23', '16');
INSERT INTO `orderitems` VALUES ('108', '201910140006112353', '24', '10');
INSERT INTO `orderitems` VALUES ('109', '201910140008127214', '1', '31');
INSERT INTO `orderitems` VALUES ('110', '201910140008127214', '23', '16');
INSERT INTO `orderitems` VALUES ('111', '201910140008127214', '24', '10');
INSERT INTO `orderitems` VALUES ('112', '201910140016292676', '4', '7');
INSERT INTO `orderitems` VALUES ('113', '201910140020081474', '4', '4');
INSERT INTO `orderitems` VALUES ('114', '201910140058518331', '1', '1');
INSERT INTO `orderitems` VALUES ('115', '201910140103473093', '1', '1');
INSERT INTO `orderitems` VALUES ('116', '201910140104380442', '1', '1');
INSERT INTO `orderitems` VALUES ('117', '201910140105115984', '1', '1');
INSERT INTO `orderitems` VALUES ('118', '201910140117311912', '27', '4');

-- ----------------------------
-- Table structure for shoppingcart
-- ----------------------------
DROP TABLE IF EXISTS `shoppingcart`;
CREATE TABLE `shoppingcart` (
  `shopcartId` int(8) NOT NULL AUTO_INCREMENT,
  `userId` int(11) NOT NULL COMMENT '用户编号',
  `goodsId` int(11) NOT NULL COMMENT '商品编号',
  `goodsNum` int(11) NOT NULL COMMENT '商品数量',
  PRIMARY KEY (`shopcartId`),
  KEY `fk_userId_shoppingcart` (`userId`),
  KEY `fk_goodsId_shoppingcart` (`goodsId`),
  CONSTRAINT `fk_goodsId_shoppingcart` FOREIGN KEY (`goodsId`) REFERENCES `goods` (`goodsId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_userId_shoppingcart` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=1016 DEFAULT CHARSET=utf8 COMMENT='购物车表';

-- ----------------------------
-- Records of shoppingcart
-- ----------------------------
INSERT INTO `shoppingcart` VALUES ('3', '2', '4', '1');
INSERT INTO `shoppingcart` VALUES ('1003', '2', '17', '3');
INSERT INTO `shoppingcart` VALUES ('1004', '4', '23', '1');
INSERT INTO `shoppingcart` VALUES ('1005', '5', '28', '2');
INSERT INTO `shoppingcart` VALUES ('1006', '6', '32', '1');
INSERT INTO `shoppingcart` VALUES ('1007', '6', '19', '2');
INSERT INTO `shoppingcart` VALUES ('1010', '1', '1', '38');
INSERT INTO `shoppingcart` VALUES ('1011', '1', '23', '16');
INSERT INTO `shoppingcart` VALUES ('1012', '1', '24', '10');
INSERT INTO `shoppingcart` VALUES ('1013', '1', '4', '4');
INSERT INTO `shoppingcart` VALUES ('1014', '30', '1', '1');
INSERT INTO `shoppingcart` VALUES ('1015', '31', '27', '4');

-- ----------------------------
-- Table structure for useraddress
-- ----------------------------
DROP TABLE IF EXISTS `useraddress`;
CREATE TABLE `useraddress` (
  `userId` int(11) NOT NULL COMMENT '用户编号',
  `userAddr` varchar(255) NOT NULL COMMENT '收货地址',
  `userTel` varchar(11) NOT NULL COMMENT '联系方式',
  `userConsignee` varchar(20) NOT NULL COMMENT '收货人',
  `userAddressId` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`userAddressId`),
  KEY `fk_userId_useraddress` (`userId`),
  CONSTRAINT `fk_userId_useraddress` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of useraddress
-- ----------------------------
INSERT INTO `useraddress` VALUES ('1', '广东省广州市湖里区上湖社19栋601', '1564882785', '何佳佳', '4');
INSERT INTO `useraddress` VALUES ('1', '广东省河源市湖里区上湖社19栋601', '15363393514', '丘彪', '5');
INSERT INTO `useraddress` VALUES ('2', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '6');
INSERT INTO `useraddress` VALUES ('2', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '7');
INSERT INTO `useraddress` VALUES ('2', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '8');
INSERT INTO `useraddress` VALUES ('2', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '9');
INSERT INTO `useraddress` VALUES ('3', '广东省揭阳市湖里区上湖社19栋602', '15363393514', '杨小辉', '10');
INSERT INTO `useraddress` VALUES ('3', '广东省潮州市湖里区上湖社19栋602', '15363393514', '何佳佳', '11');
INSERT INTO `useraddress` VALUES ('3', '广东省惠州市湖里区上湖社19栋602', '15363393514', '张玉大', '12');
INSERT INTO `useraddress` VALUES ('3', '广东省珠海市湖里区上湖社19栋602', '15363393514', '吴浩钦', '13');
INSERT INTO `useraddress` VALUES ('4', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '14');
INSERT INTO `useraddress` VALUES ('4', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '15');
INSERT INTO `useraddress` VALUES ('4', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '16');
INSERT INTO `useraddress` VALUES ('4', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '17');
INSERT INTO `useraddress` VALUES ('5', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '18');
INSERT INTO `useraddress` VALUES ('5', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '19');
INSERT INTO `useraddress` VALUES ('5', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '20');
INSERT INTO `useraddress` VALUES ('5', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '21');
INSERT INTO `useraddress` VALUES ('6', '广东省揭阳市湖里区上湖社19栋602', '15363393514', '杨小辉', '22');
INSERT INTO `useraddress` VALUES ('6', '广东省潮州市湖里区上湖社19栋602', '15363393514', '何佳佳', '23');
INSERT INTO `useraddress` VALUES ('6', '广东省惠州市湖里区上湖社19栋602', '15363393514', '张玉大', '24');
INSERT INTO `useraddress` VALUES ('6', '广东省珠海市湖里区上湖社19栋602', '15363393514', '吴浩钦', '25');
INSERT INTO `useraddress` VALUES ('7', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '26');
INSERT INTO `useraddress` VALUES ('7', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '27');
INSERT INTO `useraddress` VALUES ('7', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '28');
INSERT INTO `useraddress` VALUES ('7', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '29');
INSERT INTO `useraddress` VALUES ('8', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '30');
INSERT INTO `useraddress` VALUES ('8', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '31');
INSERT INTO `useraddress` VALUES ('8', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '32');
INSERT INTO `useraddress` VALUES ('8', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '33');
INSERT INTO `useraddress` VALUES ('9', '广东省揭阳市湖里区上湖社19栋602', '15363393514', '杨小辉', '34');
INSERT INTO `useraddress` VALUES ('9', '广东省潮州市湖里区上湖社19栋602', '15363393514', '何佳佳', '35');
INSERT INTO `useraddress` VALUES ('9', '广东省惠州市湖里区上湖社19栋602', '15363393514', '张玉大', '36');
INSERT INTO `useraddress` VALUES ('9', '广东省珠海市湖里区上湖社19栋602', '15363393514', '吴浩钦', '37');
INSERT INTO `useraddress` VALUES ('10', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '38');
INSERT INTO `useraddress` VALUES ('10', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '39');
INSERT INTO `useraddress` VALUES ('10', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '40');
INSERT INTO `useraddress` VALUES ('10', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '41');
INSERT INTO `useraddress` VALUES ('12', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '42');
INSERT INTO `useraddress` VALUES ('12', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '43');
INSERT INTO `useraddress` VALUES ('12', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '44');
INSERT INTO `useraddress` VALUES ('12', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '45');
INSERT INTO `useraddress` VALUES ('13', '广东省揭阳市湖里区上湖社19栋602', '15363393514', '杨小辉', '46');
INSERT INTO `useraddress` VALUES ('13', '广东省潮州市湖里区上湖社19栋602', '15363393514', '何佳佳', '47');
INSERT INTO `useraddress` VALUES ('13', '广东省惠州市湖里区上湖社19栋602', '15363393514', '张玉大', '48');
INSERT INTO `useraddress` VALUES ('13', '广东省珠海市湖里区上湖社19栋602', '15363393514', '吴浩钦', '49');
INSERT INTO `useraddress` VALUES ('11', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '50');
INSERT INTO `useraddress` VALUES ('11', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '51');
INSERT INTO `useraddress` VALUES ('11', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '52');
INSERT INTO `useraddress` VALUES ('11', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '53');
INSERT INTO `useraddress` VALUES ('14', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '54');
INSERT INTO `useraddress` VALUES ('14', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '55');
INSERT INTO `useraddress` VALUES ('14', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '56');
INSERT INTO `useraddress` VALUES ('14', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '57');
INSERT INTO `useraddress` VALUES ('15', '广东省揭阳市湖里区上湖社19栋602', '15363393514', '杨小辉', '58');
INSERT INTO `useraddress` VALUES ('15', '广东省潮州市湖里区上湖社19栋602', '15363393514', '何佳佳', '59');
INSERT INTO `useraddress` VALUES ('15', '广东省惠州市湖里区上湖社19栋602', '15363393514', '张玉大', '60');
INSERT INTO `useraddress` VALUES ('15', '广东省珠海市湖里区上湖社19栋602', '15363393514', '吴浩钦', '61');
INSERT INTO `useraddress` VALUES ('16', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '62');
INSERT INTO `useraddress` VALUES ('16', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '63');
INSERT INTO `useraddress` VALUES ('16', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '64');
INSERT INTO `useraddress` VALUES ('16', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '65');
INSERT INTO `useraddress` VALUES ('17', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '66');
INSERT INTO `useraddress` VALUES ('17', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '67');
INSERT INTO `useraddress` VALUES ('17', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '68');
INSERT INTO `useraddress` VALUES ('17', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '69');
INSERT INTO `useraddress` VALUES ('18', '广东省揭阳市湖里区上湖社19栋602', '15363393514', '杨小辉', '70');
INSERT INTO `useraddress` VALUES ('18', '广东省潮州市湖里区上湖社19栋602', '15363393514', '何佳佳', '71');
INSERT INTO `useraddress` VALUES ('18', '广东省惠州市湖里区上湖社19栋602', '15363393514', '张玉大', '72');
INSERT INTO `useraddress` VALUES ('18', '广东省珠海市湖里区上湖社19栋602', '15363393514', '吴浩钦', '73');
INSERT INTO `useraddress` VALUES ('19', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '74');
INSERT INTO `useraddress` VALUES ('19', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '75');
INSERT INTO `useraddress` VALUES ('19', '广东省佛山湖里区上湖社19栋602', '15363393514', '林鹏', '76');
INSERT INTO `useraddress` VALUES ('19', '广东省韶关市湖里区上湖社19栋602', '15363393514', '大傻', '77');
INSERT INTO `useraddress` VALUES ('20', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '78');
INSERT INTO `useraddress` VALUES ('20', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '79');
INSERT INTO `useraddress` VALUES ('20', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '80');
INSERT INTO `useraddress` VALUES ('20', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '81');
INSERT INTO `useraddress` VALUES ('20', '福建省厦门市湖里区上湖社19栋602', '15363393514', '丘彪', '83');
INSERT INTO `useraddress` VALUES ('20', '广东省东莞市湖里区上湖社19栋602', '15363393514', '廖伟俊', '84');
INSERT INTO `useraddress` VALUES ('20', '广东省广州市湖里区上湖社19栋602', '15363393514', '张远东', '85');
INSERT INTO `useraddress` VALUES ('20', '广东省深圳市湖里区上湖社19栋602', '15363393514', '徐奕海', '86');
INSERT INTO `useraddress` VALUES ('1', '福建省厦门市请选择区县望海路北一街三号', '15363393519', '廖伟俊', '90');
INSERT INTO `useraddress` VALUES ('30', '山西省大同市请选择区县望海路71号楼', '15363393519', '廖伟俊', '91');
INSERT INTO `useraddress` VALUES ('31', '广东省珠海市请选择区县望海路71号楼', '18312321850', '徐奕海', '92');

-- ----------------------------
-- Table structure for usercollection
-- ----------------------------
DROP TABLE IF EXISTS `usercollection`;
CREATE TABLE `usercollection` (
  `userId` int(8) DEFAULT NULL,
  `goodsId` int(8) DEFAULT NULL,
  KEY `fk_asd1` (`userId`),
  KEY `fk_asd2` (`goodsId`),
  CONSTRAINT `fk_asd1` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_asd2` FOREIGN KEY (`goodsId`) REFERENCES `goods` (`goodsId`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of usercollection
-- ----------------------------
INSERT INTO `usercollection` VALUES ('1', '2');
INSERT INTO `usercollection` VALUES ('1', '3');
INSERT INTO `usercollection` VALUES ('1', '4');
INSERT INTO `usercollection` VALUES ('1', '5');
INSERT INTO `usercollection` VALUES ('1', '6');
INSERT INTO `usercollection` VALUES ('1', '10');
INSERT INTO `usercollection` VALUES ('1', '18');
INSERT INTO `usercollection` VALUES ('1', '17');
INSERT INTO `usercollection` VALUES ('1', '31');
INSERT INTO `usercollection` VALUES ('1', '20');
INSERT INTO `usercollection` VALUES ('2', '18');
INSERT INTO `usercollection` VALUES ('2', '19');
INSERT INTO `usercollection` VALUES ('3', '19');
INSERT INTO `usercollection` VALUES ('3', '33');
INSERT INTO `usercollection` VALUES ('4', '22');
INSERT INTO `usercollection` VALUES ('5', '30');
INSERT INTO `usercollection` VALUES (null, '24');
INSERT INTO `usercollection` VALUES (null, '24');

-- ----------------------------
-- Table structure for userorders
-- ----------------------------
DROP TABLE IF EXISTS `userorders`;
CREATE TABLE `userorders` (
  `ordersId` varchar(20) NOT NULL COMMENT '订单编号:由时间和四位随机整数组成',
  `userId` int(11) NOT NULL COMMENT '用户编号',
  `orderDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '下单日期',
  `userAddr` varchar(255) NOT NULL COMMENT '收货地址',
  `isPay` varchar(10) NOT NULL DEFAULT '未支付' COMMENT '是否支付：已支付、未支付',
  PRIMARY KEY (`ordersId`),
  UNIQUE KEY `uq_ordersId_userorders` (`ordersId`),
  KEY `fk_userId_userorders` (`userId`),
  CONSTRAINT `fk_userId_userorders` FOREIGN KEY (`userId`) REFERENCES `users` (`userId`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户订单表';

-- ----------------------------
-- Records of userorders
-- ----------------------------
INSERT INTO `userorders` VALUES ('201909300933313288', '1', '2019-10-11 23:24:55', '东莞市xxxxxxxxxx', '已支付');
INSERT INTO `userorders` VALUES ('201910102004064492', '1', '2019-10-01 19:51:14', '厦门市湖里区上湖社198栋602', '已支付');
INSERT INTO `userorders` VALUES ('201910102007394912', '1', '2019-10-02 19:51:36', '厦门市湖里区下湖社198栋602', '已支付');
INSERT INTO `userorders` VALUES ('201910102009093100', '2', '2019-09-11 20:09:18', '广西柳州市柳南区光电小区26栋3单元5-2', '已支付');
INSERT INTO `userorders` VALUES ('201910102010110130', '2', '2019-10-01 19:10:26', '广东省潮州市湘桥区韩山师范学院文科楼', '已支付');
INSERT INTO `userorders` VALUES ('201910102011180483', '3', '2019-10-04 11:11:41', '广东省佛山市南海区桂荣路38号', '已支付');
INSERT INTO `userorders` VALUES ('201910121048572605', '1', '2019-10-12 10:48:58', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910121100389216', '1', '2019-10-12 11:00:38', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910121101179677', '1', '2019-10-12 11:01:18', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910121406384238', '1', '2019-10-12 14:06:39', '广东省广州市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910121410401971', '1', '2019-10-12 14:10:41', '广东省广州市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910121411051615', '1', '2019-10-12 14:11:06', '天津市天津市请选择区县顶顶顶顶', '已支付');
INSERT INTO `userorders` VALUES ('201910121414425308', '1', '2019-10-12 14:14:43', '天津市天津市请选择区县顶顶顶顶', '已支付');
INSERT INTO `userorders` VALUES ('201910121539453766', '1', '2019-10-12 15:39:46', '天津市天津市请选择区县顶顶顶顶', '已支付');
INSERT INTO `userorders` VALUES ('201910132012399731', '1', '2019-10-13 20:12:38', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132012553660', '1', '2019-10-13 20:12:54', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132014002190', '1', '2019-10-13 20:13:59', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132014253025', '1', '2019-10-13 20:14:24', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132018314015', '1', '2019-10-13 20:18:30', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132019223056', '1', '2019-10-13 20:19:21', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132021332245', '1', '2019-10-13 20:21:32', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132025046273', '1', '2019-10-13 20:25:03', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910132025565245', '1', '2019-10-13 20:25:55', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132030198610', '1', '2019-10-13 20:30:18', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132030475265', '1', '2019-10-13 20:30:46', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132031241658', '1', '2019-10-13 20:31:23', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132031308800', '1', '2019-10-13 20:31:29', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132032007955', '1', '2019-10-13 20:31:59', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132032174771', '1', '2019-10-13 20:32:16', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132032291125', '1', '2019-10-13 20:32:28', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132033102774', '1', '2019-10-13 20:33:09', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132033485638', '1', '2019-10-13 20:33:47', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132034080930', '1', '2019-10-13 20:34:07', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132035163864', '1', '2019-10-13 20:35:15', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132036183385', '1', '2019-10-13 20:36:17', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132038486576', '1', '2019-10-13 20:38:47', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132043244139', '1', '2019-10-13 20:43:23', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132043315819', '1', '2019-10-13 20:43:30', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132043388824', '1', '2019-10-13 20:43:37', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132044071867', '1', '2019-10-13 20:44:06', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132046434150', '1', '2019-10-13 20:46:42', '北京市北京市请选择区县啊啊啊', '已支付');
INSERT INTO `userorders` VALUES ('201910132100103744', '1', '2019-10-13 21:00:09', '天津市天津市请选择区县顶顶顶顶', '未支付');
INSERT INTO `userorders` VALUES ('201910140003234510', '1', '2019-10-14 00:03:22', '福建省厦门市请选择区县望海路北一街三号', '未支付');
INSERT INTO `userorders` VALUES ('201910140004383627', '1', '2019-10-14 00:04:37', '福建省厦门市请选择区县望海路北一街三号', '未支付');
INSERT INTO `userorders` VALUES ('201910140004489459', '1', '2019-10-14 00:04:47', '广东省河源市湖里区上湖社19栋601', '未支付');
INSERT INTO `userorders` VALUES ('201910140005290260', '1', '2019-10-14 00:05:28', '福建省厦门市请选择区县望海路北一街三号', '未支付');
INSERT INTO `userorders` VALUES ('201910140006112353', '1', '2019-10-14 00:06:10', '福建省厦门市请选择区县望海路北一街三号', '未支付');
INSERT INTO `userorders` VALUES ('201910140008127214', '1', '2019-10-14 00:08:11', '福建省厦门市请选择区县望海路北一街三号', '已支付');
INSERT INTO `userorders` VALUES ('201910140016292676', '1', '2019-10-14 00:16:28', '福建省厦门市请选择区县望海路北一街三号', '已支付');
INSERT INTO `userorders` VALUES ('201910140020081474', '1', '2019-10-14 00:20:07', '广东省河源市湖里区上湖社19栋601', '已支付');
INSERT INTO `userorders` VALUES ('201910140058518331', '1', '2019-10-14 00:58:50', 'null', '已支付');
INSERT INTO `userorders` VALUES ('201910140103473093', '1', '2019-10-14 01:03:46', 'null', '已支付');
INSERT INTO `userorders` VALUES ('201910140104380442', '30', '2019-10-14 01:04:37', 'null', '已支付');
INSERT INTO `userorders` VALUES ('201910140105115984', '30', '2019-10-14 01:05:10', '山西省大同市请选择区县望海路71号楼', '已支付');
INSERT INTO `userorders` VALUES ('201910140117311912', '31', '2019-10-14 01:17:30', '广东省珠海市请选择区县望海路71号楼', '已支付');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `userAccount` varchar(20) NOT NULL COMMENT '用户账号',
  `userName` varchar(20) DEFAULT NULL COMMENT '真实姓名',
  `userPetName` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `userPassword` varchar(20) NOT NULL DEFAULT '123456' COMMENT '密码',
  `userSex` varchar(20) DEFAULT NULL,
  `userState` varchar(10) NOT NULL DEFAULT '正常' COMMENT '状态：正常、冻结',
  `userTel` varchar(12) NOT NULL COMMENT '手机号',
  `userIdcard` varchar(18) DEFAULT NULL COMMENT '身份证号',
  `userEmail` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `userAge` int(11) DEFAULT '1' COMMENT '年龄',
  `userBirth` date DEFAULT NULL,
  `userIcon` varchar(255) DEFAULT NULL COMMENT '头像',
  `userIntegral` int(11) NOT NULL DEFAULT '0' COMMENT '积分',
  `userLoginTime` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最近登录时间',
  `userRegisterTime` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  PRIMARY KEY (`userId`),
  UNIQUE KEY `uq_userid` (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '三体', '杨小', '云天明', '123456', '男', '正常', '15312321850', '445281199708294611', '2458892691@qq.com', '18', '1997-08-29', 'images/usericons/ef7eaed05bba42f3b5460cc6482779b2.jpg', '0', '2019-10-14 00:26:02', '2019-09-25 13:57:32');
INSERT INTO `users` VALUES ('2', '张三', '张三', '张三', '123456', '男', '正常', '18922212547', '441900122301025468', '55555@qq.com', '55', '2019-09-04', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-12 09:50:35', '2019-09-27 09:43:15');
INSERT INTO `users` VALUES ('3', '李四', '李四', '李四', '123456', '男', '正常', '15896578548', '449255555854857581', '55555@qq.com', '1', '2019-09-05', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-13 09:44:02', '2019-09-27 09:44:22');
INSERT INTO `users` VALUES ('4', '444', '333', '333', '123456', '女', '正常', '12345678912', '452226859420101125', '30157852@qq.com', '1', '1980-02-10', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-12 10:02:10', '2019-09-29 09:41:29');
INSERT INTO `users` VALUES ('5', '邹欣', '邹欣', '邹欣', '123456', '女', '正常', '18098109448', '356894255016524800', '1157226558@qq.com', '1', '1996-10-20', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-27 09:44:00', '2019-09-27 09:44:22');
INSERT INTO `users` VALUES ('6', '廖伟斌', '廖伟斌', '廖伟斌', '123456', '男', '正常', '10086', '359459522692056620', '2089616@qq.com', '20', '1999-08-25', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-10 16:33:33', '2019-10-10 19:33:38');
INSERT INTO `users` VALUES ('7', '黄桃桃', '黄桃桃', '黄桃桃', '654321', '女', '正常', '10010', '359746156522120556', '20159628@qq.com', '1', '2019-10-15', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-13 16:35:29', '2019-10-09 16:35:35');
INSERT INTO `users` VALUES ('8', '邓文', '邓文', '邓文', '123456', '女', '正常', '15698625623', '561982654962650256', '02596161@qq.com', '32', '2019-10-14', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-10 10:37:02', '2019-09-23 10:37:12');
INSERT INTO `users` VALUES ('9', '顾燕帧', '顾燕帧', '顾燕帧', '123456', '男', '正常', '153633947055', '526548965031652116', '3054591161@qq.com', '22', '1997-01-01', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-14 15:38:30', '2019-10-15 15:38:42');
INSERT INTO `users` VALUES ('10', '谢良辰', '谢良辰', '谢良辰', '123456', '男', '正常', '153229285605', '801610461031654304', '5116892165@qq.com', '22', '1997-01-02', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-01 16:40:08', '2019-09-02 17:40:22');
INSERT INTO `users` VALUES ('11', '谢襄', '谢襄', '谢襄', '123456', '女', '正常', '180161046501', '156108404198461041', '265645216@qq.com', '1', '0199-01-03', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-08-15 14:40:46', '2019-08-15 16:40:40');
INSERT INTO `users` VALUES ('12', '沈从军', '沈从军', '沈从军', '123456', '男', '正常', '132508950445', '626089219021016100', '206652065@qq.com', '23', '1998-06-25', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-10 16:43:54', '2019-08-22 20:44:00');
INSERT INTO `users` VALUES ('13', '向真', '向真', '向真', '123456', '女', '正常', '094982105', '652982098056053210', '626546214@qq.com', '1', '2019-08-13', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-08-20 08:44:29', '2019-07-10 10:44:18');
INSERT INTO `users` VALUES ('14', '钱贝贝', '钱贝贝', '钱贝贝', '123456', '女', '正常', '091615801', '628920894616379406', '506444401@qq.com', '1', '2019-10-13', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-08 11:46:53', '2019-10-08 13:47:02');
INSERT INTO `users` VALUES ('15', '金鑫', '金鑫', '金鑫', '123456', '男', '正常', '095064150', '654940784005874504', '236085205@qq.com', '1', '2019-10-01', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-10 16:48:08', '2019-09-10 18:48:16');
INSERT INTO `users` VALUES ('16', '黎明熙', '黎明熙', '黎明熙', 'li123456', '女', '正常', '180659205105', '841610564103161065', '016106549@qq.com', '38', '1975-02-15', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-09-18 02:50:30', '2019-09-18 04:50:40');
INSERT INTO `users` VALUES ('17', '刘倩倩', '刘倩倩', '刘倩倩', '123456', '女', '正常', '192585046216', '809461310655136164', '123189068@qq.com', '33', '1980-12-30', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-06-19 17:51:09', '2019-07-16 13:50:55');
INSERT INTO `users` VALUES ('18', '吴静', '吴静', '吴静', '123456abc', '女', '正常', '15728872590', '541610698406104116', '641031616@qq.com', '19', '1999-02-04', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-21 11:54:13', '2019-10-14 11:54:20');
INSERT INTO `users` VALUES ('19', '杨过儿', '杨过儿', '杨过儿', '123456guoer', '男', '正常', '15807726582', '658916046541156405', '30543125@qq.com', '42', '1972-10-10', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-01 11:55:40', '2019-10-01 12:55:48');
INSERT INTO `users` VALUES ('20', '范灵儿', '范灵儿', '范灵儿', '123456', '女', '正常', '15206498164', '208540654301610561', '56051065@qq.com', '61', '1969-08-01', 'images/usericons/bd78761a384d416d80a29c46b7c14928.jpg', '0', '2019-10-04 17:56:07', '2019-10-04 19:55:56');
INSERT INTO `users` VALUES ('21', '444', null, null, '444444', null, '正常', '15363391819', null, '145@qq.com', '1', null, 'images/usericons/7d9eb5cc807a48519dae75262bbc68d1.jpg', '0', null, '2019-10-12 09:59:36');
INSERT INTO `users` VALUES ('22', 'qaz', null, null, '444444', null, '正常', '15363391817', null, '1455@qq.com', '1', null, 'images/usericons/61aae1ecaeb74df3a7fcef3e729887c3.jpg', '0', null, '2019-10-12 10:03:57');
INSERT INTO `users` VALUES ('23', 'qqqq', null, null, '123456', null, '正常', '15352525858', null, '14555@qq.com', '1', null, 'images/usericons/e12e4804800f4ace8aa4a11917eb9c44.jpg', '0', null, '2019-10-12 10:35:36');
INSERT INTO `users` VALUES ('24', 'www', 'www', 'www', '123456', '男', '1', '15363391819', '441621199610197612', '145@qqq.com', '14', null, null, '50', '2019-10-12 11:19:52', '2019-10-12 11:19:52');
INSERT INTO `users` VALUES ('25', 'www', 'www', 'www', '123456', '男', '1', '15363391819', '441621199610197612', '145@qqq.com', '14', null, null, '50', '2019-10-12 11:19:52', '2019-10-12 11:19:52');
INSERT INTO `users` VALUES ('30', '杨大辉', '', '杨', '123456', '男', '正常', '18312321850', '', '2458892691@qq.com', '1', '2019-10-04', 'images/usericons/c7cea981cd8142a3863fbc0823111696.jpg', '0', '2019-10-14 00:52:51', '2019-10-14 00:52:34');
INSERT INTO `users` VALUES ('31', '徐奕海', '', '', '123456', '男', '正常', '18312321855', '', '2458892691@qq.com', '23', '2019-10-03', 'images/usericons/ebbb9f932fe8492988894fb7913526b0.jpg', '100', '2019-10-14 01:14:55', '2019-10-14 01:14:41');
