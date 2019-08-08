package com.zsx.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		
		Date date = DateUtil.getDateByInitMonth(new Date());
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Date date = DateUtil.getDateByFullMonth(new Date());
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 System.out.println(df.format(date));
	}

}
