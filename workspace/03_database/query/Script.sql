show databases;

 -- board_db라는 데이터베이스 생성
create database board_db;

-- 생성한 데이터베이스로 전환하여 이후 쿼리가 해당 데이터베이스를 대상으로 실행되도록 설정
use board_db;

-- 필요 없는 board_db 데이터베이스 삭제 (삭제 시 내부의 모든 테이블과 데이터가 영구히 소멸되므로 주의 필요)
DROP DATABASE board_db;



-- 회원 테이블 삭제
drop table member;

--  회원 테이블 생성
create table member (
	id int auto_increment primary key,
	email varchar(100) not null unique,
	password varchar(255) not null, 
	name varchar(100) not null,
	created_at datetime default current_timestamp()
);

-- 회원 테이블에 데이터 추가
insert into member (email, password, name) 	values
('haru@gmail.com', '123', '하루'),
('namu@gmail.com', '456', '나무'),
('yong@gmail.com', '111', '용쌤'),
('harong@gmail.com', '223', '하롱이');

-- 회원 테이블의 모든 레코드 조회
select id, email, password, name, created_at from member;

-- 회원 테이블의 레코드 수정
update member set password=123 where id=9;

-- 회원 테이블의 레코드 삭제
delete from member where id=1;



-- 게시글 테이블 CRUD
-- 게시글 테이블 생성
create table onlineboard (
	id int auto_increment primary key,
	memberid int not null,
	title varchar(500) not null,
	content text not null,
	created_at datetime default CURRENT_TIMESTAMP()
);

-- 게시물 테이블 삭제
drop table onlineboard;



-- 게시물 테이블에 데이터 추가
insert into onlineboard (memberid, title, content) values
(1, '안녕하세요.', '반가워요'),
(2, '질문있어요!', 'DB는 어렵나요?'),
(1, '두번째 게시글', '오늘 날씨가 좋네요'),
(2, 'MySQL 설치 오류가 났어요', '어떻게 할까요?'),
(3, '자기소개', '용쌤입니다용');

-- 게시글 테이블의 모든 레코드 조회
select id, memberid, title, content, created_at from onlineboard;

-- 게시글 테이블의 레코드 수정
update onlineboard set title="행복하세요" where id=1;

-- 게시글 테이블의 레코드 삭제
delete from onlineboard where id=2;



-- 댓글 테이블 CRUD
-- 댓글 테이블 생성
create table comment (
	id int auto_increment primary key,
	onlineboardid int not null,
	memberid int(100) not null,
	content text not null,
	created_at datetime default CURRENT_TIMESTAMP()
);

-- -- 댓글 테이블 삭제
drop table comment;



-- 댓글 테이블에 데이터 추가
insert into comment (onlineboardid, memberid, content) values
(1, 2, '환영합니다.'),
(1, 3, '반가워요!'),
(3, 1, '따뜻한 햇살이 좋네요^^'),
(4, 3, '다시 설치하세요~'),
(5, 1, '파이팅!');

-- 댓글 테이블의 모든 레코드 조회
select id, onlineboardid, memberid, content, created_at from comment;

-- 댓글 테이블의 레코드 수정
update comment set content='와우 반갑습니당' where id=2 

-- 댓글 테이블의 레코드 삭제
delete from comment where id=4;

