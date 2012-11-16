/**
 */
package it.marcotinacci.xturing.xTuring.impl;

import it.marcotinacci.xturing.xTuring.Machine;
import it.marcotinacci.xturing.xTuring.State;
import it.marcotinacci.xturing.xTuring.Symbol;
import it.marcotinacci.xturing.xTuring.XTuringPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.marcotinacci.xturing.xTuring.impl.MachineImpl#getSymbols <em>Symbols</em>}</li>
 *   <li>{@link it.marcotinacci.xturing.xTuring.impl.MachineImpl#getStates <em>States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MachineImpl extends MinimalEObjectImpl.Container implements Machine
{
  /**
   * The cached value of the '{@link #getSymbols() <em>Symbols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSymbols()
   * @generated
   * @ordered
   */
  protected EList<Symbol> symbols;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineImpl()
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
    return XTuringPackage.Literals.MACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Symbol> getSymbols()
  {
    if (symbols == null)
    {
      symbols = new EObjectContainmentEList<Symbol>(Symbol.class, this, XTuringPackage.MACHINE__SYMBOLS);
    }
    return symbols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, XTuringPackage.MACHINE__STATES);
    }
    return states;
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
      case XTuringPackage.MACHINE__SYMBOLS:
        return ((InternalEList<?>)getSymbols()).basicRemove(otherEnd, msgs);
      case XTuringPackage.MACHINE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case XTuringPackage.MACHINE__SYMBOLS:
        return getSymbols();
      case XTuringPackage.MACHINE__STATES:
        return getStates();
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
      case XTuringPackage.MACHINE__SYMBOLS:
        getSymbols().clear();
        getSymbols().addAll((Collection<? extends Symbol>)newValue);
        return;
      case XTuringPackage.MACHINE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case XTuringPackage.MACHINE__SYMBOLS:
        getSymbols().clear();
        return;
      case XTuringPackage.MACHINE__STATES:
        getStates().clear();
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
      case XTuringPackage.MACHINE__SYMBOLS:
        return symbols != null && !symbols.isEmpty();
      case XTuringPackage.MACHINE__STATES:
        return states != null && !states.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MachineImpl
