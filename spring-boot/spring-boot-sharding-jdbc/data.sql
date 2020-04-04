CREATE TABLE `t_order_1` (
  `id` bigint(50) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(50) DEFAULT NULL,
  `product_id` bigint(50) DEFAULT NULL,
  `pay_amount` int(11) DEFAULT '0',
  `status` varchar(11) DEFAULT '0',
  `add_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `last_Update_Time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `index_userId` (`user_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

