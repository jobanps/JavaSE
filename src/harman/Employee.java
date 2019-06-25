package harman;

public class Employee {
	String name;
	int id;
	String department;
	String jobTitle;
	 public Employee (String name,int id,String department,String jobTitle) {
		 this.name=name;
		 this.id=id;
		 this.department=department;
		 this.jobTitle=jobTitle;
		 
	 }
	 public Employee (String name,String jobTitle) {
		 this.name=name;
		 this.id=0;
		 this.department="";
		 this.jobTitle=jobTitle;
		 
	 }
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Employee () {
		 this.name="";
		 this.id=0;
		 this.department="";
		 this.jobTitle="";
		 
	 }
	 
	
	
	
	

}
