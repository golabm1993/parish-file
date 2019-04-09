create table if not exists `person` (
`id` bigint not null auto_increment primary key,
`first_name` varchar (10),
`last_name` varchar (10),
`address` varchar (20),
`phone_number` varchar (10),
`family_member_type` varchar (10)
)ENGINE=InnoDB default charset=utf8;
