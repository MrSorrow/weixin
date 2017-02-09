package com.ping.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ping.model.AccessToken;
import com.ping.model.Button;
import com.ping.model.MainButton;
import com.ping.model.Menu;
import com.ping.model.SubKeyButton;
import com.ping.model.SubViewButton;
import com.ping.utils.WeixinUtil;

/**
 * 菜单管理器
 * @author Mr.sorrow
 */
public class MenuManager {

	private static Logger log = LoggerFactory.getLogger(MenuManager.class);  
	
	public static void main(String[] args) {
		// 第三方用户唯一凭证  
        //String appId = "wx68439db5d1eefa03";  
        //String appSecret = "14cf1bb4e8c799eafe4249785c853707";  
        
        String appId = "wxb78f615d9baa6e94";  
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
     * @return Menu
     */  
    private static Menu getMenu() {  
        SubKeyButton btn11 = new SubKeyButton();  
        btn11.setName("天气预报");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        SubKeyButton btn12 = new SubKeyButton();  
        btn12.setName("公交查询");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        SubKeyButton btn13 = new SubKeyButton();  
        btn13.setName("周边搜索");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        SubKeyButton btn14 = new SubKeyButton();  
        btn14.setName("历史上的今天");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        SubKeyButton btn15 = new SubKeyButton();  
        btn15.setName("嘻嘻");  
        btn15.setType("click");  
        btn15.setKey("15");  
        
        SubKeyButton btn21 = new SubKeyButton();  
        btn21.setName("歌曲点播");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        SubKeyButton btn22 = new SubKeyButton();  
        btn22.setName("经典游戏");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        SubKeyButton btn23 = new SubKeyButton();  
        btn23.setName("美女电台");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        SubKeyButton btn24 = new SubKeyButton();  
        btn24.setName("人脸识别");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        SubKeyButton btn25 = new SubKeyButton();  
        btn25.setName("聊天唠嗑");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        SubKeyButton btn31 = new SubKeyButton();  
        btn31.setName("Q友圈");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        SubKeyButton btn32 = new SubKeyButton();  
        btn32.setName("电影排行榜");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        SubKeyButton btn33 = new SubKeyButton();  
        btn33.setName("幽默笑话");  
        btn33.setType("click");  
        btn33.setKey("33");  
        
        SubKeyButton btn34 = new SubKeyButton();  
        btn34.setName("电影");  
        btn34.setType("click");  
        btn34.setKey("34");  
  
        SubViewButton btn35 = new SubViewButton();  
        btn35.setName("项目地址");  
        btn35.setType("view");  
        btn35.setUrl("https://github.com/MrSorrow/weixin");
  
        MainButton mainBtn1 = new MainButton();  
        mainBtn1.setName("生活助手");  
        mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14, btn15 });  
  
        MainButton mainBtn2 = new MainButton();  
        mainBtn2.setName("休闲驿站");  
        mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });  
  
        MainButton mainBtn3 = new MainButton();  
        mainBtn3.setName("关于作者");  
        mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34, btn35 });  
 
        Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
    }  

}
