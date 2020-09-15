 import java.util.Scanner;

/**
 * This program determins which number is larger
 * @author Zach Ramirez
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //creates a scanner for user input 
    Scanner input = new Scanner(System.in);

   //prompt user for their numbers
   System.out.println("please enter an integer"); 
   int integer = input.nextInt(); 
   System.out.println("please enter your second integer");
   int secondInteger = input.nextInt(); 

   //determine which number is bigger
   if(integer >= secondInteger){
     //tell them it is bigger
     System.out.println(integer + "is bigger");
   }else{
     System.out.println(secondInteger + "is bigger");
   }
   
   
   
    
  }
}
