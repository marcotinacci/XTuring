package it.marcotinacci.turingmachine.generator;

import com.google.common.base.Objects;
import it.marcotinacci.turingmachine.turingMachine.Machine;
import it.marcotinacci.turingmachine.turingMachine.ReadWriteSymbol;
import it.marcotinacci.turingmachine.turingMachine.State;
import it.marcotinacci.turingmachine.turingMachine.Symbol;
import it.marcotinacci.turingmachine.turingMachine.Transaction;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class TuringMachineGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    Machine m = ((Machine) _get);
    CharSequence _compile = this.compile(m);
    fsa.generateFile("TuringMachineBuilder.java", _compile);
  }
  
  public CharSequence compile(final Machine machine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package packagetitle;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.HashSet;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class TuringMachineBuilder {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static TuringMachine build(){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("HashSet<State> states = new HashSet<State>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("State terminate = new State(\"terminate\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("states.add(terminate);");
    _builder.newLine();
    {
      EList<State> _states = machine.getStates();
      for(final State state : _states) {
        _builder.append("\t\t");
        _builder.append("State ");
        String _name = state.getName();
        _builder.append(_name, "		");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _name_1 = state.getName();
        _builder.append(_name_1, "		");
        _builder.append(" = new State(\"");
        String _name_2 = state.getName();
        _builder.append(_name_2, "		");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("states.add(");
        String _name_3 = state.getName();
        _builder.append(_name_3, "		");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        {
          boolean _isBeginState = state.isBeginState();
          if (_isBeginState) {
            _builder.append("State begin = ");
            String _name_4 = state.getName();
            _builder.append(_name_4, "		");
            _builder.append(";");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<State> _states_1 = machine.getStates();
      for(final State state_1 : _states_1) {
        {
          EList<Transaction> _transactions = state_1.getTransactions();
          for(final Transaction transaction : _transactions) {
            _builder.append("\t\t");
            String _name_5 = state_1.getName();
            String _addTransactions = this.addTransactions(_name_5, transaction);
            _builder.append(_addTransactions, "		");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("return new TuringMachine(\"111+11\", states, begin);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String addTransactions(final String stateName, final Transaction transaction) {
    String _xblockexpression = null;
    {
      Integer size = null;
      boolean _isReading = transaction.isReading();
      if (_isReading) {
        EList<ReadWriteSymbol> _read = transaction.getRead();
        int _size = _read.size();
        size = Integer.valueOf(_size);
      } else {
        boolean _isWriting = transaction.isWriting();
        if (_isWriting) {
          EList<ReadWriteSymbol> _write = transaction.getWrite();
          int _size_1 = _write.size();
          size = Integer.valueOf(_size_1);
        }
      }
      String toRead = null;
      String toWrite = null;
      String dir = this.getDirection(transaction);
      String nextState = this.getState(transaction, stateName);
      String _xifexpression = null;
      boolean _equals = Objects.equal(size, null);
      if (_equals) {
        String _transactionToJava = this.transactionToJava(stateName, toRead, toWrite, dir, nextState);
        _xifexpression = _transactionToJava;
      } else {
        String _xblockexpression_1 = null;
        {
          int i = (-1);
          StringBuffer _stringBuffer = new StringBuffer();
          StringBuffer ret = _stringBuffer;
          int _plus = (i + 1);
          int _i = i = _plus;
          boolean _lessThan = (_i < (size).intValue());
          boolean _while = _lessThan;
          while (_while) {
            {
              String _readSymbol = this.getReadSymbol(transaction, i);
              toRead = _readSymbol;
              String _writeSymbol = this.getWriteSymbol(transaction, i);
              toWrite = _writeSymbol;
              String _transactionToJava_1 = this.transactionToJava(stateName, toRead, toWrite, dir, nextState);
              ret.append(_transactionToJava_1);
            }
            int _plus_1 = (i + 1);
            int _i_1 = i = _plus_1;
            boolean _lessThan_1 = (_i_1 < (size).intValue());
            _while = _lessThan_1;
          }
          String _string = ret.toString();
          _xblockexpression_1 = (_string);
        }
        _xifexpression = _xblockexpression_1;
      }
      _xblockexpression = (_xifexpression);
    }
    return _xblockexpression;
  }
  
  public String transactionToJava(final String stateName, final String toRead, final String toWrite, final String dir, final String nextState) {
    String _plus = (stateName + ".add(new Transaction(");
    String _plus_1 = (_plus + toRead);
    String _plus_2 = (_plus_1 + ",");
    String _plus_3 = (_plus_2 + toWrite);
    String _plus_4 = (_plus_3 + ", Direction.");
    String _plus_5 = (_plus_4 + dir);
    String _plus_6 = (_plus_5 + ",");
    String _plus_7 = (_plus_6 + nextState);
    String _plus_8 = (_plus_7 + "));\n");
    String _string = new String(_plus_8);
    return _string;
  }
  
  public String getWriteSymbol(final Transaction transaction, final int i) {
    boolean _isWriting = transaction.isWriting();
    if (_isWriting) {
      EList<ReadWriteSymbol> _write = transaction.getWrite();
      ReadWriteSymbol _get = _write.get(i);
      boolean _isEmpty = _get.isEmpty();
      if (_isEmpty) {
        String _string = new String("\'~\'");
        return _string;
      } else {
        EList<ReadWriteSymbol> _write_1 = transaction.getWrite();
        ReadWriteSymbol _get_1 = _write_1.get(i);
        Symbol _symbol = _get_1.getSymbol();
        String _name = _symbol.getName();
        String _plus = ("\'" + _name);
        String _plus_1 = (_plus + "\'");
        String _string_1 = new String(_plus_1);
        return _string_1;
      }
    }
    return null;
  }
  
  public String getReadSymbol(final Transaction transaction, final int i) {
    boolean _isReading = transaction.isReading();
    if (_isReading) {
      EList<ReadWriteSymbol> _read = transaction.getRead();
      ReadWriteSymbol _get = _read.get(i);
      boolean _isEmpty = _get.isEmpty();
      if (_isEmpty) {
        String _string = new String("\'~\'");
        return _string;
      } else {
        EList<ReadWriteSymbol> _read_1 = transaction.getRead();
        ReadWriteSymbol _get_1 = _read_1.get(i);
        Symbol _symbol = _get_1.getSymbol();
        String _name = _symbol.getName();
        String _plus = ("\'" + _name);
        String _plus_1 = (_plus + "\'");
        String _string_1 = new String(_plus_1);
        return _string_1;
      }
    }
    return null;
  }
  
  public String getState(final Transaction transaction, final String stateName) {
    boolean _isNext = transaction.isNext();
    if (_isNext) {
      State _toState = transaction.getToState();
      return _toState.getName();
    }
    boolean _isFinal = transaction.isFinal();
    if (_isFinal) {
      String _string = new String("terminate");
      return _string;
    }
    return stateName;
  }
  
  public String getDirection(final Transaction transaction) {
    String _xifexpression = null;
    boolean _isMoving = transaction.isMoving();
    if (_isMoving) {
      String _xifexpression_1 = null;
      String _move = transaction.getMove();
      boolean _equals = _move.equals("left");
      if (_equals) {
        _xifexpression_1 = "LEFT";
      } else {
        _xifexpression_1 = "RIGHT";
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = "STAND";
    }
    return _xifexpression;
  }
}
