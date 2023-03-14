package com.greatlearning.email.credentialservice;

import java.util.Random;

import com.greatlearning.email.model.Employee;

public class CredentialServiceImpl implements CredentialService{

	@Override
	public String generateEmailid(String firstName, String lastName, String department) {
		
		return firstName+lastName+"@"+department+".gl.com";
	}

	@Override
	public String generatePassword() {
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()?/><,:;[]{}-=+";
		
		String mix=caps+lower+nums+splchars;
		
		
		String mypassword=""; 
		Random random=new Random();
		
		for(int i=0;i<8;i++)
		{
		mypassword=mypassword+String.valueOf(mix.charAt(random.nextInt(mix.length())));	
		}
		return mypassword;
		
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Employee Fist Name is "+employee.getFirstName());
		System.out.println("Employee Last Name is "+employee.getLastName());
		System.out.println("Please find your company credentials below:");
		System.out.println("Employee Email-ID is "+employee.getEmailId());
		System.out.println("Employee Password is "+employee.getPassword());
	
	
		
		
	
	}
		
	}