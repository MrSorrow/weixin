package com.ping.model.request;

/**
 * ������Ϣ
 * �����ֶ�: 	Title		��Ϣ����
 * 			Description	��Ϣ����
 * 			Url			��Ϣ����
 * @author Mr.sorrow
 */
public class LinkMessage extends BaseMessage {
	private String Title;
	private String Description;
	private String Url;
	
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
	public String getUrl() {
		return Url;
	}
	public void setUrl(String url) {
		Url = url;
	}
}