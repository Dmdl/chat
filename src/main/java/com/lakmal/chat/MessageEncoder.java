package com.lakmal.chat;

import org.primefaces.json.JSONObject;
import org.primefaces.push.Encoder;

public class MessageEncoder implements Encoder<Message, String>{

	@Override
	public String encode(Message message) {
		return new JSONObject(message).toString();
	}

}
