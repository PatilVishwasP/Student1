package com.example.student.RegistrationServices;



import java.util.List;

import com.example.student.Registration.Registration;

public interface RegistrationService {
	public List<Registration> showRegister();

	public void saveReg(Registration register);
}
