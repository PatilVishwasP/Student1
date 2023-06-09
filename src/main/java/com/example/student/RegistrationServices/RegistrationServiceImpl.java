package com.example.student.RegistrationServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.Registration.Registration;
import com.example.student.RegistrationRepository.RegistrationRepository;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationRepository regRepo;

	@Override
	public void saveReg(Registration register) {
		regRepo.save(register);
		return;
	}

	@Override
	public List<Registration> showRegister() {
		List<Registration> register = regRepo.findAll();
		return register;
	}
	
	
}
