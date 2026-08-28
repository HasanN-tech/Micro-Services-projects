package com.hasan.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season-api")
public class AppController {
	
	@Value("${spring.application.instance-id}")
	private String instance_id;
	
	@GetMapping("/find")
	public ResponseEntity<String> findSeason(){
		LocalDate date=LocalDate.now();
		String season=null;
		if(date.getMonthValue()>=3 && date.getMonthValue()<=7) season= "Summer Season";
		else if(date.getMonthValue()>7 && date.getMonthValue()<=10) season= "Rainy Season";
		else season="Winter Season";
		season +=instance_id;
		return new ResponseEntity<String>(season,HttpStatus.OK);
	}
}
