/**
 */
package TIM;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Progress Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see TIM.TIMPackage#getProgress_Enum()
 * @model
 * @generated
 */
public enum Progress_Enum implements Enumerator {
	/**
	 * The '<em><b>ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO(0, "ZERO", "ZERO"),

	/**
	 * The '<em><b>TWENTY FIVE PERCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWENTY_FIVE_PERCENT_VALUE
	 * @generated
	 * @ordered
	 */
	TWENTY_FIVE_PERCENT(1, "TWENTY_FIVE_PERCENT", "TWENTY_FIVE_PERCENT"),

	/**
	 * The '<em><b>FIFTY PERCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTY_PERCENT_VALUE
	 * @generated
	 * @ordered
	 */
	FIFTY_PERCENT(2, "FIFTY_PERCENT", "FIFTY_PERCENT"),

	/**
	 * The '<em><b>SEVENTY FIVE PERCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENTY_FIVE_PERCENT_VALUE
	 * @generated
	 * @ordered
	 */
	SEVENTY_FIVE_PERCENT(3, "SEVENTY_FIVE_PERCENT", "SEVENTY_FIVE_PERCENT"),

	/**
	 * The '<em><b>HUNDRED PERCENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUNDRED_PERCENT_VALUE
	 * @generated
	 * @ordered
	 */
	HUNDRED_PERCENT(4, "HUNDRED_PERCENT", "HUNDRED_PERCENT"),

	/**
	 * The '<em><b>NO CHANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_CHANGE(5, "NO_CHANGE", "NO_CHANGE");

	/**
	 * The '<em><b>ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_VALUE = 0;

	/**
	 * The '<em><b>TWENTY FIVE PERCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWENTY_FIVE_PERCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TWENTY_FIVE_PERCENT_VALUE = 1;

	/**
	 * The '<em><b>FIFTY PERCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTY_PERCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIFTY_PERCENT_VALUE = 2;

	/**
	 * The '<em><b>SEVENTY FIVE PERCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENTY_FIVE_PERCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEVENTY_FIVE_PERCENT_VALUE = 3;

	/**
	 * The '<em><b>HUNDRED PERCENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUNDRED_PERCENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUNDRED_PERCENT_VALUE = 4;

	/**
	 * The '<em><b>NO CHANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_CHANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_CHANGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Progress Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Progress_Enum[] VALUES_ARRAY =
		new Progress_Enum[] {
			ZERO,
			TWENTY_FIVE_PERCENT,
			FIFTY_PERCENT,
			SEVENTY_FIVE_PERCENT,
			HUNDRED_PERCENT,
			NO_CHANGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Progress Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Progress_Enum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Progress Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Progress_Enum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Progress_Enum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Progress Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Progress_Enum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Progress_Enum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Progress Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Progress_Enum get(int value) {
		switch (value) {
			case ZERO_VALUE: return ZERO;
			case TWENTY_FIVE_PERCENT_VALUE: return TWENTY_FIVE_PERCENT;
			case FIFTY_PERCENT_VALUE: return FIFTY_PERCENT;
			case SEVENTY_FIVE_PERCENT_VALUE: return SEVENTY_FIVE_PERCENT;
			case HUNDRED_PERCENT_VALUE: return HUNDRED_PERCENT;
			case NO_CHANGE_VALUE: return NO_CHANGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Progress_Enum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Progress_Enum
