/**
 */
package it.marcotinacci.turingmachine.turingMachine.impl;

import it.marcotinacci.turingmachine.turingMachine.ReadWriteSymbol;
import it.marcotinacci.turingmachine.turingMachine.Symbol;
import it.marcotinacci.turingmachine.turingMachine.TuringMachinePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Write Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.ReadWriteSymbolImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.ReadWriteSymbolImpl#isEmpty <em>Empty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReadWriteSymbolImpl extends MinimalEObjectImpl.Container implements ReadWriteSymbol
{
  /**
   * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbol()
   * @generated
   * @ordered
   */
  protected Symbol symbol;

  /**
   * The default value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmpty()
   * @generated
   * @ordered
   */
  protected static final boolean EMPTY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isEmpty() <em>Empty</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isEmpty()
   * @generated
   * @ordered
   */
  protected boolean empty = EMPTY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReadWriteSymbolImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TuringMachinePackage.Literals.READ_WRITE_SYMBOL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol getSymbol()
  {
    if (symbol != null && symbol.eIsProxy())
    {
      InternalEObject oldSymbol = (InternalEObject)symbol;
      symbol = (Symbol)eResolveProxy(oldSymbol);
      if (symbol != oldSymbol)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TuringMachinePackage.READ_WRITE_SYMBOL__SYMBOL, oldSymbol, symbol));
      }
    }
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol basicGetSymbol()
  {
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSymbol(Symbol newSymbol)
  {
    Symbol oldSymbol = symbol;
    symbol = newSymbol;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.READ_WRITE_SYMBOL__SYMBOL, oldSymbol, symbol));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isEmpty()
  {
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEmpty(boolean newEmpty)
  {
    boolean oldEmpty = empty;
    empty = newEmpty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.READ_WRITE_SYMBOL__EMPTY, oldEmpty, empty));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TuringMachinePackage.READ_WRITE_SYMBOL__SYMBOL:
        if (resolve) return getSymbol();
        return basicGetSymbol();
      case TuringMachinePackage.READ_WRITE_SYMBOL__EMPTY:
        return isEmpty();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TuringMachinePackage.READ_WRITE_SYMBOL__SYMBOL:
        setSymbol((Symbol)newValue);
        return;
      case TuringMachinePackage.READ_WRITE_SYMBOL__EMPTY:
        setEmpty((Boolean)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TuringMachinePackage.READ_WRITE_SYMBOL__SYMBOL:
        setSymbol((Symbol)null);
        return;
      case TuringMachinePackage.READ_WRITE_SYMBOL__EMPTY:
        setEmpty(EMPTY_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TuringMachinePackage.READ_WRITE_SYMBOL__SYMBOL:
        return symbol != null;
      case TuringMachinePackage.READ_WRITE_SYMBOL__EMPTY:
        return empty != EMPTY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (empty: ");
    result.append(empty);
    result.append(')');
    return result.toString();
  }

} //ReadWriteSymbolImpl
