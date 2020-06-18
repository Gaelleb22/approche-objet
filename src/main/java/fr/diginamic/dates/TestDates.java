package fr.diginamic.dates;

import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date hier = new Date(2020, 06, 16);
		System.out.println(hier.getDate()+"/"+hier.getMonth()+"/"+hier.getYear());
		
		Date aujourdhui = new Date(2020, 06, 17, 23, 30, 59);
		System.out.println(aujourdhui.getDate()+"/"+aujourdhui.getMonth()+"/"+aujourdhui.getYear()+" "+aujourdhui.getHours()+":"+aujourdhui.getMinutes()+":"+aujourdhui.getSeconds());
		
		Date systeme = new Date();
		System.out.println(systeme.getDate()+"/"+systeme.getMonth()+"/"+systeme.getYear()+" "+systeme.getHours()+":"+systeme.getMinutes()+":"+systeme.getSeconds());
		
		System.out.println(systeme.toLocaleString());

	}

}
