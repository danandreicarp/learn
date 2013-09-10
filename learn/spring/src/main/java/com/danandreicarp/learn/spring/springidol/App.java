package com.danandreicarp.learn.spring.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(final String[] args) {
		final ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/danandreicarp/learn/spring/springidol/spring-idol.xml");

		final Performer performer1 = (Performer) ctx.getBean("poeticDuke");
		final Performer performer2 = (Performer) ctx.getBean("kenny");

		try {
			performer1.perform();
			performer2.perform();
		} catch (final PerformanceException e) {
			e.printStackTrace();
		}
	}
}
