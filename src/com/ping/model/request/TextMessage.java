package com.ping.model.request;

/**
 * 接收文本消息
 * 特殊字段: Content	文本消息内容
 * @author Mr.sorrow
 */
public class TextMessage extends BaseMessage {
	
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}
}
