CREATE TABLE `user`
(
    `id`     int(32)     NOT NULL AUTO_INCREMENT,
    `name`   varchar(32) NOT NULL,
    `passwd` varchar(50) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

insert into user (name, passwd) values ('leo', '123');
commit;
