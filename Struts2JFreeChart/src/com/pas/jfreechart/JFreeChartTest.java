package com.pas.jfreechart;

import java.awt.Font;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class JFreeChartTest {

	public static void main(String[] args) throws Exception{
		ChartFrame cf = new ChartFrame("公司组织结构图", pieChartTest());
		cf.pack();
		cf.setVisible(true);
		createImage();
	}

	// 中文乱码处理
	private static StandardChartTheme chartEncoding() {
		// 创建主题样式
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
		// 设置标题字体
		standardChartTheme.setExtraLargeFont(new Font("隶书", Font.BOLD, 20));
		// 设置图例的字体
		standardChartTheme.setRegularFont(new Font("宋书", Font.PLAIN, 15));
		// 设置轴向的字体
		standardChartTheme.setLargeFont(new Font("宋书", Font.PLAIN, 15));
		// 应用主题样式
		return standardChartTheme;
	}

	// 创建饼图数据
	private static DefaultPieDataset createPieDataset() {
		DefaultPieDataset dpd = new DefaultPieDataset();
		dpd.setValue("管理人员", 25);
		dpd.setValue("市场人员", 25);
		dpd.setValue("开发人员", 45);
		dpd.setValue("其他人员", 10);
		return dpd;
	}

	// 创建柱状图数据
	private static CategoryDataset createCategoryDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(10, "a", "管理人员");
		dataset.setValue(20, "b", "市场人员");
		dataset.setValue(40, "c", "开发人员");
		dataset.setValue(15, "d", "其他人员");
		return dataset;
	}

	// 饼图测试
	public static JFreeChart pieChartTest() {

		ChartFactory.setChartTheme(chartEncoding());

		JFreeChart chart = ChartFactory.createPieChart3D("公司组织结构图",
				createPieDataset(), true, true, true);
		return chart;
	}

	//柱状图
	private static JFreeChart barChartTest() {
		ChartFactory.setChartTheme(chartEncoding());

		JFreeChart chart = ChartFactory.createBarChart("标题","分类","值",createCategoryDataset(),PlotOrientation.VERTICAL,false,true,false);

		return chart;
	}
	
	private static void createImage()throws Exception
	{
		JFreeChart chart=barChartTest();
		OutputStream os=new FileOutputStream("bar.jpg");
		ChartUtilities.writeChartAsJPEG(os, chart, 500, 500);
	}
}
