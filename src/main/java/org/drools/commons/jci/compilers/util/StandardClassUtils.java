package org.drools.commons.jci.compilers.util;

/**
 * Makes strong assumptions about Java class and package names to avoid work
 * during compilation and improve performance. It will basically assume that no
 * upper case is used for package names and that all class names start with an
 * upper letter.
 * 
 * @author lgomes
 * 
 */
public class StandardClassUtils {

	public static boolean isPackage(String name) {
		return isLowerCase(name);
	}

	private static boolean isLowerCase(String name) {

		for (int i = 0; i < name.length(); i++) {

			char charAt = name.charAt(i);
			
			// Takes into account only letters. They all need to be lower-case.
			// Don't say anything about punctuation, digits and other symbols.
			if (Character.isLetter(charAt) && !Character.isLowerCase(charAt)) {
				return false;
			}
		}

		return true;
	}

}
