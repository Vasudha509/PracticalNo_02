// Practical No. 02
import java.util.Scanner;
class ArithemeticOperations {
  
  // Function to perform integer addition of two numbers.  
  public int addition(int iNum1, int iNum2) {
	  return iNum1 + iNum2;
  }

  // Function to perform integer subtraction to two numbers.
  public int subtraction(int iNum1, int iNum2) {
	  return iNum1 - iNum2;
  }

  // Function to perform integer multiplication to two numbers.
  public int multiplication(int iNum1, int iNum2) {
	  return iNum1 * iNum2;
  }

  // Function to perform integer division to two numbers.
  public int division(int iNum1, int iNum2) {
	  if (iNum2 == 0)
	  	return -1;
	  else
	  	return iNum1 / iNum2;
  }

  // Function to perform integer modulus of two numbers.
  public int modulus(int iNum1, int iNum2) {
	  return iNum1 % iNum2;
  }
  
  // Function to perform pre-increment operation on integer.
  public int increament(int iNum) {
    return ++iNum;
  }
  
  // Function to perform pre-decrement operation on integer.
  public int decrement(int iNum) {
    return --iNum;
  }
  
  // Function to perform negation of number.
  public int negation(int iNum) {
    return -iNum;
  }
}

class CalculatorProgram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArithemeticOperations objArithemetic = new ArithemeticOperations();
    
    // Taking user input
    System.out.print("Enter first number  : ");
    int iNum1 = sc.nextInt();
    
    System.out.print("Enter second number : ");
    int iNum2 = sc.nextInt();
    
    // Calling required functions
    int iResultAdd = objArithemetic.addition(iNum1, iNum2);
    int iResultSub = objArithemetic.subtraction(iNum1, iNum2);
    int iResultMul = objArithemetic.multiplication(iNum1, iNum2);
    int iResultDiv = objArithemetic.division(iNum1, iNum2);
    int iResultMod = objArithemetic.modulus(iNum1, iNum2);
    int iResultInc = objArithemetic.increament(iNum1);
    int iResultDec = objArithemetic.decrement(iNum1);
    int iResultNeg = objArithemetic.negation(iNum1);
    
    // Printing result on the screen
    System.out.println("\n");
    System.out.println("1. Addition       ("+iNum1+" + "+iNum2+ ") : "+ iResultAdd);
    System.out.println("2. Subtraction    ("+iNum1+" - "+iNum2+ ") : "+ iResultSub);
    System.out.println("3. Multiplication ("+iNum1+" * "+iNum2+ ") : "+ iResultMul);
    System.out.println("4. Division       ("+iNum1+" / "+iNum2+ ") : "+ iResultDiv);
    System.out.println("5. Modulus        ("+iNum1+" % "+iNum2+ ") : "+ iResultMod);
    System.out.println("6. Increment      (++"+iNum1+")   : "+ iResultInc);
    System.out.println("7. Decrement      (--"+iNum1+")   : "+ iResultDec);
    System.out.println("8. Negation       (-"+iNum1+")    : "+ iResultNeg);
  }
}

