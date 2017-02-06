package com.ping.model.response;

/**
 * 响应图片消息
 * 特殊字段: MediaId	通过素材管理接口上传多媒体文件，得到的id。
 * @author Mr.sorrow
 */
public class PictureMessage extends BaseMessage {

	private String MediaId;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}
}
