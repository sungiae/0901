package com.sist.controller;

import java.io.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// ���� �б� => �޴� �����(ModelŬ������ ����) => �����߿� �ѹ��� ȣ��Ǵ� �޼ҵ� => ModelŬ������ �޸� �Ҵ�
	public void init(ServletConfig config) throws ServletException {
		// �޴��� ����� ��
	}
	// �ڵ� ȣ���Ǵ� �Լ� => ����� ��û�� ������ ȣ��Ǵ� �Լ�
	// service() => GET/POST �Լ� => GET=doGet, POST=doPost
	// service() => ��ûó�� => Model ã�� => JSP�� request�� ����
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
