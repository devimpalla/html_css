<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<c:set var="mvo" value="${mdto.mvo}"/>

	<div class="col-12">
				
				<div>
				<img src="/upload/${mvo.bgImg}">
				</div>
	
              <label for="title" class="form-label">Title</label>
              <input type="text" class="form-control" name="title"
              value="${mvo.title}"
               id="title" placeholder="Title" readonly>              
            </div>
            
            <div class="col-12">
              <label for="description" class="form-label">description</label>
              <input type="text" class="form-control" name="description" value="${mvo.description}"
               id="description" placeholder="description" readonly>              
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Company</label>
              <input type="text" class="form-control" name="company" value="${mvo.company}"
               id="company" placeholder="company" readonly>              
            </div>
			
			<div class="col-12">
              <label for="title" class="form-label">genre</label>
              <select name="genre">
              	<option value="action" disabled="disabled" <c:if test="${mvo.genre eq 'action'}">selected</c:if>>action</option>
              	<option value="animation" disabled="disabled" <c:if test="${mvo.genre eq 'animation'}">selected</c:if>>animation</option>
              	<option value="comedy" disabled="disabled" <c:if test="${mvo.genre eq 'comedy'}">selected</c:if>>comedy</option>
              	<option value="documentary" disabled="disabled" <c:if test="${mvo.genre eq 'documentary'}">selected</c:if>>documentary</option>
              	<option value="drama" disabled="disabled" <c:if test="${mvo.genre eq 'drama'}">selected</c:if>>drama</option>
              	<option value="romance" disabled="disabled" <c:if test="${mvo.genre eq 'romance'}">selected</c:if>>romance</option>
              	<option value="SF" disabled="disabled" <c:if test="${mvo.genre eq 'SF'}">selected</c:if>>SF</option>
              	<option value="thriller" disabled="disabled" <c:if test="${mvo.genre eq 'thriller'}">selected</c:if>>thriller</option>
              </select>             
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Movie</label>
              <input type="checkbox" class="form-control" name="movie"
               id="movie" value="true" disabled="disabled" <c:if test="${mvo.movie eq true}">checked</c:if>>영화
              <input type="checkbox" class="form-control" name="movie"
               id="movie" value="false" disabled="disabled" <c:if test="${mvo.movie eq false}">checked</c:if>>시리즈
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">opening year</label>
              <input type="text" class="form-control" name="openingYear"
               id="openingYear" value="${mvo.openingYear}" readonly>            
            </div>
            
             <div class="col-12">
              <label for="company" class="form-label">Age limit</label>
              <input type="number" class="form-control" name="ageLimit"
               id="ageLimit" placeholder="ageLimit" value="${mvo.ageLimit}" readonly>              
            </div>
            
           
            
            <c:set var="mfList" value="${mdto.mfList }"/>
            <div>
  				<a href="/movies/play?mno=${mvo.mno}"><img src="/upload/${mvo.posterImg}"></a>
  			</div>
  			
  			<div class="col-4">
			<a href="/movies/list?pageNo=${pgvo.pageNo }&qty=${pgvo.qty}&genre=${pgvo.genre}" class="btn btn-primary">LIST</a>
			</div>
			<div class="col-4">
			<a href="/movies/modify?mno=${mvo.mno }&pageNo=${pgvo.pageNo }&qty=${pgvo.qty}&genre=${pgvo.genre}" id="modBtn" class="btn btn-outline-warning">MOD</a>
			</div>
			<div class="col-4">
    		<button type="button" id="delBtn" class="btn btn-outline-danger">DEL</button>
			</div>
			
			<form action="/movies/remove" method="post" id="delForm">
				<input type="hidden" name="mno" value="${mvo.mno }">
				<input type="hidden" name="pageNo" value="${pgvo.pageNo }">
			    <input type="hidden" name="qty" value="${pgvo.qty }">
			    <input type="hidden" name="genre" value="${pgvo.genre}">
			</form>
			
			<script src="/resources/js/movies.detail.js"></script>
   	