create database practice_db;

use practice_db;

create table user ( -- 고객번호 이름 아이디 비밀번호 전화번호 이메일 가입날짜
	user_id int auto_increment primary key,
	name varchar(100) not null,
	login_id varchar(100) not null unique,
	password varchar(100) not null
	phone
	email
	created_at 
);
