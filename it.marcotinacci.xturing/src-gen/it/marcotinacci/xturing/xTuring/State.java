/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.marcotinacci.xturing.xTuring.State#isBeginState <em>Begin State</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.State#getName <em>Name</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.State#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Begin State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Begin State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Begin State</em>' attribute.
   * @see #setBeginState(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getState_BeginState()
   * @model
   * @generated
   */
  boolean isBeginState();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.State#isBeginState <em>Begin State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Begin State</em>' attribute.
   * @see #isBeginState()
   * @generated
   */
  void setBeginState(boolean value);

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
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
   * The list contents are of type {@link it.marcotinacci.xturing.xTuring.Transaction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transactions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transactions</em>' containment reference list.
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getState_Transactions()
   * @model containment="true"
   * @generated
   */
  EList<Transaction> getTransactions();

} // State
