package com.ping.model.request;

/**
 * ������Ϣ
 * �����ֶ�: 	MediaId	������Ϣý��id�����Ե��ö�ý���ļ����ؽӿ���ȡ���ݡ�
 * 			Format	������ʽ����amr��speex��
 * @author Mr.sorrow
 */
public class VoiceMessage extends BaseMessage {

	private String MediaId;
	private String Format;
	
	public String getMediaId() {
		return MediaId;
	}
	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
}
