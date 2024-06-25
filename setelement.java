import java.util.LinkedList;
class setelement{
    public static void main(String[] args) {
        LinkedList<String> colors=new LinkedList<>();
         colors.add("blue");
         colors.add("red");
         colors.add("purple");
         colors.add("white");
         colors.set(2,"grey");
         System.out.println(colors);
         //remove
         colors.removeFirstOccurrence("blue");
         System.out.println(colors);
    
        
    }
}    

