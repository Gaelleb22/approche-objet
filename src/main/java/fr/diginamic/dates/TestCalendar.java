package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2016, 4, 19, 23, 30, 59);
		Date date1 = cal1.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		
		Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format2.format(date2));

	}

}
