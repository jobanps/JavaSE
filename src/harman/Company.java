package harman;

import java.util.ArrayList;

public class Company {
	
	
	String name;
	ArrayList<Employee> namo=new ArrayList<Employee>();
	public Company(String name,ArrayList<Employee> namo) {
		this.name=name;
		this.namo=namo;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Employee> getNamo() {
		return namo;
	}
	public void setNamo(ArrayList<Employee> namo) {
		this.namo = namo;
	}
	
	public void employrno() {
		System.out.println(namo.size());
	}
	public void report() {
		for(int i=0;i<namo.size();i++) {
			System.out.println("name=  "+namo.get(i).getName());
	System.out.println("department==" + namo.get(i).getDepartment());
		}
	}
	
	public void HireEmployee(Employee emp) {
		
		namo.add(emp);
		System.out.println("Employee Hired");
	}
	
	public void fireEmployee(String empname) {
		
		for(int i=0; i< namo.size();i++) {
			if(namo.get(i).getName().equals(empname)) {
				namo.get(i).setDepartment("");
				namo.get(i).setJobTitle("");
						
				
			}
		}
		
		
		
		
	}

}
