package es.korso.entity;

public class User {

	private String login; //c�digo del usuario
	private String email; //direcci�n de correo
	private byte age; // edad
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	
	
}
