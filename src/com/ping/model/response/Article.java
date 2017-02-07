package com.ping.model.response;

/**
 * Title		ͼ����Ϣ����
 * Description	ͼ����Ϣ����
 * PicUrl	 	ͼƬ���ӣ�֧��JPG��PNG��ʽ���Ϻõ�Ч��Ϊ��ͼ360*200��Сͼ200*200
 * Url			���ͼ����Ϣ��ת����
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
