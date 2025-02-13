<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>공용 페이지</title>
    <style>
        /* 기본 스타일 */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }

        /* 헤더 스타일 */
        header {
            background-color: black;
            color: white;
            padding: 10px 20px;
            text-align: center;
        }

        header h1 {
            margin: 0;
        }

        /* 내비게이션 바 스타일 */
        nav {
            background-color: #343a40;
            color: white;
            padding: 10px 20px;
        }

        nav ul {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: center;
        }

        nav ul li {
            margin: 0 15px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }

        nav ul li a:hover {
            color: #ffc107;
        }

        /* 메인 콘텐츠 스타일 */
        main {
            padding: 20px;
        }

        /* 푸터 스타일 */
        footer {
            background-color: #343a40;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            width: 100%;
            bottom: 0;
        }

        /* 레이아웃을 위한 반응형 디자인 */
        @media (max-width: 768px) {
            nav ul {
                flex-direction: column;
                align-items: center;
            }

            main {
                padding: 15px;
            }
        }
    </style>
</head>
<body>

    <!-- 헤더 -->
    <header>
        <h1>홈페이지</h1>
        <p>~ ~</p>
    </header>

    <!-- 내비게이션 -->
    <nav>
        <ul>
            <li><a href="/users/join.do">회원가입</a></li>
            <li><a href="/users/login.do">로그인</a></li>
            <li><a href="/users/logout.do">로그아웃</a></li>
            <li><a href="/users/mypage.do">마이페이지</a></li>
        </ul>
    </nav>

    <!-- 메인 콘텐츠 -->
    <main>

    </main>

    <!-- 푸터 -->
    <footer>
        <p>&copy; 2025 My Website. All Rights Reserved.</p>
    </footer>

</body>
</html>
