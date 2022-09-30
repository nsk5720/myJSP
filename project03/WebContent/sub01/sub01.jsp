<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
    isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	request.setCharacterEncoding("UTF-8");
%>  
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<meta name="Generator" content="Notepad++" />
	<meta name="Author" content="남상권"/>
	<meta name="Keywords" content="남상권, namsangkwon, 포트폴리오, 남상권 포트폴리오, portfolio, SanKwon's portfolio, 프로젝트, Project, 남 상권, 남 상 권, 상권 남, 상권, HTML5, CSS3, jQuery, 프로젝트, Portfolio, Project, 반응형웹, 반응형웹 포트폴리오, 학생 포트폴리오"/>
	<meta name="Description" content="남상권의 포트폴리오 사이트입니다. 방문해 주셔서 감사합니다." />
	<link rel="icon" href="images/favicon.ico">
	<title>농협은행 게시판</title>
	<!--[if gte IE 9]>
	<style>
		.gradient{
			filter: none;
		}
	</style>
	<![endif]-->
	<link rel="stylesheet" href="/project03/sub01/css/board.css"/>
	<link rel="stylesheet" href="/project03/sub01/css/style.css"/>
	<link rel="stylesheet" href="/project03/sub01/css/common.css"/>
	<script src="js/jquery-1.12.3.js"></script>
	<script src="js/script.js"></script>
</head>
<body>
	<%@ include file="../main/header.jsp" %>
	<section>
		<div id="section">
			<h2>
				<span class="hidden">고객상담</span>
			</h2>
			<h2>
				<span class="hidden">고객의소리</span>
			</h2>
			<h2>
				<span class="hidden">자주하는질문FAQ</span>
			</h2>
			<h2>
				<span class="hidden">상담원상담</span>
			</h2>
			<h2>
				<span class="hidden">1:1문의</span>
			</h2>
			<aside id="aside" class="fl cf">
				<ul class="customerCounseling">
					<li class="ccTitle"><a href="/project03/index.jsp" tabindex="253" class="ccTitle showTooltip" title="고객상담">&nbsp;&nbsp;고객상담</a></li>
					<li class="ccListFirst"><a href="/project03/sub02/sub02.jsp" tabindex="254" class="ccListFirst showTooltip" title="고객의소리">&nbsp;&nbsp;고객의소리</a></li>
					<li><a href="/project03/sub03/sub03.jsp" tabindex="255" class="ccList showTooltip" title="자주하는질문FAQ">&nbsp;&nbsp;자주하는질문FAQ</a></li>
					<li><a href="/project03/index.jsp" tabindex="256" class="ccListShort showTooltip" title="상담원상담">&nbsp;&nbsp;상담원상담</a></li>
					<li><a href="/project03/sub02/sub02.jsp" tabindex="257" class="ccList showTooltip" title="1:1문의">&nbsp;&nbsp;1:1문의</a></li>
				</ul>	<!-- class="passBtn" -->
			</aside>
			<article id="contents" class="fl cf" >
			<h3>
				<span class="hidden">자주묻는질문FAQ</span>
			</h3>
				<div id="high" class="fl cf">
					<ul class="path">
						<li class="pathColor showTooltip" title="자주묻는질문FAQ">&nbsp;고객의소리</li>
						<li><a class="showTooltip" href="/project03/sub03/sub03.jsp" tabindex="258" title="고객상담">&nbsp;고객상담 ></a> </li>
						<li><a class="showTooltip" href="/project03/index.jsp" tabindex="259" title="고객센터">고객센터 ></a></li>
					</ul>
					<div class="faq showTooltip" title="자주묻는 질문">고객의 소리</div>
					<ul class="description">
						<li class="descriptionFirst">고객님들의 목소리를 귀담아 듣겠습니다.</li>
						<li class="descriptionSecond">여기서 다 해결되지 않는 문의사항은 1:1문의를 이용해주세요.</li>
					</ul>
					<div class="inquiry"><a class="showTooltip" href="/project03/sub02/sub02.jsp" tabindex="260" title="1:1문의">1:1문의</a></div>
				</div>	
				<div id="middle" class="fl">
					<div class="search">
					<div class="fl">검색</div>
					<input type="text" name="search" class="fl"/>
					<a href="#" tabindex="260"><div class="searchButton fl"></div></a>
					</div>
					<div class="searchList ">
						<div>원하시는 항목을 선택하세요</div>
						<ul>
							<li>
								<span><a title="전체" href="/project03/sub03/sub03.jsp" tabindex="261" class="all showTooltip">전체</a></span>
								<span><a class="showTooltip" title="예금" href="/project03/index.jsp" tabindex="262">예금</a></span>
								<span><a class="showTooltip" title="펀드/신탁" href="/project03/sub02/sub02.jsp" tabindex="263">펀드/신탁</a></span>
								<span><a class="showTooltip" title="주택청약" href="/project03/sub03/sub03.jsp" tabindex="264">주택청약</a></span>
								<span><a class="showTooltip" title="대출" href="/project03/index.jsp" tabindex="265">대출</a></span>
								<span><a class="showTooltip" title="인증서/간편로그인" href="/project03/sub02/sub02.jsp" tabindex="266">인증서/간편로그인</a></span>
								<span><a class="showTooltip" title="입출금알림" href="/project03/sub03/sub03.jsp" tabindex="267">입출금알림</a></span>
								<span><a class="showTooltip" title="오픈뱅킹" href="/project03/index.jsp" tabindex="268">오픈뱅킹</a></span>
								<span><a class="showTooltip" title="텔레뱅킹" href="/project03/sub02/sub02.jsp" tabindex="269">텔레뱅킹</a></span>
								<span><a class="showTooltip" title="전자금융사기예방서비스" href="/project03/sub03/sub03.jsp" tabindex="270">전자금융사기예방서비스</a></span>
								<span><a class="showTooltip" title="기타앱서비스" href="/project03/index.jsp" tabindex="271">기타앱서비스</a></span>
								<span><a class="showTooltip" title="자동화기기" href="/project03/sub02/sub02.jsp" tabindex="272">자동화기기</a></span>
								<span><a class="showTooltip" title="자동이체" href="/project03/sub03/sub03.jsp" tabindex="273">자동이체</a></span>
								<span><a class="showTooltip" title="우수고객" href="/project03/index.jsp" tabindex="274">우수고객</a></span>
								<span><a class="showTooltip" title="외환" href="/project03sub02/sub02.jsp" tabindex="275">외환</a></span>
								<span><a class="showTooltip" title="기타" href="/project03/sub03/sub03.jsp" tabindex="276">기타</a></span>
								<span><a class="showTooltip" title="인터넷/스마트뱅킹" href="/project03/index.jsp" tabindex="277">인터넷/스마트뱅킹</a></span>
							</li>
						</ul>
					</div>
				</div>
				<div id="low" class="fl cf">
					<div action="#" style="float: right; margin: 30px 0px 0px 0px;">
					<select name="order">
						<option value="선택">선택</option>
						<option value="회순">조회순</option>
						<option value="등록일순">등록일순</option>
					</select>
					<button class="showTooltip" type="submit" title="검색">검색</button>
					</div>
					
					
					<div >
						<div class="titleWrap">
							<div class="fl titleNo">글번호</div>
							<div class="fl titleWriter">작성자</div>              
							<div class="fl title">제목</div>
							<div class="fl titleDay">작성일</div>
						</div>
					<c:choose>
						<c:when test="${empty articlesList }" >
							<div  height="10">
								<div colspan="4">
									<p align="center">
										<b><span style="font-size:9pt;">등록된 글이 없습니다.</span></b>
									</p>
								</div>  
							</div>
						</c:when>
						<c:when test="${!empty articlesList}" >
					    <c:forEach  var="article" items="${articlesList }" varStatus="articleNum" >
					    <div align="center">
							<div width="5%">${articleNum.count}</div>
							<div width="10%">${article.id }</div>
							<div align='left'  width="35%"></div>
								<span style="padding-right:30px"></span>
								<c:choose>
									<c:when test='${article.level > 1 }'>  
										<c:forEach begin="1" end="${article.level }" step="1">
											<span style="padding-left:20px"></span>    
										</c:forEach>
										<span style="font-size:12px;">[답변]</span>
										<a class='cls1' href="${contextPath}/project03/board/viewArticle.do?articleNO=${article.articleNO}">${article.title}</a>
									</c:when>
									<c:otherwise>
										<a class='cls1' href="${contextPath}/project03/board/viewArticle.do?articleNO=${article.articleNO}">${article.title }</a>
									</c:otherwise>
								</c:choose>
							</div>
							<div  width="10%"><fmt:formatDate value="${article.writeDate}" /></div> 
					</div>
					    </c:forEach>	
						</c:when>
					</c:choose>	
					</div>
					<a  class="cls1"  href="${contextPath}/project03/board/articleForm.do"><p class="cls2">글쓰기</p></a>
					
					
					<div class="pageNum">
						<div class="pageNumFirst"><a href="../sub03/sub03.jsp" tabindex="288">1</a></div>
						<div><a href="/project03/index.jsp" tabindex="289" class="pageNumber">2</a></div>
						<div><a href="/project03/sub02/sub02.jsp" tabindex="290" class="pageNumber">3</a></div>
						<div><a href="/project03/sub03/sub03.jsp" tabindex="291" class="pageNumber">4</a></div>
						<div><a href="/project03/index.jsp" tabindex="292" class="pageNumber">5</a></div>
						<div><a href="/project03/sub02/sub02.jsp" tabindex="293" class="pageNumber">6</a></div>
						<div><a href="/project03/sub03/sub03.jsp" tabindex="294" class="pageNumber">7</a></div>
						<div><a href="/project03/index.jsp" tabindex="295" class="pageNumber">8</a></div>
						<div><a href="/project03/sub02/sub02.jsp" tabindex="296" class="pageNumber">9</a></div>
						<div class="num10 pageNumber"><a href="/project03/sub03/sub03.jsp" tabindex="297">10</a></div>
						<div class="pageBtn cf">
							<div class="nextPage fl"><a href="/project03/index.jsp" tabindex="298"><img class="showTooltip" src="images/btn_numnext.gif" alt="nextpage" title="nextpage"/></a></div>
							<div class="lastPage fl"><a href="/project03/sub02/sub02.jsp" tabindex="299"><img class="showTooltip" src="images/btn_num10next.gif" alt="lastpage" title="lastpage"/></a></div>
						</div>
					</div>
				</div>
			</article>
		</div>	
	</section>
	<%@ include file="../main/footer.jsp" %>
</body>
</html>