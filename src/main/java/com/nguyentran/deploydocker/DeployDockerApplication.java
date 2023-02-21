package com.nguyentran.deploydocker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nguyentran.deploydocker.Entity.Tour;
import com.nguyentran.deploydocker.Reponsitory.TourReponsitory;

@SpringBootApplication
@RestController
public class DeployDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeployDockerApplication.class, args);
	}
	
	@Autowired
	private TourReponsitory tourReponsitory;
	
	@GetMapping("/api/gettours")
	public ResponseEntity<?> getTours(){
		try {
			return ResponseEntity.ok(tourReponsitory.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
		
	}
	
	@PostMapping("/api/addtour")
	public ResponseEntity<?> addTours(@RequestBody Tour tour){
		try {
			Tour t = tourReponsitory.save(tour);
			 return ResponseEntity.ok(t);
		} catch(Exception e) {
			 return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}

}
