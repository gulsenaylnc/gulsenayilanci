package proje2;

public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getName() + " adl� ��renciye " + student.getNumber() + " numaras� verildi");
		System.out.println(student.getNumber() + " numaral� ��renci " + student.getCourses() + " kursuna kay�t oldu");
	}
	
}
