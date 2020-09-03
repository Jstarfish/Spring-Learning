package priv.starfish.cycledepend;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: starfish
 * @create: 2020-08-28 16:14
 */
@Component
public class BeanB {
	private BeanA beanA;
//	public void setBeanA(BeanA beanA) {
//		this.beanA = beanA;
//	}


	public BeanB(BeanA beanA) {
		this.beanA = beanA;
	}
}
