package javaworkthree;

public class Main {

	public static void main(String[] args) {
		Student student = new Student ();
		student.setName("elif");
		student. setLastName("ýsýk");
		student.setEmail("elifisik98@gmail.com");
		student.setPassword("elifisik");
		student.setUserName("isikelif");
		
		
		Instructor instructor = new Instructor ();
		instructor.setEmail("1234");
		instructor.setLastName("demirog");
		instructor.setName("engin");
		instructor.setBranch("java");
		
		
		System.out.println(student.getName());
		System .out.println(instructor.getName());
		
	InstructorManager ýnstructor= new InstructorManager();
	ýnstructor .add(instructor);
	
		
	}
	


}
