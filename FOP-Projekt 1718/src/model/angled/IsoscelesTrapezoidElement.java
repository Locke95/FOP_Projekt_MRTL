/**
 * 
 */
package model.angled;

import model.GeometricModelElement;
import util.Constants;

/**
 * @author Malin
 *
 */
public class IsoscelesTrapezoidElement extends TrapezoidElement {

	@Override
	protected String getJSONClassName() {
		return Constants.GEOMETRIC_ANGLED_ISOSCELES_TRAPEZOID_ELEMENT;
	}

	@Override
	public GeometricModelElement cloneElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
