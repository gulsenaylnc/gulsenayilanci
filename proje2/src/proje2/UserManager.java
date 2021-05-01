package proje2;

public class UserManager {

	public void add(User user, Student student) {
		System.out.println(student.getName() + " " + user.geteMail() + " mail adresi ve " + user.getPassword() + " şifresiyle kayıt oldu");
	}

	public void login(User user, Student student) {
		System.out.println(user.getId() + " " + student.getName() + " Giriş Yapıldı");
	}

	public void logOut(User user, Student student) {
		System.out.println(user.getId() + " " + student.getName() + " Çıkış Yapıldı");
	}

}
