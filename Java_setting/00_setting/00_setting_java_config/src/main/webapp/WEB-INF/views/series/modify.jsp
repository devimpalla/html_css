<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:set var="mvo" value="${mdto.mvo}"/>
<form action="/series/modify" method="post" enctype="multipart/form-data">
<input type="hidden" name="mno" value="${mvo.mno }">
        <input type="hidden" name="pageNo" value="${pgvo.pageNo }">
        <input type="hidden" name="qty" value="${pgvo.qty }">
       <%--  <input type="hidden" name="genre" value="${pgvo.genre}"> --%>
	<div class="col-12">
              <label for="title" class="form-label">Title</label>
              <input type="text" class="form-control" name="title"
              value="${mvo.title}"
               id="title" placeholder="Title" >              
            </div>
            
            <div class="col-12">
              <label for="description" class="form-label">description</label>
              <input type="text" class="form-control" name="description" value="${mvo.description}"
               id="description" placeholder="description" >              
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Company</label>
              <input type="text" class="form-control" name="company" value="${mvo.company}"
               id="company" placeholder="company" >              
            </div>
			
			<div class="col-12">
              <label for="company" class="form-label">genre</label>
              <input type="checkbox" class="form-control" name="genre"
               id="movie" value="action">액션
              <input type="checkbox" class="form-control" name="genre"
               id="movie" value="animation">애니메이션
               <input type="checkbox" class="form-control" name="genre"
               id="movie" value="comedy">코메디
               <input type="checkbox" class="form-control" name="genre"
               id="movie" value="documentary">다큐멘터리
               <input type="checkbox" class="form-control" name="genre"
               id="movie" value="drama">드라마
               <input type="checkbox" class="form-control" name="genre"
               id="movie" value="romance">로맨스
               <input type="checkbox" class="form-control" name="genre"
               id="movie" value="SF">SF
               <input type="checkbox" class="form-control" name="genre"
               id="movie" value="thriller">스릴러
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Movie</label>
              <input type="checkbox" class="form-control" name="movie"
               id="movie" value="true"  <c:if test="${mvo.movie eq true}">checked</c:if>>영화
              <input type="checkbox" class="form-control" name="movie"
               id="movie" value="false"  <c:if test="${mvo.movie eq false}">checked</c:if>>시리즈
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">opening year</label>
              <input type="text" class="form-control" name="openingYear"
               id="openingYear" value="${mvo.openingYear}" >            
            </div>
            
             <div class="col-12">
              <label for="company" class="form-label">Age limit</label>
              <input type="number" class="form-control" name="ageLimit"
               id="ageLimit" placeholder="ageLimit" value="${mvo.ageLimit}" >              
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Media URL</label>
              <input type="text" class="form-control" name="media"
               id="media" placeholder="media" value="${mvo.media}">  
            </div>
            
            <!-- 새로등록하는 파일 -->
            <div class="col-12 d-grid">
  				<input class="form-control" type="file"
  				 id="files" name="files" multiple>
  				<button type="button" id="trigger" class="btn btn-outline-primary btn-block d-block">poster Image</button>
			</div>		
            
            <!-- 기존의 파일 -->
            <c:set var="mfList" value="${mdto.mfList }"/>
            <div>
  				<a href="/movies/play?mno=${mvo.mno}"><img src="/upload/${mvo.posterImg}"></a>
  			</div>
  			<button type="button" data-uuid="${mfvo.uuid }" class="file-x">X</button>
  			
  			
  			<button type="submit" class="btn btn-outline-warning" id="regBtn">Submit</button>
  			</form>
  			
  			<script src="/resources/js/movies.modify.js"></script>
  			