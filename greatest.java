import java.util.*;
public class greatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        double z=sc.nextDouble();
        System.out.println("The largest number is:"+largest(x,y,z));
    }
    static double largest(double x,double y,double z){
        return Math.max(Math.max(x,y),z);
    }
}
//10
//20
//80
//the largest number is:80
    

