package com.ping.utils;

import java.util.Date;
import java.util.List;

import com.ping.model.response.Article;
import com.ping.model.response.NewsMessage;
import com.ping.model.response.TextMessage;

/**
 * ������Ϣ������
 * 
 * @author Mr.sorrow
 */
public class SendMessageUtil {

	/**
	 * �����ı���Ϣ
	 * @param respContent 	������Ϣ����
	 * @param fromUserName 
	 * @param toUserName
	 * @return 	xml��ʽ�ķ�����Ϣ
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
	 * ����ͼ����Ϣ
	 * @param articles ͼ��item����
	 * @param fromUserName
	 * @param toUserName
	 * @return xml��ʽ�ķ�����Ϣ
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
