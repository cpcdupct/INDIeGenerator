/**
 */
package upctformaevalua;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link upctformaevalua.EvaluationUnit#getQuestions <em>Questions</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getNumberquestions <em>Numberquestions</em>}</li>
 *   <li>{@link upctformaevalua.EvaluationUnit#getLanguage <em>Language</em>}</li>
 * </ul>
 *
 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit()
 * @model
 * @generated
 */
public interface EvaluationUnit extends NameElement, EObject {
	/**
	 * Returns the value of the '<em><b>Questions</b></em>' containment reference list.
	 * The list contents are of type {@link upctformaevalua.Question}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Questions</em>' containment reference list.
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Questions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestions();

	/**
	 * Returns the value of the '<em><b>Numberquestions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numberquestions</em>' attribute.
	 * @see #setNumberquestions(int)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Numberquestions()
	 * @model
	 * @generated
	 */
	int getNumberquestions();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getNumberquestions <em>Numberquestions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numberquestions</em>' attribute.
	 * @see #getNumberquestions()
	 * @generated
	 */
	void setNumberquestions(int value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The literals are from the enumeration {@link upctformaevalua.EvaluationLanguageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see upctformaevalua.EvaluationLanguageType
	 * @see #setLanguage(EvaluationLanguageType)
	 * @see upctformaevalua.UpctformaevaluaPackage#getEvaluationUnit_Language()
	 * @model
	 * @generated
	 */
	EvaluationLanguageType getLanguage();

	/**
	 * Sets the value of the '{@link upctformaevalua.EvaluationUnit#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see upctformaevalua.EvaluationLanguageType
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(EvaluationLanguageType value);

} // EvaluationUnit
