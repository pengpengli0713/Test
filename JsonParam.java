package com.salesforce.oauth;

import java.io.Serializable;

public class JsonParam implements Serializable{

	private static final long serialVersionUID = 1L;
	private String status;
	private String leadSource;
	private String yKIdentity;
	private String company;
	private String industry;
	private String province;
	private String city;
	private String numberOfEmployees;
	private String website;
	private String lastName;
	private String email;
	private String firstName;
	private String mobile;
	private String middleName;
	private String title;
	private String suffix;
	private String phone;
	private String department;
	private String productName;
	private String productCategory;
	private String projectReq;
	private String verdorName;
	private String projectLife;
	private String projectBudget;
	private String casenum;
	
	public JsonParam(String status,String leadSource,String yKIdentity,String company,String industry,
				String province,String city,String numberOfEmployees,String website,String lastName,String email,
				String firstName,String mobile,String middleName,String title,String suffix,String phone,String department,
				String productName,String productCategory,String projectReq,String verdorName,String projectLife,
				String projectBudget,String casenum){
		this.status = status;
		this.leadSource = leadSource;
		this.yKIdentity = yKIdentity;
		this.company = company;
		this.industry = industry;
		this.province = province;
		this.city = city;
		this.numberOfEmployees = numberOfEmployees;
		this.website = website;
		this.lastName = lastName;
		this.email = email;
		this.firstName = firstName;
		this.mobile = mobile;
		this.middleName = middleName;
		this.title = title;
		this.suffix = suffix;
		this.phone = phone;
		this.department = department;
		this.productName = productName;
		this.productCategory = productCategory;
		this.projectReq = projectReq;
		this.verdorName = verdorName;
		this.projectLife = projectLife;
		this.projectBudget = projectBudget;
		this.casenum = casenum;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public String getyKIdentity() {
		return yKIdentity;
	}
	public void setyKIdentity(String yKIdentity) {
		this.yKIdentity = yKIdentity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(String numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProjectReq() {
		return projectReq;
	}
	public void setProjectReq(String projectReq) {
		this.projectReq = projectReq;
	}
	public String getVerdorName() {
		return verdorName;
	}
	public void setVerdorName(String verdorName) {
		this.verdorName = verdorName;
	}
	public String getProjectLife() {
		return projectLife;
	}
	public void setProjectLife(String projectLife) {
		this.projectLife = projectLife;
	}
	public String getProjectBudget() {
		return projectBudget;
	}
	public void setProjectBudget(String projectBudget) {
		this.projectBudget = projectBudget;
	}
	public String getCasenum() {
		return casenum;
	}
	public void setCasenum(String casenum) {
		this.casenum = casenum;
	}
	
}
