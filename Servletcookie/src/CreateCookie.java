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

		// 创建cookie
		// 时间-1为回话级别的 关闭会话就删除
		Cookie ck = new Cookie("mycookie", "123");
		ck.setMaxAge(-1);
		response.addCookie(ck);
		// out.println("创建mycookie");

		// 创建同名cookie覆盖
		Cookie ck1 = new Cookie("mycookie", java.net.URLEncoder.encode("哈哈哈",
				"gb2312"));
		ck1.setMaxAge(3600);
		response.addCookie(ck1);
		// out.println("创建mycookie");

		// 创建同名cookie覆盖

		// out.println("创建ck_date");

		// 这里取到的是上一次的 因为没有回发
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
				// out.println("删除"+c.getName());
				if (c.getName().equals("ck_date")) {
					isFirst = false;
					out.println("上次登录：" + c.getValue());
					break;
				}
			}
		}
		if (isFirst) {
			out.println("首次登录");
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
