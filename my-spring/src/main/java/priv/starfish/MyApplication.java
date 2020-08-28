package priv.starfish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.starfish.cycledepend.BeanA;

/**
 * @description:
 * @author: starfish
 * @create: 2020-08-26 10:34
 */
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		Hello hello = (Hello)context.getBean("hello");
//		hello.sayHello();

		BeanA beanA = (BeanA) context.getBean("beanA");
		System.out.println(beanA);
	}

}
