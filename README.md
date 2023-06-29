# Bookitaka (Nodeul Project)
 독후활동지 쇼핑몰 홈페이지 제작 프로젝트 in Nodeul

<br><br>

## 프로젝트 개요

#### 프로젝트 목적
- 개인이 제작한 독후 활동지를 판매하고 제공하기 위한 목적의 웹 서비스 제작

#### 프로젝트 기간
- `2023-05-09` ~ `2023-06-20`

#### 프로젝트 배포
- 배포 환경
 - Spring boot Project / MariaDB [cloudtype([https://cloudtype.io](https://cloudtype.io/))]
 - Linux (Ubuntu 22.04.2 LTS)
- 북키타카 임시 홈페이지 ([https://www.bookitaka.store](https://www.bookitaka.store))

<br><br>

## 멤버 구성
<table>
  <tbody>
    <tr>
      <td align="center"><a href="https://github.com/dawnpoems"><img src="https://avatars.githubusercontent.com/u/108113517?s=60&v=4" width="100px;" alt=""/><br /><sub><b>dawnpoems</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/kimjisudev"><img src="https://avatars.githubusercontent.com/u/114086659?s=60&v=4" width="100px;" alt=""/><br /><sub><b>kimjisudev</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/hyeokjulee"><img src="https://avatars.githubusercontent.com/u/122426157?v=4" width="100px;" alt=""/><br /><sub><b>hyeokjulee</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/BeomSeokYu"><img src="https://avatars.githubusercontent.com/u/69231700?v=4" width="100px;" alt=""/><br /><sub><b>BeomSeokYu</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/hsnkch"><img src="https://avatars.githubusercontent.com/u/111720919?v=4" width="100px;" alt=""/><br /><sub><b>hsnkch</b></sub></a><br /></td>
      <td align="center"><a href="https://github.com/KyungoeSim"><img src="https://avatars.githubusercontent.com/u/122503488?v=4" width="100px;" alt=""/><br /><sub><b>KyungoeSim</b></sub></a><br /></td>
    </tr>
  </tbody>
</table>

- `김예건` : 팀장, 독후활동지(CRUD) 및 다운로드, 결제 API연동 및 결제 프로세스
- `김지수` : 자주 묻는 질문(CRUD) 개별출제요청(CRUD), 독후활동지 등록 및 개별출제요청에서의 도서 검색 API
- `이혁주` : 장바구니 기능, 쿠폰 기능, 결제 프로세스
- `유범석` : 인증 및 인가 체계 구축, 로그인 및 회원가입, 메인 페이지 및 독후활동지 페이지 디자인
- `최현식` : 회원가입 및 회원관리(CRUD)
- `심경외` : 이용안내(CRUD), 공지사항(CRUD), 공통 템플릿 디자인

<br><br>

## 기술 스택
#### 🖥️ FE
<a href="https://www.w3.org/TR/html52/" target="_blank">
  <img src="https://img.shields.io/badge/-HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" alt="HTML5">
</a>
<a href="https://www.w3.org/Style/CSS/" target="_blank">
  <img src="https://img.shields.io/badge/-CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" alt="CSS3">
</a>
<a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
  <img src="https://img.shields.io/badge/-JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" alt="JavaScript">
</a>
<a href="https://jquery.com" target="_blank">
  <img src="https://img.shields.io/badge/-jQuery-0769AD?style=for-the-badge&logo=jquery&logoColor=white" alt="jQuery">
</a>
<a href="https://getbootstrap.com" target="_blank">
  <img src="https://img.shields.io/badge/-Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white" alt="Bootstrap">
</a>

#### ⌨️ BE
<a href="https://openjdk.java.net" target="_blank">
  <img src="https://img.shields.io/badge/-Java%2011-CC0000?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
</a>
<a href="https://www.thymeleaf.org/" target="_blank">
  <img src="https://img.shields.io/badge/-Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white" alt="Thymeleaf">
</a>
<a href="https://spring.io/projects/spring-framework" target="_blank">
  <img src="https://img.shields.io/badge/-Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring">
</a>
<a href="https://spring.io/projects/spring-boot" target="_blank">
  <img src="https://img.shields.io/badge/-Spring%20Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
</a>
<a href="https://tomcat.apache.org" target="_blank">
  <img src="https://img.shields.io/badge/-Apache%20Tomcat-F8DC75?style=for-the-badge&logo=apache%20tomcat&logoColor=black" alt="Apache Tomcat">
</a>
<br>
<a href="https://www.oracle.com/database/" target="_blank">
  <img src="https://img.shields.io/badge/-JPA-6DB33F?style=for-the-badge&logo=hibernate&logoColor=white" alt="JPA">
</a>
<a href="https://spring.io/projects/spring-data-jpa" target="_blank">
  <img src="https://img.shields.io/badge/-Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring Data JPA">
</a>
<a href="https://querydsl.com/" target="_blank">
  <img src="https://img.shields.io/badge/-Querydsl-005F0F?style=for-the-badge&logo=code&logoColor=white" alt="Querydsl">
</a>
<a href="https://www.mysql.com" target="_blank">
  <img src="https://img.shields.io/badge/-MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" alt="MySQL">
</a>

#### 🔨 dev tool
<a href="https://www.jetbrains.com/idea/" target="_blank">
  <img src="https://img.shields.io/badge/-IntelliJ%20IDEA-000000?style=for-the-badge&logo=intellij%20idea&logoColor=white" alt="IntelliJ IDEA">
</a>
<a href="https://code.visualstudio.com/" target="_blank">
  <img src="https://img.shields.io/badge/-Visual%20Studio%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white" alt="Visual Studio Code">
</a>
<a href="https://www.postman.com/" target="_blank">
  <img src="https://img.shields.io/badge/-Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white" alt="Postman">
</a>

#### ⛓️ API
- PortOne 결제 API ([https://portone.io](https://portone.io/))
- ISBN 서지정보 API ([https://www.nl.go.kr](https://www.nl.go.kr/NL/contents/N31101030500.do))

<br><br>

## 구현 기능

### 인증 및 인가
스프링 시큐리티와 jjwt 라이브러리를 이용한 JWT(Json Web Token) 방식의 인증으로 구현하였습니다. 액세스 토큰은 HTTP-Only 쿠키에 저장하여 XSS 공격에 의한 토큰 탈취 위험성을 낮췄으며, 리프레시 토큰을 추가해 액세스 토큰이 탈취되더라도 만료 시간을 짧게 설정 가능하게 하여 보안성을 높였습니다.

JWT 구현 방식은 오픈소스([https://github.com/murraco/spring-boot-jwt](https://github.com/murraco/spring-boot-jwt))를 참고하여 제작되었습니다.

### 회원
리소스 접근 기능은 API로 개발되었습니다. 회원 ROLE은 관리자와 일반 회원으로 나뉘며 각각의 역할에 따라 리소스 요청에 대한 권한을 인가 받을 수 있습니다. 비밀번호 찾기 기능은 임시 비밀번호를 발급하여 네이버 메일 API를 통해 가입한 이메일로 발급받게 됩니다.

### 독후활동지 게시판 및 다운로드

### 장바구니 기능

### 쿠폰 기능

### 결제 프로세스

### 개별출제요청

### 자주 묻는 질문

### 이용안내 게시판

### 공지사항 게시판

### 마이페이지

### 메인 페이지

### 관리자 페이지

<br><br>

## 업데이트 기록
- 23.06.29 : 발송 메일 홈페이지 링크 수정 / favicon 추가
- 23.06.28 : 배포 상황에 알맞게 수정

<br><br>
