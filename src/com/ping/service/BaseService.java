package com.ping.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * ͨ��service
 * @author Mr.sorrow
 */
public class BaseService {
	
	/**
	 * ����http�����ȡ���ؽ�� 
	 * @param requestUrl url��ַ
	 * @return json����
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
  
            // �����ص�������ת�����ַ���  
            InputStream inputStream = httpUrlConn.getInputStream();  
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");  
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  
  
            String str = null;  
            while ((str = bufferedReader.readLine()) != null) {  
                buffer.append(str);  
            }  
            bufferedReader.close();  
            inputStreamReader.close();  
            // �ͷ���Դ  
            inputStream.close();  
            inputStream = null;  
            httpUrlConn.disconnect();  
  
        } catch (Exception e) {  
        	e.printStackTrace();
        }
        return buffer.toString(); 
	}
	
	 /** 
     * utf���� 
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
	 * ����url����
	 * @return URL
	 */
	public String setParams(String... args) {
		return null;
	}

	/**
	 * ����jsonȡ������
	 * @param json
	 * @return ����
	 */
	public String processJson(String json) {
		return null;
	}

	/**
	 * ��ȡ����
	 * @return 
	 */
	public String getDataContent(String... args) {
		String url = setParams(args);
		String content = httpRequest(url);
		return processJson(content);
	}
}
