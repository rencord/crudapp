package entity;

import java.util.ArrayList;
import java.util.Date;

public class User {
	private String name;
	private String surname; 
	private String email;
	private Date birthday;
	private Date signupdate;
	private ArrayList<Post> posts;
	private ArrayList<Comment> comments; 
	
	
	public User(String Name, String Surname, String Email, Date Birthday, Date Signupdate ){
		name= Name;
		surname = Surname;
		email= Email;
		birthday = Birthday;
		signupdate= Signupdate;
		posts = new ArrayList<Post>();
		comments = new ArrayList<Comment>();
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getSignupdate() {
		return signupdate;
	}
	public void setSignupdate(Date signupdate) {
		this.signupdate = signupdate;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
	
}
