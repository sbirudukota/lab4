/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
Exercise #1
*/
public class Box1{
	
	   public int size = 0;   //declare & initialize size

	   public void printBox() {         
	       for (int i = 0; i < size; ++i) {
	           for (int j = 0; j < size; ++j) {
	               System.out.print("*");
	           }
	           System.out.println();
	       }
	   }
	  
	   public void printBox(char c) {    //overloaded method   
	       for (int i = 0; i < size; ++i) {
	           for (int j = 0; j < size; ++j) {
	               System.out.print(c);
	           }
	           System.out.println();    //separate rows and columns
	       }
	   }

	   public static void main(String[] args) {
	    
	       Box1 b = new Box1();    		//create an object
	       b.size = 5;
	       b.printBox();
	       b.printBox('B');             //invoke overloaded method
	   }

	}

