import java.util.Scanner;
public class duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int [a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for(int j=1;j<a;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                    return;
                }
            }
        }
    }
}
//output
//3
//1
//2
//1
//1
