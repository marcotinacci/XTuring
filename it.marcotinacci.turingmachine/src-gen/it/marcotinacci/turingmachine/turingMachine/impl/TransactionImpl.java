/**
 */
package it.marcotinacci.turingmachine.turingMachine.impl;

import it.marcotinacci.turingmachine.turingMachine.ReadWriteSymbol;
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
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#isReading <em>Reading</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#getRead <em>Read</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#isWriting <em>Writing</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#getWrite <em>Write</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#getMove <em>Move</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#isNext <em>Next</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#getToState <em>To State</em>}</li>
 *   <li>{@link it.marcotinacci.turingmachine.turingMachine.impl.TransactionImpl#isFinal <em>Final</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionImpl extends MinimalEObjectImpl.Container implements Transaction
{
  /**
   * The default value of the '{@link #isReading() <em>Reading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReading()
   * @generated
   * @ordered
   */
  protected static final boolean READING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReading() <em>Reading</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReading()
   * @generated
   * @ordered
   */
  protected boolean reading = READING_EDEFAULT;

  /**
   * The cached value of the '{@link #getRead() <em>Read</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRead()
   * @generated
   * @ordered
   */
  protected EList<ReadWriteSymbol> read;

  /**
   * The default value of the '{@link #isWriting() <em>Writing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWriting()
   * @generated
   * @ordered
   */
  protected static final boolean WRITING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isWriting() <em>Writing</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isWriting()
   * @generated
   * @ordered
   */
  protected boolean writing = WRITING_EDEFAULT;

  /**
   * The cached value of the '{@link #getWrite() <em>Write</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWrite()
   * @generated
   * @ordered
   */
  protected EList<ReadWriteSymbol> write;

  /**
   * The default value of the '{@link #isMoving() <em>Moving</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMoving()
   * @generated
   * @ordered
   */
  protected static final boolean MOVING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMoving() <em>Moving</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMoving()
   * @generated
   * @ordered
   */
  protected boolean moving = MOVING_EDEFAULT;

  /**
   * The default value of the '{@link #getMove() <em>Move</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected static final String MOVE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMove() <em>Move</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMove()
   * @generated
   * @ordered
   */
  protected String move = MOVE_EDEFAULT;

  /**
   * The default value of the '{@link #isNext() <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNext()
   * @generated
   * @ordered
   */
  protected static final boolean NEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNext() <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNext()
   * @generated
   * @ordered
   */
  protected boolean next = NEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getToState() <em>To State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToState()
   * @generated
   * @ordered
   */
  protected State toState;

  /**
   * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected static final boolean FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFinal()
   * @generated
   * @ordered
   */
  protected boolean final_ = FINAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransactionImpl()
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
    return TuringMachinePackage.Literals.TRANSACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReading()
  {
    return reading;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReading(boolean newReading)
  {
    boolean oldReading = reading;
    reading = newReading;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__READING, oldReading, reading));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReadWriteSymbol> getRead()
  {
    if (read == null)
    {
      read = new EObjectContainmentEList<ReadWriteSymbol>(ReadWriteSymbol.class, this, TuringMachinePackage.TRANSACTION__READ);
    }
    return read;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isWriting()
  {
    return writing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWriting(boolean newWriting)
  {
    boolean oldWriting = writing;
    writing = newWriting;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__WRITING, oldWriting, writing));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReadWriteSymbol> getWrite()
  {
    if (write == null)
    {
      write = new EObjectContainmentEList<ReadWriteSymbol>(ReadWriteSymbol.class, this, TuringMachinePackage.TRANSACTION__WRITE);
    }
    return write;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMoving()
  {
    return moving;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMoving(boolean newMoving)
  {
    boolean oldMoving = moving;
    moving = newMoving;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__MOVING, oldMoving, moving));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMove()
  {
    return move;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMove(String newMove)
  {
    String oldMove = move;
    move = newMove;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__MOVE, oldMove, move));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(boolean newNext)
  {
    boolean oldNext = next;
    next = newNext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__NEXT, oldNext, next));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getToState()
  {
    if (toState != null && toState.eIsProxy())
    {
      InternalEObject oldToState = (InternalEObject)toState;
      toState = (State)eResolveProxy(oldToState);
      if (toState != oldToState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TuringMachinePackage.TRANSACTION__TO_STATE, oldToState, toState));
      }
    }
    return toState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetToState()
  {
    return toState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToState(State newToState)
  {
    State oldToState = toState;
    toState = newToState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__TO_STATE, oldToState, toState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isFinal()
  {
    return final_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinal(boolean newFinal)
  {
    boolean oldFinal = final_;
    final_ = newFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TuringMachinePackage.TRANSACTION__FINAL, oldFinal, final_));
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
      case TuringMachinePackage.TRANSACTION__READ:
        return ((InternalEList<?>)getRead()).basicRemove(otherEnd, msgs);
      case TuringMachinePackage.TRANSACTION__WRITE:
        return ((InternalEList<?>)getWrite()).basicRemove(otherEnd, msgs);
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
      case TuringMachinePackage.TRANSACTION__READING:
        return isReading();
      case TuringMachinePackage.TRANSACTION__READ:
        return getRead();
      case TuringMachinePackage.TRANSACTION__WRITING:
        return isWriting();
      case TuringMachinePackage.TRANSACTION__WRITE:
        return getWrite();
      case TuringMachinePackage.TRANSACTION__MOVING:
        return isMoving();
      case TuringMachinePackage.TRANSACTION__MOVE:
        return getMove();
      case TuringMachinePackage.TRANSACTION__NEXT:
        return isNext();
      case TuringMachinePackage.TRANSACTION__TO_STATE:
        if (resolve) return getToState();
        return basicGetToState();
      case TuringMachinePackage.TRANSACTION__FINAL:
        return isFinal();
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
      case TuringMachinePackage.TRANSACTION__READING:
        setReading((Boolean)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__READ:
        getRead().clear();
        getRead().addAll((Collection<? extends ReadWriteSymbol>)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__WRITING:
        setWriting((Boolean)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__WRITE:
        getWrite().clear();
        getWrite().addAll((Collection<? extends ReadWriteSymbol>)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__MOVING:
        setMoving((Boolean)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__MOVE:
        setMove((String)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__NEXT:
        setNext((Boolean)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__TO_STATE:
        setToState((State)newValue);
        return;
      case TuringMachinePackage.TRANSACTION__FINAL:
        setFinal((Boolean)newValue);
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
      case TuringMachinePackage.TRANSACTION__READING:
        setReading(READING_EDEFAULT);
        return;
      case TuringMachinePackage.TRANSACTION__READ:
        getRead().clear();
        return;
      case TuringMachinePackage.TRANSACTION__WRITING:
        setWriting(WRITING_EDEFAULT);
        return;
      case TuringMachinePackage.TRANSACTION__WRITE:
        getWrite().clear();
        return;
      case TuringMachinePackage.TRANSACTION__MOVING:
        setMoving(MOVING_EDEFAULT);
        return;
      case TuringMachinePackage.TRANSACTION__MOVE:
        setMove(MOVE_EDEFAULT);
        return;
      case TuringMachinePackage.TRANSACTION__NEXT:
        setNext(NEXT_EDEFAULT);
        return;
      case TuringMachinePackage.TRANSACTION__TO_STATE:
        setToState((State)null);
        return;
      case TuringMachinePackage.TRANSACTION__FINAL:
        setFinal(FINAL_EDEFAULT);
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
      case TuringMachinePackage.TRANSACTION__READING:
        return reading != READING_EDEFAULT;
      case TuringMachinePackage.TRANSACTION__READ:
        return read != null && !read.isEmpty();
      case TuringMachinePackage.TRANSACTION__WRITING:
        return writing != WRITING_EDEFAULT;
      case TuringMachinePackage.TRANSACTION__WRITE:
        return write != null && !write.isEmpty();
      case TuringMachinePackage.TRANSACTION__MOVING:
        return moving != MOVING_EDEFAULT;
      case TuringMachinePackage.TRANSACTION__MOVE:
        return MOVE_EDEFAULT == null ? move != null : !MOVE_EDEFAULT.equals(move);
      case TuringMachinePackage.TRANSACTION__NEXT:
        return next != NEXT_EDEFAULT;
      case TuringMachinePackage.TRANSACTION__TO_STATE:
        return toState != null;
      case TuringMachinePackage.TRANSACTION__FINAL:
        return final_ != FINAL_EDEFAULT;
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
    result.append(" (reading: ");
    result.append(reading);
    result.append(", writing: ");
    result.append(writing);
    result.append(", moving: ");
    result.append(moving);
    result.append(", move: ");
    result.append(move);
    result.append(", next: ");
    result.append(next);
    result.append(", final: ");
    result.append(final_);
    result.append(')');
    return result.toString();
  }

} //TransactionImpl
