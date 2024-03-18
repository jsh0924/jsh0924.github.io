---
layout: post
comments: true
title: 일본 IT Java 웹개발자 수업 8일차
subtitle: javascript
categories: study
tags: [글로벌인, 학원, IT, javascript]
---

## 1\. 문자열 함수

![문자열 함수들](https://jsh0924.github.io/assets/images/posts/240318_1.png)<br>
![문자열 함수 결과](https://jsh0924.github.io/assets/images/posts/240318_2.png)<br>
  
**의문! indexOf 함수 사용 시 매개변수에 왜 1이나 3을 더할까?😮**  
  
파일명 추출을 예시로 들어보자.  
![파일명 추출 1](https://jsh0924.github.io/assets/images/posts/240318_3.png)<br>
/ 와 . 사이의 index 만을 추출해야 한다.  
![파일명 추출 2](https://jsh0924.github.io/assets/images/posts/240318_4.png)<br>
indexOf 함수로 해당 문자를 찾게 되면 해당 문자의 왼쪽까지만 포함하게 된다.  
그대로 출력하면 /index 로 나타나기 때문에,  
/ 를 없애기 위해 1을 더한 것.  
<span style="font-size: 12px;">뭐 쓰다보면 이해 하겠지</span>  
  
## 2\. 배열

![배열](https://jsh0924.github.io/assets/images/posts/240318_5.png)<br>
![배열 결과](https://jsh0924.github.io/assets/images/posts/240318_6.gif)<br>
<span style="color: gold;">prompt</span> 함수 때문에 입력한 것이 배열값으로 저장됨  