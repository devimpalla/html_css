package com.myweb.www.repos;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.www.domain.MediaVO;
import com.myweb.www.repository.MovieDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.myweb.www.config.RootConfig.class})
public class MovieTest {
	
	@Inject
	private MovieDAO mdao;
	
	@Test
	public void insertMovieTest() throws Exception{
		MediaVO mvo = new MediaVO();
		mvo.setTitle("영화 테스트");
		mvo.setDescription("영화 테스트 디스크립션");
		mvo.setCompany("디즈니 테스트");
		mvo.setGenre("액션");
		mvo.setMovie(true);
		mvo.setOpeningYear("2022-01-21");
		mvo.setAgeLimit(12);
		mvo.setMedia("urltest");
		
		
		int isUp = mdao.insertMovies(mvo);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void selectListMoviesTest() throws Exception{
		List<MediaVO> list = mdao.selectListMovies();
		log.debug(list.toString());
	}
	
	@Test
	public void detailMoviesTest() throws Exception{
		MediaVO mvo = mdao.selectOneMovies(1L);
		log.debug(mvo.toString());
	}
	
	@Test
	public void modifyMoviesTest() throws Exception{
		MediaVO mvo = new MediaVO();
		mvo.setTitle("수정");
		mvo.setDescription("수정테스트");
		mvo.setCompany("수정입니다");
		mvo.setGenre("야호");
		mvo.setMovie(true);
		mvo.setOpeningYear("2022-01-21");
		mvo.setAgeLimit(12);
		mvo.setMedia("urltest");
	
		mvo.setMno(1L);
		int isUp = mdao.updateMovies(mvo);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void deleteMoviesTest() throws Exception{
		int isUp = mdao.deleteMovies(2L);
		log.debug(">>>> isUp > {}", isUp);
	}
	
}