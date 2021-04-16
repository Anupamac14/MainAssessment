import java.util.ArrayList;
class StudentReq 
{
	int id;
    char section;
    String name,address,mobile,fathername,mothername,bloodgroup; 
    
	public StudentReq(int id, char section,String name, String address, String mobile, String fathername, String mothername, String bloodgroup) {
		super();
		this.id = id;
		this.section = section;
		this.name = name;
		this.address = address;
		this.mobile = mobile;
		this.fathername = fathername;
		this.mothername = mothername;
		this.bloodgroup = bloodgroup;
	}
}
public class ArrayListEx{
	public static void main(String[] args) {
		ArrayList<StudentReq> list= new java.util.ArrayList<StudentReq>();
		StudentReq s1=new StudentReq(1,'A',"Anu","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s2=new StudentReq(2,'B',"Racchu","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s3=new StudentReq(3,'C',"Buff","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s4=new StudentReq(4,'A',"Netty","Mysore","9880591071","Chandru","Kala","B+");
		StudentReq s5=new StudentReq(5,'B',"Hemi","Mysore","9880591071","Chandru","Kala","B+");
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		for(StudentReq sub:list) {
			System.out.println("ID:"+sub.id+" "+" Section : "+sub.section+" "+" Student Name : "+sub.name+" "+" Address : "+sub.address+" "+" Mobile : "+sub.mobile+" "+" Father Name : "+sub.fathername+" "+" Mother Name : "+sub.mothername+" "+" Blood Group : "+sub.bloodgroup+" ");
		}
	}
}
  	
