package exam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * jsp == servlet : 하는 일이 같음==할 수 있는 일이 같음
 * 					사용자 요청 처리
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		
		// 화면에 보여주기는 어떻게할까?
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<h3> 이름: "+name+"</h3>");
		out.print("<h3> 나이: "+age+"</h3>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
//		doGet(request, response); ==> html 쪽에서 method를 get을 하든
// 		post를 하던 상관 없게 해주지만 utf-8 인코딩을 해주어야함
	}
}
