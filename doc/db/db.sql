CREATE TABLE `member` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(11) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `mobile` char(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;


INSERT INTO `dubbox_demo`.`member` (`id`, `name`, `age`, `sex`, `mobile`) VALUES ('1', '姚明', '45', '男', '18025669321');
INSERT INTO `dubbox_demo`.`member` (`id`, `name`, `age`, `sex`, `mobile`) VALUES ('2', '易建联', '36', '男', '17092679982');
INSERT INTO `dubbox_demo`.`member` (`id`, `name`, `age`, `sex`, `mobile`) VALUES ('3', '李娜', '38', '女', '17092679983');
INSERT INTO `dubbox_demo`.`member` (`id`, `name`, `age`, `sex`, `mobile`) VALUES ('4', '迈克尔乔丹', '46', '男', '17092679984');
INSERT INTO `dubbox_demo`.`member` (`id`, `name`, `age`, `sex`, `mobile`) VALUES ('5', '刘翔', '40', '男', '17092679985');
INSERT INTO `dubbox_demo`.`member` (`id`, `name`, `age`, `sex`, `mobile`) VALUES ('6', '李冰冰', '32', '女', '17092679986');
