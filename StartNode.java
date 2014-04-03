// Mahir Kothary
// CodingForKids 
// v 1.1
// Terminator: Start

public class StartNode implements FlowNode {
   private String command;
   public FlowNode next; 
   
   public StartNode(String command, FlowNode next){
      this.command = command;
      this.next = next;
   }
   
   public String description(){
      return "A block for Start Statements";
   }
   
   public String type(){
      return "start";
   }   
   
   public String compute(){
      return command;
   }
   
   public boolean add(FlowNode other){
      return false;
   }
}