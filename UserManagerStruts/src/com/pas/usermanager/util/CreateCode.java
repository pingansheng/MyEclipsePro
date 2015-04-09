package com.pas.usermanager.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.commons.digester.rss.Image;

public class CreateCode extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("image/gif");
		// ²»»º´æ
		// IE
		response.setDateHeader("Expires", -1);
		// firefox
		response.setHeader("Cache-Control", "no-cache");
		// ÆäËû
		response.setHeader("Pragma", "no-cache");

		BufferedImage img = new BufferedImage(60, 20,
				BufferedImage.TYPE_INT_RGB);

		Graphics g = img.getGraphics();

		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 60, 20);

		g.setColor(Color.GRAY);
		g.setFont(new Font(null, Font.BOLD, 15));

		String num = getNumString();
		FontMetrics fm=g.getFontMetrics();
		int fontac=fm.getAscent();
		int fontdc=fm.getDescent();
		int fontwith=fm.stringWidth(num);


		g.drawString(num, (60-fontwith)/2, (15-fontac-fontdc)/2+fontac);

		HttpSession ss=request.getSession();
		ss.setAttribute("code",num);
		
		ImageIO.write(img, "gif", response.getOutputStream());
		

	}

	private String getNumString() {
		StringBuffer num = new StringBuffer();
		Random rm = new Random();
		for (int i = 0; i < 4; i++) {
			num.append(rm.nextInt(10));
		}
		return num.toString();
	}
}
