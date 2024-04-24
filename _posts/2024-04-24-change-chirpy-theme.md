---
title: Chirpy 테마 적용
date: 2024-04-24 12:00:00
comments: true
categories: [information]
tags: [git 블로그, chirpy theme]
render_with_liquid: false
---

첫 포스팅으로 [yat theme 적용 및 수정하기](https://jsh0924.github.io/posts/blog-start/) 글을 작성했었는데, 스스로 검색기능 집어넣고, 뭐 수정하고 하다보니 조잡해져서(ㅋ) 아예 처음부터 검색기능도 있고 깔끔한 테마로 변경하기로 결심했다.  
  
하지만 처음부터 난관에 부딪혔는데...  
  
<p style="font-size: 250%;">git 블로그 테마 변경은 어떻게 해야 하나요?</p>
  
🙂❓  
  
그러니까 말인 즉슨, 깃 블로그 첫 테마 적용 방법은 알지만  
이미 테마가 적용된 블로그에 다른 테마를 어떻게 적용하는가의 정보가 극히 적었다.  
  
뭐 찾아보면 그래도 이것 덮어씌우고, 저것 덮어씌우고 하면 된다던데...  
  
__기존 테마를 전부 삭제하고 새 테마를 적용할 수는 없는 걸까?__  
  
<br>
결론부터 말하자면,
<p style="font-size: 200%; background: #d8f5a2; text-align: center;">새 레파지토리를 만들어라.</p>  
  
새 레파지토리 만들기 싫어서 발버둥치다가 내린 결론이다😂😂  
그럼 나같은 초보자를 위해 하나하나 설명해 보겠다.  
<br>
<br>
- - -
<br>

## git blog 테마 변경하기

__1\. 현재 사용하는 레파지토리를 백업한다__  
기존 레파지토리의 이름을 `_backup` 으로 바꾸거나, 아니면 로컬에 백업해둔다.  
특히 `_post` 폴더의 파일들은 모두 백업하는 것이 좋다  
<span style="font-size: 80%;">백업 안했으면... 포스팅들 날리는거지 뭐...</span>  
<br>

![레파지토리명 변경](https://jsh0924.github.io/assets/images/posts/post_240424_1.png)  
<pre>
	깃 사이트에서 setting에 들어가면 바로 바꿀 수 있다. 바꾸는 건 쉬우니까 걱정 말고 바꾸자.
</pre>
  
__2-1\. 새 레파지토리를 만든다__  
만약 기존 레파지토리명을 변경하지 않았다면 임시로 새로운 이름으로 변경하고, 변경했다면 기존 레파지토리명과 동일하게 생성해도 된다.  
그럼 대충 이런 모양이 나올 것이다.  
![레파지토리가 두 개](https://jsh0924.github.io/assets/images/posts/post_240424_2.png)  
  
__2-2\. 배포하는 테마에서 새 레파지토리 생성을 진행한다(추천)__  
예로 [Chirpy theme 스타터 가이드](https://chirpy.cotes.page/posts/getting-started/#option-1-using-the-chirpy-starter)를 보면 `Create a new repository` 를 진행하라고 한다. 그대로 따라주다가 새 레파지토리명을 기존 레파지토리명과 동일하게 만들면 위와 같은 상황이 될 것이다.  
  
__3\. 인터넷에서 테마 설치 방법을 찾아 따라서 진행한다__  
다 쓰긴 귀찮으니까😗 깃 블로그 사용자라면 구글링 정도는 간단하게 하겠지?  
설치 후 `_post` 폴더에 기존 포스트 파일을 붙여넣어주면 그대로~ 적용된다😊  
  
- - -
<br>
이걸 누가 못 함?🤷‍♀️  
내가 못하고 어제 하루종일 테마 설치 오류와 싸웠다네🥶  
그러니까 뻘짓 말고 그냥 새 레파지토리 설치하자.  
  
<br>
그런데, 어라?  
<u>분명히 push가 되긴 하는데 빌드 에러가 뜬다?</u>  
🤔❓❓  

![왜죠](https://jsh0924.github.io/assets/images/posts/post_240424_3.png)  
<pre>
	이렇게 된 기록을 클릭해 보면  
</pre>
  
![링크 에러?](https://jsh0924.github.io/assets/images/posts/post_240424_4.png)  
  
https링크가 아니라는 경고문과  
a 태그에 참조가 없다는 ~~개~~소리가 있다.  
진짜 내가 이것 때문에 얼마나 고생을 했는지~💗  
<br>

## push는 되지만 빌드 에러가 뜰 때  

> 'a' tag is missing a reference
{: .prompt-danger }

> http://jekyllthemes.org/ is not an HTTPS link
{: .prompt-danger }

위의 문구들이 뜰 경우  
<br>

#### 'a' tag is missing a reference

> [Chirpy-theme 깃헙](https://github.com/cotes2020/jekyll-theme-chirpy/tree/84ea68cab0c09492162aa9672421bca16651e689/_data)에서 `_data` 폴더 안의 `authors.yml` 파일을 다운로드한다.  
><br>
>
> ![url 수정](https://jsh0924.github.io/assets/images/posts/post_240424_5.png)  
> 해당 파일에서 url 부분에 내 블로그 주소를 작성한다.  
> [참고한 페이지1], [참고한 페이지2]
{: .prompt-info }

#### ~is not an HTTPS link

> [html-proofer 깃헙](https://github.com/gjtorikian/html-proofer?tab=readme-ov-file)에서 [Ignoring content](https://github.com/gjtorikian/html-proofer?tab=readme-ov-file#ignoring-content) 부분대로 실행한다.  
> ![예시 이미지](https://jsh0924.github.io/assets/images/posts/post_240424_6.png)  
> [참고한 페이지3], [참고한 페이지4]
{: .prompt-info }

https가 아니면 경고하는 거라고 한다. 앞으로 http 링크를 걸게 되면 꼭 `<div data-proofer-ignore></div>` (앞의 `div`는 `span`이어도 상관없음) 태그를 작성하자.  

이제 빌드 에러가 사라졌다😊  
  
하지만 다른 문제가 있었는데...  
<br>
  
## 빌드됐지만 새로운 포스팅이 게시되지 않을 때
이게 뭔 소린고?🤔  
분명히 github 레파지토리 상에선 정상적으로 빌드되었다고✔ 하는데, 레파지토리 상에도 잘 업로드되었는데, 새로운 포스팅이 보이지 않는다.  
😮  
그래도 이건 구글링 좀 하니까 나왔다!
> `_config.yml`에 `future: true` 추가하기.  
[참고한 페이지5] <span style="font-size: 80%;"> 압도적인 감사..!</span>
{: .prompt-info }
<br>
<br>
- - -
<br>
<br>
이렇게 나의 우당탕탕 테마 바꾸기는 성공적으로 끝났다🥳  
그래도 chirpy 테마의 사용자가 많아서 검색 결과가 잘 나왔다고 본다.  
마이너한거 쓰면... 다 알아서 해야 함😇  
벌써부터 스타일 바꾸고 싶어서 손이 근질근질하네😅  


[참고한 페이지1]: https://talk.jekyllrb.com/t/chirpy-theme-a-tag-is-missing-a-reference/8731/2
[참고한 페이지2]: https://github.com/cotes2020/jekyll-theme-chirpy/issues/1403
[참고한 페이지3]: https://github.com/gjtorikian/html-proofer/issues/799
[참고한 페이지4]: https://github.com/gjtorikian/html-proofer?tab=readme-ov-file#ignoring-content
[참고한 페이지5]: https://sehooni.github.io/blog/github_blog_not_shown/

