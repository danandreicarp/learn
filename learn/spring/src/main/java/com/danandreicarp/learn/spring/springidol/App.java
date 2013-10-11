package com.danandreicarp.learn.spring.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(final String[] args) {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/danandreicarp/learn/spring/springidol/spring-idol.xml");

		final Performer performer1 = (Performer) ctx.getBean("innerPoeticDuke");
		final Performer performer2 = (Performer) ctx.getBean("pKenny");
		final Performer performer3 = (Performer) ctx.getBean("propHank");

		try {
			performer1.perform();
			performer2.perform();
			performer3.perform();
		} catch (final PerformanceException e) {
			e.printStackTrace();
		}
	}
}
