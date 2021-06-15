package springdemoFitnessApp;

public class TennisCoach implements Coach{
	
	GetDailyFortune fortune;
	
	TennisCoach(){
		System.out.println("Tennis coach constructor");
	}
	
	TennisCoach(GetDailyFortune thefortune){
		fortune=thefortune;
	}
	
	@Override
	public String dailyWorkout() {
		return "50 lunges";
	}
	
	@Override
	public String getFortune() {
		 return fortune.todayFortune();
	}

}
