package pl.edu.agh.ki.mwo.model;

import pl.edu.agh.ki.mwo.persistence.UserDatabase;

public class User {
	private static int userIdGenerator = 0;
	protected int id;
	protected String login;
	protected String firstName;
	protected String lastName;
	protected String sex;
	protected int year;
	protected int month;
	protected int day;
	protected String university;
	protected String domain;
	protected String email;
	protected String address;
	protected String telephone;
	protected boolean isPrelegent;
	protected boolean isRecenzent;
	protected boolean isAdmin;
	private String password;
	
	public User(String login, String firstName, String lastName, String sex, int year, int month, int day, String university, String domain, String email, String address, String telephone, boolean isPrelegent, boolean isRecenzent, boolean isAdmin, String password) {
		System.out.println("UserController login='" + login + "' firstName='" + firstName + "' lastName='" + lastName + "' sex='" + sex + "' year=" + year + " month=" + month + " day=" + day + " university='" + university + "' domain='" + domain + "' e-mail='" + email + "' isPrelegent=" + isPrelegent + " isRecenzent=" + isRecenzent + " isAdmin=" + isAdmin);
		//if(!UserDatabase.getInstance().hasUser(login)){
			userIdGenerator++;
			this.id = userIdGenerator;
			this.login = login;
			this.firstName = firstName;
			this.lastName = lastName;
			this.sex = sex;
			this.year = year;
			this.month = month;
			this.day = day;
			this.university = university;
			this.domain = domain;
			this.email = email;
			this.address = address;
			this.telephone = telephone;
			this.isPrelegent = isPrelegent;
			this.isRecenzent = isRecenzent;
			this.isAdmin = isAdmin;
			this.password = password;
		//}
	}
	
	public static int getUserIdGenerator(){
		return userIdGenerator;
	}
	
	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	public String getUniversity() {
		return university;
	}
	
	public String getDomain() {
		return domain;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getTelephone() {
		return telephone;
	}

	public boolean getIsPrelegent() {
		return isPrelegent;
	}
	public void setIsPrelegent(boolean isPrelegent) {
		this.isPrelegent = isPrelegent;
	}
	
	public boolean getIsRecenzent() {
		return isRecenzent;
	}
	public void setIsRecenzent(boolean isRecenzent) {
		this.isRecenzent = isRecenzent;
	}
	
	public boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	public boolean getLoginPassCorrect(String login, String password){
		if(this.login.equals(login)) if(this.password.equals(password)) return true;
		return false;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getPassTooShort() {
		return this.password.length()<5;
	}
}

