import java.util.LinkedList;
class addition{
    public static void main(String[] args){
        LinkedList<Integer> num=new LinkedList<>();
        num.add(1);
        num.add(8);
        int sum=0;
        for(int i=0;i<num.size();i++){
            sum=num.get(i)+sum;
        }
        System.out.print(sum);
    }
}


