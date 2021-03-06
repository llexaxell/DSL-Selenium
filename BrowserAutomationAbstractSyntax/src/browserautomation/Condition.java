/**
 */
package browserautomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link browserautomation.Condition#isExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Condition)
	 * @see browserautomation.BrowserautomationPackage#getCondition_Condition()
	 * @model
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link browserautomation.Condition#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(boolean)
	 * @see browserautomation.BrowserautomationPackage#getCondition_Expression()
	 * @model
	 * @generated
	 */
	boolean isExpression();

	/**
	 * Sets the value of the '{@link browserautomation.Condition#isExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #isExpression()
	 * @generated
	 */
	void setExpression(boolean value);

} // Condition
