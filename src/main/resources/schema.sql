/*==============================================================*/
/* Table: Items                                                 */
/*==============================================================*/
create table items
(
    item_id               int not null auto_increment,
    designation           varchar(50) not null,
    primary key (item_id)
);