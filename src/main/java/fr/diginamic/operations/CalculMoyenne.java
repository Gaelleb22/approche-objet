package fr.diginamic.operations;

public class CalculMoyenne {
	private double[] array= new double[0];

	public CalculMoyenne() {
	}
	
	public double[] getArray() {
		return array;
	}

	public void setArray(double[] nvArray) {
		this.array = nvArray;
	}

	public double[] ajout(double a) {
		double[] temp = new double[array.length+1];
		for (int i=0; i<array.length; i++) {
			temp[i] =array[i];
		}
		temp[temp.length-1] = a;
		array = temp;
		return array;
	}
	
	public double calcul() {
		double somme = 0;
		for(int i=0; i<array.length; i++) {
			somme += array[i];
		}
		return somme/array.length;
	}

}
