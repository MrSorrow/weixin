package com.ping.utils;

import java.util.Date;
import java.util.List;

import com.ping.model.response.Article;
import com.ping.model.response.NewsMessage;
import com.ping.model.response.TextMessage;

/**
 * 发送消息工具类
 * 
 * @author Mr.sorrow
 */
public class SendMessageUtil {

	/**
	 * 发送文本消息
	 * @param respContent 	发送消息内容
	 * @param fromUserName 
	 * @param toUserName
	 * @return 	xml格式的发送消息
	 */
	public static String sendTextMessage(String respContent, String fromUserName, String toUserName) {
		TextMessage textMessage = new TextMessage();
		textMessage.setToUserName(toUserName);
		textMessage.setFromUserName(fromUserName);
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
		textMessage.setFuncFlag(0);
		textMessage.setContent(respContent);
		return MessageUtil.textMessageToXml(textMessage);
	}

	/**
	 * 发送图文消息
	 * @param articles 图文item集合
	 * @param fromUserName
	 * @param toUserName
	 * @return xml格式的发送消息
	 */
	public static String sendNewsMessage(List<Article> articles, String fromUserName,String toUserName) {
		NewsMessage newsMessage = new NewsMessage();
		newsMessage.setToUserName(toUserName);
		newsMessage.setFromUserName(fromUserName);
		newsMessage.setCreateTime(new Date().getTime());  
        newsMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_NEWS);  
        newsMessage.setFuncFlag(0);
        newsMessage.setArticleCount(articles.size());  
        newsMessage.setArticals(articles);  
		return MessageUtil.newsMessageToXml(newsMessage);
	}
}
