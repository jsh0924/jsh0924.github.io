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
			<td>var</td><td>자료형</td>
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
  
  
#### 3\. 식별자
