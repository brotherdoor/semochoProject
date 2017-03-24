--새로 만들꺼 겹치는거 또는 이전에 1없는 것 삭제
--DROP TABLE friends_tb;
--DROP TABLE semohome_tb;
--DROP TABLE guestbook_tb;
--DROP TABLE enteruser_tb;
--DROP TABLE good_tb;
--DROP TABLE alaming_tb;
--DROP TABLE post_tb;
--DROP TABLE accuse_tb;
--DROP TABLE user_tb;
--DROP TABLE winner_tb;
--DROP TABLE vote_tb;
--DROP TABLE choice_tb;
--DROP TABLE comment_tb;


--시퀀스 삭제
--drop sequence friends_sq;
--drop sequence semohome_sq; 
--drop sequence guestbook_sq; 
--drop sequence enteruser_sq; 
--drop sequence good_sq; 
--drop sequence alaming_sq; 
--drop sequence post_sq;
--drop sequence accuse_sq;
--drop sequence vote_sq; 
--drop sequence choice_sq; 
--drop sequence winner_sq;
--drop sequence comment_sq;



CREATE TABLE friends_tb (
  fnum number PRIMARY KEY,
  userId varchar2(50),
  friendId varchar2(50)
 );
 
create table semohome_tb (
  semonum number PRIMARY KEY,
  userId varchar2(50));
  
create table guestbook_tb (
 gbnum number PRIMARY KEY,
 userId varchar2(50),
 Contents varchar(200),
 semonum number
 );
 
 create table user_tb(
 ID varchar2(50) primary key,
 pw varchar2(50),
 name varchar2(50),
 birth varchar2(50),
 phonenumber varchar2(50),
 interest varchar2(50),
 email varchar2(50),
 gender varchar2(50),
 grade varchar2(50),
 semo varchar(50)
 );
 
 create table enteruser_tb(
 enternum number primary key,
 userid varchar2(50),
 goodnum varchar2(50)
 );
 
 create table good_tb(
 goodnum number primary key,
 title varchar2(50),
 contents varchar2(200),
 product varchar2(100),
 startdate date,
 enddate date,
 imagetype varchar2(50),
 imagename varchar2(50)
 );
 
 create table alaming_tb(
 alamnum number primary key,
 userid varchar2(50),
 postid number
 );
 
 create table post_tb(
 postnum number primary key,
 userid varchar2(50),
 title varchar2(50),
 category varchar2(50),
 accusecount number,
 enddate date
 );
 
 create table comment_tb(
 commentnum number primary key,
 contents varchar2(50),
 userid varchar2(50),
 postnum number
 );
 
 
 create table winner_tb(
 winnernum number primary key,
 userid varchar2(50),
 goodnum number
 );
 
 create table choice_tb(
 choicenum number primary key,
 postnum number,
 content varchar2(50),
 imagetype varchar2(50),
 imagename varchar2(50)
 );
 
 create table vote_tb(
 votenum number primary key,
 choicenum number,
 userid varchar2(50),
 postnum number
 );
 
 create table accuse_tb(
 accusenum number primary key,
 content varchar2(100),
 postnum number,
 userid varchar2(50)
 );
 

 
CREATE SEQUENCE friends_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE semohome_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE guestbook_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE enteruser_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE good_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE alaming_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE post_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE accuse_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE comment_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE vote_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE winner_sq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE choice_sq START WITH 1 INCREMENT BY 1;


insert into good_tb values(
good_sq.nextval, '노트북 가지실분!!', '초경량 노트북입니다.',
'삼성노트북', '2017/03/21', '2017/04/30', 'image/jpg', 'notebook');
insert into good_tb values(
good_sq.nextval, '세계맥주 꽁짜로 드려요!~', '당신의 피곤함을 사르르르 녹여줄 맥주!!',
'클라우드맥주', '2017/03/19', '2017/03/30', 'image/jpg', 'beer');
insert into good_tb values(
good_sq.nextval, 'CGV 영화 예매권 2장', '마지막으로 영화를 언제 보러갔는지 모르는 당신을 위해!',
'영화예매권', '2017/03/23', '2017/05/30', 'image/jpg', 'movie');
insert into good_tb values(
good_sq.nextval, 'BHC 치킨 기프티콘', '치킨엔 소주죠!',
'치킨', '2017/02/21', '2017/05/30', 'image/jpg', 'soju');
insert into good_tb values(
good_sq.nextval, '포켓몬 인형 택1', '최저시급이 10000원도 안되지만 10분만에 10000원을 잃는 당신에게 드리는 선물',
'포켓몬인형', '2017/03/21', '2017/04/30', 'image/jpg', 'doll');
insert into good_tb values(
good_sq.nextval, '샤이니 콘서트 티켓 1인 동반권', '싸인회까지~',
'콘서트 티켓', '2017/05/30', '2017/05/30', 'image/jpg', 'ticket');
insert into good_tb values(
good_sq.nextval, '뮤지컬 티켓 1인 동반권', '귀를 녹이는 감미로운 목소리',
'뮤지컬 티켓', '2017/03/11', '2017/03/30', 'image/jpg', 'ticket');
insert into good_tb values(
good_sq.nextval, '핸드폰 드립니다~', 'LG야심작 v20~',
'핸드폰', '2017/01/23', '2017/05/22', 'image/jpg', 'cellphone');
insert into good_tb values(
good_sq.nextval, '호식이 두마리 치킨 기프티콘', '치킨엔 콜라죠',
'치킨', '2017/02/22', '2017/06/30', 'image/jpg', 'chicken');
insert into good_tb values(
good_sq.nextval, '닌텐도3ds', '아이들이 좋아하는 포켓몬 칩을 드려요',
'닌텐도', '2017/03/21', '2017/04/30', 'image/jpg', 'nintendo');

insert into friends_tb values(
friends_sq.nextval, '창훈', '해진');
insert into friends_tb values(
friends_sq.nextval, '창훈', '택진');
insert into friends_tb values(
friends_sq.nextval, '창훈', '형문');
insert into friends_tb values(
friends_sq.nextval, '창훈', '치광');
insert into friends_tb values(
friends_sq.nextval, '치광', '택진');
insert into friends_tb values(
friends_sq.nextval, '치광', '형문');
insert into friends_tb values(
friends_sq.nextval, '치광', '해진');
insert into friends_tb values(
friends_sq.nextval, '치광', '창훈');
insert into friends_tb values(
friends_sq.nextval, '택진', '해진');
insert into friends_tb values(
friends_sq.nextval, '택진', '형문');
insert into friends_tb values(
friends_sq.nextval, '택진', '창훈');
insert into friends_tb values(
friends_sq.nextval, '택진', '치광');
insert into friends_tb values(
friends_sq.nextval, '형문', '해진');
insert into friends_tb values(
friends_sq.nextval, '형문', '창훈');
insert into friends_tb values(
friends_sq.nextval, '형문', '치광');
insert into friends_tb values(
friends_sq.nextval, '형문', '택진');
insert into friends_tb values(
friends_sq.nextval, '해진', '창훈');
insert into friends_tb values(
friends_sq.nextval, '해진', '치광');
insert into friends_tb values(
friends_sq.nextval, '해진', '택진');
insert into friends_tb values(
friends_sq.nextval, '해진', '형문');

insert into semohome_tb values(
semohome_sq.nextval, '창훈');
insert into semohome_tb values(
semohome_sq.nextval, '치광');
insert into semohome_tb values(
semohome_sq.nextval, '택진');
insert into semohome_tb values(
semohome_sq.nextval, '형문');
insert into semohome_tb values(
semohome_sq.nextval, '해진');

insert into user_tb values(
'pang', '1', '이창훈', '1991/11/21', '01084894898', 'IT', 'lch4898@naver.com', 'M','흰수염고래','10000000');
insert into user_tb values(
'chee', '12', '인치광', '1991/03/21', '01063742865', 'IT', 'chee@naver.com', 'M','개복치','1');
insert into user_tb values(
'taek', '123', '정택진', '1991/04/21', '01031589689', '연예', 'kimo343459@naver.com', 'M','새우','2');
insert into user_tb values(
'door', '1234', '최형문', '1993/8/5', '01063386335', 'IT', 'hyeungmoon@gmail.com', 'F','밍크고래','500');
insert into user_tb values(
'hehe', '12345', '곽해진', '1994/5/5', '01090434359', 'IT', 'thkdld4359@naver.com', 'F','쭈꾸미','10');
insert into user_tb values(
'onew', '123456', '이진기', '1989/12/14', '01012345678', 'people', 'onew@naver.com', 'M', '향유고래', '500');

insert into enteruser_tb values(
enteruser_sq.nextval, 'pang', '1');
insert into enteruser_tb values(
enteruser_sq.nextval, 'pang', '2');
insert into enteruser_tb values(
enteruser_sq.nextval, 'pang', '3');
insert into enteruser_tb values(
enteruser_sq.nextval, 'pang', '4');
insert into enteruser_tb values(
enteruser_sq.nextval, 'pang', '5');
insert into enteruser_tb values(
enteruser_sq.nextval, 'hehe', '2');
insert into enteruser_tb values(
enteruser_sq.nextval, 'chee', '3');
insert into enteruser_tb values(
enteruser_sq.nextval, 'door', '4');
insert into enteruser_tb values(
enteruser_sq.nextval, 'taek', '5');

insert into post_tb values(
post_sq.nextval, 'pang', '집에 갈까? 말까?', '피플', accuse_sq.nextval, '2017/03/27');
insert into post_tb values(
post_sq.nextval, 'chee', '맥주 VS 소주', '정치와사회', accuse_sq.nextval, '2017/04/27');
insert into post_tb values(
post_sq.nextval, 'taek', '인공지능 괜찮은가?', 'IT와과학', accuse_sq.nextval, '2017/05/27');
insert into post_tb values(
post_sq.nextval, 'door', '이거 무슨 색으로 보여요?', '생활', accuse_sq.nextval, '2017/06/27');
insert into post_tb values(
post_sq.nextval, 'hehe', '인기아이돌?', '연예', accuse_sq.nextval, '2017/07/27');
insert into post_tb values(
post_sq.nextval, 'pang', '짜장면 vs 짬뽕', '피플', accuse_sq.nextval, '2017/03/27');
insert into post_tb values(
post_sq.nextval, 'chee', '기부 방법', '정치와사회', accuse_sq.nextval, '2017/04/27');
insert into post_tb values(
post_sq.nextval, 'taek', '애플 vs 삼성', 'IT와과학', accuse_sq.nextval, '2017/05/27');
insert into post_tb values(
post_sq.nextval, 'door', '아침형 vs 저녁형', '생활', accuse_sq.nextval, '2017/06/27');
insert into post_tb values(
post_sq.nextval, 'hehe', '흑과 백', '피플', accuse_sq.nextval, '2017/07/27');



insert into alaming_tb values(
alaming_sq.nextval, 'pang', '2');
insert into alaming_tb values(
alaming_sq.nextval, 'pang', '3');
insert into alaming_tb values(
alaming_sq.nextval, 'pang', '4');
insert into alaming_tb values(
alaming_sq.nextval, 'pang', '5');
insert into alaming_tb values(
alaming_sq.nextval, 'door', '1');
insert into alaming_tb values(
alaming_sq.nextval, 'hehe', '2');
insert into alaming_tb values(
alaming_sq.nextval, 'taek', '3');
insert into alaming_tb values(
alaming_sq.nextval, 'chee', '4');


insert into comment_tb values(
comment_sq.nextval, '난모르겠어..', 'pang', '1');
insert into comment_tb values(
comment_sq.nextval, '소주', 'pang', '2');
insert into comment_tb values(
comment_sq.nextval, '괜찮아', 'chee', '3');
insert into comment_tb values(
comment_sq.nextval, '난 둘다 보이는데?', 'moon', '4');
insert into comment_tb values(
comment_sq.nextval, '짜장면', 'hehe', '5');
insert into comment_tb values(
comment_sq.nextval, '집에 가고싶어', 'hehe', '1');
insert into comment_tb values(
comment_sq.nextval, '맥주', 'moon', '2');
insert into comment_tb values(
comment_sq.nextval, '안괜찮아', 'taek', '3');
insert into comment_tb values(
comment_sq.nextval, '흰색', 'onew', '4');
insert into comment_tb values(
comment_sq.nextval, '짬뽕', 'chee', '5');

insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 1, 'hehe');
insert into ACCUSE_TB values(accuse_sq.nextval, '선정성', 2, 'hehe');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 2, 'chee');
insert into ACCUSE_TB values(accuse_sq.nextval, '선정성', 3, 'chee');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 3, 'hehe');
insert into ACCUSE_TB values(accuse_sq.nextval, '선정성', 3, 'pang');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 4, 'pang');
insert into ACCUSE_TB values(accuse_sq.nextval, '선정성', 4, 'door');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 4, 'chee');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 4, 'hehe');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 5, 'hehe');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 5, 'chee');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 5, 'pang');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 5, 'door');
insert into ACCUSE_TB values(accuse_sq.nextval, '욕설', 5, 'taek');

insert into guestbook_tb values(
guestbook_sq.nextval, 'pang', '치광아 잘지내니...?',2);
insert into guestbook_tb values(
guestbook_sq.nextval, 'pang', '택진아 잘지내니...?',3);
insert into guestbook_tb values(
guestbook_sq.nextval, 'pang', '형문아 잘지내니...?',4);
insert into guestbook_tb values(
guestbook_sq.nextval, 'pang', '해진아 잘지내니...?',5);
insert into guestbook_tb values(
guestbook_sq.nextval, 'chee', '들렀다가요~',1);
insert into guestbook_tb values(
guestbook_sq.nextval, 'chee', '들락날락~',3);
insert into guestbook_tb values(
guestbook_sq.nextval, 'chee', '발도장~',4);
insert into guestbook_tb values(
guestbook_sq.nextval, 'chee', '나트륨~',5);

insert into winner_tb values(
winner_sq.nextval, 'hehe', 1);
insert into winner_tb values(
winner_sq.nextval, 'chee', 2);
insert into winner_tb values(
winner_sq.nextval, 'pang', 3);
insert into winner_tb values(
winner_sq.nextval, 'teak', 4);
insert into winner_tb values(
winner_sq.nextval, 'moon', 5);
insert into winner_tb values(
winner_sq.nextval, 'hehe', 6);
insert into winner_tb values(
winner_sq.nextval, 'chee', 7);
insert into winner_tb values(
winner_sq.nextval, 'pang', 8);
insert into winner_tb values(
winner_sq.nextval, 'teak', 9);
insert into winner_tb values(
winner_sq.nextval, 'moon', 10);

insert into choice_tb values(
choice_sq.nextval, 1, '간다', 'image/jpg', 'go');
insert into choice_tb values(
choice_sq.nextval, 1, '안간다', 'image/jpg', 'nogo');
insert into choice_tb values(
choice_sq.nextval, 2, '맥주', 'image/jpg', 'beer');
insert into choice_tb values(
choice_sq.nextval, 2, '소주', 'image/jpg', 'soju');
insert into choice_tb values(
choice_sq.nextval, 3, '인공지능찬성', 'image/jpg', 'robot');
insert into choice_tb values(
choice_sq.nextval, 3, '인공지능반대', 'image/jpg', 'robotno');
insert into choice_tb values(
choice_sq.nextval, 4, '흰금', 'image/jpg', 'whitegold');
insert into choice_tb values(
choice_sq.nextval, 4, '파검', 'image/jpg', 'blueblack');
insert into choice_tb values(
choice_sq.nextval, 5, '샤이니', 'image/jpg', 'shinee');
insert into choice_tb values(
choice_sq.nextval, 5, '2pm', 'image/jpg', '2pm');

insert into vote_tb values(vote_sq.nextval, 1, 'chee', 1);
insert into vote_tb values(vote_sq.nextval, 1, 'hehe', 1);
insert into vote_tb values(vote_sq.nextval, 1, 'pang', 1);
insert into vote_tb values(vote_sq.nextval, 1, 'taek', 1);
insert into vote_tb values(vote_sq.nextval, 2, 'door', 1);
insert into vote_tb values(vote_sq.nextval, 3, 'door', 2);
insert into vote_tb values(vote_sq.nextval, 3, 'hehe', 2);
insert into vote_tb values(vote_sq.nextval, 3, 'taek', 2);
insert into vote_tb values(vote_sq.nextval, 4, 'chee', 2);
insert into vote_tb values(vote_sq.nextval, 4, 'pang', 2);
insert into vote_tb values(vote_sq.nextval, 5, 'door', 3);
insert into vote_tb values(vote_sq.nextval, 7, 'door', 4);
insert into vote_tb values(vote_sq.nextval, 8, 'chee', 4);
insert into vote_tb values(vote_sq.nextval, 9, 'door', 5);
insert into vote_tb values(vote_sq.nextval, 10, 'chee', 5);
insert into vote_tb values(vote_sq.nextval, 10, 'hehe', 5);


commit;
