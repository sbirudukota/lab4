/*Sravani Birudukota
 Programming fundamentals
 Summer
 Programming Assignment lab 2
Exercise #4
*/
import java.util.Arrays;

import java.util.Scanner;

public class Numbers {

	public static int nextLargest(int arrayele[], int val) {  // find next largest of number 

		int ele = -1;

		for (int i = 0; i < arrayele.length; i++) {   //finding largest number using for loop

			if (arrayele[i] > val) {

				ele = arrayele[i];
				break;   //use break if largest number found

			}

		}

		return ele;  //return largest element 

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  //create scanner object

		int size;    //initialize variables 

		int arrayele[],sortedarrayele[];  

		System.out.print("Enter no. of array elements");

		size = sc.nextInt();      

		arrayele = new int[size];

		sortedarrayele = new int[size];

		System.out.println("Enter array of elements");

		for (int i = 0; i < size; i++) {   //loop for array elements

			arrayele[i] = sc.nextInt();

			sortedarrayele[i] = arrayele[i];

		}
		sc.close();

		Arrays.sort(sortedarrayele);    //sort array elements

		System.out.println("Result:");

		for (int i = 0; i < size; i++) {

			int ele = nextLargest(sortedarrayele, arrayele[i]);

			if (ele != -1) {

				System.out.println(arrayele[i] + ": " + ele);
				

			}

			else {

				System.out.println(arrayele[i] + ": " + Integer.MAX_VALUE); 

			}
			
		}

	}
}
