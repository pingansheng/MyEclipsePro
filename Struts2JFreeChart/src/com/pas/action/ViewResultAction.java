package com.pas.action;

import java.awt.Font;
import java.util.List;
import java.util.Map;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ViewResultAction extends ActionSupport {

	//ͼ�����Ʊ���Ϊchart Ӳ����
	private JFreeChart chart;
	private List<String> study;
	
	public List<String> getStudy() {
		return study;
	}

	public void setStudy(List<String> study) {
		this.study = study;
	}
	
	//ͼ��get���� ������
	public JFreeChart getChart() {
		// ����������ʽ
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
		// ���ñ�������
		standardChartTheme.setExtraLargeFont(new Font("����", Font.BOLD, 20));
		// ����ͼ��������
		standardChartTheme.setRegularFont(new Font("����", Font.PLAIN, 15));
		// �������������
		standardChartTheme.setLargeFont(new Font("����", Font.PLAIN, 15));
		// Ӧ��������ʽ
		ChartFactory.setChartTheme(standardChartTheme);
		JFreeChart chart = ChartFactory.createBarChart3D("ѧ��ͳ�ƽ��","��Ŀ","����",getDataSet(),
				PlotOrientation.VERTICAL,false,false,false);
		return chart;
	}
	
	@Override
	public String execute()throws Exception
	{
		
		return SUCCESS;
	}
	
	//��������
	private void increaseRes(List<String>list)
	{
		Map servletContext=ActionContext.getContext().getApplication();
		for (String item : list) {
			if(servletContext.containsKey(item))
			{
				//��
				int value=(Integer)servletContext.get(item);
				value++;
				servletContext.put(item, value);
			}
			else
			{
				//��һ��
				servletContext.put(item, 1);
			}
		}
	}
	
	//�õ����ݼ�
	private CategoryDataset getDataSet()
	{
		DefaultCategoryDataset ds=new DefaultCategoryDataset();
		
		this.increaseRes(this.getStudy());
		
		Map map=ActionContext.getContext().getApplication();
		
		ds.setValue((Integer)map.get("computer"), "", "�����");
		
		ds.setValue((Integer)map.get("math"), "", "��ѧ");

		ds.setValue((Integer)map.get("english"), "", "Ӣ��");

		ds.setValue((Integer)map.get("history"), "", "��ʷ");
		
		return ds;

	}

}
