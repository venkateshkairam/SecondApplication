import java.util.*;
class Arthmeticoperation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
   
int a,b;
System.out.println("Enter the values of a and b ");
a=sc.nextInt();
b=sc.nextInt();


System.out.println("Addition of two numbers is="+(a+b));
System.out.println("Subtraction of two numbers is="+(a-b));
System.out.println("Multiplication of two numbers is="+(a*b));
System.out.println("Qutient of two numbers is="+(a/b));
System.out.println("Remainder of two numbers is="+(a%b));
}
}