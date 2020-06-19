package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date date1 = new Date(120, 5, 19);
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(format1.format(date1));
		
		Date date2 = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(format2.format(date2));
		
		Date systeme = new Date();
		System.out.println(format2.format(systeme));

	}

}
