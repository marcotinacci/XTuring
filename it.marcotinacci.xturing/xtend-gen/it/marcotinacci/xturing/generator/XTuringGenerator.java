package it.marcotinacci.xturing.generator;

import com.google.common.base.Objects;
import it.marcotinacci.xturing.generator.staticstructure.Alphabet;
import it.marcotinacci.xturing.xTuring.Machine;
import it.marcotinacci.xturing.xTuring.ReadWriteSymbol;
import it.marcotinacci.xturing.xTuring.State;
import it.marcotinacci.xturing.xTuring.Symbol;
import it.marcotinacci.xturing.xTuring.Transaction;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class XTuringGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    Machine m = ((Machine) _get);
    EList<Symbol> _symbols = m.getSymbols();
    final Procedure1<Symbol> _function = new Procedure1<Symbol>() {
        public void apply(final Symbol sym) {
          Alphabet _instance = Alphabet.getInstance();
          String _name = sym.getName();
          _instance.add(_name);
        }
      };
    IterableExtensions.<Symbol>forEach(_symbols, _function);
    Alphabet _instance = Alphabet.getInstance();
    _instance.add("~");
    CharSequence _compile = this.compile(m);
    fsa.generateFile("TuringMachineBuilder.java", _compile);
  }
  
  public CharSequence compile(final Machine machine) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package it.marcotinacci.xturing.generator.staticstructure;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.util.HashSet;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class TuringMachineBuilder {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("TuringMachine tm = TuringMachineBuilder.build(\"11+1\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("tm.run();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static TuringMachine build(String inputTape){");
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
        _builder.append("\t\t");
        String _name_5 = state_1.getName();
        EList<Transaction> _transactions = state_1.getTransactions();
        String _addTransactions = this.addTransactions(_name_5, _transactions);
        _builder.append(_addTransactions, "		");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("return new TuringMachine(inputTape, states, begin);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String addTransactions(final String stateName, final EList<Transaction> transactions) {
    String _xblockexpression = null;
    {
      Transaction complementary = null;
      HashSet<String> _hashSet = new HashSet<String>();
      HashSet<String> usedSymbols = _hashSet;
      StringBuffer _stringBuffer = new StringBuffer();
      StringBuffer ret = _stringBuffer;
      for (final Transaction transaction : transactions) {
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
          boolean _isReading_1 = transaction.isReading();
          boolean _not = (!_isReading_1);
          if (_not) {
            complementary = transaction;
          } else {
            int i = (-1);
            int _plus = (i + 1);
            int _i = i = _plus;
            boolean _lessThan = (_i < (size).intValue());
            boolean _while = _lessThan;
            while (_while) {
              {
                String _readSymbol = this.getReadSymbol(transaction, i);
                toRead = _readSymbol;
                boolean _isWriting_1 = transaction.isWriting();
                if (_isWriting_1) {
                  String _writeSymbol = this.getWriteSymbol(transaction, i);
                  toWrite = _writeSymbol;
                } else {
                  toWrite = null;
                }
                String _transactionToJava = this.transactionToJava(stateName, toRead, toWrite, dir, nextState);
                ret.append(_transactionToJava);
                usedSymbols.add(toRead);
              }
              int _plus_1 = (i + 1);
              int _i_1 = i = _plus_1;
              boolean _lessThan_1 = (_i_1 < (size).intValue());
              _while = _lessThan_1;
            }
          }
        }
      }
      boolean _notEquals = (!Objects.equal(complementary, null));
      if (_notEquals) {
        String toWrite = null;
        String dir = this.getDirection(complementary);
        String nextState = this.getState(complementary, stateName);
        Alphabet _instance = Alphabet.getInstance();
        for (final String s : _instance) {
          String _plus = ("\'" + s);
          String _plus_1 = (_plus + "\'");
          boolean _contains = usedSymbols.contains(_plus_1);
          boolean _not = (!_contains);
          if (_not) {
            boolean _isWriting = complementary.isWriting();
            if (_isWriting) {
              String _writeSymbol = this.getWriteSymbol(complementary, 0);
              toWrite = _writeSymbol;
            } else {
              toWrite = null;
            }
            String _plus_2 = ("\'" + s);
            String _plus_3 = (_plus_2 + "\'");
            String _transactionToJava = this.transactionToJava(stateName, _plus_3, toWrite, dir, nextState);
            ret.append(_transactionToJava);
          }
        }
      }
      String _string = ret.toString();
      _xblockexpression = (_string);
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
