
//----------------------------------------------------
// The following code was generated by CUP v0.11b beta 20140226
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import java.util.*;
import java.util.Iterator;
import java_cup.runtime.XMLElement;

/** CUP v0.11b beta 20140226 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\043\000\002\002\004\000\002\002\007\000\002\005" +
    "\006\000\002\005\005\000\002\006\005\000\002\010\002" +
    "\000\002\010\004\000\002\007\006\000\002\007\010\000" +
    "\002\003\004\000\002\003\006\000\002\003\007\000\002" +
    "\003\003\000\002\004\003\000\002\011\004\000\002\011" +
    "\006\000\002\012\007\000\002\013\003\000\002\013\005" +
    "\000\002\015\005\000\002\014\003\000\002\016\003\000" +
    "\002\017\003\000\002\020\002\000\002\020\004\000\002" +
    "\021\010\000\002\023\003\000\002\023\005\000\002\024" +
    "\006\000\002\027\003\000\002\027\005\000\002\030\005" +
    "\000\002\025\003\000\002\026\003\000\002\022\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\111\000\006\005\005\006\004\001\002\000\006\005" +
    "\ufffc\006\ufffc\001\002\000\004\005\103\001\002\000\004" +
    "\004\ufff5\001\002\000\004\002\102\001\002\000\004\004" +
    "\023\001\002\000\006\005\013\006\012\001\002\000\004" +
    "\006\021\001\002\000\004\005\020\001\002\000\006\004" +
    "\ufff8\006\012\001\002\000\004\006\012\001\002\000\006" +
    "\004\ufff7\006\012\001\002\000\004\004\ufff6\001\002\000" +
    "\006\005\ufffe\006\ufffe\001\002\000\004\006\022\001\002" +
    "\000\006\004\ufffd\006\ufffd\001\002\000\004\011\027\001" +
    "\002\000\004\004\051\001\002\000\006\004\ufff4\011\027" +
    "\001\002\000\004\011\027\001\002\000\004\007\030\001" +
    "\002\000\006\010\uffec\021\uffec\001\002\000\004\010\043" +
    "\001\002\000\012\004\ufff0\011\ufff0\012\ufff0\013\ufff0\001" +
    "\002\000\006\012\035\013\034\001\002\000\004\007\030" +
    "\001\002\000\004\007\036\001\002\000\006\011\uffed\014" +
    "\uffed\001\002\000\004\014\040\001\002\000\010\004\ufff1" +
    "\007\ufff1\011\ufff1\001\002\000\012\004\uffef\011\uffef\012" +
    "\uffef\013\uffef\001\002\000\004\015\044\001\002\000\004" +
    "\015\uffeb\001\002\000\012\004\uffee\011\uffee\012\uffee\013" +
    "\uffee\001\002\000\006\004\ufff3\011\ufff3\001\002\000\004" +
    "\011\027\001\002\000\004\007\030\001\002\000\010\004" +
    "\ufff2\011\ufff2\013\034\001\002\000\006\002\uffea\010\uffea" +
    "\001\002\000\006\002\000\010\053\001\002\000\004\016" +
    "\uffdf\001\002\000\004\016\056\001\002\000\006\002\uffe9" +
    "\010\uffe9\001\002\000\004\007\057\001\002\000\004\017" +
    "\uffe1\001\002\000\004\017\061\001\002\000\004\007\036" +
    "\001\002\000\006\013\077\014\100\001\002\000\006\013" +
    "\uffe7\014\uffe7\001\002\000\004\011\065\001\002\000\004" +
    "\007\030\001\002\000\004\021\075\001\002\000\006\012" +
    "\uffe4\013\uffe4\001\002\000\006\012\072\013\071\001\002" +
    "\000\004\007\030\001\002\000\006\013\uffe5\014\uffe5\001" +
    "\002\000\006\012\uffe3\013\uffe3\001\002\000\004\020\076" +
    "\001\002\000\004\020\uffe0\001\002\000\006\012\uffe2\013" +
    "\uffe2\001\002\000\004\007\036\001\002\000\006\002\uffe8" +
    "\010\uffe8\001\002\000\006\013\uffe6\014\uffe6\001\002\000" +
    "\004\002\001\001\002\000\004\005\104\001\002\000\004" +
    "\005\105\001\002\000\006\005\uffff\006\uffff\001\002\000" +
    "\006\005\110\006\107\001\002\000\010\004\ufffc\005\ufffc" +
    "\006\ufffc\001\002\000\010\004\ufffb\005\ufffb\006\ufffb\001" +
    "\002\000\010\004\ufffa\005\110\006\112\001\002\000\006" +
    "\004\ufffc\005\ufffc\001\002\000\006\004\ufff9\005\110\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\111\000\012\002\006\003\007\005\010\007\005\001" +
    "\001\000\004\010\105\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\014\001\001\000\004\006\015\001\001\000\004\006" +
    "\016\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\004\023\011\024\012" +
    "\025\001\001\000\002\001\001\000\004\012\045\001\001" +
    "\000\004\012\044\001\001\000\010\013\032\015\031\016" +
    "\030\001\001\000\002\001\001\000\004\017\041\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\015\040\016" +
    "\030\001\001\000\004\014\036\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\012\046\001\001\000\010\013\047\015" +
    "\031\016\030\001\001\000\002\001\001\000\004\020\051" +
    "\001\001\000\006\021\054\022\053\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\025\057" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\014" +
    "\063\023\061\024\062\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\010\016\065\027\067\030" +
    "\066\001\001\000\004\026\073\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\016\065\030\072\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\014\063\024\100\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\110\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\112\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {

    symbol_table = new HashMap<String, HashMap>();

 Tree = new DisegnaAlbero();   }public static DisegnaAlbero Tree;

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 Symbol s=_scanner.next_token(); Tree.push(s.toString(), 0); return s;   }


    public HashMap<String,HashMap> symbol_table;

    public void syntax_error(Symbol current_symbol) {
      StringBuffer m = new StringBuffer("Error");

      if (current_symbol.left != -1) {                
        m.append(" in line " + (current_symbol.left+1));   
	    m.append(", column " + (current_symbol.right+1));
      }

      m.append(", symbol: " + (current_symbol));
      m.append(" : Syntax Error");
   
  	  System.err.println(m);
    } 

    public Object stack(int position) {
      return (((Symbol)stack.elementAt(tos+position)).value);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {


    public class Material{
     public String name;
     public Double price; 

      Material(String name, Double price){
          this.name =name;
          this.price = price;
      }
    }
    
    public class Element {
        public String name;
        public ArrayList<Component> components;
        
        public Element(String n, ArrayList<Component> c){
            name = n;
            components = c;
        }
    }
    
    public class Component {
        public String name;
        public Integer quantity;
        
        public Component(String m, Integer q){
            this.name = m;
            this.quantity = q;
        }
    }

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= prog EOF 
            { 
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // prog ::= header SEP warehouse_ SEP products 
            { parser.Tree.reduce(5,"prog",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("prog",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // tok1 ::= TOK1 TOK1 TOK1 TOK1 
            { parser.Tree.reduce(4,"tok1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // tok1 ::= tok1 TOK1 TOK1 
            { parser.Tree.reduce(3,"tok1",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok1",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // tok2 ::= TOK2 TOK2 TOK2 
            { parser.Tree.reduce(3,"tok2",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok2",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // tok11 ::= 
            { parser.Tree.reduce(0,"tok11",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok11",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // tok11 ::= tok11 TOK1 
            { parser.Tree.reduce(2,"tok11",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok11",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tok22 ::= TOK2 tok11 TOK2 tok11 
            { parser.Tree.reduce(4,"tok22",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok22",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // tok22 ::= TOK2 tok11 TOK2 tok11 TOK2 tok11 
            { parser.Tree.reduce(6,"tok22",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tok22",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // header ::= tok1 tok2 
            { parser.Tree.reduce(2,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // header ::= tok1 tok2 tok2 tok2 
            { parser.Tree.reduce(4,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // header ::= tok1 tok2 tok2 tok2 tok2 
            { parser.Tree.reduce(5,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // header ::= tok22 
            { parser.Tree.reduce(1,"header",1);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("header",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // warehouse_ ::= warehouse 
            { parser.Tree.reduce(1,"warehouse_",0);
              Object RESULT =null;
		
    System.out.println("---");

              CUP$parser$result = parser.getSymbolFactory().newSymbol("warehouse_",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // warehouse ::= material_type material_type 
            { parser.Tree.reduce(2,"warehouse",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("warehouse",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // warehouse ::= warehouse material_type material_type material_list 
            { parser.Tree.reduce(4,"warehouse",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("warehouse",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // material_type ::= BO material_list BC material_type_name PV 
            { parser.Tree.reduce(5,"material_type",0);
              Object RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		HashMap<String,Material> list = (HashMap<String,Material>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    symbol_table.put(name, list);
    
    Material lower = null;
    Material upper = null;
    
    ArrayList<Material> list2 = new ArrayList<Material>(list.values());
    for (Material m : list2){
        if (lower == null || lower.price > m.price){
            lower = m;
        }

        if (upper == null || upper.price < m.price){
            upper = m;
        }
    }

    System.out.println(name + ": less: " + lower.name + ", more: "+ upper.name);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("material_type",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // material_list ::= material 
            { parser.Tree.reduce(1,"material_list",0);
              HashMap<String,Material> RESULT =null;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Material m = (Material)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new HashMap<String, Material>(); RESULT.put(m.name, m); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("material_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // material_list ::= material_list COMMA material 
            { parser.Tree.reduce(3,"material_list",0);
              HashMap<String,Material> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		HashMap<String,Material> list = (HashMap<String,Material>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int mleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int mright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Material m = (Material)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        list.put(m.name, m);
        RESULT = list;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("material_list",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // material ::= material_name unit_price EUROKG 
            { parser.Tree.reduce(3,"material",0);
              Material RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int priceleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int priceright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Double price = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    Material tmp = new Material(name, price);
    RESULT = tmp;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("material",11, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // material_type_name ::= QUOTEDS 
            { parser.Tree.reduce(1,"material_type_name",0);
              String RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = str; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("material_type_name",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // material_name ::= QUOTEDS 
            { parser.Tree.reduce(1,"material_name",0);
              String RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = str; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("material_name",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // unit_price ::= REAL 
            { parser.Tree.reduce(1,"unit_price",0);
              Double RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double num = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = num; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("unit_price",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // products ::= 
            { parser.Tree.reduce(0,"products",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("products",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // products ::= products product 
            { parser.Tree.reduce(2,"products",0);
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("products",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // product ::= tax EURO product_name DD element_list PV 
            { parser.Tree.reduce(6,"product",0);
              Object RESULT =null;
		int taxleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).left;
		int taxright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)).right;
		Double tax = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-5)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<Element> list = (ArrayList<Element>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    System.out.println(name);
    
    for (Element e : list){

        // scorro i material type
        String type = e.name;

        for (Component c : e.components){
            Material tmp = (Material) ( (HashMap<String, Material>) symbol_table.get(type)).get(c.name);
            
            Double price = (tmp.price * c.quantity) + tax;
            System.out.println(tmp.name + " " + String.format(Locale.US, "%.2f", price) + " euro");
        }
        
    }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("product",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // element_list ::= element 
            { parser.Tree.reduce(1,"element_list",0);
              ArrayList<Element> RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Element e = (Element)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        RESULT = new ArrayList<Element>();
        RESULT.add(e);
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("element_list",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // element_list ::= element_list COMMA element 
            { parser.Tree.reduce(3,"element_list",0);
              ArrayList<Element> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<Element> list = (ArrayList<Element>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Element e = (Element)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        list.add(e);
        RESULT = list;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("element_list",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // element ::= material_type_name BO component_list BC 
            { parser.Tree.reduce(4,"element",0);
              Element RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		ArrayList<Component> list = (ArrayList<Component>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    Element tmp = new Element(name, list);
    RESULT = tmp;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("element",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // component_list ::= component 
            { parser.Tree.reduce(1,"component_list",0);
              ArrayList<Component> RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Component c = (Component)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new ArrayList<Component>(); RESULT.add(c);
              CUP$parser$result = parser.getSymbolFactory().newSymbol("component_list",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // component_list ::= component_list COMMA component 
            { parser.Tree.reduce(3,"component_list",0);
              ArrayList<Component> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		ArrayList<Component> list = (ArrayList<Component>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Component c = (Component)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
        list.add(c);
        RESULT = list;
    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("component_list",21, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // component ::= material_name quantity KG 
            { parser.Tree.reduce(3,"component",0);
              Component RESULT =null;
		int nameleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int quantityleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int quantityright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer quantity = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
    RESULT = new Component(name, quantity);

              CUP$parser$result = parser.getSymbolFactory().newSymbol("component",22, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // product_name ::= QUOTEDS 
            { parser.Tree.reduce(1,"product_name",0);
              String RESULT =null;
		int strleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int strright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String str = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = str; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("product_name",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // quantity ::= INT 
            { parser.Tree.reduce(1,"quantity",0);
              Integer RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer num = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = num; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("quantity",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // tax ::= REAL 
            { parser.Tree.reduce(1,"tax",0);
              Double RESULT =null;
		int numleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int numright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Double num = (Double)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		RESULT = num;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("tax",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
