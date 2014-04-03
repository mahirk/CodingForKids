// Mahir Kothary
// CodingForKids 
// v 1.1
// Main Class

import java.util.*;
import java.io.*;
import javax.swing.*;

public class FlowChartMain {
   private static Map<String, Integer> values;
   private static Scanner console;
   private FlowNode starter;
   
   public static void main(String[] args){
      Intro();
      values = new HashMap<String, Integer>();
      console = new Scanner(System.in);
      String prompt = "Add your variable name and its value";
      outer: while(yesTo(prompt)){
         boolean check = add();
         inner: while(!check){
            if (yesTo("Illegal Value, Do you want to go again")){
               check = add();
            } else {
               break outer;
            }   
         }
        prompt = "Do you want to add more variables"; 
      }
      System.out.println(values);
   }
   
   public static void Intro(){
      System.out.println("Welcome to CodingForKids");
      System.out.println("Please Define Your Variables and create a question");
      System.out.println("Then create a chart to solve that problem,");
      System.out.println("Let's hope you can beat the computer");
      System.out.println("Psssst.... Remember only Integer comparison for now");
   }
   
   public static boolean add(){
      System.out.print("Don't forget the space in between them : ");
      Scanner data = new Scanner(console.nextLine());
      String name;
      int val;
      try {
         name = data.next().trim().toLowerCase();
         val = data.nextInt();
      } catch (InputMismatchException e){
         System.out.println("Ooops, seems you have done something wrong, try again");
         return false;
      }
      if(values.containsKey(name)){
         return false;
      }
      values.put(name, val);
      return true;
   }
   
   public static boolean yesTo(String prompt) {
      System.out.print(prompt + " (y/n)? ");
      String response = console.nextLine().trim().toLowerCase();
      while (!response.equals("y") && !response.equals("n")) {
         System.out.println("Please answer y or n.");
         System.out.print(prompt + " (y/n)? ");
         response = console.nextLine().trim().toLowerCase();
      }
      return response.equals("y");
   }
   
   


}
