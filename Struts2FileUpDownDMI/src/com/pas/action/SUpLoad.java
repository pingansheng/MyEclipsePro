package com.pas.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class SUpLoad extends ActionSupport {

	private String username;
	private List<File> file;
	private List<String> fileFileName;
	private List<String> fileContentType;

	public List<File> getFile() {
		return file;
	}

	public void setFile(List<File> file) {
		this.file = file;
	}

	public List<String> getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(List<String> fileFileName) {
		this.fileFileName = fileFileName;
	}

	public List<String> getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(List<String> fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String execute() throws Exception {

		System.out.println(username);
		for (int i = 0; i < file.size(); i++) {

			String root = ServletActionContext.getServletContext().getRealPath(
					"/upload");
			File desFile = new File(root, fileFileName.get(i));

			// 第一种方式开始
			FileUtils.copyFile(file.get(i), desFile);
			// end

			/*
			 * //第二种方式开始 InputStream is = new FileInputStream(file.get(i));
			 * OutputStream os = new FileOutputStream(desFile);
			 * 
			 * int len = 0; byte[] buff = new byte[512];
			 * 
			 * while ((len = is.read(buff)) > 0) { os.write(buff, 0, len); }
			 * os.flush(); os.close(); is.close(); //end
			 */
		}

		return SUCCESS;
	}
}
