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
	// 파일 읽기 => 메뉴 만들기(Model클래스를 저장) => 실행중에 한번만 호출되는 메소드 => Model클래스를 메모리 할당
	public void init(ServletConfig config) throws ServletException {
		// 메뉴판 만드는 곳
	}
	// 자동 호츨되는 함수 => 사용자 요청이 있으면 호출되는 함수
	// service() => GET/POST 함수 => GET=doGet, POST=doPost
	// service() => 요청처리 => Model 찾기 => JSP로 request를 전송
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
