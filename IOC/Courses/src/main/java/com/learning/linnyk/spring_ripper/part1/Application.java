package com.learning.linnyk.spring_ripper.part1;

import com.learning.linnyk.spring_ripper.part1.bean.Quoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author LinnykOleh
 */
public class Application {

	public static void main(String[] args) throws InterruptedException {
		final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring_ripper/spring.xml");
		final Quoter bean = context.getBean(Quoter.class);
		System.out.println(bean);

		while (true) {
			Thread.sleep(1000);
			context.getBean(Quoter.class).sayQuote();
		}
	}
}
