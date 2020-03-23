package com.spring.assignment;

import org.springframework.stereotype.Component;

@Component
public class TeamPlayers implements Players {

	@Override
	public String playerNames() {
		
		return "the entire E3boys are willing to play cricket";
	}

}
