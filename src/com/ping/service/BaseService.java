package com.ping.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 通用service
 * @author Mr.sorrow
 */
public class BaseService {
	
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
            
            httpUrlConn.setRequestProperty("Content-type", "text/html");
            httpUrlConn.setRequestProperty("Accept-Charset", "utf-8");
            httpUrlConn.setRequestProperty("contentType", "utf-8");
  
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
     * utf编码 
     * @param source 
     * @return 
     */ 
	public static String urlEncodeUTF8(String source) {  
        String result = source;  
        try {  
            result = java.net.URLEncoder.encode(source, "utf-8");  
        } catch (UnsupportedEncodingException e) {  
            e.printStackTrace();  
        }  
        return result;  
    }  
	
	/**
	 * 设置url参数
	 * @return URL
	 */
	public String setParams(String... args) {
		return null;
	}

	/**
	 * 处理json取出内容
	 * @param json
	 * @return 内容
	 */
	public String processJson(String json) {
		return null;
	}

	/**
	 * 获取数据
	 * @return 
	 */
	public String getDataContent(String... args) {
		String url = setParams(args);
		String content = httpRequest(url);
		return processJson(content);
	}
}
