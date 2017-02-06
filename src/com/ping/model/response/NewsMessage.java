package com.ping.model.response;

import java.util.List;

/**
 * 响应图文消息
 * 特殊字段: 	ArticleCount	图文消息个数，限制为10条以内
 * 			Articles	 	多条图文消息信息，默认第一个item为大图,注意，如果图文数超过10，则将会无响应
 * @author Mr.sorrow
 */
public class NewsMessage extends BaseMessage {
	
	private List<Artical> Articals;
	private int ArticleCount;
	
	public List<Artical> getArticals() {
		return Articals;
	}
	public void setArticals(List<Artical> articals) {
		Articals = articals;
	}
	public int getArticleCount() {
		return ArticleCount;
	}
	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}
}
