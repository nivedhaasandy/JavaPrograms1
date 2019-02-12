import java.util.Scanner;
class LeaporNot{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int year=scan.nextInt();
if(year%4==0)
if(year%100==0)
if(year%400==0)
System.out.println("year is LEAP");
else
System.out.println("NOT");
else
System.out.println("LEAP");
else
System.out.println("year is not LEAP");
}
}
