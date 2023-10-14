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

CREATE TABLE `recommend`.`category`  (
                                       `id` int NOT NULL AUTO_INCREMENT COMMENT 'id 主键',
                                       `created_at` datetime(0) NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '创建时间',
                                       `update_at` datetime(0) NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '更新时间',
                                       `name` varchar(20) NOT NULL DEFAULT '' COMMENT '品类名称',
                                       `icon_url` varchar(200) NOT NULL DEFAULT '' COMMENT '品类icon',
                                       `sort` int NOT NULL DEFAULT 0 COMMENT '排序',
                                       PRIMARY KEY (`id`),
                                       UNIQUE INDEX `name_unique_index`(`name`) USING BTREE COMMENT '品类名称唯一索引'
) COMMENT = '品类表';