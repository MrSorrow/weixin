package com.ping.model.response;

import java.util.List;

/**
 * ��Ӧͼ����Ϣ
 * �����ֶ�: 	ArticleCount	ͼ����Ϣ����������Ϊ10������
 * 			Articles	 	����ͼ����Ϣ��Ϣ��Ĭ�ϵ�һ��itemΪ��ͼ,ע�⣬���ͼ��������10���򽫻�����Ӧ
 * @author Mr.sorrow
 */
public class NewsMessage extends BaseMessage {
	
	private List<Article> Articles;
	private int ArticleCount;
	
	public List<Article> getArticals() {
		return Articles;
	}
	public void setArticals(List<Article> articles) {
		Articles = articles;
	}
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
}
