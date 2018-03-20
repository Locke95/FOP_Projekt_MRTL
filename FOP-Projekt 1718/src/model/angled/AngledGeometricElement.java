package model.angled;

import static org.junit.Assume.assumeNoException;

import model.GeometricModelElement;
import model.Point;
import util.Constants;

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
		int numberPoints = this.getNumberOfPoints();
		Point[] points = this.getPoints();
		double midX = this.middle().getX();
		double midY = this.middle().getY();
		if (axis.equals(Constants.X_AXIS)) {
			for (int i = 0; i < numberPoints; i++) {
				points[i].setX(points[i].getX());
				points[i].setY(2 * midY - points[i].getY());
			}
		}
		if (axis.equals(Constants.Y_AXIS)) {
			for (int i = 0; i < numberPoints; i++) {
				points[i].setY(points[i].getY());
				points[i].setX(2 * midX - points[i].getX());
			}
		}
		else return;
	}

	private Point middle() {
		double maxY = this.getPoint(0).getY();
		double minY = this.getPoint(0).getY();
		double maxX = this.getPoint(0).getX();
		double minX = this.getPoint(0).getX();
		int numberPoints = this.getNumberOfPoints();
		Point[] points = this.getPoints();
		for (int i = 0; i < numberPoints; i++) {
			if (points[i].getX() > maxX) {
				maxX = points[i].getX();
			}
			if (points[i].getX() < minX) {
				minX = points[i].getX();
			}
			if (points[i].getY() > maxY) {
				maxY = points[i].getY();
			}
			if (points[i].getY() < minY) {
				minY = points[i].getY();
			}
		}
		double midX = (minX + maxX) / 2;
		double midY = (minY + maxY) / 2;
		return new Point(midX, midY);
	}
	// calculateMirroring(String axis)
	/**
	 * Zudem soll die Methode calculateMirroring(String axis) in der Klasse
	 * AngledGeometricElement implementiert werden. Durch den Mittelpunkt der
	 * Bounding Box des Elements kann eine (imaginäre) horizontale und eine
	 * (imaginäre) vertikale Linie gezogen werden. Die (imaginäre) horizontale Linie
	 * wird im Weiteren als x-Achse, die (imaginäre) vertikale Linie als y-Achse
	 * bezeichnet. In der Methode calculateMirroring(String axis) sollen nun die
	 * Punkte des Elements so manipuliert werden, dass das Element, an der x- oder
	 * der y- Achse gespiegelt wird. Das bedeutet, dass die Punkte, die auf der
	 * einen Seite der Achse liegen, im gleichen Abstand zur Achse, auf die andere
	 * Seite der Achse verlagert werden sollen. Mit axis wird angegeben, ob an der
	 * x- oder der y-Achse gespiegelt werden soll. Die entsprechenden Werte für axis
	 * sind in der Constants-Klasse zu finden (x steht für die x-Achse und y steht
	 * für die y-Achse).
	 */
}