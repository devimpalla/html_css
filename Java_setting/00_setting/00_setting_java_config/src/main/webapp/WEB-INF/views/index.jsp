<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header class="p-3 bg-dark text-white">
    <div class="container">
      <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
        <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
          <svg class="bi me-2" width="40" height="32" role="img" aria-label="Bootstrap"><use xlink:href="#bootstrap"/></svg>
        </a>
        <c:set var="genre" value="action" />



        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
          <li><a href="/" class="nav-link px-2 text-secondary">Home</a></li>
          <li><a href="/movies/list?genre=${genre}" class="nav-link px-2 text-white">영화</a></li>
          <li><a href="/movies/register" class="nav-link px-2 text-white">영화등록</a></li>
          <li><a href="/series/list?genre=${genre}" class="nav-link px-2 text-white">시리즈</a></li>
          <li><a href="/series/register" class="nav-link px-2 text-white">시리즈등록</a></li>
          </ul></div></div></header>