create table personal_learning_center.tb_dept
(
    dept_id      bigint                             not null comment '主键ID（全局唯一）'
        primary key,
    dept_name    varchar(30)                        null comment '部门名称',
    staff        int                                null comment '员工',
    tel          varchar(50)                        null comment '联系电话',
    deleted      bit      default b'0'              null comment '逻辑删除（0:未删除；1:已删除）',
    version      int      default 0                 null comment '乐观锁',
    gmt_create   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    gmt_modified datetime                           null on update CURRENT_TIMESTAMP comment '修改时间'
)
    comment '部门' charset = utf8;

create table personal_learning_center.tb_passenger
(
    id       bigint unsigned auto_increment comment '主键ID'
        primary key,
    name     varchar(32) null comment '姓名',
    sex      bit         null comment '性别',
    birthday varchar(32) null comment '出生日期'
)
    comment '乘客表' charset = utf8;

create table personal_learning_center.tb_passport
(
    id          bigint unsigned auto_increment comment '主键ID'
        primary key,
    nationality varchar(32) null comment '国籍',
    expire      varchar(32) null comment '过期时间',
    owner       bigint      null comment '所有者'
)
    comment '护照表' charset = utf8;

create table personal_learning_center.tb_relation
(
    id           bigint auto_increment comment '主键ID（全局唯一）'
        primary key,
    passenger_id bigint unsigned                    null comment '乘客ID',
    passport_id  bigint unsigned                    null comment '护照ID',
    gmt_create   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    gmt_modified datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    constraint stu_id
        unique (passenger_id, passport_id),
    constraint tb_relation_ibfk_1
        foreign key (passenger_id) references personal_learning_center.tb_passenger (id)
            on update cascade on delete cascade,
    constraint tb_relation_ibfk_2
        foreign key (passport_id) references personal_learning_center.tb_passport (id)
            on update cascade on delete cascade
)
    comment '成绩表' charset = utf8;

create index fk_sub_id
    on personal_learning_center.tb_relation (passport_id);

create table personal_learning_center.tb_staff
(
    user_id      bigint                             not null comment '主键ID（全局唯一）'
        primary key,
    user_name    varchar(30)                        null comment '姓名',
    age          int                                null comment '年龄',
    email        varchar(50)                        null comment '邮箱',
    dept_id      bigint                             null comment '部门ID',
    deleted      bit      default b'0'              null comment '逻辑删除（0:未删除；1:已删除）',
    version      int      default 0                 null comment '乐观锁',
    gmt_create   datetime default CURRENT_TIMESTAMP null comment '创建时间',
    gmt_modified datetime                           null on update CURRENT_TIMESTAMP comment '修改时间',
    constraint tb_staff_ibfk_1
        foreign key (dept_id) references personal_learning_center.tb_dept (dept_id)
            on update cascade on delete cascade
)
    comment '职员表' charset = utf8;

create index dept_id
    on personal_learning_center.tb_staff (dept_id);


