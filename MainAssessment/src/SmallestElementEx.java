import java.util.TreeSet;  
class SmallestElementEx{  
 public static void main(String args[]){  
 TreeSet<Integer> set=new TreeSet<Integer>();  
         set.add(24);  
         set.add(66);  
         set.add(12);  
         set.add(15); 
         System.out.println(set);
         System.out.println(" ");
         System.out.println("Min: "+set.pollFirst());  
         System.out.println("MAx: "+set.pollLast());
 	}
}
         
  
