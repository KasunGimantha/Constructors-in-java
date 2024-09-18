public class Student{
	public int id;
    public String firstName;
	public String lastName;
	public int age;
	
	public Student(){}//default constructor
	
	public Student(int id){
		this.id = id;
	}
	
	public Student(int id,String firstName){
		this.id = id;
		this.firstName = firstName;
	}

    public Student(int id,String firstName,String lastName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}


     public static void main(String args[]){
		 Student student1 = new Student();
		 Student student2 = new Student(1);
		 Student student3 = new Student(2,"Kamal");
		 Student student4 = new Student(3,"Nimal","Perera");
		 
		 
	 System.out.println(student4.firstName);
	 System.out.println(student4.firstName + " "+student4.lastName+" "+student4.age);
	 }
	 
	 
	
}
