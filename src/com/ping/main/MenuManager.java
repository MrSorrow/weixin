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
 * �˵�������
 * @author Mr.sorrow
 */
public class MenuManager {

	private static Logger log = LoggerFactory.getLogger(MenuManager.class);  
	
	public static void main(String[] args) {
		// �������û�Ψһƾ֤  
        //String appId = "wx68439db5d1eefa03";  
        //String appSecret = "14cf1bb4e8c799eafe4249785c853707";  
        
        String appId = "wxb78f615d9baa6e94";  
        String appSecret = "d4624c36b6795d1d99dcf0547af5443d";  
  
        // ���ýӿڻ�ȡaccess_token  
        AccessToken at = WeixinUtil.getAccessToken(appId, appSecret);  
  
        if (null != at) {  
            // ���ýӿڴ����˵�  
            int result = WeixinUtil.createMenu(getMenu(), at.getToken());  
  
            // �жϲ˵��������  
            if (0 == result)  
                System.out.println("�˵������ɹ���");  
            else  
            	System.out.println("�˵�����ʧ�ܣ������룺" + result);  
        }  
	}
	
	/** 
     * ��װ�˵����� 
     * @return Menu
     */  
    private static Menu getMenu() {  
        SubKeyButton btn11 = new SubKeyButton();  
        btn11.setName("����Ԥ��");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        SubKeyButton btn12 = new SubKeyButton();  
        btn12.setName("������ѯ");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        SubKeyButton btn13 = new SubKeyButton();  
        btn13.setName("�ܱ�����");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        SubKeyButton btn14 = new SubKeyButton();  
        btn14.setName("��ʷ�ϵĽ���");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        SubKeyButton btn15 = new SubKeyButton();  
        btn15.setName("����");  
        btn15.setType("click");  
        btn15.setKey("15");  
        
        SubKeyButton btn21 = new SubKeyButton();  
        btn21.setName("�����㲥");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        SubKeyButton btn22 = new SubKeyButton();  
        btn22.setName("������Ϸ");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        SubKeyButton btn23 = new SubKeyButton();  
        btn23.setName("��Ů��̨");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        SubKeyButton btn24 = new SubKeyButton();  
        btn24.setName("����ʶ��");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        SubKeyButton btn25 = new SubKeyButton();  
        btn25.setName("�������");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        SubKeyButton btn31 = new SubKeyButton();  
        btn31.setName("Q��Ȧ");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        SubKeyButton btn32 = new SubKeyButton();  
        btn32.setName("��Ӱ���а�");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        SubKeyButton btn33 = new SubKeyButton();  
        btn33.setName("��ĬЦ��");  
        btn33.setType("click");  
        btn33.setKey("33");  
        
        SubKeyButton btn34 = new SubKeyButton();  
        btn34.setName("��Ӱ");  
        btn34.setType("click");  
        btn34.setKey("34");  
  
        SubViewButton btn35 = new SubViewButton();  
        btn35.setName("��Ŀ��ַ");  
        btn35.setType("view");  
        btn35.setUrl("https://github.com/MrSorrow/weixin");
  
        MainButton mainBtn1 = new MainButton();  
        mainBtn1.setName("��������");  
        mainBtn1.setSub_button(new Button[] { btn11, btn12, btn13, btn14, btn15 });  
  
        MainButton mainBtn2 = new MainButton();  
        mainBtn2.setName("������վ");  
        mainBtn2.setSub_button(new Button[] { btn21, btn22, btn23, btn24, btn25 });  
  
        MainButton mainBtn3 = new MainButton();  
        mainBtn3.setName("��������");  
        mainBtn3.setSub_button(new Button[] { btn31, btn32, btn33, btn34, btn35 });  
 
        Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
    }  

}
