package com.ping.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ping.service.CoreService;
import com.ping.utils.SignUtil;

/**
 * 核心请求处理
 * @author Mr.sorrow
 */
public class CoreServlet extends HttpServlet{

	private static final long serialVersionUID = 452274839755049823L;
	
	/**
	 * 确认请求来自微信服务器
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 微信加密签名  
        String signature = req.getParameter("signature");  
        // 时间戳  
        String timestamp = req.getParameter("timestamp");  
        // 随机数  
        String nonce = req.getParameter("nonce");  
        // 随机字符串  
        String echostr = req.getParameter("echostr");  
  
        PrintWriter out = resp.getWriter();  
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败  
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {  
            out.print(echostr);  
        }  
        out.close();  
        out = null;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 将请求、响应的编码均设置为UTF-8（防止中文乱码）  
		req.setCharacterEncoding("UTF-8");  
		resp.setCharacterEncoding("UTF-8");
		
		// 调用核心业务类接收消息、处理消息  
        String respMessage = CoreService.processRequest(req);  
          
        // 响应消息  
        PrintWriter out = resp.getWriter();  
        out.print(respMessage);  
        out.close();  
	}
}
