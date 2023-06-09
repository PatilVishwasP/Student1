package com.example.student.RegistrationController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.student.Registration.Registration;
import com.example.student.RegistrationServices.RegistrationService;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistrationService regservice;
	
	//http:localhost:8080/NewReg
	@RequestMapping("/NewReg")
	public String register() {
		return "NewReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(Registration register, Model model) {
		regservice.saveReg(register);
		model.addAttribute("msg", "Record is saved");
		return "NewReg";
	}
	//http:localhost:8080/showReg
	@RequestMapping("/showReg")
	public String showRegister(Model model) {
		
		List<Registration> showRegister = regservice.showRegister();
		model.addAttribute("showRegister", showRegister);
		return "search_results";
	}

}
