package com.ping.service;

import com.ping.model.weather.Realtime;

import net.sf.json.JSONObject;

/**
 * 获取天气
 * @author Mr.sorrow
 */
public class WeatherService extends BaseService{
	
	private static final String APPKEY = "f3d8b23babda4d2fbcb56bf6ce1a7359";

	/**
	 * 设置地址参数
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
	 * 处理数据
	 * @return 
	 */
	@Override
	public String processJson(String json) {
		JSONObject all = JSONObject.fromObject(json);
		JSONObject result = all.getJSONObject("result");
		
		String content = "";
		
		JSONObject realtime = result.getJSONObject("realtime");
		Realtime rtRealtime = (Realtime) JSONObject.toBean(realtime, Realtime.class);
		content = "城市："+rtRealtime.getCity_name() + "\n日期：" + rtRealtime.getDate() + "\n查询时间：" + rtRealtime.getTime() 
					+ "\n天气：" + rtRealtime.getWeather().getInfo() + "\n气温：" + rtRealtime.getWeather().getTemperature()
					+ "\n风向：" + rtRealtime.getWind().getDirect() + "\n强度：" + rtRealtime.getWind().getPower();
		return content;
	}
}
