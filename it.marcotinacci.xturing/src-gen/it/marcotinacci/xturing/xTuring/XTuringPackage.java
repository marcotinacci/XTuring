/**
 */
package it.marcotinacci.xturing.xTuring;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see it.marcotinacci.xturing.xTuring.XTuringFactory
 * @model kind="package"
 * @generated
 */
public interface XTuringPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xTuring";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.marcotinacci.it/xturing/XTuring";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xTuring";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XTuringPackage eINSTANCE = it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl.init();

  /**
   * The meta object id for the '{@link it.marcotinacci.xturing.xTuring.impl.MachineImpl <em>Machine</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.marcotinacci.xturing.xTuring.impl.MachineImpl
   * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getMachine()
   * @generated
   */
  int MACHINE = 0;

  /**
   * The feature id for the '<em><b>Symbols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__SYMBOLS = 0;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE__STATES = 1;

  /**
   * The number of structural features of the '<em>Machine</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link it.marcotinacci.xturing.xTuring.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.marcotinacci.xturing.xTuring.impl.SymbolImpl
   * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__NAME = 0;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link it.marcotinacci.xturing.xTuring.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.marcotinacci.xturing.xTuring.impl.StateImpl
   * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getState()
   * @generated
   */
  int STATE = 2;

  /**
   * The feature id for the '<em><b>Begin State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__BEGIN_STATE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 1;

  /**
   * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__TRANSACTIONS = 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link it.marcotinacci.xturing.xTuring.impl.TransactionImpl <em>Transaction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.marcotinacci.xturing.xTuring.impl.TransactionImpl
   * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getTransaction()
   * @generated
   */
  int TRANSACTION = 3;

  /**
   * The feature id for the '<em><b>Reading</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__READING = 0;

  /**
   * The feature id for the '<em><b>Read</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__READ = 1;

  /**
   * The feature id for the '<em><b>Writing</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__WRITING = 2;

  /**
   * The feature id for the '<em><b>Write</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__WRITE = 3;

  /**
   * The feature id for the '<em><b>Moving</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__MOVING = 4;

  /**
   * The feature id for the '<em><b>Move</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__MOVE = 5;

  /**
   * The feature id for the '<em><b>Next</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__NEXT = 6;

  /**
   * The feature id for the '<em><b>To State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__TO_STATE = 7;

  /**
   * The feature id for the '<em><b>Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION__FINAL = 8;

  /**
   * The number of structural features of the '<em>Transaction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSACTION_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link it.marcotinacci.xturing.xTuring.impl.ReadWriteSymbolImpl <em>Read Write Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see it.marcotinacci.xturing.xTuring.impl.ReadWriteSymbolImpl
   * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getReadWriteSymbol()
   * @generated
   */
  int READ_WRITE_SYMBOL = 4;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_WRITE_SYMBOL__SYMBOL = 0;

  /**
   * The feature id for the '<em><b>Empty</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_WRITE_SYMBOL__EMPTY = 1;

  /**
   * The number of structural features of the '<em>Read Write Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int READ_WRITE_SYMBOL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link it.marcotinacci.xturing.xTuring.Machine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine</em>'.
   * @see it.marcotinacci.xturing.xTuring.Machine
   * @generated
   */
  EClass getMachine();

  /**
   * Returns the meta object for the containment reference list '{@link it.marcotinacci.xturing.xTuring.Machine#getSymbols <em>Symbols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Symbols</em>'.
   * @see it.marcotinacci.xturing.xTuring.Machine#getSymbols()
   * @see #getMachine()
   * @generated
   */
  EReference getMachine_Symbols();

  /**
   * Returns the meta object for the containment reference list '{@link it.marcotinacci.xturing.xTuring.Machine#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see it.marcotinacci.xturing.xTuring.Machine#getStates()
   * @see #getMachine()
   * @generated
   */
  EReference getMachine_States();

  /**
   * Returns the meta object for class '{@link it.marcotinacci.xturing.xTuring.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see it.marcotinacci.xturing.xTuring.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Symbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.marcotinacci.xturing.xTuring.Symbol#getName()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Name();

  /**
   * Returns the meta object for class '{@link it.marcotinacci.xturing.xTuring.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see it.marcotinacci.xturing.xTuring.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.State#isBeginState <em>Begin State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Begin State</em>'.
   * @see it.marcotinacci.xturing.xTuring.State#isBeginState()
   * @see #getState()
   * @generated
   */
  EAttribute getState_BeginState();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see it.marcotinacci.xturing.xTuring.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link it.marcotinacci.xturing.xTuring.State#getTransactions <em>Transactions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transactions</em>'.
   * @see it.marcotinacci.xturing.xTuring.State#getTransactions()
   * @see #getState()
   * @generated
   */
  EReference getState_Transactions();

  /**
   * Returns the meta object for class '{@link it.marcotinacci.xturing.xTuring.Transaction <em>Transaction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transaction</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction
   * @generated
   */
  EClass getTransaction();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Transaction#isReading <em>Reading</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reading</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#isReading()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Reading();

  /**
   * Returns the meta object for the containment reference list '{@link it.marcotinacci.xturing.xTuring.Transaction#getRead <em>Read</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Read</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#getRead()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Read();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Transaction#isWriting <em>Writing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Writing</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#isWriting()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Writing();

  /**
   * Returns the meta object for the containment reference list '{@link it.marcotinacci.xturing.xTuring.Transaction#getWrite <em>Write</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Write</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#getWrite()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_Write();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Transaction#isMoving <em>Moving</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Moving</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#isMoving()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Moving();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Transaction#getMove <em>Move</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Move</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#getMove()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Move();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Transaction#isNext <em>Next</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Next</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#isNext()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Next();

  /**
   * Returns the meta object for the reference '{@link it.marcotinacci.xturing.xTuring.Transaction#getToState <em>To State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To State</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#getToState()
   * @see #getTransaction()
   * @generated
   */
  EReference getTransaction_ToState();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.Transaction#isFinal <em>Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Final</em>'.
   * @see it.marcotinacci.xturing.xTuring.Transaction#isFinal()
   * @see #getTransaction()
   * @generated
   */
  EAttribute getTransaction_Final();

  /**
   * Returns the meta object for class '{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol <em>Read Write Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Read Write Symbol</em>'.
   * @see it.marcotinacci.xturing.xTuring.ReadWriteSymbol
   * @generated
   */
  EClass getReadWriteSymbol();

  /**
   * Returns the meta object for the reference '{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see it.marcotinacci.xturing.xTuring.ReadWriteSymbol#getSymbol()
   * @see #getReadWriteSymbol()
   * @generated
   */
  EReference getReadWriteSymbol_Symbol();

  /**
   * Returns the meta object for the attribute '{@link it.marcotinacci.xturing.xTuring.ReadWriteSymbol#isEmpty <em>Empty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Empty</em>'.
   * @see it.marcotinacci.xturing.xTuring.ReadWriteSymbol#isEmpty()
   * @see #getReadWriteSymbol()
   * @generated
   */
  EAttribute getReadWriteSymbol_Empty();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XTuringFactory getXTuringFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link it.marcotinacci.xturing.xTuring.impl.MachineImpl <em>Machine</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.marcotinacci.xturing.xTuring.impl.MachineImpl
     * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getMachine()
     * @generated
     */
    EClass MACHINE = eINSTANCE.getMachine();

    /**
     * The meta object literal for the '<em><b>Symbols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE__SYMBOLS = eINSTANCE.getMachine_Symbols();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE__STATES = eINSTANCE.getMachine_States();

    /**
     * The meta object literal for the '{@link it.marcotinacci.xturing.xTuring.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.marcotinacci.xturing.xTuring.impl.SymbolImpl
     * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

    /**
     * The meta object literal for the '{@link it.marcotinacci.xturing.xTuring.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.marcotinacci.xturing.xTuring.impl.StateImpl
     * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Begin State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__BEGIN_STATE = eINSTANCE.getState_BeginState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__TRANSACTIONS = eINSTANCE.getState_Transactions();

    /**
     * The meta object literal for the '{@link it.marcotinacci.xturing.xTuring.impl.TransactionImpl <em>Transaction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.marcotinacci.xturing.xTuring.impl.TransactionImpl
     * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getTransaction()
     * @generated
     */
    EClass TRANSACTION = eINSTANCE.getTransaction();

    /**
     * The meta object literal for the '<em><b>Reading</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__READING = eINSTANCE.getTransaction_Reading();

    /**
     * The meta object literal for the '<em><b>Read</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__READ = eINSTANCE.getTransaction_Read();

    /**
     * The meta object literal for the '<em><b>Writing</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__WRITING = eINSTANCE.getTransaction_Writing();

    /**
     * The meta object literal for the '<em><b>Write</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__WRITE = eINSTANCE.getTransaction_Write();

    /**
     * The meta object literal for the '<em><b>Moving</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__MOVING = eINSTANCE.getTransaction_Moving();

    /**
     * The meta object literal for the '<em><b>Move</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__MOVE = eINSTANCE.getTransaction_Move();

    /**
     * The meta object literal for the '<em><b>Next</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__NEXT = eINSTANCE.getTransaction_Next();

    /**
     * The meta object literal for the '<em><b>To State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSACTION__TO_STATE = eINSTANCE.getTransaction_ToState();

    /**
     * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSACTION__FINAL = eINSTANCE.getTransaction_Final();

    /**
     * The meta object literal for the '{@link it.marcotinacci.xturing.xTuring.impl.ReadWriteSymbolImpl <em>Read Write Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see it.marcotinacci.xturing.xTuring.impl.ReadWriteSymbolImpl
     * @see it.marcotinacci.xturing.xTuring.impl.XTuringPackageImpl#getReadWriteSymbol()
     * @generated
     */
    EClass READ_WRITE_SYMBOL = eINSTANCE.getReadWriteSymbol();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference READ_WRITE_SYMBOL__SYMBOL = eINSTANCE.getReadWriteSymbol_Symbol();

    /**
     * The meta object literal for the '<em><b>Empty</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute READ_WRITE_SYMBOL__EMPTY = eINSTANCE.getReadWriteSymbol_Empty();

  }

} //XTuringPackage
