package com.example.student.RegistrationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.student.Registration.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {

}
