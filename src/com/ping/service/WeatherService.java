package com.ping.service;

import com.ping.model.weather.Realtime;

import net.sf.json.JSONObject;

/**
 * ��ȡ����
 * @author Mr.sorrow
 */
public class WeatherService extends BaseService{
	
	private static final String APPKEY = "f3d8b23babda4d2fbcb56bf6ce1a7359";

	/**
	 * ���õ�ַ����
	 * @return url
	 */
	@Override
	public String setParams(String... args) {
		String url = "http://api.avatardata.cn/Weather/Query?key="+APPKEY+"&cityname=";
		if(args.length == 0)
			return "";
		String params = urlEncodeUTF8(args[0]);
		url = url + params;
		System.out.println(url);
		return url;
	}
	
	/**
	 * ��������
	 * @return 
	 */
	@Override
	public String processJson(String json) {
		JSONObject all = JSONObject.fromObject(json);
		JSONObject result = all.getJSONObject("result");
		
		String content = "";
		
		JSONObject realtime = result.getJSONObject("realtime");
		Realtime rtRealtime = (Realtime) JSONObject.toBean(realtime, Realtime.class);
		content = "���У�"+rtRealtime.getCity_name() + "\n���ڣ�" + rtRealtime.getDate() + "\n��ѯʱ�䣺" + rtRealtime.getTime() 
					+ "\n������" + rtRealtime.getWeather().getInfo() + "\n���£�" + rtRealtime.getWeather().getTemperature()
					+ "\n����" + rtRealtime.getWind().getDirect() + "\nǿ�ȣ�" + rtRealtime.getWind().getPower();
		return content;
	}
}
