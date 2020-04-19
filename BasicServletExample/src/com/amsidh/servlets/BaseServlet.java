package com.amsidh.servlets;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = { "/base" }, name = "base", loadOnStartup = 1)
public class BaseServlet implements Servlet {

	@Override
	public void destroy() {
		System.out.println("Destroyed Method is called");

	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig Method is called");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo Method is called");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init Method is called");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service Method is called");

	}

}
