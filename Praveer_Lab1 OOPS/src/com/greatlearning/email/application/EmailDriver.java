package com.greatlearning.email.application;

import java.util.Scanner;

import com.greatlearning.email.credentialservice.CredentialService;
import com.greatlearning.email.credentialservice.CredentialServiceImpl;
import com.greatlearning.email.model.Employee;

public class EmailDriver {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter your First Name");
	String fn=in.next();
	System.out.println("Please enter your Last Name");
	String ln= in.next();
	Employee employee = new Employee();
	employee.setFirstName(fn);
	employee.setLastName(ln);
	String genEmailId="";
	CredentialServiceImpl dept = new CredentialServiceImpl();
	int selectDepartment;
	do{System.out.println("Please choose one Department:");
	 String[] departments={"1.Technical", "2.Admin", "3.Human Resource", "4.Legal"};
	 for(int i=0;i<4;i++) {
		 System.out.println(departments[i]);}
	 System.out.println("Please enter your choice below");
	 selectDepartment=in.nextInt();
		switch(selectDepartment) {
		case 1:
			genEmailId=dept.generateEmailid(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");break;
		case 2:
			genEmailId=dept.generateEmailid(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"admin");break;
		case  3:
			genEmailId=dept.generateEmailid(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");break;
		case 4:
			genEmailId=dept.generateEmailid(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"legal");break;
		default:
			System.out.println("Please enter a vaild value"); break;}} while (selectDepartment>4 ||  selectDepartment<1);
	String genpassword="";
genpassword=dept.generatePassword();
employee.setEmailId(genEmailId);
employee.setPassword(genpassword);
dept.showCredentials(employee);

	}}

		
	


