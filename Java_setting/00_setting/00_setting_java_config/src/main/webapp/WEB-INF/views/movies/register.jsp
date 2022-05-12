<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div>
<form action="/movies/register" method="post" enctype="multipart/form-data">
			
			<div class="col-12">
              <label for="title" class="form-label">Title</label>
              <input type="text" class="form-control" name="title"
               id="title" placeholder="Title">              
            </div>
            
            <div class="col-12">
              <label for="description" class="form-label">description</label>
              <input type="text" class="form-control" name="description"
               id="description" placeholder="description">              
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Company</label>
              <input type="text" class="form-control" name="company"
               id="company" placeholder="company">              
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
               id="movie" value="true">영화
              <input type="checkbox" class="form-control" name="movie"
               id="movie" value="false">시리즈
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">opening year</label>
              <input type="date" class="form-control" name="openingYear"
               id="openingYear">            
            </div>
            
             <div class="col-12">
              <label for="company" class="form-label">Age limit</label>
              <input type="number" class="form-control" name="ageLimit"
               id="ageLimit" placeholder="ageLimit">              
            </div>
            
            <div class="col-12">
              <label for="company" class="form-label">Media URL</label>
              <input type="text" class="form-control" name="media"
               id="media" placeholder="media">         
            </div>
            
            <div class="col-12 d-grid">
  				<input class="form-control" type="file"
  				 id="files" name="files" multiple>
  				<button type="button" id="trigger" class="btn btn-outline-primary btn-block d-block">poster Image</button>
			</div>		
            
            <button class="w-100 btn btn-primary btn-lg my-5" id="regBtn" type="submit">Continue to Register</button>
</form>
</div>