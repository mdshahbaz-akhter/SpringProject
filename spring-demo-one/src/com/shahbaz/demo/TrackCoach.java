package com.shahbaz.demo;

public class TrackCoach implements Coach {

private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run daily 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public TrackCoach() {
		
	}

	//add init method
	public void doMyStartupStuff()
	{
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add destroy method
	public void doMyCleanupStuff()
	{
		System.out.println("TrackCoach: inside method doMyCleanupStuff");

	}
	
}
