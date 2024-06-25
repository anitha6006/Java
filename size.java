import java.util.LinkedList;
class remove{
    public static void main(String[] args){
        LinkedList<String> colors=new LinkedList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("purple");
        colors.add("red");
        colors.removeFirst();
        System.out.println(colors);
        //removeLast
        colors.removeLast();
        System.out.println(colors);
        //size
        colors.add("black");
        System.out.println(colors.size());
    }
}
    

