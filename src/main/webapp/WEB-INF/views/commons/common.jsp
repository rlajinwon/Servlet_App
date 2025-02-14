<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank 홈페이지</title>
    <style>
        /* 기본 스타일 */
        body {
            font-family: 'Noto Sans KR', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            color: #333;
        }

        /* 헤더 스타일 */
        header {
            background: linear-gradient(to right, #000428, #004e92);
            color: white;
            padding: 20px 0;
            text-align: center;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.2);
        }

        header h1 {
            margin: 0;
            font-size: 2rem;
            letter-spacing: 2px;
        }

        header p {
            margin: 5px 0;
            font-size: 1.2rem;
            opacity: 0.8;
        }

        /* 내비게이션 스타일 */
        nav {
            background: #343a40;
            color: white;
            padding: 15px 0;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }

        nav ul {
            list-style: none;
            padding: 0;
            margin: 0;
            display: flex;
            justify-content: center;
        }

        nav ul li {
            margin: 0 20px;
        }

        nav ul li a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            font-size: 1.1rem;
            transition: color 0.3s ease-in-out, transform 0.2s;
        }

        nav ul li a:hover {
            color: #ffc107;
            transform: scale(1.1);
        }

        /* 메인 콘텐츠 */
        main {
            padding: 40px;
            text-align: center;
        }

        .content-section {
            background: white;
            padding: 30px;
            margin: 20px auto;
            max-width: 800px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            animation: fadeIn 1s ease-in-out;
        }

        .content-section h2 {
            color: #004e92;
            margin-bottom: 15px;
        }

        .content-section p {
            font-size: 1rem;
            line-height: 1.6;
            color: #555;
        }

        /* 푸터 스타일 */
        footer {
            background: #343a40;
            color: white;
            text-align: center;
            padding: 15px;
            position: fixed;
            width: 100%;
            bottom: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            gap: 15px;
        }

        /* 소셜 아이콘 */
        .social-icons {
            display: flex;
            gap: 15px;
        }

        .social-icons a {
            color: white;
            font-size: 1.4rem;
            transition: color 0.3s ease-in-out, transform 0.2s;
        }

        .social-icons a:hover {
            color: #ffc107;
            transform: scale(1.2);
        }

        /* 애니메이션 */
        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-10px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        /* 반응형 디자인 */
        @media (max-width: 768px) {
            nav ul {
                flex-direction: column;
                align-items: center;
            }

            main {
                padding: 20px;
            }

            .content-section {
                max-width: 90%;
            }
        }
        
        .content-header {
    display: flex;
    align-items: center;
    justify-content: center; /* 가운데 정렬 */
    gap: 20px; /* 로고와 메뉴 사이 간격 */
    padding: 10px 0;
}

/* 로고 스타일 */
.logo {
    width: 150px;
    height: auto;
}

/* 네비게이션 메뉴 스타일 */
.nav-menu {
    list-style: none;
    margin: 0;
    padding: 0;
}

.nav-menu li {
    display: inline;
}

.nav-menu a {
    text-decoration: none;
    font-weight: bold;
    color: #007bff;
    padding: 8px 12px;
    border-radius: 5px;
    transition: background 0.3s ease;
}

.nav-menu a:hover {
    background: #007bff;
    color: white;


}
    </style>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</head>
<body>

    <!-- 헤더 -->
<header>
    <h1 onclick="location.reload();" style="cursor: pointer;">Bank 홈페이지</h1>
</header>

    <!-- 내비게이션 -->
    <nav>
        <ul>
            <c:if test="${empty user}">
                <li><a href="/users/login.do">로그인</a></li>
                <li><a href="/users/join.do">회원가입</a></li>
            </c:if>

            <c:if test="${not empty user}">
                <li><a href="/users/logout.do">로그아웃</a></li>
                <li><a href="/users/mypage.do">마이페이지</a></li>
            </c:if>
        </ul>
    </nav>

    <!-- 메인 콘텐츠 -->
    <main>
        <div class="content-section">
            <h2>Welcome to Bank</h2>
            <p></p>
           
        </div>
    </main>

    <!-- 푸터 -->
    <footer>
        <p>&copy; 2025 Bank Website. All Rights Reserved.</p>
        <div class="social-icons">
            <a href="https://facebook.com" target="_blank"><i class="fab fa-facebook-f"></i></a>
            <a href="https://twitter.com" target="_blank"><i class="fab fa-twitter"></i></a>
            <a href="https://instagram.com" target="_blank"><i class="fab fa-instagram"></i></a>
        </div>
    </footer>

</body>
</html>
