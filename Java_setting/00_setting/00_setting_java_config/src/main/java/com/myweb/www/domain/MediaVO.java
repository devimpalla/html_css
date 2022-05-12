package com.myweb.www.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MediaVO {
	long mno;
	String title;
	String description; 	
	String company;
	String genre;
	boolean movie;
	long readCount;
	String openingYear;
	int ageLimit;
	String media;
	String posterImg;
	String bgImg;
}
