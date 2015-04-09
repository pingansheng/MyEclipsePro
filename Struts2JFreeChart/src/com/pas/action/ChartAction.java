package com.pas.action;

import org.apache.struts2.ServletActionContext;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.servlet.ServletUtilities;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.pas.jfreechart.JFreeChartTest;

public class ChartAction extends ActionSupport {

	public String execute() throws Exception
	{
		JFreeChart chart = JFreeChartTest.pieChartTest();
		String path=ServletUtilities.saveChartAsPNG(chart, 600, 450, ServletActionContext.getRequest().getSession());
		ServletActionContext.getRequest().setAttribute("path", path);
		return SUCCESS;
	}
}
