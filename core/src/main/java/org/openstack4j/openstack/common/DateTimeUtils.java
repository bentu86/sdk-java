package org.openstack4j.openstack.common;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtils {
	/**
	 * DateTime format YYYY-MM-dd'T'HH:mm'Z'
	 */
	public static final String FORMAT_YMDTHMZ = "YYYY-MM-dd'T'HH:mm'Z'";
	
	/**
	 * DateTime format YYYY-MM-dd'T'HH:mm:ss'Z'
	 */
	public static final String FORMAT_YMDTHMSZ = "YYYY-MM-dd'T'HH:mm:ss'Z'";
	
	/**
	 * format date
	 * @param date
	 * @param format
	 * @return
	 */
	public static String format(Date date, String format) {
		return new SimpleDateFormat(format).format(date);
	}
}
