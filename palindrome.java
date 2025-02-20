import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int r,temp,n,sum=0;
System.out.print("Enter a three digit number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
temp=n;
while(n>0)
{
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
{
System.out.println("is pallindrome:");
}
else
{
System.out.println("is not pallindrome:");
}
}
}

