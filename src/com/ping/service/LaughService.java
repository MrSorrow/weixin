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
 * Ц����ȫ�ӿ�
 * @author Mr.sorrow
 */
public class LaughService {

	private static final String APPKEY = "5088801e6eb348edaa8171de72029425";
	
	private static int page = 0;
	
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
	 * ����ʱ���������page
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
	 * ����json�ַ���
	 * @param json json����
	 * @return Ц������
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
	 * ��ȡЦ����ȫ����
	 * @return
	 */
	public static String getDataContent() {
		String url = setTimeParams();
		String content = httpRequest(url);
		return processJson(content);
	}
}
