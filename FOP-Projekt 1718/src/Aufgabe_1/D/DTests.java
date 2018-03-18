/**
 * 
 */
package Aufgabe_1.D;

import data.ListItem;
import model.GeometricModelElement;
import model.round.CircleElement;
import org.junit.*;

import java.util.Comparator;

/**
 * @author Malin
 *
 */
public class DTests {
	/**
	 * switchElements: Die Methode vertauscht die Elemente an den zwei angegebenen Indizes. Falls f�r arr eine null-Referenz übergeben
	 * wird oder einer der Indizes nicht in dem Array liegt, soll eine IllegalArgumentException geworfen werden.
	 * Implementieren Sie diese Methode in konstanter Laufzeit.
	 * 
	 * @param arr
	 *            The array to work on
	 * @param ind1
	 *            Index of the first element
	 * @param ind2
	 *            Index of the second element
	 * @throws IllegalArgumentException
	 *             if arr is null or Indices is invalid.
	 */
	
	/**
	 * insertLast: Die Methode fügt die Liste elem an das Ende von lst an und gibt das Ergebnis zurück. Implementieren Sie diese
	 * Methode iterativ.
	 * 
	 * @param lst
	 *            the list to work on
	 * @param elem
	 *            the list element(s) to add to the end
	 * @return the list lst with elem added to the end
	 */
	
	/**
	 * removeSecLastElement: Die Methode löscht das zweitgrößte Element aus der Eingabeliste. Ist dieses Element nicht enthalten, so ist es
	 * bereits als gelöscht anzusehen. Falls für cmp eine null-Referenz übergeben wird, soll eine
	 * IllegalArgumentException geworfen werden. Implementieren Sie diese Methode iterativ.
	 *
	 * @param lst
	 *            the list to work on
	 * @param cmp
	 *            the comparator to detect the second max element
	 * @return the list lst without the second biggest element
	 * @throws IllegalArgumentException
	 */
	
	/**
	 * invertTriples: Für i = 1,2,3,... vertauscht die Methode die Schl�sselwerte an den Positionen 3i - 2 und 3i, d.h.: Das Element,
	 * das vorher an Position 3i - 2 war, ist hinterher an Position 3i und umgekehrt. Ist kein komplettes Triple mehr
	 * übrig, auf dem die Operation ausgeführt werden kann, so bricht die Methode ab und ist fertig. Falls eine
	 * null-Referenz übergeben wird, soll eine IllegalArgumentException geworfen werden. Implementieren Sie diese
	 * Methode rekursiv.
	 * 
	 * @param lst
	 *            the list to work on
	 * @return the list where all complete triples are inverted
	 */
	
	/**
	 * divideAlternatinglyIntoLists: Die Methode erhält eine Liste und gibt eine Liste von genau zwei Listen zurück, wobei alle Elemente an einer
	 * ungeraden Position der Eingabeliste in der ersten Liste zu finden sind, alle Elemente der Eingabeliste mit einer
	 * geraden Position in der zweiten Liste. Hierfür dürfen neue Listenelemente der Klasse ListItem<ListItem<T>>
	 * erstellt werden. Implementieren Sie diese Methode rekursiv.
	 *
	 * @param lst
	 *            the list to split
	 * @return a list of two lists where all list elements of the input list are located
	 */
	
	/**
	 * listIntoArray: Die Methode erhält eine Liste und wandelt diese in ein Array um, d.h. genau alle Schlüsselwerte der Liste sind in
	 * dem Array, welches zurückgegeben wird, in ursprünglicher Reihenfolge enthalten. Sind keine Schlüsselwerte in der
	 * Liste enthalten, so soll ein Array der Länge null zurückgegeben werden. Implementieren Sie diese Methode
	 * iterativ.
	 *
	 * 
	 * @param lst
	 *            the list to convert
	 * @return a array with all key values of the given list
	 */

}
