package springdemoFitnessApp;

public class FortuneTeller implements GetDailyFortune {

	@Override
	public String todayFortune() {
		return "Have a good day";
	}

}
