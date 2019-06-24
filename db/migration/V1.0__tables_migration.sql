create table if not exists `family` (
`id` bigint not null auto_increment primary key,
`surname` varchar(20),
`address` varchar(20),
`phone_number` varchar(10),
`last_pastoral_visit` date
)ENGINE=InnoDB default charset=utf8;

create table if not exists `family_member` (
`id` bigint not null auto_increment,
`first_name` varchar (15),
`birth_date` date,
`occupation` varchar (20),
`work` varchar (20),
`family_member_type` varchar (15),
`year_of_marriage` date,
`sunday_holy_mass` varchar (15),
`confession_and_holy_communion` varchar (15),
`comments` varchar (30),
`baptism_date` date,
`first_communion_date` date,
`confirmation_date` date,
`participation_in_catechesis` varchar (15),
`general_religious_evaluation` varchar (15),
`family_id` bigint,
primary key (id),
foreign key (family_id) references family(id)
)ENGINE=InnoDB default charset=utf8;
