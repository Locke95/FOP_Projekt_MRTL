package model.angled;

import model.GeometricModelElement;

/**
 * Basic class of the angled picture elements
 * 
 * @author Nora Wester
 */
public abstract class AngledGeometricElement extends GeometricModelElement {

	@Override
	protected void calculateMove(double xDirection, double yDirection) {

	}

	@Override
	protected void calculateRotation(double angle) {

	}

	@Override
	protected void calculateScale(double factor) {

	}

	@Override
	protected void calculateMirroring(String axis) {

	}
	// calculateMirroring(String axis)
	/**
	 * Zudem soll die Methode calculateMirroring(String axis) in der Klasse
	 * AngledGeometricElement implementiert werden. Durch den Mittelpunkt der
	 * Bounding Box des Elements kann eine (imagin�re) horizontale und eine
	 * (imagin�re) vertikale Linie gezogen werden. Die (imagin�re) horizontale
	 * Linie wird im Weiteren als x-Achse, die (imagin�re) vertikale Linie als
	 * y-Achse bezeichnet. In der Methode calculateMirroring(String axis) sollen nun
	 * die Punkte des Elements so manipuliert werden, dass das Element, an der x-
	 * oder der y- Achse gespiegelt wird. Das bedeutet, dass die Punkte, die auf der
	 * einen Seite der Achse liegen, im gleichen Abstand zur Achse, auf die andere
	 * Seite der Achse verlagert werden sollen. Mit axis wird angegeben, ob an der
	 * x- oder der y-Achse gespiegelt werden soll. Die entsprechenden Werte f�r axis
	 * sind in der Constants-Klasse zu finden (x steht f�r die x-Achse und y steht
	 * f�r die y-Achse).
	 */
}