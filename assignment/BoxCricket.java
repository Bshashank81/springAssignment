package com.spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoxCricket implements Cricket {

	
	@Autowired
	Timings timings;
	
	@Autowired
	Players players;
	
	public BoxCricket() {
		System.out.println("Inside default constructor: BoxCricket()");
	}
	
	@Autowired
	public void playWithFriendsDuringHolidays(Timings theTimings) {
		System.out.println(">>>Inside playWithFriendsDuringHolidays method");
		timings = theTimings;
	}
	
	@Override
	public String playCricketDaily() {
		
		return "play cricket during weekends";
	}

	@Override
	public String getDailyTimings() {
		return timings.getTimings();
	}
	
	@Autowired
	public void boysPlayCricket(Players thePlayers) {
		players = thePlayers;
		System.out.println(">>>>Inside another method used for autowiring ");
		
	}

	@Override
	public String getTeamPlayers() {
		return players.playerNames();
	}

}
