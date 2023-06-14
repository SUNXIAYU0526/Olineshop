package com.example.demo.entity;

public class OrdersEntity {
	/** 会員番号 */
	private String custNo;
	/** 氏名 */
	private String custname;
	/** ふりがな */
	private String furigana;
	/** メールアドレス */
	private String mailAddress;
	/** パスワード */
	private Integer password;
	/** 生年月日 */
	private String birthday;
	/** 性別 */
	private String sex;
	/** 〒 */
	private Integer ZIP;
	/** お届け先 */
	private String addrsess;
	/** お電話番号 */
	private Integer telNo;
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getFurigana() {
		return furigana;
	}
	public void setFurigana(String furigana) {
		this.furigana = furigana;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getZIP() {
		return ZIP;
	}
	public void setZIP(Integer zIP) {
		ZIP = zIP;
	}
	public String getAddrsess() {
		return addrsess;
	}
	public void setAddrsess(String addrsess) {
		this.addrsess = addrsess;
	}
	public Integer getTelNo() {
		return telNo;
	}
	public void setTelNo(Integer telNo) {
		this.telNo = telNo;
	}

	
	
}
