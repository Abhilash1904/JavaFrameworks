package springdemoFitnessApp;


public class BasketballCoach implements Coach {

	GetDailyFortune fortune;
	
	BasketballCoach(GetDailyFortune thefortune){
		fortune=thefortune;
	}
	
	@Override
	public String dailyWorkout() {
		
		return "run 5km";
	}

	@Override
	public String getFortune() {
		return fortune.todayFortune();
	}

}
