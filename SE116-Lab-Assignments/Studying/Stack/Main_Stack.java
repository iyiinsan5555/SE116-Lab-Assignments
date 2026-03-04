import java.util.Stack;

public class Main_Stack {
    public static void main(String[] args) {
        //LIFO --> Last-in First-out

        Stack<String> myStack = new Stack<String>();

        //Adding object
        myStack.add("DOOM");
        myStack.add("Minecraft");
        System.out.println(myStack);
        System.out.println(myStack.search("Minecraft"));
        myStack.addFirst("GTA_V");
        myStack.pop();
        System.out.println(myStack);

    }
}
