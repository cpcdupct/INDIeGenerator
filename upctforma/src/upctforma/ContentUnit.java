/**
 */
package upctforma;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctforma.ContentUnit#getSections <em>Sections</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getAuthor <em>Author</em>}</li>
 *   <li>{@link upctforma.ContentUnit#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see upctforma.UpctformaPackage#getContentUnit()
 * @model
 * @generated
 */
public interface ContentUnit extends NameElement {
	/**
	 * Returns the value of the '<em><b>Sections</b></em>' containment reference list.
	 * The list contents are of type {@link upctforma.Section}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sections</em>' containment reference list.
	 * @see upctforma.UpctformaPackage#getContentUnit_Sections()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Section> getSections();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see upctforma.UpctformaPackage#getContentUnit_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link upctforma.ContentUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see upctforma.ContentUnitType
	 * @see #setType(ContentUnitType)
	 * @see upctforma.UpctformaPackage#getContentUnit_Type()
	 * @model
	 * @generated
	 */
	ContentUnitType getType();

	/**
	 * Sets the value of the '{@link upctforma.ContentUnit#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see upctforma.ContentUnitType
	 * @see #getType()
	 * @generated
	 */
	void setType(ContentUnitType value);

} // ContentUnit
