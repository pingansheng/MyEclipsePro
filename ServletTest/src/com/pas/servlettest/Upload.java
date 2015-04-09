package com.pas.servlettest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.taglibs.standard.tag.common.core.OutSupport;

public class Upload extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DiskFileItemFactory factory = new DiskFileItemFactory();

		// �����ٽ��С ������ д�����
		factory.setSizeThreshold(1024 * 1024);
		String tempath = getServletContext().getRealPath("/");
		// ������ʱĿ¼
		factory.setRepository(new File(tempath));
		ServletFileUpload fileupload = new ServletFileUpload(factory);

		try {
			// FileItem�����ύ��ĳ���ֶ� ���������ֶ�
			List<FileItem> list = fileupload.parseRequest(request);

			for (FileItem fileItem : list) {
				if (fileItem.isFormField()) {
					// ����ͨ�ֶ�
					String name = fileItem.getFieldName();
					String value = fileItem.getString("gbk");
					request.setAttribute(name, value);

				} else {
					// �ļ�����
					String name = new String(fileItem.getName().getBytes(),"utf-8");
					
					int start=name.lastIndexOf('\\');
					String filename =name.substring(start+1);
					request.setAttribute(fileItem.getFieldName(), filename);

					//��㷽��commons fileupload�ṩ
					fileItem.write(new File(tempath,filename));
					
					
					/*OutputStream os = new FileOutputStream(new File(tempath,
							filename));

					InputStream in = fileItem.getInputStream();

					byte[] buffer = new byte[400];

					int length = 0;

					while ((length = in.read(buffer)) > 0) {
						os.write(buffer, 0, length);
					}

					in.close();
					os.close();*/
				}
			}
		} catch (FileUploadException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.getRequestDispatcher("/upload.jsp").forward(request,
				response);
	}

}
