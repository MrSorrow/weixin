package com.ping.model.request;

/**
 * ͼƬ��Ϣ
 * �����ֶ�: 	PicUrl	ͼƬ����
 * 			MediaId	ͼƬ��Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
 * @author Mr.sorrow
 */
public class ImageMessage extends BaseMessage {
	
	private String PicUrl;
	private String MediaId;
	
	public String getPicUrl() {
		return PicUrl;
	}
	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
}
