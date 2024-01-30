// Practical No 04: Java practical
// Program to perform different operations on Array of Integer
import java.util.Scanner;

class ArrayOperation {
    int firstElement (int[] array) {
        return array[0];
    }
    
    int secondElement (int[] array) {
        return array[1];
    }
    
    int arrayEleAddition (int[] array) {
        int sum = 0;
        
        if (array.length == 0)
            return 0;
            
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    
}

class Practical4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayOperation objArray = new ArrayOperation();
        
        System.out.print("Enter array size: ");
        int iSizeArray = sc.nextInt();
        
        // creating an integer array        
        int[] iArray = new int[iSizeArray];
        
        System.out.print("Enter "+iSizeArray+ " elements in array : ");
        for (int i = 0; i < iSizeArray; i++) 
            iArray[i] = sc.nextInt();
            
        // printing first element of an array
        System.out.println("First element of Array  : " + objArray.firstElement(iArray));
        
        // printing second element of an array
        System.out.println("Second element of Array : " + objArray.secondElement(iArray));
        
        // calling method to add the array
        System.out.println("Sum of elements of Array: " + objArray.arrayEleAddition(iArray));
     }
}
