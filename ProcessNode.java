// Mahir Kothary
// CodingForKids 
// v 1.1
// ProcessNode

public class ProcessNode implements FlowNode {
   private String command;
   public FlowNode next; 
   
   public ProcessNode(String command, FlowNode next){
      this.command = command;
      this.next = next;
   }
   
   public String description(){
      return "A block for Process Statements";
   }
   
   public String type(){
      return "process";
   }   
   
   public String compute(){
      return command;
   }
   
   public boolean replace(FlowNode other){
      return true;
   }
}