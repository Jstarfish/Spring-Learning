package priv.starfish.cycledepend;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: starfish
 * @create: 2020-08-28 16:13
 */
@Component
public class BeanA {
	private BeanB beanB;

	public void setBeanB(BeanB beanB) {
		this.beanB = beanB;
	}
}
