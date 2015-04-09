package com.pas.convert;

import java.util.Map;

import com.pas.domain.Point;

import ognl.DefaultTypeConverter;

public class PointConvert extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		if(Point.class==toType)
		{
			//ת��Ϊ ��
			Point p=new Point();
			String[] str=(String[])value;
			String[] paravalues=str[0].split(",");
			
			int x=Integer.parseInt(paravalues[0]);
			int y=Integer.parseInt(paravalues[1]);
			System.out.println(x);
			p.setX(x);
			p.setY(y);
			return p;
		}
		//��������ͻ���ת��
		if(String.class==toType)
		{
			Point p=(Point)value;
			System.out.println("asd");
			int x=p.getX();
			int y=p.getY();
			String res="[x="+x+", y="+y+"]";
			return res;
		}
		return super.convertValue(context, value, toType);
	}

}
