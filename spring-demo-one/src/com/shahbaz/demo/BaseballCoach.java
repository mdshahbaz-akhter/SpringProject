package com.shahbaz.demo;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Spend 30 minutes on practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}