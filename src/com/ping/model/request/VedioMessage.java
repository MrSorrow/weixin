package com.ping.model.request;

/**
 * ��Ƶ��Ϣ
 * �����ֶ�: 	MediaId			��Ƶ��Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
 * 			ThumbMediaId	��Ƶ��Ϣ����ͼ��ý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
 * @author Mr.sorrow
 */
public class VedioMessage extends BaseMessage {
	private String MediaId;
	private String ThumbMediaId;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getThumbMediaId() {
		return ThumbMediaId;
	}
	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}
}
