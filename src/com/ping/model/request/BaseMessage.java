package com.ping.model.request;

/**
 * ������Ϣ���ࣺ����������Ϣ�Ĺ�ͬ�����ֶ�
 * ToUserName	������΢�ź�
 * FromUserName	���ͷ��ʺţ�һ��OpenID��
 * CreateTime	��Ϣ����ʱ�� �����ͣ�
 * MsgType		text
 * MsgId		��Ϣid��64λ����
 * @author Mr.sorrow
 */
public class BaseMessage {
	
	private String ToUserName;
	private String FromUserName;
	private long  CreateTime;
	private String MsgType;
	private long  MsgId;
	
	public String getToUserName() {
		return ToUserName;
	}
	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}
	public String getFromUserName() {
		return FromUserName;
	}
	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}
	
	public long getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}
	public long getMsgId() {
		return MsgId;
	}
	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	
	
	
}
