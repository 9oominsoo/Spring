package com.javaex.servlet;

// HTML 파일의 경우 파일 이름을 주소로 바로 사용할 수 있었지만
// 서블릿 같은 프로그램은 파일이 아니기 때문에 주소를 직접 지정해주어야 한다.
// 또 HTML은 수정해도 서버를 재시작 안해도 되지만, 프로그램의 경우에는 서버에 올라간 정보를 새로 컴파일 하기 위해 서버를 재시작 해주어야 한다.

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GugudanServlet

 */
// *****************************서블릿 프로그램의 주소를 다음과 같이 지정*****************************
@WebServlet("/Gugudan")
// *************************************************************************************
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("구구단 출력");
			String tempDan = request.getParameter("dan");
			System.out.println("단 수: " + tempDan);
			
			int dan = Integer.parseInt(tempDan);
			
			PrintWriter out = response.getWriter();
			out.println("<table border = '1'>");
			for(int i=1; i<=9; i++){
				out.println("	<tr>");
				out.println("		<td>"+ dan +"</td>");
				out.println("		<td>"+ i +"</td>");
				out.println("		<td>");
				out.println(dan*i);
				out.println("		</td>");
				out.println(" </tr>");
			}

			out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
