package com.ping.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 笑话大全接口
 * @author Mr.sorrow
 */
public class LaughService {

	private static final String APPKEY = "5088801e6eb348edaa8171de72029425";
	
	private static int page = 0;
	
	/**
	 * 发起http请求获取返回结果 
	 * @param requestUrl url地址
	 * @return json数据
	 */
	public static String httpRequest(String requestUrl) {
		StringBuffer buffer = new StringBuffer();  
        try {  
            URL url = new URL(requestUrl);  
            HttpURLConnection httpUrlConn = (HttpURLConnection) url.openConnection();  
  
            httpUrlConn.setDoOutput(false);  
            httpUrlConn.setDoInput(true);  
            httpUrlConn.setUseCaches(false);  
  
            httpUrlConn.setRequestMethod("GET");  
            httpUrlConn.connect();  
  
            // 将返回的输入流转换成字符串  
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
  
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
            // 释放资源  
            inputStream.close();  
            inputStream = null;  
            httpUrlConn.disconnect();  
  
        } catch (Exception e) {  
        	e.printStackTrace();
        }  
        return buffer.toString(); 
	}
	
	/**
	 * 设置时间戳参数和page
	 */
	public static String setTimeParams() {
		long time = System.currentTimeMillis();
		time = time / 100000000L * 100000L;
		String timeParam = time+"";
		page++;
		if(page > 100)
			page = 100;
		String url = "http://api.avatardata.cn/Joke/QueryJokeByTime?key="+APPKEY
				+"&page="+page+"&rows=1&sort=asc&time="+timeParam;
		return url;
	}
	
	/**
	 * 处理json字符串
	 * @param json json数据
	 * @return 笑话内容
	 */
	public static String processJson(String json) {
		JSONObject jb = JSONObject.fromObject(json);
		JSONArray arrays = jb.getJSONArray("result");
		if(arrays.size() != 0){
			JSONObject object = arrays.getJSONObject(0);
			return (String) object.get("content");
		}
		return "";
	}
	
	/**
	 * 获取笑话大全数据
	 * @return
	 */
	public static String getDataContent() {
		String url = setTimeParams();
		String content = httpRequest(url);
		return processJson(content);
	}
}
