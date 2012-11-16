/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Read Write Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol#isEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getReadWriteSymbol()
 * @model
 * @generated
 */
public interface ReadWriteSymbol extends EObject
{
  /**
   * Returns the value of the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbol</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbol</em>' reference.
   * @see #setSymbol(Symbol)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getReadWriteSymbol_Symbol()
   * @model
   * @generated
   */
  Symbol getSymbol();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol#getSymbol <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Symbol</em>' reference.
   * @see #getSymbol()
   * @generated
   */
  void setSymbol(Symbol value);

  /**
   * Returns the value of the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty</em>' attribute.
   * @see #setEmpty(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getReadWriteSymbol_Empty()
   * @model
   * @generated
   */
  boolean isEmpty();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol#isEmpty <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty</em>' attribute.
   * @see #isEmpty()
   * @generated
   */
  void setEmpty(boolean value);

} // ReadWriteSymbol
