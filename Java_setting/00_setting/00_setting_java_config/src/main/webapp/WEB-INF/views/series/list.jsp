<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
<c:forEach items="${list}" var="mvo">
<div><a href="/series/detail?mno=${mvo.mno }&pageNo=${pgn.pgvo.pageNo}&qty=${pgn.pgvo.qty}&genre=${pgn.pgvo.genre}"><img alt="" src="/upload/${mvo.posterImg}"/></a></div></c:forEach>
</div>