/**
 */
package browserautomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link browserautomation.LoopCollection#getCollectionLoop <em>Collection Loop</em>}</li>
 *   <li>{@link browserautomation.LoopCollection#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see browserautomation.BrowserautomationPackage#getLoopCollection()
 * @model
 * @generated
 */
public interface LoopCollection extends Loop {
	/**
	 * Returns the value of the '<em><b>Collection Loop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Loop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Loop</em>' containment reference.
	 * @see #setCollectionLoop(Collection)
	 * @see browserautomation.BrowserautomationPackage#getLoopCollection_CollectionLoop()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Collection getCollectionLoop();

	/**
	 * Sets the value of the '{@link browserautomation.LoopCollection#getCollectionLoop <em>Collection Loop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Loop</em>' containment reference.
	 * @see #getCollectionLoop()
	 * @generated
	 */
	void setCollectionLoop(Collection value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' reference.
	 * @see #setOperations(OperationSequence)
	 * @see browserautomation.BrowserautomationPackage#getLoopCollection_Operations()
	 * @model required="true"
	 * @generated
	 */
	OperationSequence getOperations();

	/**
	 * Sets the value of the '{@link browserautomation.LoopCollection#getOperations <em>Operations</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations</em>' reference.
	 * @see #getOperations()
	 * @generated
	 */
	void setOperations(OperationSequence value);

} // LoopCollection
