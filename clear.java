import java.util.LinkedList;
class clear{
    public static void main(String[] args){
        LinkedList<String> colors=new LinkedList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("white");
        colors.add("green");
        colors.addLast("black");
        System.out.println(colors);
        System.out.println(colors.getLast());
        colors.clear();
        System.out.println(colors);
        
    }
}

            
        




