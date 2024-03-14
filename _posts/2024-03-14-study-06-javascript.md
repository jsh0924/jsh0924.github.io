---
layout: post
comments: true
title: 일본 IT Java 웹개발자 수업 6일차
subtitle: javascript
categories: study
tags: [글로벌인, 학원, IT, javascript]
---

#### 1\. 자바스크립트

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
  

#### 2\. 변수

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
  
NaN : 숫자가 아님을 의미  
  
<pre>
	전역변수 선언에 대해 알았다! var 없이 선언하면 전역변수라니!!! 유레카!😮  
	this.전역변수도 처음 앎. 당연함 배운 적이 없음🤔  
</pre>
  
  
#### 3\. 식별자

생성 규칙
- 첫 문자 : 숫자 불가능. 알파벳, 언더스코어(_\), $문자 가능
- 둘째 문자 : 알파벳, 언더스코어, $문자 가능
- 대소문자 구분
- 예약어 불가

<!-- #### -->