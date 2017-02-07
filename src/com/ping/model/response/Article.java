package com.ping.model.response;

/**
 * Title		图文消息标题
 * Description	图文消息描述
 * PicUrl	 	图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
 * Url			点击图文消息跳转链接
 * @author Mr.sorrow
 */
public class Article {
	
	private String Title;
	private String Description;
	private String PicUrl;
	private String Url;
	
	public Article() {
		super();
	}

	public Article(String title, String description, String picUrl, String url) {
		super();
		Title = title;
		Description = description;
		PicUrl = picUrl;
		Url = url;
	}
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
}
