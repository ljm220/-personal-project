<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        /* Add your CSS styling here */
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
        }
        form {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #f8f8f8;
            border-radius: 5px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        label {
            font-weight: bold;
        }
        .form-control {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .btn {
            padding: 10px 20px;
            border-radius: 5px;
            font-weight: bold;
            cursor: pointer;
        }
        .btn-info {
            background-color: #007bff;
            color: #fff;
            border: none;
        }
        .btn-secondary {
            background-color: #6c757d;
            color: #fff;
            border: none;
            margin-left: 10px;
        }
    </style>
</head>
<body>
    <form action='<c:url value="/BoardInsert"/>' method="post">
        <div class="form-group">
            <label for="title">제목</label>
            <input type="text" class="form-control" id="title" name="noticeTitle" placeholder="제목을 작성해주세요.">
        </div>
        <div class="form-group">
            <label for="crea_id">작성자</label>
            <input type="text" class="form-control" id="crea_id" name="noticeWriter" placeholder="이름을 적어주세요.">
        </div>
        <div class="form-group">
            <label for="contents">내용</label>
            <textarea class="form-control" id="contents" name="noticeContext" rows="10"></textarea>
        </div>
        <button type="submit" class="btn btn-info">등록하기</button>
        <button type="button" class="btn btn-secondary" onclick="location.href='/..	'">목록으로</button>
    </form>
</body>
</html>
