package com.chainsys.application.doctor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorService {
	@Autowired
	private DoctorRepository repo;

//	@Bean
//	public void cteaterepo(DoctorRepository repo) {
//		this.repo = repo;
//
//	}
	@GetMapping("/getdoctor")
	public Doctor getDoctor(int id) {
		return repo.findById(id);
	}

	@PostMapping(value = "/newdoctor", consumes = "application/json")
	// we need given where to read data from the HTTP request and also the content
	// type ("application/json")
	public String addDoctor(@RequestBody Doctor dr) {
		repo.save(dr);
		return "rediract:/adddoctor";
	}

	@DeleteMapping("/deletedoctor")
	public String deleteDoctor(int id) {
		repo.deleteById(id);
		return "rediract:/deleteddoctor";
	}

	@GetMapping("/getalldoctors")
	public List<Doctor> getDoctors() {
		return repo.findAll();
	}

	@PostMapping(value = "/modifydoctor", consumes = "application/json")
	public String modifyDoctor(@RequestBody Doctor dr) {
		repo.save(dr);
		return "redirect:/getalldoctors";

	}

}
