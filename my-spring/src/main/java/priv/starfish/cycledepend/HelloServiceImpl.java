package priv.starfish.cycledepend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description:
 * @author: starfish
 * @create: 2020-09-01 18:46
 */
//@Service
public class HelloServiceImpl implements HelloService {
	@Autowired
	private HelloService helloService;

	@Override
	@Transactional
	public Object hello() {
		return "Hello JavaKeeper";
	}
}
