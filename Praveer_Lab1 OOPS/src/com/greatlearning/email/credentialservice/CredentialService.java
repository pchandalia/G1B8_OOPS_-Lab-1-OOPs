package com.greatlearning.email.credentialservice;

import com.greatlearning.email.model.Employee;

public interface CredentialService {
	public String generateEmailid(String firstName,String lastName,String department)
		
	;
	public String generatePassword();
	public void showCredentials(Employee employee);
	


}
