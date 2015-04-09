package com.pas.convert;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.pas.domain.Point;

public class PointConvertStrutsTypeConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		//×ª»»Îª µã
		Point p=new Point();
		String[] str=(String[])arg1;
		String[] paravalues=str[0].split(",");
		
		int x=Integer.parseInt(paravalues[0]);
		int y=Integer.parseInt(paravalues[1]);
		p.setX(x);
		p.setY(y);
		return p;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		Point p=(Point)arg1;
		int x=p.getX();
		int y=p.getY();
		String res="[x="+x+", y="+y+"]";
		return res;
	}

}
