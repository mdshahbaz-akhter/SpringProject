package com.shahbaz.demo;

public class CricketCoach implements Coach {

	private String emailId;
	private String team;
	
	public void setEmailId(String emailId) {
		System.out.println("Set Email Address");
		this.emailId = emailId;
	}

	public void setTeam(String team) {
		System.out.println("Set team name");
		this.team = team;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getTeam() {
		return team;
	}



	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("Cricket Coach");
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
