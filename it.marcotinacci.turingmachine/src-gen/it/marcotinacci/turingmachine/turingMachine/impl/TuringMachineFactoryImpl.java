/**
 */
package it.marcotinacci.turingmachine.turingMachine.impl;

import it.marcotinacci.turingmachine.turingMachine.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TuringMachineFactoryImpl extends EFactoryImpl implements TuringMachineFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TuringMachineFactory init()
  {
    try
    {
      TuringMachineFactory theTuringMachineFactory = (TuringMachineFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.marcotinacci.it/turingmachine/TuringMachine"); 
      if (theTuringMachineFactory != null)
      {
        return theTuringMachineFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TuringMachineFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuringMachineFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TuringMachinePackage.MACHINE: return createMachine();
      case TuringMachinePackage.SYMBOL: return createSymbol();
      case TuringMachinePackage.STATE: return createState();
      case TuringMachinePackage.TRANSACTION: return createTransaction();
      case TuringMachinePackage.READ_WRITE_SYMBOL: return createReadWriteSymbol();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Machine createMachine()
  {
    MachineImpl machine = new MachineImpl();
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transaction createTransaction()
  {
    TransactionImpl transaction = new TransactionImpl();
    return transaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReadWriteSymbol createReadWriteSymbol()
  {
    ReadWriteSymbolImpl readWriteSymbol = new ReadWriteSymbolImpl();
    return readWriteSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TuringMachinePackage getTuringMachinePackage()
  {
    return (TuringMachinePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TuringMachinePackage getPackage()
  {
    return TuringMachinePackage.eINSTANCE;
  }

} //TuringMachineFactoryImpl
