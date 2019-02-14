import java.util.Scanner;
class PalindromeorNot{ 
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
int N=Scan.nextInt();
int temp=N;
int rev=0;
while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;
}
System.out.println(N+"output"+rev);
}
}
