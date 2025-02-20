import java.util.Scanner;
class largest
{
public static void main (String args[])
{
int a,b,c;
System.out.println("Enter three numbers:");
Scanner l=new Scanner(System.in);
a=l.nextInt();
b=l.nextInt();
c=l.nextInt();
if (a>b && a>c)
{
System.out.println("Largest number is:"+a);
} 
else if (b>c)
{
System.out.println("largest number is:"+b);
}
else
{
System.out.println("largest number is:"+c);
}
}
}

