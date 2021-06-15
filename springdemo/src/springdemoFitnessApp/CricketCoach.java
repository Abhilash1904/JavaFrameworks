package springdemoFitnessApp;

public class CricketCoach implements Coach {

	private GetDailyFortune fortune;
	private String email;
	private String  teamname;
	
	// Setters and Getters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamname() {
		return teamname;
	}

	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Override
	public String dailyWorkout() {
		return "50 mins of batting";
	}

	@Override
	public String getFortune() {
		return "inside cricket fortune "+fortune.todayFortune();
	}
	
	public void setFortuneteller(GetDailyFortune thefortune) {
		fortune=thefortune;
	}

}
