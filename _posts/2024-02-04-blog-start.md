---
layout: post
title: yat theme 적용 및 수정하기
subtitle: git blog jekyll 테마 수정
categories: information
tags: [git, git 블로그, yat theme]
---

깃 블로그에 적응할 겸 [yat another theme](https://github.com/jeffreytse/jekyll-theme-yat) 수정 과정을 적어보려 한다.

일단 나는 [Jekyll Themes](http://jekyllthemes.org/) 를 둘러보다가 실용적이면서도 깔끔한 이 테마를 발견했다. 그리고 다른 분들의 글을 보며 깃 블로그 세팅을 한 것처럼, 이 테마에서 불필요한 부분을 어떻게 수정할까 검색해 보았더니...

**사용법이 많이 나와있지 않아 적용을 포기한다는 글만 나왔다.**

보통은 공식 깃헙(?) 에 세세하게 설명을 써놓는데...

**이 테마 제작자는 설명도 얼마 안써놨다.**

😢

나름 프론트 경력 7년차이니만큼 스스로 해결하기로 결심했다...💔<br>
참고로 영어는 쥐약이니 번역기 돌려가며 진행했음을 알아두길 바란다😅



- - -


## 목차

1. [기본 설정](#1.-기본-설정)
2. [카테고리 수정](#2.-카테고리-수정)
3. [언어 선택 버튼 없애기](#3.-언어-선택-버튼-없애기)

<br>

- - -


### 1. 기본 설정

일단 로컬에서 username.github.io 폴더에 위치한 \_config.yml을 연다.

![config.yml 서문](https://jsh0924.github.io/assets/images/posts/240204_1.png)

그러면 오호라... 이 양반이 여기에 설명을 몰빵해놨다는 걸 알 수 있다.<br>
~~사실 이것만 알면 나머지는 번역기 돌려가며 할 수 있지만 기왕 쓴 김에 마무리는 지어야지.~~



![config.yml 수정할 곳 1](https://jsh0924.github.io/assets/images/posts/240204_2.png)

조금만 밑으로 내리면 블로그 타이틀 등 수정할 곳이 보인다.
보이지 않으면 앞의 #을 지워 주석을 해제하면 된다.
참고로 <span style="color: DarkTurquoise;">content_width</span> 부분은 콘텐츠 가로길이인데, 설정해 봤지만 차이를 잘 모르겠다...?


<br>

![config.yml 수정할 곳 2](https://jsh0924.github.io/assets/images/posts/240204_3.png)

기본 언어는 한국어로 설정했다. 참고로 이거,

![config.yml 수정할 곳 2_1](https://jsh0924.github.io/assets/images/posts/240204_3_1.png)

이 부분이다. 개인적으로는 거슬리는 기능이어서 숨김처리 했다. 어떻게 했는지는 잠시 뒤에 설명한다.


<br>

![config.yml 수정할 곳 3](https://jsh0924.github.io/assets/images/posts/240204_4.png)

저녁 시간대 (오후 7시) 부터는 자동으로 다크모드가 적용된다. 신경쓰이면 <span style="color: DarkTurquoise;">night_mode</span> 설정을 건드리자. off로 설정하면 상시 라이트모드가 된다.



내려가서 <span style="color: DarkTurquoise;">defaults</span> 부터는 상단의 헤더 부분이다.

![config.yml 수정할 곳 3_1](https://jsh0924.github.io/assets/images/posts/240204_4_1.png)

<span style="color: DarkTurquoise;">heading : </span>타이틀<br>
<span style="color: DarkTurquoise;">subheading : </span>서브 타이틀<br>
<span style="color: DarkTurquoise;">banner : </span>배경 이미지

만약 기본 배경 이미지를 사용하고 싶다면, <span style="color: DarkTurquoise;">banner : </span><span style="color: MediumSeaGreen;">"/assets/images/banners/home.jpeg"</span> 으로 코드를 변경하자.


<br>

### 2. 카테고리 수정

![카테고리 위치](https://jsh0924.github.io/assets/images/posts/240204_5.png)

로컬에서 username.github.io/\_site 경로로 들어가면 나오는 폴더들이 카테고리이다. 적당히 손봐주자.


<br>

### 3. 언어 선택 버튼 없애기

로컬에서 username.github.io/**\_sass/misc/google-translate.scss** 파일을 연다.

![언어 선택 버튼 위치](https://jsh0924.github.io/assets/images/posts/240204_6.png)

Ctrl + F 로 <span style="color: MediumOrchid">ct-language</span> 을 찾아 display 코드를 inline-block 에서 <span style="color: MediumOrchid">none</span> 으로 바꿔주면 된다. 나처럼 본래 css는 주석을 걸고 그 밑에 새 css를 추가하는 걸 추천한다.


<br>

