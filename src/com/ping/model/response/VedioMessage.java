package com.ping.model.response;

/**
 * 响应视频消息
 * 特殊字段: 	MediaId	 	通过素材管理接口上传多媒体文件，得到的id
 * 			Title	 	视频消息的标题
 * 			Description	视频消息的描述
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
