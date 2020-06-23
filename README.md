# Ateam
ReserveApp
//git 협업

## 목차


Ⅰ. 프로젝트 개요
 1. 프로젝트 기능 소개 
 2. 프로젝트 선정 이유
 3. 시장 조사 및 경쟁사 분석
 4. 프로젝트 일정 및 역할

Ⅱ. 프로젝트 개발
 1. 개발환경 구성
 2. 데이터 베이스 설계
 2. 기술 구현
 3. 결과 실행

Ⅲ. 결론
 1. 결론
 2. 기대효과
 3. 참고자료
 4. 프로젝트 소감


---


# Ⅰ. 프로젝트 개요
 
## I-1. 프로젝트 기능 소개 

![image](https://user-images.githubusercontent.com/62562198/85266237-8d878700-b4ae-11ea-889e-129b56bbc678.png)

 저희 조 ‘카페 R’ 프로젝트는 카페에 갔을 때 자리가 없어서 다시 돌아오는 경우나 카페 메뉴의 재고를 따로 물어봐야 하는 불편함을 해결하기 위해서 계획하였습니다. 기능으로는 다음과 같습니다.

* 카페 어플 회원가입
* 카페 어플 로그인
* 카페 공지사항 전달
* 카페 메뉴 재고 표시
* 카페 메뉴 카테고리별로 제공
* 카페 메뉴 주문하기
* 카페 쿠폰 발급하기
* 카페 주문내역 제공하기
* 카페 자리 실시간으로 표시하기
* 카페 자리 실시간으로 예약하기

<br/>

## I-2. 프로젝트 선정 이유

### ① 소비자 측
 요즘 코로나 때문에 카페에서 온라인 강의와 과제를 하는 대학생들과 자택근무를 하는 직장인들이 더욱 늘어났습니다. 이와 같은 현상으로 인해서 카페에 가더라도 자리가 없거나 메뉴가 빠르게 소진되면서 카페를 이용하는데 불편함이 많아졌습니다. 실제로 동네 혹은 학교 근처 카페를 조금이라도 늦게 가면 앉을 자리가 없어 돌아가는가는 경우가 빈번하다. 그래서 카페에 자리가 없는 곳은 굳이 직접 가지 않아도 알 수 있는 방법은 없을까? 그리고 자리를 예약할 수 있다면 얼마나 좋을까? 라는 생각에서 자리예약 기능 어플 프로젝트를 생각하게 되었습니다. 또 비슷한 경우로 소형 프렌차이즈나 개인 카페의 경우에도 원하는 메뉴의 재고가 없는 경우에 매장에 가기전에 알 수 있는 방법은 없을까? 그리고 카페에서 직원분에게 직접 물어보지 않고 메뉴의 재고를 알 수 있는 방법은 없을까? 라는 생각에서 메뉴 재고 표시 기능을 생각하게 되었습니다.

코로나로 인해서 요즘 공부할 곳이 마땅히 없는 학생들과 온라인 강의을 듣기 위한 학생들로 카페가 붐비는 상황에서 이러한 기능을 가진 어플이 있다면 붐비는 상황에서 조금이라도 기다리는 시간을 줄일 수 있고 자리가 없거나 원하는 메뉴가 없어 헛걸음하는 일 이 해결될 것이다.


### ② 공급자 측
 저희는 이 프로젝트를 처음 생각하였을 때부터 이 프로젝트의 주요 타겟은 대형 프렌차이즈보다는 소규모 카페와 개인 카페를 대상으로 하였다. 극소수의 대형 프렌차이즈에서는 이미 어플을 통해서 메뉴, 메뉴 주문하기, 음료당 쿠폰(스탬프) 제공하기, 지도 상 위치제공 등의 기능을 제공하고 있지만 소규모 프렌차이즈나 개인 카페는 어플을 거의 제공하지 못하고 있기 때문입니다. 대형 프렌차이즈 어플을 그대로 소형 프렌차이즈와 개인카페에 적용하는 것이므로 공급자 입장에서도 큰 편의를 줄 거라고 생각하였습니다. 이 프로젝트의 주요기능인 메뉴의 재고표시와 어플을 통한 주문하는 기능은 매장에서 주문받는 시간을 줄여 노동력과 시간을 단축할 수 있으며, 자리예약 기능 또한 자리 없을 때 오신 손님을 돌려보내지 않아도 되고 재고를 일일이 알려드리지 않아도 되므로 직원들도 편하고 손님들도 원하는 서비스를 제공받으므로 손님의 만족도도 높아지고 이로 인한 고객 증가 효과를 생각하였다.

## I-3. 시장 조사 및 경쟁사 분석

 우선 카페 어플 시장을 분석한 내용입니다. 현재 카페 어플은 극소수의 대기업 프렌차이즈 카페에서만 어플 서비스를 제공하고 있었습니다. 어플 서비스 주요 내용으로는 카테고리별로 분류된 메뉴판에 메뉴의 칼로리와 성분의 정보를 제공하여 홈페이지에 접속하지 않아도 고객들이 원하는 많은 정보를 제공해주고 있었습니다. 그리고 어플을 통한 메뉴 주문하기와 계산하기를 원터치로 가능하도록 하여 카페에서 주문하는데 줄서는 시간, 메뉴를 기다리는 시간을 절약 할 수 있도록 편리함을 제공하고 있습니다. 그리고 메뉴당 쿠폰(스탬프) 제공하고 그에 따른 등급을 나눠 해당 쿠폰과 서비스를 제공하고 있었습니다. 그리고 현 위치에서 가장 가까운 매장을 찾아주고 지도상의 위치와 별점을 제공하고 있습니다. 
 이러한 어플의 다운로드 수가 많은 것으로 보아 고객들도 카페 어플을 사용하고 있다는 것을 알 수 있었습니다. 하지만 소규모의 프렌차이즈나 개인 카페인 경우는 어플 서비스를 거의 제공하고 있지 않았습니다.

 다음은 경쟁사들의 분석한 내용입니다.
 
 <br/>
 


### ① 스타벅스💚

 ![image](https://user-images.githubusercontent.com/62562198/85266368-bb6ccb80-b4ae-11ea-9c0f-5abfc764225d.png)
 
 스타벅스 어플은 가장 많이 사용되고 있는 카페 어플로 스타벅스 어플의 주요기능은 스타벅스에서 현금처럼 사용이 가능한 기프트카드 등록하기 및 사용하기, 매장을 설정하면 실시간으로 메뉴의 수량을 확인하기, 메뉴를 자신이 원하는 옵션으로 고르기, 원터치로 메뉴를 주문하고 계산하기 등이 있습니다.


### ② 이디야💙

![image](https://user-images.githubusercontent.com/62562198/85266410-c6bff700-b4ae-11ea-8417-6be293a028ed.png)


 이디야 어플은 두 번째로 가장 많이 사용하는 카페 어플이며 주요기능은 음료를 주문하면 한 잔당 하나의 스탬프 적립해주기, 이디야에서 현금처럼 메뉴를 주문할 수 있는 쿠폰 등록하고 사용하기, 스탬프 적립을 통해 등급을 제공하고 등급에 맞게 다양한 혜택을 제공하기, 원터치로 메뉴 주문하기와 같은 기능이 있습니다.

 위와 같이 대형 프렌차이즈 어플들의 주요기능들을 보면 고객들에게 편리함을 주기 위해 다양한 서비스를 제공하고 있지만 저희 프로젝트에서 제공하고자 하는 오프라인 매장의 자리의 정보를 실시간으로 제공하는 기능과 자리를 예약하는 기능은 없었습니다. 그래서 이 어플을 출시하게 되면 매장의 자리를 손님들이 미리 예약함으로써 매장의 회전율도 개선되고 손님들의 불편함도 해소되는등 카페 어플시장에서 희소성있는 어플이 될 수 있다 생각합니다.

<br/>

## I-4. 프로젝트 일정 및 역할

![image](https://user-images.githubusercontent.com/62562198/85266444-d2abb900-b4ae-11ea-9cc7-83b7926fb43f.png)

 다음의 저희 조의 1주차부터 14주차까지의 활동의 내용과 일정을 표시한 진도표입니다. 저희 조는 한주마다 그 주의 계획에 해당하는 기능들을 한 화면씩 구현하고 한 기능씩 구축하였습니다.
<br/>

# Ⅱ. 프로젝트 개발
## Ⅱ-1. 개발환경 구성

### ●  서버를 사용하는 이유
 어플을 이용하는 사용자들의 정보를 DB에 저장하고 DB에 저장되어있는 정보에 접근하기 위해서 서버가 꼭 필요하다. 


### ●  서버, 데이터베이스 구성

https://www.cafe24.com/<br/>
DB와 연동하기 위해서 DB호스팅을 구매하는 곳 중 카페 24를 통해서 DB호스팅을 구매하여 서버를 이용한다.<br/>

-카페24 호스팅 계정에 phpMyAdmin 설치 방법<br/>
https://help.cafe24.com/cs/cs_faq_view.php?idx=1879&page=1&mode=&s_value=&faq_list=36&categoryIdx=36&select_os=&contentNum=116<br/>


![image](https://user-images.githubusercontent.com/62562198/85266563-fa028600-b4ae-11ea-9f70-d6545d55e3ca.png)


### ● 웹 FTP 
 -호스팅을 받는 서버에 접근하여 파일을 업로드하거나 다운로드 할 수 있는 툴(TOOL)<br/>
 -FileZila 설치 방법<br/>
https://help.cafe24.com/cs/cs_faq_view.php?idx=467<br/>

![image](https://user-images.githubusercontent.com/62562198/85266476-ddfee480-b4ae-11ea-9057-112d6cb0eaba.png)

![image](https://user-images.githubusercontent.com/62562198/85266607-0c7cbf80-b4af-11ea-90ad-b1df96f47e71.png)


우선 http://filezilla-project.org 로 접속 후 사용하시는 OS에 맞게 다운로드 합니다.<br/>


 이렇게 다운받은 filezila에 접속해서 카페24에서 구매한 도메인과 포트번호를 입력하여 웹 FTP에 접속합니다. <br/>
 
 ![image](https://user-images.githubusercontent.com/62562198/85266678-27e7ca80-b4af-11ea-8ab9-caf10e3763f8.png)
 
 각각 비밀번호, 호스트란에 부여받은 도메인을 입력하고, 포트 입력하는 곳에 부여받은 포트번호를 입력하여 접속하게 됩니다.<br/>
연결하면 다음과 같이 왼쪽은 로컬사이트로 자신의 PC파일을 보여주며
오른쪽에는 리모트 사이트로 자신의 서버이다.<br/>

![image](https://user-images.githubusercontent.com/62562198/85266796-58c7ff80-b4af-11ea-93e5-7ec6fc2d31f4.png)

왼쪽 로컬사이트에서 오른쪽 리모트 사이트로 파일을 업로드 해주면 된다.



<안드로이드 스튜디오와 DB를 연결하기 위해 PHP 파일을 이용해 안드로이드 스튜디오에서 정보를 받아 DB에 정보를 보내준다.>

- 이렇게 접속한 후 메뉴추가 데이터베이스 파일인  MenuAdd.php파일, 메뉴리스트 데이터베이스 파일인 menulist.php, 공지사항 데이터베이스 파일인 NoticeList.php, 로그인 데이터베이스 파일인 UserLogin.php, 회원가입 데이터베이스 파일인 UserRegister.php를 업로드합니다. 

 각각의 데이터 베이스 php파일은 Ⅱ-2. 데이터 베이스 설계에서 자세하게 설명하도록 하겠습니다.



 그리고 업로드를 완료한 후 DB(데이터베이스)를 관리하기 위해 설치한 phpMyAdmin에 접속합니다. phpMyAdmin에 접속하는 방법은  먼저 웹브라우저를 열고, 주소창에 http://www.도메인주소/dbeditor 를 입력합니다. <br>
 
 그러면 아래와 같은 화면이 나타납니다.<br>
 
![image](https://user-images.githubusercontent.com/62562198/85269797-5f587600-b4b3-11ea-86bf-c3450a3dbeec.png)<br>

사이트로 접속하여 사용자명에 아이디를 입력하고 비밀번호를 입력하여 접속합니다.<br>



![image](https://user-images.githubusercontent.com/62562198/85269861-772ffa00-b4b3-11ea-9144-7f4fd4e75fe9.png)<br>
이렇게 접속한 화면에서 사용자 아이디 부분을 클릭하여 아래화면과 같이 추가가 DB를 확인 할 수 있습니다.<br>

![image](https://user-images.githubusercontent.com/62562198/85269909-84e57f80-b4b3-11ea-9ebe-8a9f12c0d14f.png)<br>

그 후 자신의 데이터베이스에 테이블을 생성한다.<br>

 맨 위 상단의 MEMBER 테이블은 회원가입 창에서 회원이 ID, 비밀번호, 이름, 핸드폰 번호를 각각 입력하도록 하고 가입하기 버튼을 눌렀을 때 회원이  
입력한 정보를 가지고 있는 테이블로 이 정보들은 MEMBER 테이블에 입력 받은 정보를 각각 아이디는 userID, 비밀번호는 userPassword, 이름은 userName, 전화번호는 userPhoneNumber로 정보 받아서 저장하기 위해서 생성되는 테이블입니다.

그리고 NOTICE 테이블은 관리자가 로그인 후에 사용자들에게 전달하고자 하는 정보를 입력받아 메인 화면의 공지사항란에 나오게 하는데 이때 공지사항란에 보이는 정보와 공지사항을 쓴 사용자의 ID를 이곳에 저장하기 위해 생성되는 테이블입니다. 
그리고 STATISTIC 테이블은 메인 화면 상단에 위치한 메뉴 버튼을 클릭하면 이동하게 되는 메뉴화면에서 주문한 메뉴를 저장하는 테이블로, 각각의 카테고리에서 메뉴를 선택하고 해당 메뉴의 수량을 입력하고 cart버튼을 클릭하면 입력받은 정보들이 이 테이블에 저장됩니다. 또한 이 테이블은 cart버튼을 클릭하였을 때와 메인 화면의 상단에 주문 내역 버튼을 클릭하였을 때 이동하는 주문 내용을 보여주는 주문 내역 화면에서 보여줄 정보의 테이블이기도 합니다.

---

## Ⅱ-2. 데이터 베이스 설계

### 1. 데이터베이스와 서버 PHP파일로 연동
 안드로이드 스튜디오와 데이터베이스를 연동하기 위해서 PHP파일을 이용합니다.

#### ●  UserRegister.php 파일

![image](https://user-images.githubusercontent.com/62562198/85269951-90d14180-b4b3-11ea-848a-acc331e2502b.png)

##### -입력받은 회원가입 정보를 DB로 전달 
우선 DB와의 연동 할 수 있도록 맨 위에 localhost,DB아이디,DB의 비밀번호,DB이름을 작성하여 연결합니다.<br/>

그 다음 코드는 안드로이드 스튜디오로 만든 어플을 통해 입력받은 사용자의 아이디를 userID, 비밀번호를 userPassword, 이름을 userName, 전화번호를 userPhoneNumber로 할당되도록하고 아이디와 비밀번호를 입력해 연결된 자신의 데이터베이스로 연결 시켜준다. <br/>

그리고 네 가지 정보를 입력받았을 때 ‘MEMBER‘라는 데이터베이스 테이블 안에 해당 정보를 문자열 형태로 입력할 수 있도록 한다. <br/>

회원 등록을 success 했을 때 true 값을 보내줘 response 하여 회원가입 성공을 알린다.<br/>



#### ●  UserValidate.php 파일

![image](https://user-images.githubusercontent.com/62562198/85270330-17861e80-b4b4-11ea-9e92-210e5308755d.png)


##### -입력받은 아이디가 DB에 저장되어있는지 확인 <br/>

 우선 DB와의 연동 할 수 있도록 맨 위에 localhost,DB아이디,DB의 비밀번호,DB이름을 작성하여 연결합니다.<br/>

그리고 하나의 아이디를 입력받은 후 아이디를 userID로 할당하고 userID가 데이터베이스의 ’MEMBER‘ 테이블의 모든 정보를 불러와 입력받은 아이디가  ’MEMBER‘ 테이블에 userID로 존재하는지 확인을 합니다.<br/>

입력받은 아이디가 데이터베이스의 ’MEMBER‘ 테이블에 userID가 존재하는 경우에는 success값에 false값을 보내줘 회원가입할 수 없는 정보임을 알려준다.<br/>


#### ● UserLogin.php 파일

![image](https://user-images.githubusercontent.com/62562198/85270362-2240b380-b4b4-11ea-96ae-9c66ba72be73.png)

##### -로그인<br/>

 우선 DB와의 연동 할 수 있도록 맨 위에 localhost, DB아이디, DB의 비밀번호, DB이름을 작성하여 연결합니다.<br/>

그리고 안드로이드 스튜디오로 실행한 어플의 로그인 화면에서 아이디는 userID와 userPassword를 매개변수로 받은 후 MEMBER 테이블에서 모든 userID를 불러와서 해당 userID이 있는지 확인한다.
<br/>
해당 회원userID이 있는 경우 success값(입력받은 아이디값)을 true로 반환하고 해당 회원이 없는 경우 success값(입력받은 아이디값)을 false로 반환한다.<br/>


#### ●  NoticeList.php 파일

![image](https://user-images.githubusercontent.com/62562198/85270399-35538380-b4b4-11ea-868f-e4fa62a43b19.png)

##### -공지사항<br/>
우선 DB와의 연동 할 수 있도록 맨 위에 localhost, DB아이디, DB의 비밀번호, DB이름을 작성하여 연결합니다.<br/>

연결 후 ORDER 테이블에 모든 noticDate를 불러오도록 하여 내림차 순으로 정렬하여 보여주는데 이 공지사항은 안드로이드 스튜디오에서 실행한 어플에 입력한 공지사항을  “noticContent”, “noticName”, “noticDate”를 정렬하여 보여줍니다.<br/>



#### ●  menulist.php 파일

![image](https://user-images.githubusercontent.com/62562198/85270428-40a6af00-b4b4-11ea-9008-911065f01acd.png)

##### -주문내역 
 
우선 DB와의 연동 할 수 있도록 맨 위에 localhost, DB아이디, DB의 비밀번호, DB이름을 작성하여 연결합니다.<br/>

그리고 ORDER 테이블에서 모든 menuID를 불러와서 내림차순으로 정렬 시켜줍니다.<br/>
 
이것은 데이터베이스에서 저장된 내용을 안드로이드 스튜디오로 실행한 어플의 주문내역화면에 보여줄 때로 menuID를 menu, userID는 아이디, menuName는 메뉴 이름, menuCount는 메뉴 수량순으로 주문내역 화면에 데이터 베이스에 저장된 내용을 정렬하여 보여줍니다. <br/>



 
#### ● sitlist.php 파일

![image](https://user-images.githubusercontent.com/62562198/85270527-5e741400-b4b4-11ea-8df8-2bafff86c81b.png)

##### -자리예약

우선 DB와의 연동 할 수 있도록 맨 위에 localhost, DB아이디, DB의 비밀번호, DB이름을 작성하여 연결합니다.

안드로이드 스튜디오에서 실행한 어플에서 입력받은 아이디를 userID, 비밀번호를 userPassword, 테이블 번호를 usertable로 데이터 베이스에 할당 되도록 합니다.
그리고 MEMBER 테이블에서 모든 userID정보를 불러오도록 합니다.<br/>
 

 그리고 NOTICE 테이블은 관리자가 로그인 후에 사용자들에게 전달하고자 하는 정보를 입력받아 메인 화면의 공지사항란에 나오게 하는데 이때 공지사항란에 보이는 정보와 공지사항을 쓴 사용자의 ID를 이곳에 저장하기 위해 생성되는 테이블입니다. 
그리고 STATISTIC 테이블은 메인 화면 상단에 위치한 메뉴 버튼을 클릭하면 이동하게 되는 메뉴화면에서 주문한 메뉴를 저장하는 테이블로, 각각의 카테고리에서 메뉴를 선택하고 해당 메뉴의 수량을 입력하고 cart버튼을 클릭하면 입력받은 정보들이 이 테이블에 저장됩니다. 또한 이 테이블은 cart버튼을 클릭하였을 때와 메인 화면의 상단에 주문 내역 버튼을 클릭하였을 때 이동하는 주문 내용을 보여주는 주문 내역 화면에서 보여줄 정보의 테이블이기도 합니다.



---




 ### Ⅱ-3. 기술 구현

#### 1.회원가입

#### ● RegisterActivity.java

![image](https://user-images.githubusercontent.com/62562198/85271969-7cdb0f00-b4b6-11ea-86f1-8c208ee57735.png)
![image](https://user-images.githubusercontent.com/62562198/85272326-fffc6500-b4b6-11ea-9a2b-57b4c58df73e.png)
![image](https://user-images.githubusercontent.com/62562198/85272504-36d27b00-b4b7-11ea-8bb6-626055166b6f.png)
![image](https://user-images.githubusercontent.com/62562198/85272583-536eb300-b4b7-11ea-979f-e9cd10c8a920.png)

-아이디를 입력하고 validateButton을 클릭하면 데이터베이스에 저장되어 있는 userID와 일치하지 않으면 "사용할 수 있는 아이디입니다."라는
  메세지가 나옵니다. 그리고 데이터베이스 저장되어 있는 userID와 일치하면 "사용할 수 없는 아이디입니다."라는 메세지가 나옵니다.

-아이디 중복체크 버튼을 누르면 버튼의 색과 idText찬의 색이 colorGray로 바뀝니다.

-아이디를 입력하고아이디 중복체크 버튼을 누르고 "사용할 수 있는 버튼입니다"라는 메세지가 나오면 버튼의 색과 idText창의 색이 colorGray로 바뀝니다.

-regiseterButton은 회원가입창에 정보를 입력한 루 누르는 회원가입 버튼입니다.

-regiseterButton은 회원가입창에 정보를 입력한 후 회원가입 버튼을 누르는데 그러면 입력한 정보들이 데이터베이스에 저장 됩니다.

-regiseterButton을 눌렀을 때 아이디 중복체크 버튼을 누르지 않으면 "먼저 중복체크를 해주세요"라는 메세지가 나옵니다.
-정보를 입력하고 regiseterButton을 눌렀을 때 아이디 중복체크 버튼을 누르지 않으면 "먼저 중복체크를 해주세요"라는 메세지가 나옵니다.

-regiseterButton을 눌렀을 때 userID 또는 userPasssword 또는 userName 또는 userPhoneNumber 중 하나라도 빈칸인 경우에는
  "빈칸없이 입력해주세요"라는 메세지가 나옵니다.

-그리고 모든 조건을 만족하고 regiseterButton을 누르면 "회원등록에 성공했습니다."라는 메세지가 나오고 만족하지 못하면 
   "회원등록에 실패하였습니다"라는 메세지가 나옵니다.
   
-그리고 아이디의 중복체크버튼을 눌렀을 때 "사용가능한 아이디입니다"라는 메세지가 나오고 빈칸없이 모든 창에 정보를 입력하고 regiseterButton을 누르  면 "회원등록에 성공했습니다."라는 메세지가 나오고 만족하지 못하면 "회원등록에 실패하였습니다"라는 메세지가 나옵니다.

 -모든 과정이 끝나면 onStop메소드를 통해서 RegisterActivity에서 나오게 됩니다.


#### ● RegisterRequest.java

![image](https://user-images.githubusercontent.com/62562198/85272647-697c7380-b4b7-11ea-8661-5b08c03621bf.png)

-자신의 도메인과 UserRegister.php를입력합니다.

-여기서 UserRegister.php는 안드로이드 스튜디오로 실행한 어플에서 입력한 정보를 데이터 베이스와 연결해 줍니다.

-안드로이드 스튜디오에서 입력한 정보를 UserRegister.php파일을 통해서 아이디는 userID, 비밀번호는 userPassword, 
 이름은 userName, 전화번호는 userPhoneNumber로 할당하여 데이터베이스에 저장합니다.


###### <아이디 중복 체크>

#### ● ValidateRequest.java
![image](https://user-images.githubusercontent.com/62562198/85363171-2f64ad80-b55b-11ea-889d-5a00695d5180.png)

-자신의 도메인과 UserValidate.php를입력합니다. 이 UserValidate.php는 아이디 중복체크를 위한 php파일입니다.

-안드로이드 스튜디오에서 실행한 어플에서 입력한 아이디가 데이터베이스에 userID값이 있는지 확인하기 위해서 PHP파일이 안드로이드 스튜디오
와 데이터베이스를 연결 시켜줍니다.

-userID가 입력되면 parameters에 입력됩니다.



#### 2. 로그인
#### ● LoginActivity.java
![image](https://user-images.githubusercontent.com/62562198/85270674-a2ffaf80-b4b4-11ea-8229-0077e8356ad7.png)
![image](https://user-images.githubusercontent.com/62562198/85270865-ece89580-b4b4-11ea-97be-c1aac96a1abf.png)

-레이아웃은 activity_login으로 할당합니다.

-LoginActivity는  RegisterActivity.class를 서브 클래스로 하여 RegisterActivity에서 회원가입 버튼인 registerButton을 클릭하였을 때<br/> LoginActivity로 화면이 이동하게 됩니다.
 
-안드로이드 스튜디오에서 실행한 어플인 로그인 창에서 입력받은 아이디는 idText, 비밀번호는 passwordText로 할당합니다.

-loginButton을 눌렀을 때 데이터 베이스에 있는 값과 일치하는 성공값에서는 "로그인에 성공했습니다."라는 메세지가 나옵니다. 이때 이 메세지와 함께
 로그인에 성공하게 되면 MainActivity로 화면이 이동하게 됩니다.
 
 -loginButton을 눌렀을 때 데이터 베이스에 있는 값과 일치하지 않는 경우에는 "계정을 다시 확인하세요"라는 메세지와 함께 "다시시도"라는
 버튼이 나오게 됩니다.
 
 -로그인에 성공하게되면 userID, userPassword를 매개변수로 하여 loginRequest에 추가 되게 된다. 
 
 -그리고 Onstop메소드를 통해서 LoginActivity에서 빠져나오게 됩니다.



#### ● LoginRequest.java
![image](https://user-images.githubusercontent.com/62562198/85270937-0853a080-b4b5-11ea-8518-17fce33d304b.png)


-자신의 도메인과 UserLogin.php를입력합니다.

-여기서 UserLogin.php는 안드로이드 스튜디오로 실행한 어플에서 입력한 정보를 데이터 베이스와 연결해 줍니다.

-안드로이드 스튜디오에서 입력한 정보를 UserLogin.php파일을 통해서 아이디는 userID, 비밀번호는 userPassword로 할당하여 데이터베이스에 저장합니다.



### 3. 메인 화면
#### ● MainActivity.java
![image](https://user-images.githubusercontent.com/62562198/85354822-59f83b80-b546-11ea-9b15-281cbb3268a4.png)
![image](https://user-images.githubusercontent.com/62562198/85354858-6c727500-b546-11ea-9771-93edf7ba1727.png)
![image](https://user-images.githubusercontent.com/62562198/85354899-83b16280-b546-11ea-89c9-8be0a2616cb4.png)
![image](https://user-images.githubusercontent.com/62562198/85354959-a04d9a80-b546-11ea-80ea-df5a84578e54.png)
![image](https://user-images.githubusercontent.com/62562198/85354985-afcce380-b546-11ea-96d9-ae1cdf71dca4.png)

-멤버변수 noticListView, adapter, noticeList, userID를 만들어줍니다.

-레이아웃을 activity_main으로 할당합니다.

-userID는 입력된 사용자의 userID를 할당되도록 합니다.

-adapter에 공지사항에 해당하는 noticelist를 넣어줍니다. 여기서 adapter에 들어갈 공지사항은 view형태로 보여줍니다.

-아이디가 notice인 LinearLayout을 notice로 , 아이디가 reserveButton인 Button을 reserveButton으로,
아이디가 menuButton인 Button을 menuButton으로 , 아이디가 statisticButton인 Button을 
statisticButton으로 선언합니다.

-menuButton을 클릭하였을 때 MenuActivity 클래스로 화면이 이동하도록 하고 MenuActivity를 시작합니다. 
이때 menuButton, reserveButton, statisticButton을 클릭하였을 때 각각 버튼의 색이 color레이아웃에 
설정한 colorPrimary로 바뀌도록 한다.

-reserveButton을 클릭하였을 때 Sit 클래스로 화면이 이동하도록 하고 SitActivity를 시작합니다. 이때 menuButton, reserveButton, statisticButton을 클릭하였을 때 각각 버튼의 색이 color레이아웃에 설정한 colorPrimary로 바뀌도록 한다.

-statistcButton을 클릭하였을 때 StatisticActivity 클래스로 화면이 이동하도록 하고  StatisticActivity 를 시작합니다. 이때 menuButton, reserveButton, statisticButton을 클릭하였을 때 각각 버튼의 색이 
color레이아웃에 설정한 colorPrimary로 바뀌도록 한다.

-우선 target을 선언하고 target에 해당하는 공지사항 데이터베이스와 연결해주기 위해서 자신의 도메인과 
안드로이드스튜디오와 데이터베이스를 연결해줄 NoticeList.php를 입력해서 해당 데이터베이스와 연결 시켜줍니다.
 
 -URL target에서 안드로이드 스튜디오에서 실행한 어플에서 입력한 받은 정보를 결과값으로 넘겨받아 결과값을 저장 할 수 있도록 합니다.
 그리고 inputstream에 있는 내용을 buffer에 담아서 읽을 수 있도록 합니다. 이때 값이 null이 아닐때까지 한 줄 씩 추가해줍니다.
 
 -그리고 활동이 끝나면 연결을 끊어줍니다.
 
 -onProgressUpdate를 통해서 response에 공지사항 리스트를 넣어줍니다. 이 공지사항에는 공지사항 내용, 이름, 날짜를 넣을 수 있습니다.
  이때 카운트가 arry크기보다 작을 때까지 현재 배열 원소값을 넣을 수 있도록 하고 noticecontent값을 가져오고, noticedate 값을 가져와서
  하나의 공지사항 객체를 만들어주어 noticelist에 추가 해줍니다.
  
  -그리고 뒤로가기 버튼은 두 번 눌렀을 때 앱을 종료시킵니다.
  이때 뒤로가기 버튼을 한번 누르고 1.5초이내에 한 번 더 눌렀을 때 종료되도록합니다.
  
  -종료할 때는 "Good Bye"라는 메세지가 나오도록 합니다.



##### -메인 화면에 들어갈 공지사항 List

#### ● Notice.java

![image](https://user-images.githubusercontent.com/62562198/85355328-5add9d00-b547-11ea-867b-317b845d79c9.png)

-Notice클래스는 공지사항에 들어갈 List를 생성자를 생성하고 입력값을 할당하는 클래스입니다.

-공지사항에 들어갈 notice, name, date 매개변수를 선업힙니다.

-그리고 Notice이라는 생성자를 생성하여 매개변수 notice, name, date를 사용합니다.
getter, setter를 생성해서 입력받은 notice을 notice으로, 입력받은 name을 name으로 ,
입력받은 date를 date로 할당합니다.


#### ● NoticeListAdapter.java

![image](https://user-images.githubusercontent.com/62562198/85355421-82cd0080-b547-11ea-8a20-fecd4c34f6cc.png)

-매개변수 context, noticList를 선언합니다.

-입력된 context, noticList를 각각의 매개변수에 할당합니다.

-위에 객체로 할당한 noticeList를 가져오도록 하고 View로 보여줍니다. 이때 보여주는 view는 레이아웃 notice을 통해서 보여줍니다.

-TextView의 아이디 noticeText, nameText, dateText를 각각 이름을 noticeText, nameText, dateText로 할당합니다.
그리고 할당되어 있는 Text를 list에 넣는 값으로 notic, name, date를 넣어줍니다.




### 4. 메뉴 화면

#### ● MenuActivity.java

![image](https://user-images.githubusercontent.com/62562198/85355474-a728dd00-b547-11ea-808b-073ffc8d917d.png)
![image](https://user-images.githubusercontent.com/62562198/85355546-d2133100-b547-11ea-977e-0cfdcb76de93.png)


-레이아웃을 activity_menu로 할당합니다.

-Menu화면 상단에 위치한 reserverButton, menuButton, statisticButton이 있는데 이 버튼들의 아이디가 reserverButton
,menuButton, statisticButton인 Button을 각각 이름을 reserverButton, menuButton,statisticButton으로 할당합니다.

-menuButton을 클릭하면 MenuActivity클래스로 화면이 이동하게 됩니다. 그리고 MenuActivity클래스를 시작합니다.

-reserveButton을 클릭하면 sit클래스로 화면이 이동하게 됩니다. 그리고 sit클래스를 시작합니다.

-statisticButton을 클릭하면 StatisticActivity클래스로 화면이 이동하게 됩니다. 그리고 StatisticActivity클래스를 시작합니다.

-menuButton을 클릭하였을 때, 화면에 coffeeButton, DesertButton, NoncoffeeButton이 있습니다.
이 버튼들을 통해서 메뉴의 카테고리 별로 분류해서 메뉴를 주문할 수 있도록 하였습니다.

-coffeeButton을 클릭하면 CoffeeActivity클래스로 화면이 이동하게 됩니다. 그리고 CoffeeActivity클래스를 시작합니다.

-DesertButton을 클릭하면 DesertActivity클래스로 화면이 이동하게 됩니다. 그리고 DesertActivity클래스를 시작합니다.

-NoncoffeeButton을 클릭하면 NonCoffeeActivity클래스로 화면이 이동하게 됩니다. 그리고 NonCoffeeActivity클래스를 시작합니다.


#### ● CoffeeActivity.java
![image](https://user-images.githubusercontent.com/62562198/85355641-0c7cce00-b548-11ea-8c06-61ed0597ce01.png)

-레이아웃을 menu로 할당합니다.





#### ● NoncoffeeActivity.java
![image](https://user-images.githubusercontent.com/62562198/85355707-2e765080-b548-11ea-8eb4-8f938dff8d60.png)


#### ● DessertActivity.java
![image](https://user-images.githubusercontent.com/62562198/85355744-45b53e00-b548-11ea-8656-0301d86a1a74.png)

 
 
### 5. 자리예약 화면
#### ● Sit.java
![image](https://user-images.githubusercontent.com/62562198/85355799-641b3980-b548-11ea-9123-9a2bdb3d902d.png)
![image](https://user-images.githubusercontent.com/62562198/85355871-80b77180-b548-11ea-9bce-d7a4c34825eb.png)
-sit 화면에서 상단바 각각의 메뉴, 자리예약, 주문내역 버튼들을 누를 때 해당 화면으로 넘어갈수 있는 이벤트 처리를 합니다.

-그리고 자신이 원하는 자리의 이미지버튼들을 누를시 ReserveActivity 화면으로 넘어가 사용자 인증 후 자리를 예약할 수 있도록 합니다.

-예약된자리는 버튼 클릭후 colorDark로 만들어줘서 예약된 자리임을 나타내주도록 합니다.



### 6. 주문 내역 화면
#### ● OrderActivity.java
![image](https://user-images.githubusercontent.com/62562198/85362976-ce3cda00-b55a-11ea-878a-e425ad046322.png)
![image](https://user-images.githubusercontent.com/62562198/85363049-e280d700-b55a-11ea-9446-8db0a71a1dda.png)
![image](https://user-images.githubusercontent.com/62562198/85363078-f4627a00-b55a-11ea-9168-f0c3ac216fcd.png)

-멤버변수 statisticListView, adapter, statisticList, userID를 만들어줍니다.

-레이아웃을 activity_statistic으로 할당합니다.

-userID는 입력된 사용자의 userID를 할당되도록 합니다.

-OrderListAdapter에 주문내역 statisticList 를 넣어줍니다. 여기서 adapter에 들어갈 주문내역은
view형태로 보여줍니다.

-아이디가 notice인 LinearLayout을 notice로 , 아이디가 reserveButton인 Button을 reserveButton으로, 
아이디가 menuButton인 Button을 menuButton으로 , 아이디가 statisticButton인 Button을 statisticButton으로 선언합니다.

-menuButton을 클릭하였을 때 MenuActivity 클래스로 화면이 이동하도록 하고 MenuActivity를 시작합니다.

-reserveButton을 클릭하였을 때 Sit 클래스로 화면이 이동하도록 하고 SitActivity를 시작합니다.

-statistcButton을 클릭하였을 때 StatisticActivity 클래스로 화면이 이동하도록 하고 StatisticActivity 를 시작합니다. 

-우선 target을 선언하고 target에 해당하는 주문내역 데이터베이스와 연결해주기 위해서 자신의 도메인과 
안드로이드스튜디와 데이터베이스를 연결해줄 menulist.php를 입력해서 해당 데이터베이스와 연결 시켜줍니다.
 
 -URL target에서 안드로이드 스튜디오에서 실행한 어플에서 입력한 받은 정보를 결과값으로 넘겨받아 결과값을 저장 할 수 있도록 합니다.
 그리고 inputstream에 있는 내용을 buffer에 담아서 읽을 수 있도록 합니다. 이때 값이 null이 아닐때까지 한 줄 씩 추가해줍니다.
 
 -그리고 활동이 끝나면 연결을 끊어줍니다.
 
 -onProgressUpdate를 통해서 response에 주문내역 리스트를 넣어줍니다. 이 주문내역에는 주문번호, 
 사용자아이디, 메뉴이름, 주문수량을 넣을 수 있습니다.
  
 -이때 카운트가 array크기보다 작을 때까지 현재 배열 원소값을 넣을 수 있도록 하고 
 userID, menuID, menuName, menuAmount 값을 가져와서 하나의 주문 객체인
 Order statistic을 만들어주어 statisticList에 추가 해줍니다.

#### ● Order.java
![image](https://user-images.githubusercontent.com/62562198/85362916-a3eb1c80-b55a-11ea-88b0-433f5cf8cf4a.png)

-Order 클래스는 주무내역에 들어갈 List를 생성자를 생성하고 입력값을 할당하는 클래스입니다.

-주문내역에 들어갈 userID, menuID, menuName, menuAmount 매개변수를 선업힙니다.

-그리고 Order 라는 생성자를 생성하여 매개변수 userID, menuID, menuName, menuAmount를 사용합니다.

-getter, setter를 생성해서 입력받은 userID는 userID로, 입력받은 menuID는 menuID로 ,
입력받은 menuName을 menuName로, 입력받은 menuAmount를  menuAmount로 할당합니다.


#### ● OrderListAdapter.java
![image](https://user-images.githubusercontent.com/62562198/85363122-10feb200-b55b-11ea-89f2-45d3486ce079.png)

-매개변수 context, statisticList를 선언합니다.

-입력된 context, statisticList를 각각의 매개변수에 할당합니다.

-위에 객체로 할당한 statisticList를 가져오도록 하고 View로 보여줍니다. 이때 보여주는 view는 레이아웃 user를 통해서 보여줍니다.

-TextView의 아이디 orderText, idText, menuText, amountText 각각 이름을 orderText, idText, menuText, amountText로 할당합니다.

-그리고 할당되어 있는 Text에 list의 userID, menuID, menuName, menuAmount 값들을 넣어줍니다.


### 7. 실행 화면
#### ● Splashscreen.java
![image](https://user-images.githubusercontent.com/62562198/85355962-ae9cb600-b548-11ea-97e9-092805dd4366.png)
![image](https://user-images.githubusercontent.com/62562198/85355983-bcead200-b548-11ea-8108-29affe109daa.png)

-처음 어플을 실행할때 보여주는 화면으로 로고사진이 실행할때 보여지도록 합니다.

-Splashscreen 이 실행된 이후에 첫번째 화면인 LoginActivity가 실행될 수 있도록 합니다.


#### ● AndroidManifest.xml
![image](https://user-images.githubusercontent.com/62562198/85356028-e0158180-b548-11ea-9bee-14c2456b0622.png)


## Ⅱ-4. 결과 실행
 





