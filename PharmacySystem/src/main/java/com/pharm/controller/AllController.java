package com.pharm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pharm.entities.AllotStock;
import com.pharm.entities.BookMedicine;
import com.pharm.entities.Medicine;
import com.pharm.entities.Pharmacist;
import com.pharm.entities.UserRegister;
import com.pharm.services.AllotStockService;
import com.pharm.services.BookMedicineService;
import com.pharm.services.MedicineService;
import com.pharm.services.PharmacistService;
import com.pharm.services.UserService;


@RestController
public class AllController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PharmacistService pharmService;
	
	@Autowired
	private MedicineService medService;
	
	@Autowired
	private BookMedicineService bookmedService;
	
	@Autowired
	private AllotStockService allotService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Online Pharmacy Management System";
	}
	
	
			//GET USERS
	@GetMapping("/users")
	public List<UserRegister> getUsers(){
		return this.userService.getUsers();
	}
	
			//GET ONE USER
	@GetMapping("/users/{userId}")
	public UserRegister getUsers(@PathVariable int userId) {
		return this.userService.getUsers(userId);
	}
			//ADD NEW USERS
	@PostMapping("/users")
	public UserRegister addUser(@RequestBody UserRegister user) {
		return this.userService.addUser(user);
	}
	
	
			//GET PHARMACIST
	@GetMapping("/pharmacist")
	public List<Pharmacist> getpharma(){
		return this.pharmService.getpharma();
	}
			//GET ONE PHARMACIST
	@GetMapping("/pharmacist/{pharmacistId}")
	public Pharmacist getpharm(@PathVariable int pharmacistId) {
		return this.pharmService.getpharma(pharmacistId);
	}
			//ADD NEW PHARMACIST
	@PostMapping("/pharmacist")
	public Pharmacist addPharmacist(@RequestBody Pharmacist pharmacist) {
		return this.pharmService.addPharmacist(pharmacist);
	}
			//UPDATE PHARMACIST
	@PutMapping("/pharmacist")
	public Pharmacist updatePharmacist(@RequestBody Pharmacist pharmacist) {
		return this.pharmService.updatePharmacist(pharmacist);
	}
	
			//DELETE PHARMACIST
	@DeleteMapping("/pharmacist/{pharmacistId}")
	public ResponseEntity<HttpStatus> deletePharmacist(@PathVariable int pharmacistId){
		try {
			this.pharmService.deletePharmacist(pharmacistId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
			//GET MEDICINE
	@GetMapping("/medicine")
	public List<Medicine> getmedicines(){
		return this.medService.getmedicines();		
	}
	
			//GET ONE MEDICINE
	@GetMapping("/medicine/{medicineId}")
	public Medicine getmedicines(@PathVariable int medicineId) {
		return this.medService.getmedicines(medicineId);
	}
	
			//ADD MEDICINE
	@PostMapping("/medicine")
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		return this.medService.addMedicine(medicine);
	}
	
			//UPDATE MEDICINE
	@PutMapping("/medicine")
	public Medicine updateMedicine(@RequestBody Medicine medicine) {
		return this.medService.updateMedicine(medicine);
	}
	
		//DELETE MEDICINE
	@DeleteMapping("/medicine/{medicineId}")
	public ResponseEntity<HttpStatus> deleteMedicine(@PathVariable int medicineId){
		try {
			this.medService.deleteMedicine(medicineId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

			
	
			//BOOK MEDICINE
	@GetMapping("/bookmed")
	public List<BookMedicine> getbookmed(){
		return this.bookmedService.getbookmed();
	}
	
			//GET ONE BOOK MEDICINE
	@GetMapping("/bookmed/{medId}")
	public BookMedicine getbookmed(@PathVariable int medId) {
		return this.bookmedService.getbookmed(medId);
	}
	
			//ADD BOOK MEDICINE
	@PostMapping("/bookmed")
	public BookMedicine addbookmed(@RequestBody BookMedicine medbook) {
		return this.bookmedService.addbookmed(medbook);
	}
	
	
			//ALLOT STOCK
	@GetMapping("/allot")
	public List<AllotStock> getallot(){
		return this.allotService.getallot();
	}
	
			//GET ONE ALLOT STOCK
	@GetMapping("/allot/{allotId}")
	public AllotStock getallot(@PathVariable int allotId) {
		return this.allotService.getallot(allotId);
	}
	
			//ADD NEW STOCK
	@PostMapping("/allot")
	public AllotStock addAllot(@RequestBody AllotStock allotstock) {
		return this.allotService.addAllot(allotstock);
	}
	
			//UPDATE ALLOT STOCK
	@PutMapping("/allot")
	public AllotStock updateAllot(@RequestBody AllotStock allotstock) {
		return this.allotService.updateAllot(allotstock);
	}
	
			//DELETE ALLOT STOCK
	@DeleteMapping("/allot/{allotId}")
	public ResponseEntity<HttpStatus> deleteAllot(@PathVariable int allotId){
		try {
			this.allotService.deleteAllot(allotId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
