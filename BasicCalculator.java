
import java.util.Scanner;
import java.lang.Math;
class MyCalculator {
    public static void main (String args []){
      System.out.println("select operands- a="); 
      Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
           System.out.println("and b=");
       int b = scan.nextInt();
       
           
      
          
       
          
           System.out.println("select operation to perform");
      Scanner string = new Scanner(System.in);
      String operation = string.nextLine();
          
          
          
          
           double o = 0;
       System.out.println("you selected- "+operation);
           
           switch(operation) {
             case "add":
                  o = a+b;
               break;
             case "subtract":
                  o = a-b;
               break;
             case "multipy":
                   o = a*b;
               break;
             case "division":
                   o = a/(double)b;
               break;
             default:
               System.out.println("select only - 'add,subtract,multiply,division' as operation");
               
           }
         
      System.out.println("output is="+o);
      
    }
}
