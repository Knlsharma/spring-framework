package com.mycompany.spring_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;  

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
                
                Coach s = context.getBean("e", Coach.class);
                
                  Employee s=(Employee)factory.getBean("e");  
                       s.show(); 
                       
                       Coach k = context.getBean("obj", Coach.class);
                       k.display();
                       
		
		// close the context
		context.close();
	}

}







