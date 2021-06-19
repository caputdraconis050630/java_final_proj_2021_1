package kr.ac.inha.vo;

public class MemberVO {
	private String userId;
	private String userPass;
	private String userName;
	private String userNickName;
	private String userEmail;
	private String userHello;
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserNickName() {
		return userNickName;
	}
	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserHello() {
		return userHello;
	}
	public void setUserHello(String userHello) {
		this.userHello = userHello;
	}
	
	
	@Override
	public String toString() {
		return "MemberVO [userId=" + userId + ", userPass=" + userPass + ", userName=" + userName + ", userNickName="
				+ userNickName + ", userEmail=" + userEmail + ", userHello=" + userHello + "]";
	}
}
