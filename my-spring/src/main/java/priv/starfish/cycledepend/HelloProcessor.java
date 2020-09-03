package priv.starfish.cycledepend;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: starfish
 * @create: 2020-09-01 18:33
 */
@Component
public class HelloProcessor implements SmartInstantiationAwareBeanPostProcessor {

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println("提前曝光了："+beanName);
		return bean;
	}
}
