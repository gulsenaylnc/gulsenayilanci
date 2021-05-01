package proje2;

public class UserManager {

	public void add(User user, Student student) {
		System.out.println(student.getName() + " " + user.geteMail() + " mail adresi ve " + user.getPassword() + " �ifresiyle kay�t oldu");
	}

	public void login(User user, Student student) {
		System.out.println(user.getId() + " " + student.getName() + " Giri� Yap�ld�");
	}

	public void logOut(User user, Student student) {
		System.out.println(user.getId() + " " + student.getName() + " ��k�� Yap�ld�");
	}

}
