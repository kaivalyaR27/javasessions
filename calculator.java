import java.util.*;
import java.io.*;
import java.lang.*;
class calculator {
public static void main(String[] args) {
char symbol;
int a, b, result;
Scanner sc = new Scanner(System.in);
System.out.println("Choose an symbol: +, -, *, /");
symbol = sc.next().charAt(0);
System.out.println("Enter first number");
a = sc.nextInt();
System.out.println("Enter second number");
b = sc.nextInt();
switch (symbol) {
case '+':
result = a + b;
System.out.println(a + " + " + b + " = " + result);
break;
case '-':
result = a - b;
System.out.println(result);
break;
case '*':
result = a * b;
System.out.println(result);
break;
case '/':
result = a / b;
System.out.println(result);
break;
default:
System.out.println("No operation to perform");
break;
 }
}
}