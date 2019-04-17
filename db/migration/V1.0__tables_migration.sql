create table if not exists `person` (
`id` bigint not null auto_increment primary key,
`first_name` varchar (10),
`last_name` varchar (10),
`address` varchar (20),
`phone_number` varchar (10),
`family_member_type` varchar (10)
)ENGINE=InnoDB default charset=utf8;

create table if not exists `family` (
`id` bigint not null auto_increment primary key,
`surname` varchar(10),
`address` varchar(20),
`phone_number` varchar(10),
`last_pastoral_visit` varchar(10)
)ENGINE=InnoDB default charset=utf8;

create table if not exists `family_member` (
`id` bigint not null auto_increment,
`first_name` varchar (10),
`birth_date` date,
`occupation` varchar (20),
`work` varchar (20),
`family_member_type` varchar (10),
`year_of_marriage` date,
`sunday_holy_mass` varchar (10),
`confession_and_holy_communion` varchar (10),
`comments` varchar (30),
`family_id` bigint,
primary key (id),
foreign key (family_id) references family(id)
)ENGINE=InnoDB default charset=utf8;

create table if not exists `child` (
`id` bigint not null auto_increment,
`first_name` varchar (10),
`birth_date` date,
`baptism_date` date,
`first_communion_date` date,
`confirmation_date` date,
`address` varchar (10),
`phone_number` varchar (10),
`participation_in_catechesis` varchar (10),
`family_id` bigint,
primary key(id),
foreign key(family_id) references family(id)
)ENGINE=InnoDB default charset=utf8;
