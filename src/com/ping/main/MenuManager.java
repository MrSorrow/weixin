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
 * �˵�������
 * @author Mr.sorrow
 */
public class MenuManager {

	private static Logger log = LoggerFactory.getLogger(MenuManager.class);  
	
	public static void main(String[] args) {
		// �������û�Ψһƾ֤  
        String appId = "wxb78f615d9baa6e94";  
        // �������û�Ψһƾ֤��Կ  
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
     * @return 
     */  
    private static Menu getMenu() {  
        SubButton btn11 = new SubButton();  
        btn11.setName("����Ԥ��");  
        btn11.setType("click");  
        btn11.setKey("11");  
  
        SubButton btn12 = new SubButton();  
        btn12.setName("������ѯ");  
        btn12.setType("click");  
        btn12.setKey("12");  
  
        SubButton btn13 = new SubButton();  
        btn13.setName("�ܱ�����");  
        btn13.setType("click");  
        btn13.setKey("13");  
  
        SubButton btn14 = new SubButton();  
        btn14.setName("��ʷ�ϵĽ���");  
        btn14.setType("click");  
        btn14.setKey("14");  
  
        SubButton btn21 = new SubButton();  
        btn21.setName("�����㲥");  
        btn21.setType("click");  
        btn21.setKey("21");  
  
        SubButton btn22 = new SubButton();  
        btn22.setName("������Ϸ");  
        btn22.setType("click");  
        btn22.setKey("22");  
  
        SubButton btn23 = new SubButton();  
        btn23.setName("��Ů��̨");  
        btn23.setType("click");  
        btn23.setKey("23");  
  
        SubButton btn24 = new SubButton();  
        btn24.setName("����ʶ��");  
        btn24.setType("click");  
        btn24.setKey("24");  
  
        SubButton btn25 = new SubButton();  
        btn25.setName("�������");  
        btn25.setType("click");  
        btn25.setKey("25");  
  
        SubButton btn31 = new SubButton();  
        btn31.setName("Q��Ȧ");  
        btn31.setType("click");  
        btn31.setKey("31");  
  
        SubButton btn32 = new SubButton();  
        btn32.setName("��Ӱ���а�");  
        btn32.setType("click");  
        btn32.setKey("32");  
  
        SubButton btn33 = new SubButton();  
        btn33.setName("��ĬЦ��");  
        btn33.setType("click");  
        btn33.setKey("33");  
  
        MainButton mainBtn1 = new MainButton();  
        mainBtn1.setName("��������");  
        mainBtn1.setSub_button(new SubButton[] { btn11, btn12, btn13, btn14 });  
  
        MainButton mainBtn2 = new MainButton();  
        mainBtn2.setName("������վ");  
        mainBtn2.setSub_button(new SubButton[] { btn21, btn22, btn23, btn24, btn25 });  
  
        MainButton mainBtn3 = new MainButton();  
        mainBtn3.setName("��������");  
        mainBtn3.setSub_button(new SubButton[] { btn31, btn32, btn33 });  
 
        Menu menu = new Menu();  
        menu.setButton(new Button[] { mainBtn1, mainBtn2, mainBtn3 });  
  
        return menu;  
    }  

}
