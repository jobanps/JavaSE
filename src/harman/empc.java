package harman;

import java.util.ArrayList;
import java.util.Scanner;

public class empc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Employee ob1 = new Employee("John Smith",9,"IT","Manager");
		 Employee ob2=new Employee("name",2,"department","jobTitle");
        Employee ob3=new Employee("harman",7,"ut","owner");
       
        
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        
        
        Company objComp = new Company("Joban", list);
        
        objComp.employrno();
        objComp.report();
        
        Employee obj4 = new Employee("Joban", "Ownrs");
        
        objComp.HireEmployee(obj4);
      
        
        objComp.employrno();
       
        
        objComp.fireEmployee("Joban");
        
        objComp.employrno();
        
        
		
	
        
		  }

}
