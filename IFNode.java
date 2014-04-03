// Mahir Kothary
// CodingForKids 
// v 1.1
// IfNode

public class IFNode implements FlowNode {
   private int valueA, valueB;
   private String operator;
   public FlowNode yes;
   public FlowNode no; 
   
   public IFNode(int var1, int var2, String operate, FlowNode yes, FlowNode no){
      this.valueA = var1;
      this.valueB = var2;
      this.operator = operate;
      this.yes = yes;
      this.no = no;
   }
   
   public String description(){
      return "A block for IF-ELSE Statements";
   }
   
   public String type(){
      return "if";
   }
   
   public boolean compute(){
      if(operator.equals("<") || operator.equalsIgnoreCase("less than")){
         return valueB < valueA;
      } else if (operator.equals(">") || operator.equalsIgnoreCase("greater than")){
         return valueA > valueB;
      } else if (operator.equals("!=") || operator.equalsIgnoreCase("not equal to")) {
         return valueA != valueB;
      } else {//equals
         return valueA == valueB;
      }
   }
   
   public boolean add(FlowNode other){
      return true;
   }
}