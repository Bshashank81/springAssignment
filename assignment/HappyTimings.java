package com.spring.assignment;

import org.springframework.stereotype.Component;

@Component
public class HappyTimings implements Timings {

	@Override
	public String getTimings() {
		return "Time slot available, we can have a match";
	}
	
}
