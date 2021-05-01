package proje2;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setPassword("1234");
		user.seteMail("gulsenaylnc@gmail.com");
		
		Student student = new Student();
		student.setName("Gülsena Yılancı");
		student.setNumber(987);
		student.setCourses("Java");
		
		Instructor instructor = new Instructor();
		instructor.setName("Engin Demiroğ");
		instructor.setBranch("C#");
		
		
		UserManager userManager = new UserManager();
		userManager.add(user, student);
		userManager.login(user, student);
		userManager.logOut(user, student);
		
		StudentManager studenManager = new StudentManager();
		studenManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor, user);
				
	
	}

}
