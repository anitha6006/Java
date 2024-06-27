import java.util.Scanner;
public class Multipletable{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        System.out.print("Enter the length of the table:");
        int n=sc.nextInt();
        int c=1;
        for(int i=1;i<=n;i++){
            c=a*i;
            System.out.println(i+" * "+a+" = "+c);
        }
sc.close();
    }
}
//Enter the number:2
//Enter the length of the table:5
//1*2=2
//2*2=4
//3*2=6
//4*2=8
//5*2=10    