package com.ping.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ping.model.AccessToken;
import com.ping.model.Button;
import com.ping.model.MainButton;
import com.ping.model.Menu;
import com.ping.model.SubButton;
import com.ping.utils.WeixinUtil;

/**
 * 菜单管理器
 * @author Mr.sorrow
 */
public class MenuManager {

	private static Logger log = LoggerFactory.getLogger(MenuManager.class);  
	
	public static void main(String[] args) {
		// 第三方用户唯一凭证  
        String appId = "wxb78f615d9baa6e94";  
        // 第三方用户唯一凭证密钥  
        String appSecret = "d4624c36b6795d1d99dcf0547af5443d";  
  
        // 调用接口获取access_token  
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);  
  
        if (null != at) {  
            // 调用接口创建菜单  
            int result = WeixinUtil.createMenu(getMenu(), at.getToken());  
  
            // 判断菜单创建结果  
            if (0 == result)  
                System.out.println("菜单创建成功！");  
            else  
            	System.out.println("菜单创建失败，错误码：" + result);  
        }  
	}
	
	/** 
     * 组装菜单数据 
     * @return 
     */  
    private static Menu getMenu() {  
        SubButton btn11 = new SubButton();  
        btn11.setName("天气预报");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        SubButton btn12 = new SubButton();  
        btn12.setName("公交查询");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        SubButton btn13 = new SubButton();  
        btn13.setName("周边搜索");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        SubButton btn14 = new SubButton();  
        btn14.setName("历史上的今天");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        SubButton btn21 = new SubButton();  
        btn21.setName("歌曲点播");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        SubButton btn22 = new SubButton();  
        btn22.setName("经典游戏");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        SubButton btn23 = new SubButton();  
        btn23.setName("美女电台");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        SubButton btn24 = new SubButton();  
        btn24.setName("人脸识别");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        SubButton btn25 = new SubButton();  
        btn25.setName("聊天唠嗑");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        SubButton btn31 = new SubButton();  
        btn31.setName("Q友圈");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        SubButton btn32 = new SubButton();  
        btn32.setName("电影排行榜");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        SubButton btn33 = new SubButton();  
        btn33.setName("幽默笑话");  
        btn33.setType("click");  
        btn33.setKey("33");  
  
        MainButton mainBtn1 = new MainButton();  
        mainBtn1.setName("生活助手");  
        mainBtn1.setSub_button(new SubButton[] { btn11, btn12, btn13, btn14 });  
  
        MainButton mainBtn2 = new MainButton();  
        mainBtn2.setName("休闲驿站");  
        mainBtn2.setSub_button(new SubButton[] { btn21, btn22, btn23, btn24, btn25 });  
  
        MainButton mainBtn3 = new MainButton();  
        mainBtn3.setName("更多体验");  
        mainBtn3.setSub_button(new SubButton[] { btn31, btn32, btn33 });  
 
        Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
    }  

}
