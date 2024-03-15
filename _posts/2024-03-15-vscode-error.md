---
layout: post
comments: true
title: 비주얼 스튜디오 코드 로컬호스트 연결 거부 오류
subtitle: vscode
categories: information
tags: [비주얼스튜디오코드, vscode, error]
---

학원에서는 비주얼 스튜디오 코드를 사용하는데,  
어느 날 갑자기 오류가 나면서 디버그가 실행되지 않는다!

![오류](https://jsh0924.github.io/assets/images/posts/vscode_error1.png)<br>
  
😱  

검색해도 해결방법이 잘 안나오길래 (진짜 의외...) 나라도 써본다.  
  
<br>
- - -
<br>
  
## 1\. launch.json

![launch 파일](https://jsh0924.github.io/assets/images/posts/vscode_error2.png)<br>
  
좌측 run and debug 버튼을 누르고 상단을 보면 **Open 'launch.json'** 버튼이 있다. 클릭하자.  

<br>

## 2\. 코드 추가

![file 코드](https://jsh0924.github.io/assets/images/posts/vscode_error3.png)<br>
  
    
````json
"file": "${fileDirname}/${fileBasename}"
````
<br>
url, webRoot 코드는 주석처리 하고 file 코드를 붙여넣기한다.<br>
${fileDirname}는 현재 열려있는 파일의 디렉토리이고  
${fileBasename}는 현재 열려있는 파일의 확장자이다.  

이 해결법은 [비주얼 스튜디오 코드 튜토리얼](https://demun.github.io/vscode-tutorial/debug/)에서 발견했다.  
이제 다시 마음놓고 코딩하자!😊  


