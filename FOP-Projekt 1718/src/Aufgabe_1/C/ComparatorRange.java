package Aufgabe_1.C;

import java.util.Comparator;

import model.Point;
import model.angled.AngledGeometricElement;

/**
 * Die Klasse implementiert einen java.util.Comparator, welcher den Vergleich anhang des Umfangs durchführt. Dabei ist
 * ein kleinerer Umfang als kleiner zu bewerten.
 */
public class ComparatorRange implements Comparator<AngledGeometricElement> {
	/**
	 * Implementieren Sie die Metode compare der Klasse ComparatorRange, welche einen java.util.Comparator
	 * implementiert. Die Methode führt den Vergleich anhand des Umfangs durch. Dabei ist ein kleinerer Umfang als
	 * kleiner zu bewerten.
	 */
	@Override
	public int compare(AngledGeometricElement elem1, AngledGeometricElement elem2) {
		return compare(elem1, elem2);
	}
	private double perimeter (AngledGeometricElement elem) {
		int perim = 0;
		int numberPoints = elem.getNumberOfPoints();
		Point[] points = elem.getPoints();
		for(int i = 0; ; i++) {
			
		}
		
	}
}