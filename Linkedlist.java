import java.util.LinkedList;
class Linkedlist{
    public static void main(String[] args){
        LinkedList<String> colors=new LinkedList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.addFirst("black");
        System.out.println(colors);
    }
}