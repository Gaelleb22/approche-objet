package fr.diginamic.dates;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		Calendar aujourdhui = Calendar.getInstance();
		aujourdhui.set(Calendar.MONTH, 6);
		System.out.println(aujourdhui.get(Calendar.DAY_OF_MONTH)+"/"+aujourdhui.get(Calendar.MONTH)+"/"+aujourdhui.get(Calendar.YEAR));
		
		Calendar jour1 = Calendar.getInstance();
		jour1.set(2020, 06, 17, 23, 30, 59);
		

		System.out.println(jour1.getTime());

	}

}
