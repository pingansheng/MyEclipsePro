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

	//图表名称必须为chart 硬编码
	private JFreeChart chart;
	private List<String> study;
	
	public List<String> getStudy() {
		return study;
	}

	public void setStudy(List<String> study) {
		this.study = study;
	}
	
	//图表get方法 必须有
	public JFreeChart getChart() {
		// 创建主题样式
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
		// 设置标题字体
		standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
		// 设置图例的字体
		standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
		// 设置轴向的字体
		standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
		// 应用主题样式
		ChartFactory.setChartTheme(standardChartTheme);
		JFreeChart chart = ChartFactory.createBarChart3D("学科统计结果","科目","数量",getDataSet(),
				PlotOrientation.VERTICAL,false,false,false);
		return chart;
	}
	
	@Override
	public String execute()throws Exception
	{
		
		return SUCCESS;
	}
	
	//更新数据
	private void increaseRes(List<String>list)
	{
		Map servletContext=ActionContext.getContext().getApplication();
		for (String item : list) {
			if(servletContext.containsKey(item))
			{
				//有
				int value=(Integer)servletContext.get(item);
				value++;
				servletContext.put(item, value);
			}
			else
			{
				//第一次
				servletContext.put(item, 1);
			}
		}
	}
	
	//得到数据集
	private CategoryDataset getDataSet()
	{
		DefaultCategoryDataset ds=new DefaultCategoryDataset();
		
		this.increaseRes(this.getStudy());
		
		Map map=ActionContext.getContext().getApplication();
		
		ds.setValue((Integer)map.get("computer"), "", "计算机");
		
		ds.setValue((Integer)map.get("math"), "", "数学");

		ds.setValue((Integer)map.get("english"), "", "英语");

		ds.setValue((Integer)map.get("history"), "", "历史");
		
		return ds;

	}

}
