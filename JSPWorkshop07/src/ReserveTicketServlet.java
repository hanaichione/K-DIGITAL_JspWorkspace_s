

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReserveTicketServlet")
public class ReserveTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReserveTicketServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String birth = request.getParameter("birth");
		int grade = Integer.parseInt(request.getParameter("class"));
		double price = 0.0;
		Calendar cal = Calendar.getInstance();
		int age = cal.get(Calendar.YEAR) - Integer.parseInt(birth.substring(0, 4));
		String mesg = "";
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<b>입력한 생년월일 : " + birth + ", 선택한 티켓 : " + grade + "</b><br>");
		
		if(age < 19) {
			price = grade * 0.6;
			mesg = "미성년자";
		} else if(age < 60) {
			price = grade * 0.9;
			mesg = "성인";
		} else {
			price = grade * 0.5;
			mesg = "경로우대";
		}
		
		out.print("나이 : " + age + "세, 등급 : " + mesg + ", 할인 적용 금액 : " + price + "원");
		out.print("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
