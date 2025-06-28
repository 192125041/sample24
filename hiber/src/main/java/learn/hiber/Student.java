package learn.hiber;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	
   int kodId;
   String name;
   String addr;
   int yop;
   
   public Student(int kodId,String name,String addr,int yop) {
	   this.kodId=kodId;
	   this.name=name;
	   this.addr=addr;
	   this.yop=yop;
   }
}
