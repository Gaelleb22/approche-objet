package fr.diginamic.sets;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		Double[] set = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
		
		Set<Double> setDouble = new HashSet<Double>();
		setDouble.addAll(Arrays.asList(set));
		System.out.println(setDouble);
		
		double max = Collections.max(setDouble);
		System.out.println(max);
		
		double min = Collections.min(setDouble);
		System.out.println(min);
		setDouble.remove(min);
		System.out.println(setDouble);

	}

}
