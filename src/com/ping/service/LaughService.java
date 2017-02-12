package com.ping.service;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * Ц����ȫ�ӿ�
 * @author Mr.sorrow
 */
public class LaughService extends BaseService{

	private static final String APPKEY = "5088801e6eb348edaa8171de72029425";
	
	/**
	 * ����ʱ���������page
	 */
	@Override
	public String setParams(String... args) {
		long time = System.currentTimeMillis();
		time = time / 1000000000L * 1000000L;
		String timeParam = time+"";
		int page = (int) (Math.random()*100);
		if(page > 100)
			page = 100;
		String url = "http://api.avatardata.cn/Joke/QueryJokeByTime?key="+APPKEY
				+"&page="+page+"&rows=1&sort=asc&time="+timeParam;
		System.out.println(url);
		return url;
	}
	
	/**
	 * ����json�ַ���
	 * @param json json����
	 * @return Ц������
	 */
	@Override
	public String processJson(String json) {
		JSONObject jb = JSONObject.fromObject(json);
		JSONArray arrays = jb.getJSONArray("result");
		if(arrays.size() != 0){
			JSONObject object = arrays.getJSONObject(0);
			return (String) object.get("content");
		}
		return "";
	}
}
