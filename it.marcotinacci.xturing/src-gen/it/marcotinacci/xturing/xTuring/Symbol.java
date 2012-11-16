/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Symbol#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getSymbol_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Symbol#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Symbol
