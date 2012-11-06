/**
 */
package it.marcotinacci.turingmachine.turingMachine.impl;

import it.marcotinacci.turingmachine.turingMachine.State;
import it.marcotinacci.turingmachine.turingMachine.Transaction;
import it.marcotinacci.turingmachine.turingMachine.TuringMachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.StateImpl#isBeginState <em>Begin State</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.StateImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
{
  /**
   * The default value of the '{@link #isBeginState() <em>Begin State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeginState()
   * @generated
   * @ordered
   */
  protected static final boolean BEGIN_STATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isBeginState() <em>Begin State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isBeginState()
   * @generated
   * @ordered
   */
  protected boolean beginState = BEGIN_STATE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransactions()
   * @generated
   * @ordered
   */
  protected EList<Transaction> transactions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return TuringMachinePackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isBeginState()
  {
    return beginState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBeginState(boolean newBeginState)
  {
    boolean oldBeginState = beginState;
    beginState = newBeginState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.STATE__BEGIN_STATE, oldBeginState, beginState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.STATE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transaction> getTransactions()
  {
    if (transactions == null)
    {
      transactions = new EObjectContainmentEList<Transaction>(Transaction.class, this, TuringMachinePackage.STATE__TRANSACTIONS);
    }
    return transactions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TuringMachinePackage.STATE__TRANSACTIONS:
        return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TuringMachinePackage.STATE__BEGIN_STATE:
        return isBeginState();
      case TuringMachinePackage.STATE__NAME:
        return getName();
      case TuringMachinePackage.STATE__TRANSACTIONS:
        return getTransactions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TuringMachinePackage.STATE__BEGIN_STATE:
        setBeginState((Boolean)newValue);
        return;
      case TuringMachinePackage.STATE__NAME:
        setName((String)newValue);
        return;
      case TuringMachinePackage.STATE__TRANSACTIONS:
        getTransactions().clear();
        getTransactions().addAll((Collection<? extends Transaction>)newValue);
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
      case TuringMachinePackage.STATE__BEGIN_STATE:
        setBeginState(BEGIN_STATE_EDEFAULT);
        return;
      case TuringMachinePackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TuringMachinePackage.STATE__TRANSACTIONS:
        getTransactions().clear();
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
      case TuringMachinePackage.STATE__BEGIN_STATE:
        return beginState != BEGIN_STATE_EDEFAULT;
      case TuringMachinePackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TuringMachinePackage.STATE__TRANSACTIONS:
        return transactions != null && !transactions.isEmpty();
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
    result.append(" (beginState: ");
    result.append(beginState);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //StateImpl
