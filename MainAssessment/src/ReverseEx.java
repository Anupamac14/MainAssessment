import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
 
// Program to in-place reverse a list in Java
public class ReverseEx
{
    public static void main(String[] args)
    {
        LinkedList<String> colors = new LinkedList<>(Arrays.asList("RED", "BLUE", "BLACK"));
        System.out.println("List: "+colors);
        Collections.reverse(colors);
        System.out.println("List after reverse: "+colors);
    }
}
