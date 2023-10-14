CREATE TABLE `recommend`.`user`  (
                                       `id` int NOT NULL AUTO_INCREMENT,
                                       `created_at` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0),
                                       `updated_at` datetime(0) NOT NULL ON UPDATE CURRENT_TIMESTAMP(0),
                                       `telphone` varchar(40) NOT NULL DEFAULT '',
                                       `password` varchar(200) NOT NULL DEFAULT '',
                                       `nick_name` varchar(40) NOT NULL DEFAULT '',
                                       `gender` int NOT NULL DEFAULT 0,
                                       PRIMARY KEY (`id`),
                                       UNIQUE INDEX `telphone_unique_index`(`telphone`) USING BTREE
);

CREATE TABLE `recommend`.`seller`  (
                                       `id` int NOT NULL AUTO_INCREMENT,
                                       `name` varchar(80) NOT NULL DEFAULT '',
                                       `create_at` datetime(0) NOT NULL DEFAULT '1000-01-01 00:00:00',
                                       `updata_at` datetime(0) NOT NULL DEFAULT '1000-01-01 00:00:00',
                                       `remark_score` decimal(2, 1) NOT NULL DEFAULT 0,
                                       `disabled_flag` int NOT NULL DEFAULT 0,
                                       PRIMARY KEY (`id`)
);