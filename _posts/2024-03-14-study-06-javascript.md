---
layout: post
comments: true
title: 일본 IT Java 웹개발자 수업 6일차 - javascript
subtitle: javascript
categories: study
tags: [글로벌인, javascript]
---

## 1\. 자바스크립트

while문과 do while문의 차이점 : 조건을 보고 돌리냐, 조건을 보지 않고 돌리냐의 차이  
컴파일러 존재❌ 라인별로(인터프리터) 실행  
브라우저 객체 - bom  
css의 가상 클래스가 이벤트 리스너로 존재  
  
css &#10140; head 내에만 작성 가능  
javascript &#10140; head, body 상관없이 작성 가능  
  
\n : 자바스크립트에선 줄바꿈❌ 한 칸 여백⭕  
  
| prompt('메시지', '디폴트 입력값') | 입력 함수 |
| confirm('메시지') | 확인 함수 |
| alert('메시지') | 출력 함수 |

실행 순서 : 헤더 &#10140; 외부 파일 &#10140; 내부 스크립트 &#10140; 내부 태그  
  
<br>
- - -
<br>
  
![실행 순서 예시](https://jsh0924.github.io/assets/images/posts/240314_1.png)<br>
![실행 순서 예시](https://jsh0924.github.io/assets/images/posts/240314_2.png)<br>
![실행 순서](https://jsh0924.github.io/assets/images/posts/240314_3.gif)<br>

## 2\. 변수

<table>
	<thead>
		<tr>
			<th class="th">변수명</th><th class="th">유형</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>const</td><td>숫자형</td>
		</tr>
		<tr>
			<td>let</td><td>문자형</td>
		</tr>
		<tr>
			<td>var</td><td>자료형 (숫자형, 문자형 모두 가능)</td>
		</tr>
		<tr>
			<td>boolean</td><td>true, false</td>
		</tr>
		<tr>
			<td>null</td><td>값을 저장할 공간만 존재, 값은 존재하지 않음. <br>의도적으로 대입.</td>
		</tr>
		<tr>
			<td>undefined</td><td>선언만 되고 값, 공간은 존재하지 않음.</td>
		</tr>
	</tbody>
</table>
  
지역변수 &#10140; 함수 내에 var 키워드로 선언 / 선언된 함수 내에서만 사용 가능  
전역변수 &#10140; 함수 밖에 선언 & <span style="color: #ff6b6b;">함수 내에 var 없이 선언</span> / 프로그램 전체에서 사용 가능  
  
지역 변수와 전역 변수의 이름이 같을 때❓  
기본적으로 지역 변수 호출.  
전역 변수에 접근하려면 **this.전역변수**  
  
NaN &#10140; 숫자가 아님을 의미  
  
<pre>
	전역변수 선언에 대해 알았다! var 없이 선언하면 전역변수라니!!! 유레카!😮  
	this.전역변수도 처음 앎. 당연함 배운 적이 없음🤔  
</pre>
  
<br>
- - -
<br>

![변수 예시](https://jsh0924.github.io/assets/images/posts/240314_4.png)<br>
![변수 결과](https://jsh0924.github.io/assets/images/posts/240314_5.png)<br>
  

## 3\. 식별자

생성 규칙
- 첫 문자 : 숫자 불가능. 알파벳, 언더스코어(_\), $문자 가능
- 둘째 문자 : 알파벳, 언더스코어, $문자 가능
- 대소문자 구분
- 예약어 불가
  
  
## 4\. 비트 연산자

& &#10140; 논리합, 같으면 1, 다르면 0  
| &#10140; or, 논리곱, 둘 중 하나라도 1이 있으면 1  
^ &#10140; XoR, 같으면 0, 다르면 1 ex.자석  
~ &#10140; 부정, 0은 1로, 1은 0으로 변경  
  
  
## 5\. 시프트 연산자 

\>> &#10140; 10 \>> 2 == 2  
10의 이진수 1010가 오른쪽으로 두 칸 이동, 10 사라짐  
\<< &#10140; 10 \<< 2 == 40  
10의 이진수 1010가 왼쪽으로 두 칸 이동, 빈자리에 0 채움  
  
조건 연산자  
?: &#10140; 조건 ? 참 : 거짓  
i % 2 = 0 ? "짝수" : "홀수";  
  

## 6\. 연산

![연산 예시1](https://jsh0924.github.io/assets/images/posts/240314_6.png)<br>
![연산 결과1](https://jsh0924.github.io/assets/images/posts/240314_7.png)<br>
  
- - -
<br>

![연산 예시2](https://jsh0924.github.io/assets/images/posts/240314_8.png)<br>
![연산 결과2](https://jsh0924.github.io/assets/images/posts/240314_9.png)<br>
  
- - -
<br>

![연산 예시3](https://jsh0924.github.io/assets/images/posts/240314_10.png)<br>
![연산 결과3](https://jsh0924.github.io/assets/images/posts/240314_11.png)<br>
  
- - -
<br>

![연산 예시4](https://jsh0924.github.io/assets/images/posts/240314_12.png)<br>
![연산 결과4](https://jsh0924.github.io/assets/images/posts/240314_13.png)<br>
  
- - -
<br>

![연산 예시5](https://jsh0924.github.io/assets/images/posts/240314_14.png)<br>
![연산 결과5](https://jsh0924.github.io/assets/images/posts/240314_15.gif)<br>
  
## 7\. 반복문
  
### 7-1. for문

for문 &#10140; 시작값과 종료값이 명확할 때 사용  
````javascript
for(초기문; 조건식; 반복 후 작업) {
	..작업문..
}
````

<br>
- - -
<br>

![for문 예시1](https://jsh0924.github.io/assets/images/posts/240314_16.png)<br>
![for문 결과1](https://jsh0924.github.io/assets/images/posts/240314_17.png)<br>
  
- - -
<br>

![for문 예시2](https://jsh0924.github.io/assets/images/posts/240314_18.png)<br>
![for문 결과2](https://jsh0924.github.io/assets/images/posts/240314_19.gif)<br>
  
- - -
<br>

![for문 예시3](https://jsh0924.github.io/assets/images/posts/240314_20.png)<br>
![for문 결과3](https://jsh0924.github.io/assets/images/posts/240314_21.png)<br>
<br>
  
- - -
<br>
  
### 7-2. while문

while문 &#10140; 종료값이 명확하지 않을 때  
````javascript
while(조건식) {
	..작업문..
}
````
  
<br>
- - -
<br>
  
![while문 예시1](https://jsh0924.github.io/assets/images/posts/240314_22.png)<br>
![while문 결과1](https://jsh0924.github.io/assets/images/posts/240314_23.png)<br>
  
- - -
<br>
  
![while문 예시2](https://jsh0924.github.io/assets/images/posts/240314_24.png)<br>
![while문 결과2](https://jsh0924.github.io/assets/images/posts/240314_25.png)<br>
  
<br>

### 7-3. do-while문

do-while문 &#10140; 무조건 한 번 실행 후 조건식 실행  
````javascript
do {
	..작업문..
} while(조건식);
````
<br>
  
- - -
<br>
  
![do-while문 예시1](https://jsh0924.github.io/assets/images/posts/240314_26.png)<br>
![do-while문 결과1](https://jsh0924.github.io/assets/images/posts/240314_27.png)<br>
  
- - -
<br>
  
![do-while문 예시2](https://jsh0924.github.io/assets/images/posts/240314_28.png)<br>
![do-while문 결과2](https://jsh0924.github.io/assets/images/posts/240314_29.png)<br>