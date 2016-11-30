package domain.markup.web_service.messenger.service;

import java.util.ArrayList;
import java.util.List;

import domain.markup.web_service.messenger.attribute.msg;

public class MsgService {

	public List<msg> getAllMessages(){
		msg m1 = new msg(1l, "hi", " Mayukh");
		msg m2 = new msg(2l, "hello", " this is my book app");
		List<msg> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		return list;
	}
}
