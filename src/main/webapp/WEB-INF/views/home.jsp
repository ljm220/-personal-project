<!DOCTYPE html>
<html lang="en">
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>네트워크 질문</title>
    <style>
        /* Add your CSS styling here to customize the appearance of the announcement */
        html, body {
        	height:100%;
            font-family: Arial, sans-serif;
            line-height: 0.6;
            margin: 0; /* Remove default margin */
            padding: 20px;
        }
        h1 {
            color: #333;
        }
        footer {
       		 position : fixed;
   			 bottom: 0;
		}
        p {
            color: #666;
        }
        .important {
            color: red;
            font-weight: bold;
        }
        table {
            width: 100%; /* Table width set to 100% */
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        #wrap {
		    min-height: 100%;
		    position: relative;
		    padding-bottom: 60px;
		}
        /* Add any additional CSS styles as needed */
    </style>
</head>
<body>
    <!-- Announcement content goes here -->
    <h2>네트워크 질문</h2>
    <div class="important" style="float:right;">
		<select>
			<option value="">5개씩</option>
			<option value="">10개씩</option>
		</select>    
    	</div>
    	
    <table>
        <tr>
            <th> </th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회</th>
            <th>좋아요</th>
        </tr>
        
        
<!--         이런 방법도 있다 -->
<%--         <tr th:each="board : ${boards}"> --%>
<%--             <td th:text="${board.noticeNum}">${board.noticeNum}</td> --%>
<%--             <td th:text="${board.noticeTitle}"></td> --%>
<%--             <td th:text="${board.noticeWriter}"></td> --%>
<%--  		    <td th:text="${board.formattedNoticeDate}"></td>	 --%>
<%--             <td th:text="${board.noticeCheck}"></td> --%>
<%--             <td th:text="${board.noticeLike}"></td> --%>
<!--         </tr> -->


		<c:forEach items="${boards}" var="board">
		<tr>
			<td>${board.noticeNum}</td>
			<td>${board.noticeTitle}</td>
			<td>${board.noticeWriter}</td>
			<td>${board.formattedNoticeDate}</td>
			<td>${board.noticeCheck}</td>
			<td>${board.noticeLike}</td>
		</tr>
		</c:forEach>
    </table>
	 <div id="pagination">
        <c:forEach begin="1" end="10" var="pageNumber">
            <a href="javascript:void(0);" onclick="goToPage(${pageNumber})">${pageNumber}</a>
        </c:forEach>
    </div>
    페이징
    <div style="float:right;">
<button type="button" onclick="location.href='/BoardWrite'">글쓰기 버튼</button>
	</div>
	
</body>

		<select>
			<option value="">5개씩</option>
			<option value="">10개씩</option>
		</select>  
		
<footer>
    <div>
    <select>
			<option value="">전체기간</option>
			<option value="">1개월</option>
	</select> 
	 <select>
			<option value="">게시글+댓글</option>
			<option value="">작성자</option>
	</select> 
	
    <input type="text" placeholder="검색어 입력">
    </div>
    
</footer>
<script>
    function goToPage(pageNumber) {
        // 페이지 번호를 클릭하면 해당 페이지로 이동하는 JavaScript 함수
        // 페이지 번호를 서버로 보내고 서버에서 해당 페이지의 데이터를 가져오는 로직을 구현해야 합니다.
        
        // 예시로 경로를 변경하는 방법을 사용했습니다.
        window.location.href = "yourPage.jsp?page=" + pageNumber;
    }
</script>
</html>