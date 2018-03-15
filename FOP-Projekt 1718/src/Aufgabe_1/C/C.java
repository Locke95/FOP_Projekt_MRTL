package Aufgabe_1.C;

import java.util.Comparator;

import data.ListItem;

/**
 * Tasks of subproject 1.C
 *
 * @author Lukas Roehr
 * @author David Koehler
 * @param <T>
 *            Generic Type
 */
public class C<T> {
	/**
	 * Die Methode kombiniert zwei nach dem übergebenem Comparator aufsteigend
	 * sortierte Arrays zu einem Array, das wiederum gemäß des Comparators
	 * aufsteigend sortiert ist, und gibt dieses zurück. Wird für cmp eine
	 * null-Referenz übergeben, so ist eine IllegalArgumentException zu werfen. Ist
	 * eines der beiden oder gar beide Arrays nicht aufsteigend gemäß cmp
	 * sortiert, so wird ebenfalls eine IllegalArgumentException geworfen. Wird für
	 * beide Arrays eine null-Referenz übergeben, so soll null zurückgegeben
	 * werden. Implementieren Sie diese Methode rekursiv.
	 * 
	 * @param arr1
	 *            the first array
	 * @param arr2
	 *            the second array to combine
	 * @param cmp
	 *            the comparator
	 * @return a combined Array with all elements of the two given arrays.
	 */
	public T[] combine(T[] arr1, T[] arr2, Comparator<T> cmp, Class<?> type) throws IllegalArgumentException {
		/**
		 * IllegalArgumentException: cmp null, arrays nicht nach cmp sortiert, type
		 * null, Initialisierfehler arrays null-Referenz bei arrays: null zur�ckgeben
		 */
		if (cmp.equals(null) || type.equals(null)) {
			throw new IllegalArgumentException(
					"Either the comparator is null, the type is null, the arrays aren't sorted according to the comparator or there was an error with initialization of the arrays");
		}

		return null; // bei intialisierungsfehler arrays
	}

	/**
	 * Die Methode fügt die komplette Liste head an den Anfang der Liste lst an und
	 * gibt den neuen Listenkopf zurück. Falls für head eine null-Referenz
	 * übergeben wird, soll eine IllegalArgumentException geworfen werden, es sei
	 * denn, lst ist ebenfalls null. Hierfür darf ein neues Listenelement erstellt
	 * werden. Implementieren Sie diese Methode rekursiv.
	 * 
	 * @param lst
	 *            the list where to add the new head onto
	 * @param head
	 *            the new head (may be longer than one element)
	 * @return the list with the new head in front
	 */
	public ListItem<T> insertHead(ListItem<T> lst, ListItem<T> head) {
		// TODO Your task
		return null;
	}

	/**
	 * Die Methode entfernt das letzte Listenelement aus der Liste lst und gibt die
	 * resultierende Liste zurück. Wenn für lst eine null-Referenz übergeben
	 * wird, ist das letzte Element als bereits gelöscht anzusehen. Implementieren
	 * Sie diese Methode iterativ.
	 * 
	 * @param lst
	 *            the list to work on
	 * @return the list without the last element
	 */
	public ListItem<T> removeLast(ListItem<T> lst) {
		// TODO Your task
		return null;
	}

	/**
	 * Die Methode invertiert die komplette Reihenfolge der Liste lst, d.h. das
	 * erste Element wird zum neuen letzten Element, das zweite zum neuen
	 * zweitletzten, usw. Implementieren Sie diese Methode iterativ.
	 * 
	 * @param lst
	 *            the list to work on
	 * @return the inverted list
	 */
	public ListItem<T> invert(ListItem<T> lst) {
		// TODO Your task
		return null;
	}

	/**
	 * Die Methode gibt eine Liste zurück, die an gerader Position alle Elemente
	 * aus lst1 und an ungerader Position alle Elemente aus lst2 enthält. Sollte
	 * die Länge der beiden Listen unterschiedlich sein, so ist der Rest der
	 * längeren Liste anzuhängen. Implementieren Sie diese Methode rekursiv.
	 * 
	 * @param lst1
	 *            the first list
	 * @param lst2
	 *            the second list to work with
	 * @return the combined list
	 */
	public ListItem<T> combineLists(ListItem<T> lst1, ListItem<T> lst2) {
		// TODO Your task
		return null;
	}

	/**
	 * Die Methode gibt eine Liste zurück, in welcher alle Elemente des
	 * Eingabearrays in der ursprünglichen Reihenfolge als Schlüsselwerte der
	 * Liste zu finden sind. Falls für arr eine null-Referenz übergeben wird, soll
	 * eine IllegalArgumentException geworfen werden. Falls das Array die Länge
	 * null hat, soll null zurückgegeben werden. Hierfür dürfen neue
	 * Listenelemente erstellt werden. Implementieren Sie diese Methode iterativ.
	 * 
	 * @param arr
	 *            the array to convert
	 * @return a list where the keys are the elements of the given array
	 * @throws IllegalArgumentException
	 */
	public ListItem<T> arrayIntoList(T[] arr) throws IllegalArgumentException {
		// TODO Your task
		return null;
	}
}