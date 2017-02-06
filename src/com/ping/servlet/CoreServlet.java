package com.ping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ping.utils.SignUtil;

/**
 * ����������
 * @author Mr.sorrow
 */
public class CoreServlet extends HttpServlet{

	private static final long serialVersionUID = 452274839755049823L;
	
	/**
	 * ȷ����������΢�ŷ�����
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ΢�ż���ǩ��  
        String signature = req.getParameter("signature");  
        // ʱ���  
        String timestamp = req.getParameter("timestamp");  
        // �����  
        String nonce = req.getParameter("nonce");  
        // ����ַ���  
        String echostr = req.getParameter("echostr");  
  
        PrintWriter out = resp.getWriter();  
        // ͨ������signature���������У�飬��У��ɹ���ԭ������echostr����ʾ����ɹ����������ʧ��  
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
            out.print(echostr);  
        }  
        out.close();  
        out = null;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}