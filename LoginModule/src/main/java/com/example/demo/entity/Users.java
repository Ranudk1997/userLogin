package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import org.hibernate.validator.constraints.Length;



@Entity
@Table(name = "User_Table")
public class Users {

	@Id
	@Column(name = "user_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	//@NotEmpty(message = "user password is mandatory")
	////@Length(min = 8,max = 14,message = "Password must be greater than 8 and less than 14")
	@Column(name = "userPassword")
	private String userPassword;

	//@NotEmpty(message = "user name is mandatory")
	@Column(name = "userName")
	private String userName;

	//@NotNull(message = "contact must be mandatory")
	@Column(name = "contactNo")
	private String contactNo;

	@Column(name = "userRole")
	private String userRole="User";

	//@NotEmpty(message = "emailid is mandatory")
	//@Email(message = "Email is mandatory")
	@Column(name = "emailId")
	private String emailId;
	
	@Column(name = "Age")
	//@NotNull(message = "Age is mandatory")
	private Integer age;
	
	@Column(name = "Gender")
	//@NotNull(message = "Gender is mandatory")
	private String gender;

	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPassword=" + userPassword + ", userName=" + userName + ", contactNo="
				+ contactNo + ", userRole=" + userRole + ", emailId=" + emailId + ", age=" + age + ", gender=" + gender
				+ "]";
	}
	
	public Users() {
		//super();	
	}

	//public Users(Integer userId,
			//@NotEmpty(message = "user password is mandatory") @Length(min = 8, max = 14, message = "Password must be greater than 8 and less than 14") String userPassword,
			//@NotEmpty(message = "user name is mandatory")  String userName,
		//	@NotNull(message = "contact must be mandatory")  String contactNo,
		//	String userRole,
		//	@NotEmpty(message = "emailid is mandatory") @Email(message = "Email is mandatory") String emailId,
	   // @NotNull(message = "Age is mandatory") Integer age,
			//@NotNull(message = "Gender is mandatory") String gender) {
	//	super();
	//	this.userId = userId;
		//this.userPassword = userPassword;
		//this.userName = userName;
		//this.contactNo = contactNo;
		//this.userRole = userRole;
	//	this.emailId = emailId;
		//this.age = age;
//		this.gender = gender;
	
	
	

}

