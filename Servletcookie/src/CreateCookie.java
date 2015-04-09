import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CreateCookie extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();

		// ����cookie
		// ʱ��-1Ϊ�ػ������ �رջỰ��ɾ��
		Cookie ck = new Cookie("mycookie", "123");
		ck.setMaxAge(-1);
		response.addCookie(ck);
		// out.println("����mycookie");

		// ����ͬ��cookie����
		Cookie ck1 = new Cookie("mycookie", java.net.URLEncoder.encode("������",
				"gb2312"));
		ck1.setMaxAge(3600);
		response.addCookie(ck1);
		// out.println("����mycookie");

		// ����ͬ��cookie����

		// out.println("����ck_date");

		// ����ȡ��������һ�ε� ��Ϊû�лط�
		Cookie[] cks = request.getCookies();
		boolean isFirst = true;

		if (cks != null) {
			out.println(cks.length);

			for (Cookie c : cks) {

				out.println(c.getName() + ","
						+ java.net.URLDecoder.decode(c.getValue(), "gb2312")
						+ "</br>");
				// c.setMaxAge(0);
				// response.addCookie(c);
				// out.println("ɾ��"+c.getName());
				if (c.getName().equals("ck_date")) {
					isFirst = false;
					out.println("�ϴε�¼��" + c.getValue());
					break;
				}
			}
		}
		if (isFirst) {
			out.println("�״ε�¼");
			addDateCookie(response, out);
		}
		addDateCookie(response, out);

	}

	private void addDateCookie(HttpServletResponse response, PrintWriter out) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String nowTime = sdf.format(new Date());
		Cookie ck_date = new Cookie("ck_date", nowTime);
		ck_date.setMaxAge(3600);
		response.addCookie(ck_date);
	}
}
