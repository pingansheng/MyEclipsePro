package com.pas.convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.pas.domain.Point;

public class PointsConvertStrutsTypeConverter extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		//转换为 点集合
		List<Point>  list=new ArrayList<Point>();
		
		for (String value : arg1) {
			Point p=new Point();
			String[] paravalues=value.split(",");
			
			int x=Integer.parseInt(paravalues[0]);
			int y=Integer.parseInt(paravalues[1]);
			p.setX(x);
			p.setY(y);
			list.add(p);
		}
		return list;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		List<Point> list=(List<Point>)arg1;
		StringBuffer sb=new StringBuffer();
		for (Point point : list) {
			sb.append("[x=").append(point.getX()).append(", y=").append(point.getY()).append("]");
		}
		return sb.toString();
	}

}
