package com.zsx.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public  static Date getDateByInitMonth(Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return  c.getTime();
		
	}
	public static Date getDateByFullMonth(Date src){
		Date date = getDateByInitMonth(src);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.MONTH, 1);
		c.add(Calendar.SECOND, -1);
		
		return  c.getTime();
	 }
}
