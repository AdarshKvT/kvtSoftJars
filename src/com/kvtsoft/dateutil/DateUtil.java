package com.kvtsoft.dateutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * @author		Adarsh Kavtiyal
 * @version 	1.0
 * @since		2020
 * 
 * The date formatter
 * <p>
 * dd: day in month (number)
 * <p>
 * MM: month in year (number)
 * <p>
 * yyyy: year
 * 
 * See this link for details:
 * 
 * @see https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html 
 */

public class DateUtil {

	private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	/*
	 * 
	 * Read a date string and parse/convert to a date
	 * 
	 * <p>Use {@link #parseDate(String datestr)} to parse a string date.
	 * 
	 * @param Parameter accept date as a String
	 * 
	 * @return Return returns the parsed Date Object
	 * 
	 * @exception Exception throws ParseException
	 * 
	 */
	public static Date parseDate(String datestr) throws ParseException {

		Date theDate = formatter.parse(datestr);

		return theDate;
	}

	/*
	 * 
	 * Read a date and format/convert to a string
	 * 
	 * <p>Use {@link #formateDate(Date theDate)} to format a date.
	 *
	 * @param Parameter accept date as a Date object
	 * 
	 * @return Return returns the parsed Date Object
	 * 
	 */
	public static String formateDate(Date theDate) {
		String result = null;

		if (theDate != null) {
			result = formatter.format(theDate);
		}

		return result;
	}
}
