// Practical No. 02
import java.util.Scanner;

class Practical {
public static int addition(int num1, int num2) {
	return num1 + num2;
}

public static int subtraction(int num1, int num2) {
	return num1 - num2;
}

public static int multiplication(int num1, int num2) {
	return num1 * num2;
}

public static int division(int num1, int num2) {
	if (num2 == 0)
		return -1;
	else
		return num1 / num2;
}

public static int modulus(int num) {
	return num % 10;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int num1 = sc.nextInt();
    
    System.out.print("Enter second number : ");
    int num2 = sc.nextInt();
    
    int iResultAdd = addition(num1, num2);
    int iResultSub = subtraction(num1, num2);
    int iResultMul = multiplication(num1, num2);
    int iResultDiv = division(num1, num2);
    int iResultMod = modulus(num1);
    
    System.out.println("Addition : "+iResultAdd);
    System.out.println("Subtraction : "+iResultSub);
    System.out.println("Multiplication : "+iResultMul);
    System.out.println("Division : "+iResultDiv);
    System.out.println("Modulus : "+iResultMod);        
  }
}

