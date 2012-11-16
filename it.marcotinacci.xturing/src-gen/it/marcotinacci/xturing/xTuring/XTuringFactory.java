/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.marcotinacci.xturing.xTuring.XTuringPackage
 * @generated
 */
public interface XTuringFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XTuringFactory eINSTANCE = it.marcotinacci.xturing.xTuring.impl.XTuringFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Machine</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Machine</em>'.
   * @generated
   */
  Machine createMachine();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Transaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Transaction</em>'.
   * @generated
   */
  Transaction createTransaction();

  /**
   * Returns a new object of class '<em>Read Write Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Read Write Symbol</em>'.
   * @generated
   */
  ReadWriteSymbol createReadWriteSymbol();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XTuringPackage getXTuringPackage();

} //XTuringFactory
