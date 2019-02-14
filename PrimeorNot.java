import java.util.Scanner;
class PrimeorNot{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int flag=0;
for(int i=2;i<N;i++){
if(N%i==0){
flag=1;
break;
}
else
continue;
}
if(flag==1)
System.out.println("NOT PRIME");
else
System.out.println("PRIME");
}
}
