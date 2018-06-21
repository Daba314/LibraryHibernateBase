<%@ page contentType="text/html;charset=Windows-1251" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Add Cyclist</title>
    <link rel="stylesheet" type="text/css" href="resources/style.css"/>
</head>
<body>
<header class="header">
    <h1 class="header_logo">
        <a href="#" class="header_logo_link">����������</a></h1>
    <nav class="nav_item">
        <ul class="nav_ul">
            <li class="nav_li">
                <a href="/allbooks" class="nav_link nav_link1"> ����� </a>
            </li>
            <li class="nav_li">
                <a href="/bookshelf" class="nav_link nav_link2"> ����� </a>
            </li>
            <li class="nav_li">
                <a href="/findbook.jsp" class="nav_link nav_link3"> ����� </a>
            </li>
        </ul>
    </nav>
</header>

<div class="description">
    <form action="addBook" method="post" class="form">
        <h2>�������� �����</h2>
        <p class="add_description">�������� �����</p>
        <input name="book_name" type="text" required placeholder="�������� �����" class="textbox"> </br>
        <p class="add_description">����</p>
        <select name="genreSelector" class="add_select">
            <c:forEach items="${bookshelf}" var="bookshelf">
                <option>${bookshelf.nameBs}</option>
            </c:forEach>
        </select>
        <input type="submit" value="��������" class="button"/>
        <a href="/allbooks" class="cancel">�����</a>
    </form>
</div>
</body>
</html>