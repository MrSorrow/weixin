package com.ping.model.response;

/**
 * ��Ӧ��Ƶ��Ϣ
 * �����ֶ�: 	MediaId	 	ͨ���زĹ���ӿ��ϴ���ý���ļ����õ���id
 * 			Title	 	��Ƶ��Ϣ�ı���
 * 			Description	��Ƶ��Ϣ������
 * @author Mr.sorrow
 */
public class VedioMessage extends BaseMessage {
	
	private String MediaId;
	private String Title;
	private String Description;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
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
}
