import java.util.LinkedList;
class condition{
    public static void main(String[] args){
        LinkedList<String> tech=new LinkedList<>();
        tech.add("java");
        tech.add("C");
        tech.add("python");
        tech.add("react");
        System.out.println(tech);
        if(tech.contains("react")){
            System.out.println("react is present");
        }
        else{
            System.out.println("react is not present");
        }
        
    }
}

