SELECT * FROM post;

SELECT * FROM member;


-- 2번 회원 탈퇴시 게시글 삭제 옵션을 선택한 경우 

START transaction; -- 2번 이상의 수정 작업이 동시에 발생해야 할 경우, 문제 발생시 자동으로 복구 가능

-- 2번 회원의 게시글 먼저 삭제 (init 에 cascade 옵션 넣어놓아서 게시글 삭제 시 댓글은 자동삭제됨)
DELETE FROM post WHERE member_id = 2; 

-- 2번 회원 삭제
DELETE FROM member WHERE id = 2;

-- 정상 완료시 DB에 반영
commit;

-- 오류 발생시 원래 상태로 복구
rollback;

