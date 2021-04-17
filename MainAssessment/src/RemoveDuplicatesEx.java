import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
public class RemoveDuplicatesEx
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> duplicateElements = new LinkedList<Integer>();
        duplicateElements.add(1);
        duplicateElements.add(2);
        duplicateElements.add(3);
        duplicateElements.add(4);
        duplicateElements.add(1);
        duplicateElements.add(3);
        duplicateElements.add(1);
        
        System.out.println("Elements from LinkedList: "+ duplicateElements);
        
        List<Integer> newList = duplicateElements.stream().distinct().collect(Collectors.toList());
        
        System.out.println("Element from new LinkedList: "+ newList);
        
        //boolean i = duplicateElements.remove(duplicateElements.contains(duplicateElements));
        //System.out.println("Elements from LinkedHashSet: "+ i);
        //System.out.println("Elements from LinkedList: "+ duplicateElements);
        
    }
}
