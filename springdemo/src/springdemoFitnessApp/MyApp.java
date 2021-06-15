package springdemoFitnessApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Coach c=context.getBean("mycoach", Coach.class);
		CricketCoach cricc=context.getBean("mycriccoach", CricketCoach.class);
//		System.out.println(c.dailyWorkout());
//		System.out.println(c.getFortune());
		
		System.out.println(cricc.getEmail());
		System.out.println(cricc.getTeamname());
		
		context.close();
		
	}
		
}
