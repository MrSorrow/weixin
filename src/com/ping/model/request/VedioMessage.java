package com.ping.model.request;

/**
 * 视频消息
 * 特殊字段: 	MediaId			视频消息媒体id，可以调用多媒体文件下载接口拉取数据。
 * 			ThumbMediaId	视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据。
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
