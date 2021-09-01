<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	  브라우저 ============= Controller ======== 해당 Model로 request전송 (request에 결과값을 추가)
	 (사용자)   request                request                           |
	                                                                  JSP로 전송
	                                                                  setAttribute()
	                                                                  => 출력할 때 getAttribute()사용 => ${}
     MVC(Model2) => 단점(자바에 대해 어느정도 알고 있어야한다, 파일이 복잡하다)
                                     장점(보안, 재사용성, 확장성, 분산처리(여러명이 동시 작업이 가능)
     JSP(Model1) => 단점 (보안=전체파일 보내준다, 일회용(재사용이 불가능)), 장점(코딩하기가 간단하다:(자바/HTML))	                                                                  
     JSP에서 기술면접 => model1,2 차잊엄
     				 GET vs POST => 한글처리
     				 Cookie vs Session
     				 =====================
     Model : Java
     View : JSP(JSTL/EL)
     Controller : Servlet - 519page     				 
 --%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>