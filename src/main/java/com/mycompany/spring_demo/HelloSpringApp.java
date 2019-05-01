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
               
                
                
                    Coach s = context.getBean("ck", Employee.class);
                
            //      Employee s=(Employee)factory.getBean("e");  
                       s.getDailyWorkout();
                       s.show();
                       s.getDailyFortune();
                       
                       Person k = context.getBean("obj", Person.class);
                       k.display();
                       
		 
		// close the context
		context.close();
	}

}







