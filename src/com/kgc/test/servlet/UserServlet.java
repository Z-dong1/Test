package com.kgc.test.servlet;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kgc.test.utils.MyBeanUtils;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class UserServlet extends BaseServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
	protected void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


}
