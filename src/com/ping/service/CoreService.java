package com.ping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ping.model.response.Article;
import com.ping.utils.MessageUtil;
import com.ping.utils.SendMessageUtil;

/**
 * ���ķ�����
 * @author Mr.sorrow
 */
public class CoreService {
	/**
	 * ����������Ϣ
	 * @param request ������Ϣ
	 * @return respMessage ��Ӧ�ı���Ϣ
	 */
	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;
		try {
			// xml�������
			Map<String, String> requestMap = MessageUtil.parseXml(request);
			// ���ͷ��ʺţ�open_id��
			String fromUserName = requestMap.get("FromUserName");
			// �����ʺ�
			String toUserName = requestMap.get("ToUserName");
			// ��Ϣ����
			String msgType = requestMap.get("MsgType");

			// �ı���Ϣ
			if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_TEXT)) {
				switch (requestMap.get("Content")) {
					case "��ͼ����Ϣ":
						Article article = new Article("��ͼ����Ϣ...", "Android�����Խ��ܣ�ConstraintLayout��ȫ����", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						List<Article> singleArticles = new ArrayList<Article>();
						singleArticles.add(article);
						respMessage = SendMessageUtil.sendNewsMessage(singleArticles, toUserName, fromUserName);
						System.out.println("-----���͵�ͼ�ĳɹ�-----");
						break;
						
					case "��ͼ����Ϣ":
						Article article1 = new Article("��ͼ����Ϣ...", "Android�����Խ��ܣ�ConstraintLayout��ȫ����", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						Article article2 = new Article("��ͼ����Ϣ...", "Android�����Խ��ܣ�ConstraintLayout��ȫ����", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						Article article3 = new Article("��ͼ����Ϣ...", "Android�����Խ��ܣ�ConstraintLayout��ȫ����", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						Article article4 = new Article("��ͼ����Ϣ...", "Android�����Խ��ܣ�ConstraintLayout��ȫ����", "http://img.blog.csdn.net/20170131133515600?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvZ3VvbGluX2Jsb2c=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast", "http://blog.csdn.net/guolin_blog/article/details/53122387");
						List<Article> moreArticles = new ArrayList<Article>();
						moreArticles.add(article1);
						moreArticles.add(article2);
						moreArticles.add(article3);
						moreArticles.add(article4);
						respMessage = SendMessageUtil.sendNewsMessage(moreArticles, toUserName, fromUserName);
						System.out.println("-----���Ͷ�ͼ�ĳɹ�-----");
						break;
	
					default:
						String defaultMsg = "���ܲ˵�������(���������)\n1.��ͼ����Ϣ\n2.��ͼ����Ϣ\n...";
						respMessage = SendMessageUtil.sendTextMessage(defaultMsg, toUserName, fromUserName);
						break;
				}
			}
			// ͼƬ��Ϣ
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_IMAGE)) {
			}
			// ����λ����Ϣ
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LOCATION)) {
			}
			// ������Ϣ
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_LINK)) {
			}
			// ��Ƶ��Ϣ
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_VOICE)) {
			}
			// �¼�����
			else if (msgType.equals(MessageUtil.REQ_MESSAGE_TYPE_EVENT)) {
				// �¼�����
				String eventType = requestMap.get("Event");
				// ����
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {
					// �ظ��ı���Ϣ
					String respContent = "��ӭ��ע��΢����Ŀ��ַ��" + "\n<a href='https://github.com/MrSorrow/weixin'>--�����ת--</a>";
					respMessage = SendMessageUtil.sendTextMessage(respContent, toUserName, fromUserName);
					System.out.println("-----��ע�ɹ�-----");
				}
				// ȡ������
				else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
					//ȡ�����ĺ��û����ղ������ںŷ��͵���Ϣ����˲���Ҫ�ظ���Ϣ
				}
				// �Զ���˵�����¼�
				else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					String eventKey = requestMap.get("EventKey");  
					String respContent = "";  
					  
                    if (eventKey.equals("11")) {  
                        respContent = "����Ԥ���˵�������";  
                    } else if (eventKey.equals("12")) {  
                        respContent = "������ѯ�˵�������";  
                    } else if (eventKey.equals("13")) {  
                        respContent = "�ܱ������˵�������";  
                    } else if (eventKey.equals("14")) {  
                        respContent = "��ʷ�ϵĽ���˵�������";  
                    } else if (eventKey.equals("21")) {  
                        respContent = "�����㲥�˵�������";  
                    } else if (eventKey.equals("22")) {  
                        respContent = "������Ϸ�˵�������";  
                    } else if (eventKey.equals("23")) {  
                        respContent = "��Ů��̨�˵�������";  
                    } else if (eventKey.equals("24")) {  
                        respContent = "����ʶ��˵�������";  
                    } else if (eventKey.equals("25")) {  
                        respContent = "������ྲ˵�������";  
                    } else if (eventKey.equals("31")) {  
                        respContent = "Q��Ȧ�˵�������";  
                    } else if (eventKey.equals("32")) {  
                        respContent = "��Ӱ���а�˵�������";  
                    } else if (eventKey.equals("33")) {  
                        respContent = "��ĬЦ���˵�������";  
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
