package com.ping.model.response;

/**
 * 响应消息基类：包含所有消息的共同属性字段
 * ToUserName	发送方帐号（一个OpenID）
 * FromUserName	开发者微信号
 * CreateTime	消息创建时间 （整型）
 * MsgType		text
 * FuncFlag		位0x0001被标志时，星标刚收到的消息
 * @author Mr.sorrow
 */
public class BaseMessage {
	
	private String ToUserName;
	private String FromUserName;
	private long  CreateTime;
	private String MsgType;
	private int FuncFlag;
	
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
	public String getMsgType() {
		return MsgType;
	}
	public void setMsgType(String msgType) {
		MsgType = msgType;
	}
	public int getFuncFlag() {
		return FuncFlag;
	}
	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}
}
