package com.ping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ping.model.response.Article;
import com.ping.utils.MessageUtil;
import com.ping.utils.SendMessageUtil;

/**
 * 核心服务类
 * @author Mr.sorrow
 */
public class CoreService {
	/**
	 * 处理请求消息
	 * @param request 请求消息
	 * @return respMessage 响应文本消息
	 */
	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;
		try {
			// xml请求解析
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			// 发送方帐号（open_id）
			String fromUserName = requestMap.get("FromUserName");
			// 公众帐号
			String toUserName = requestMap.get("ToUserName");
			// 消息类型
			String msgType = requestMap.get("MsgType");

			// 文本消息
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				switch (requestMap.get("Content")) {
					case "单图文消息":
						Article article = new Article("单图文消息...", "Android新特性介绍，ConstraintLayout完全解析", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						List<Article> singleArticles = new ArrayList<Article>();
						singleArticles.add(article);
						respMessage = SendMessageUtil.sendNewsMessage(singleArticles, toUserName, fromUserName);
						System.out.println("-----发送单图文成功-----");
						break;
						
					case "多图文消息":
						Article article1 = new Article("多图文消息...", "Android新特性介绍，ConstraintLayout完全解析", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						Article article2 = new Article("多图文消息...", "Android新特性介绍，ConstraintLayout完全解析", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						Article article3 = new Article("多图文消息...", "Android新特性介绍，ConstraintLayout完全解析", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						Article article4 = new Article("多图文消息...", "Android新特性介绍，ConstraintLayout完全解析", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						List<Article> moreArticles = new ArrayList<Article>();
						moreArticles.add(article1);
						moreArticles.add(article2);
						moreArticles.add(article3);
						moreArticles.add(article4);
						respMessage = SendMessageUtil.sendNewsMessage(moreArticles, toUserName, fromUserName);
						System.out.println("-----发送多图文成功-----");
						break;
	
					default:
						String defaultMsg = "功能菜单：输入(不包含序号)\n1.单图文消息\n2.多图文消息\n...";
						respMessage = SendMessageUtil.sendTextMessage(defaultMsg, toUserName, fromUserName);
						break;
				}
			}
			// 图片消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
			}
			// 地理位置消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
			}
			// 链接消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
			}
			// 音频消息
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
			}
			// 事件推送
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
				// 事件类型
				String eventType = requestMap.get("Event");
				// 订阅
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					// 回复文本消息
					String respContent = "欢迎关注，微信项目地址：" + "\n<a href='https://github.com/MrSorrow/weixin'>--点此跳转--</a>";
					respMessage = SendMessageUtil.sendTextMessage(respContent, toUserName, fromUserName);
					System.out.println("-----关注成功-----");
				}
				// 取消订阅
				else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
					//取消订阅后用户再收不到公众号发送的消息，因此不需要回复消息
				}
				// 自定义菜单点击事件
				else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					String eventKey = requestMap.get("EventKey");  
					String respContent = "";  
					  
                    if (eventKey.equals("11")) {  
                        respContent = "天气预报菜单项被点击！";  
                    } else if (eventKey.equals("12")) {  
                        respContent = "公交查询菜单项被点击！";  
                    } else if (eventKey.equals("13")) {  
                        respContent = "周边搜索菜单项被点击！";  
                    } else if (eventKey.equals("14")) {  
                        respContent = "历史上的今天菜单项被点击！";  
                    } else if (eventKey.equals("21")) {  
                        respContent = "歌曲点播菜单项被点击！";  
                    } else if (eventKey.equals("22")) {  
                        respContent = "经典游戏菜单项被点击！";  
                    } else if (eventKey.equals("23")) {  
                        respContent = "美女电台菜单项被点击！";  
                    } else if (eventKey.equals("24")) {  
                        respContent = "人脸识别菜单项被点击！";  
                    } else if (eventKey.equals("25")) {  
                        respContent = "聊天唠嗑菜单项被点击！";  
                    } else if (eventKey.equals("31")) {  
                        respContent = "Q友圈菜单项被点击！";  
                    } else if (eventKey.equals("32")) {  
                        respContent = "电影排行榜菜单项被点击！";  
                    } else if (eventKey.equals("33")) {  
                        respContent = "幽默笑话菜单项被点击！";  
                    }
                    
					respMessage = SendMessageUtil.sendTextMessage(respContent, toUserName, fromUserName);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return respMessage;
	}
}
