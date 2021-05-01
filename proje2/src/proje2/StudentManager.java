package proje2;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getName() + " adlı öğrenciye " + student.getNumber() + " numarası verildi");
		System.out.println(student.getNumber() + " numaralı öğrenci " + student.getCourses() + " kursuna kayıt oldu");
	}
	
}
