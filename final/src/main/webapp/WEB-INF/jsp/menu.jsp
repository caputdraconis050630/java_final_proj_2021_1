<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="kr.ac.inha.vo.MemberVO"%>

<%	
	if((MemberVO)session.getAttribute("member") != null){
	MemberVO member = (MemberVO)session.getAttribute("member");
	System.out.println(member.toString());
	}
%>
<nav class="navbar navbar-expand  navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="/welcome.do">Home</a>
		</div>
		<div>
			<ul class="navbar-nav mr-auto">
				<c:choose>
					<c:when test="${member  ne null}">
						<li style="padding-top: 7px; color: white">[${member.getUserName()}님]</li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/member/logout.do"/>">로그아웃 </a></li>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/member/updateMember.do"/>">회원 수정</a></li>
						
					</c:when>
					<c:otherwise>
						<li class="nav-item"><a class="nav-link" href="<c:url value="/member/login.do"/>">로그인 </a></li>
						<li class="nav-item"><a class="nav-link" href='<c:url value="/member/addMember.do"/>'>회원 가입</a></li>
					</c:otherwise>
				</c:choose>
			</ul>
		</div>
	</div>
</nav>
