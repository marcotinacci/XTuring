/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#isReading <em>Reading</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#getRead <em>Read</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#isWriting <em>Writing</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#getWrite <em>Write</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#isMoving <em>Moving</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#getMove <em>Move</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#isNext <em>Next</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#getToState <em>To State</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.Transaction#isFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction()
 * @model
 * @generated
 */
public interface Transaction extends EObject
{
  /**
   * Returns the value of the '<em><b>Reading</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reading</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reading</em>' attribute.
   * @see #setReading(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Reading()
   * @model
   * @generated
   */
  boolean isReading();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#isReading <em>Reading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reading</em>' attribute.
   * @see #isReading()
   * @generated
   */
  void setReading(boolean value);

  /**
   * Returns the value of the '<em><b>Read</b></em>' containment reference list.
   * The list contents are of type {@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read</em>' containment reference list.
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Read()
   * @model containment="true"
   * @generated
   */
  EList<ReadWriteSymbol> getRead();

  /**
   * Returns the value of the '<em><b>Writing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Writing</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Writing</em>' attribute.
   * @see #setWriting(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Writing()
   * @model
   * @generated
   */
  boolean isWriting();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#isWriting <em>Writing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Writing</em>' attribute.
   * @see #isWriting()
   * @generated
   */
  void setWriting(boolean value);

  /**
   * Returns the value of the '<em><b>Write</b></em>' containment reference list.
   * The list contents are of type {@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Write</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Write</em>' containment reference list.
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Write()
   * @model containment="true"
   * @generated
   */
  EList<ReadWriteSymbol> getWrite();

  /**
   * Returns the value of the '<em><b>Moving</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moving</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moving</em>' attribute.
   * @see #setMoving(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Moving()
   * @model
   * @generated
   */
  boolean isMoving();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#isMoving <em>Moving</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moving</em>' attribute.
   * @see #isMoving()
   * @generated
   */
  void setMoving(boolean value);

  /**
   * Returns the value of the '<em><b>Move</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Move</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Move</em>' attribute.
   * @see #setMove(String)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Move()
   * @model
   * @generated
   */
  String getMove();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#getMove <em>Move</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Move</em>' attribute.
   * @see #getMove()
   * @generated
   */
  void setMove(String value);

  /**
   * Returns the value of the '<em><b>Next</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Next</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Next</em>' attribute.
   * @see #setNext(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Next()
   * @model
   * @generated
   */
  boolean isNext();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#isNext <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Next</em>' attribute.
   * @see #isNext()
   * @generated
   */
  void setNext(boolean value);

  /**
   * Returns the value of the '<em><b>To State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To State</em>' reference.
   * @see #setToState(State)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_ToState()
   * @model
   * @generated
   */
  State getToState();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#getToState <em>To State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To State</em>' reference.
   * @see #getToState()
   * @generated
   */
  void setToState(State value);

  /**
   * Returns the value of the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' attribute.
   * @see #setFinal(boolean)
   * @see it.marcotinacci.xturing.xTuring.XTuringPackage#getTransaction_Final()
   * @model
   * @generated
   */
  boolean isFinal();

  /**
   * Sets the value of the '{@link it.marcotinacci.xturing.xTuring.Transaction#isFinal <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' attribute.
   * @see #isFinal()
   * @generated
   */
  void setFinal(boolean value);

} // Transaction
