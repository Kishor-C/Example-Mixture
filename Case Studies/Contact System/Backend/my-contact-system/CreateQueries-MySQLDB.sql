create database profile_contact_db;
use profile_contact_db;

create table profile(
	userid int auto_increment, 
	name varchar(15), 
	password varchar(15), 
	phone bigint, 
	dob date, 
	constraint profile__pk primary key(userid))auto_increment=5000;

create table profile_contacts(
	id int auto_increment, 
	useridref int, 
	name varchar(15), 
	phone bigint, 
	constraint profile_contacts_pk primary key(id), 
	constraint profile_contacts_fk foreign key(useridref) references profile(userid));






