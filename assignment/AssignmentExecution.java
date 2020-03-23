package com.spring.assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignmentExecution {
	
	public static void main(String args[]) {
		
		
		//read spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");	
		
		//get the bean from spring container
		Cricket theCricket = context.getBean("boxCricket",Cricket.class);
		
		
		//call a method on the bean boxCricket
		System.out.println("Calling the method playCricketDaily(): "+theCricket.playCricketDaily());
		
		
		//call method to get the daily timings from method which is autowired
		System.out.println("Calling the timings from the autowired method: "+theCricket.getDailyTimings());
		
		//call method to get the team players from method which is autowired
		System.out.println("Calling the players from the autowired method: "+theCricket.getTeamPlayers());
				
		
		//close the context
		context.close();
		
	}
}


