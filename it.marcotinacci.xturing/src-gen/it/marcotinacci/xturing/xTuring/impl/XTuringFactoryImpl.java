/**
 */
package it.marcotinacci.xturing.xTuring.impl;

import it.marcotinacci.xturing.xTuring.*;

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
public class XTuringFactoryImpl extends EFactoryImpl implements XTuringFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XTuringFactory init()
  {
    try
    {
      XTuringFactory theXTuringFactory = (XTuringFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.marcotinacci.it/xturing/XTuring"); 
      if (theXTuringFactory != null)
      {
        return theXTuringFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XTuringFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XTuringFactoryImpl()
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
      case XTuringPackage.MACHINE: return createMachine();
      case XTuringPackage.SYMBOL: return createSymbol();
      case XTuringPackage.STATE: return createState();
      case XTuringPackage.TRANSACTION: return createTransaction();
      case XTuringPackage.READ_WRITE_SYMBOL: return createReadWriteSymbol();
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
  public XTuringPackage getXTuringPackage()
  {
    return (XTuringPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XTuringPackage getPackage()
  {
    return XTuringPackage.eINSTANCE;
  }

} //XTuringFactoryImpl
