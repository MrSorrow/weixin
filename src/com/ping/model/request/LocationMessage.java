package com.ping.model.request;

/**
 * 地理消息
 * 特殊字段: 	Location_X	地理位置维度
 * 			Location_Y	地理位置经度
 * 			Scale		地图缩放大小
 * 			Label		地理位置信息
 * @author Mr.sorrow
 */
public class LocationMessage extends BaseMessage {
	private String Location_X;
	private String Location_Y;
	private String Scale;
	private String Label;
	
	public String getLocation_X() {
		return Location_X;
	}
	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}
	public String getLocation_Y() {
		return Location_Y;
	}
	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}
	public String getScale() {
		return Scale;
	}
	public void setScale(String scale) {
		Scale = scale;
	}
	public String getLabel() {
		return Label;
	}
	public void setLabel(String label) {
		Label = label;
	}
}
