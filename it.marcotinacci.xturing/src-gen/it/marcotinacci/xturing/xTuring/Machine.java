/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Machine#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Machine#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getMachine()
 * @model
 * @generated
 */
public interface Machine extends EObject
{
  /**
   * Returns the value of the '<em><b>Symbols</b></em>' containment reference list.
   * The list contents are of type {@link it.marcotinacci.xturing.xTuring.Symbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Symbols</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symbols</em>' containment reference list.
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getMachine_Symbols()
   * @model containment="true"
   * @generated
   */
  EList<Symbol> getSymbols();

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link it.marcotinacci.xturing.xTuring.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getMachine_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Machine
