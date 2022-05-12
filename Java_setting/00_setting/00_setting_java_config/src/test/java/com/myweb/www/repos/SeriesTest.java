package com.myweb.www.repos;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myweb.www.domain.MediaVO;
import com.myweb.www.domain.SeasonVO;
import com.myweb.www.repository.SeriesDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {com.myweb.www.config.RootConfig.class})
public class SeriesTest {
	
	@Inject
	private SeriesDAO sdao;
	
	@Test
	public void insertSeriesTest() throws Exception{
		MediaVO mvo = new MediaVO();
		mvo.setTitle("시리즈 테스트3333");
		mvo.setDescription("시리즈 테스트 디스크립션");
		mvo.setCompany("시리즈 테스트");
		mvo.setGenre("드라마");
		mvo.setMovie(false);
		mvo.setOpeningYear("2022-01-22");
		mvo.setAgeLimit(19);
		mvo.setMedia(null);
		
		int isUp = sdao.insertSeries(mvo);
		log.debug(">>>> isUp > {}", isUp);
	}


	
	
	@Test
	public void detailSeriesTest() throws Exception{
		MediaVO mvo = sdao.selectOneSeries(3L);
		log.debug(mvo.toString());
	}
	
	@Test
	public void modifySeriesTest() throws Exception{
		MediaVO mvo = new MediaVO();
		mvo.setTitle("시리즈 수정");
		mvo.setDescription("시리즈 수정수정");
		mvo.setCompany("시리즈 수정");
		mvo.setGenre("장르수정");
		mvo.setMovie(false);
		mvo.setOpeningYear("2022-01-22");
		mvo.setAgeLimit(19);
		mvo.setMedia(null);
		mvo.setMno(3L);
		
		int isUp = sdao.updateSeries(mvo);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void deleteSeriesTest() throws Exception{
		int isUp = sdao.deleteSeries(7L);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void insertSeasonTest() throws Exception{
		SeasonVO svo = new SeasonVO();
		svo.setTitle("2화. 테스트 시즌");
		svo.setSeason(1);
		svo.setMedia("시즌 url");
		svo.setThumbnail("테스트 썸네일");
		svo.setDescription("테스트 시즌의 2화입니다");
		svo.setMno(7L);
		
		int isUp = sdao.insertSeason(svo);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void selectListSeason() throws Exception{
		List<SeasonVO> list = sdao.selectListSeason(3L,1);
		log.debug(list.toString());
	}
	
	@Test
	public void modifySeason() throws Exception{
		SeasonVO svo = new SeasonVO();
		svo.setTitle("2화. 수정된 시즌");
		svo.setSeason(1);
		svo.setMedia("시즌 수정 url");
		svo.setThumbnail("수정된 썸네일");
		svo.setDescription("수정된 시즌의 2화입니다");
		svo.setMno(4L);
		svo.setSno(2);
		
		int isUp = sdao.updateSeason(svo);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void deleteSeason() throws Exception{
		int isUp = sdao.deleteSeason(2L);
		log.debug(">>>> isUp > {}", isUp);
	}
	
	@Test
	public void deleteAllSeason() throws Exception{
		int isDel = sdao.deleteAllSeason(7L);
		log.debug(">>>>> isDel > {}", isDel);
	}
}
