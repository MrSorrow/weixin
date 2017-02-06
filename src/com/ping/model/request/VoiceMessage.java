package com.ping.model.request;

/**
 * 语音消息
 * 特殊字段: 	MediaId	语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
 * 			Format	语音格式，如amr，speex等
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
