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
		ChartFrame cf = new ChartFrame("��˾��֯�ṹͼ", pieChartTest());
		cf.pack();
		cf.setVisible(true);
		createImage();
	}

	// �������봦��
	private static StandardChartTheme chartEncoding() {
		// ����������ʽ
		StandardChartTheme standardChartTheme = new StandardChartTheme("CN");
		// ���ñ�������
		standardChartTheme.setExtraLargeFont(new Font("����", Font.BOLD, 20));
		// ����ͼ��������
		standardChartTheme.setRegularFont(new Font("����", Font.PLAIN, 15));
		// �������������
		standardChartTheme.setLargeFont(new Font("����", Font.PLAIN, 15));
		// Ӧ��������ʽ
		return standardChartTheme;
	}

	// ������ͼ����
	private static DefaultPieDataset createPieDataset() {
		DefaultPieDataset dpd = new DefaultPieDataset();
		dpd.setValue("������Ա", 25);
		dpd.setValue("�г���Ա", 25);
		dpd.setValue("������Ա", 45);
		dpd.setValue("������Ա", 10);
		return dpd;
	}

	// ������״ͼ����
	private static CategoryDataset createCategoryDataset() {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		dataset.setValue(10, "a", "������Ա");
		dataset.setValue(20, "b", "�г���Ա");
		dataset.setValue(40, "c", "������Ա");
		dataset.setValue(15, "d", "������Ա");
		return dataset;
	}

	// ��ͼ����
	public static JFreeChart pieChartTest() {

		ChartFactory.setChartTheme(chartEncoding());

		JFreeChart chart = ChartFactory.createPieChart3D("��˾��֯�ṹͼ",
				createPieDataset(), true, true, true);
		return chart;
	}

	//��״ͼ
	private static JFreeChart barChartTest() {
		ChartFactory.setChartTheme(chartEncoding());

		JFreeChart chart = ChartFactory.createBarChart("����","����","ֵ",createCategoryDataset(),PlotOrientation.VERTICAL,false,true,false);

		return chart;
	}
	
	private static void createImage()throws Exception
	{
		JFreeChart chart=barChartTest();
		OutputStream os=new FileOutputStream("bar.jpg");
		ChartUtilities.writeChartAsJPEG(os, chart, 500, 500);
	}
}
