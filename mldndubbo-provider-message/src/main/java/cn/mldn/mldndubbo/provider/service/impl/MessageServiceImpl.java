package cn.mldn.mldndubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.mldndubbo.service.IMessageService;
import cn.mldn.mldndubbo.vo.Message;
@Service
public class MessageServiceImpl implements IMessageService {
 
	@Override
	public Message echo(Message msg) { 
		Message echoMsg = new Message() ;
		echoMsg.setTitle("【ECHO - 3】" + msg.getTitle());
		echoMsg.setContent("【ECHO - 3】" + msg.getContent());
		echoMsg.setSender("MessageProvider");
		return echoMsg ;
	}

}
