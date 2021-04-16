import java.util.HashSet;  
class Book {  
	int id;  
	String name,author;  
	  
	public Book(int id, String name, String author) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
	}  
}  
public class HashSetEx {
	public static void main(String[] args) {  
		HashSet<Book> set=new HashSet<Book>();  
		Book b1=new Book(101,"My Journey","Dr. A.P.J. Abdul Kalam");  
		Book b2=new Book(102,"Saffron Swords","Manoshi Sinha Rawal");  
		Book b3=new Book(103,"The Braille edition of the book Exam Warriors","Narendra Modi");  
		set.add(b1);  
		set.add(b2);  
		set.add(b3);
		
		int i=set.hashCode();
        System.out.println("HashCode: "+i);
        System.out.println(" ");
        
        
		System.out.println("Set:");
		for(Book b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author);  
		}
		System.out.println(" ");
		
		HashSet<Book> set1=new HashSet<Book>();
		Book b4=new Book(105,"The Overstory","Richard Powers");  
		Book b5=new Book(106,"Girl Power: Indian Women Who Broke The Rules","Neha J Hiranandani");  
		Book b6=new Book(107,"Sridevi: Girl Woman Superstar","Satyarth Nayak"); 
		set1.add(b4);  
		set1.add(b5);  
		set1.add(b6);
		System.out.println("Set1");
		for(Book b:set1){  
			System.out.println(b.id+" "+b.name+" "+b.author);  
		}
		 if(set.equals(set1))
             System.out.println("Both Objects are equal. ");
         else
             System.out.println("Both Objects are not equal. ");
		 System.out.println(" ");
		 
		set.addAll(set1);
        System.out.println("After adding Set1 to Set: ");  
		for(Book b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author);  
		}
		System.out.println(" ");
		
		System.out.println("Size of set after adding Set1");
		System.out.println(set.size());
		System.out.println(" ");
		
		System.out.println("RemoveAll Set1:");
		set.removeAll(set1);
		for(Book b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author);  
		}
		System.out.println(" ");

		System.out.println("Remove if Statement contains 'Saffron':");
		set.removeIf(b->(b.name).contains("Saffron"));  
		for(Book b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author);  
		}
		System.out.println(" ");
		System.out.println("Is Set Empty?");
		System.out.println(set.isEmpty()); 
		System.out.println(" ");
   
		System.out.println("Clear:");
		set.clear();
		for(Book b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author);  
		}
	}  
}

