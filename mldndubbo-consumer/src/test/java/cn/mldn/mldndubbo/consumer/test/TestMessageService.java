package cn.mldn.mldndubbo.consumer.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.mldndubbo.service.IMessageService;
import cn.mldn.mldndubbo.vo.Message;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
	// @Resource(name="messageInstance")
	@Autowired
	private IMessageService messageService ;
	@Test
	public void testEcho() {
		Message msg = new Message() ;
		msg.setTitle("过节放假");
		msg.setContent("集体去跳江喂鱼");
		msg.setSender("consumer");
		System.out.println(this.messageService.echo(msg));
	}
}
