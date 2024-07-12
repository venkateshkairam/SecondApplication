import java.io.*;
import java.util.*;

class Average
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int s1,s2,s3,s4,s5,s6,sum;
float avg;
System.out.println("Enter the marks of student");
s1=sc.nextInt();
s2=sc.nextInt();
s3=sc.nextInt();
s4=sc.nextInt();
s5=sc.nextInt();
s6=sc.nextInt();
if(s1>=35 || s2>=35 || s3>=35 || s4>=35 || s5>=35 || s6>=35)
   System.out.println("Fail");
else
{
     sum= s1+s2+s3+s4+s5+s6;
     avg=sum/6.0f;
if(avg>=35 && avg<50)
System.out.println("third division");
else if(avg>=60 && avg<70)
System.out.println("second division");
else
System.out.println("distinction");
}
}
}  		

