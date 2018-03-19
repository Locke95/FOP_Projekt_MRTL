package model.angled;

import model.GeometricModelElement;
import model.Point;

/**
 * Basic class of the angled picture elements
 * 
 * @author Nora Wester
 */
public abstract class AngledGeometricElement extends GeometricModelElement 
{

	@Override
	protected void calculateMove(double xDirection, double yDirection) 
	{
		Point[] points = getPoints();
		for(int i = 0; i < points.length; i++)
		{
			points[i].setX(points[i].getX() + xDirection); 
			points[i].setY(points[i].getY() + yDirection);
		}
	}

	@Override
	protected void calculateRotation(double angle) 
	{

	}

	@Override
	protected void calculateScale(double factor) 
	{

	}

	@Override
	protected void calculateMirroring(String axis) 
	{

	}
}