package com.sowing.seed.controller;

import java.util.HashMap;
import java.util.Map;

import org.omg.PortableServer.RequestProcessingPolicyOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sowing.seed.model.Farmer;

@RestController
public class FarmerController {
	private static Map<Integer, Farmer> farmers = new HashMap<>();
	static {
		Farmer f1 = new Farmer();
		f1.setName("ABC");
		f1.setPhone("98777773");
		Farmer f2 = new Farmer();
		f2.setName("XYZ");
		f2.setPhone("32555676");
		farmers.put(1, f1);
		farmers.put(2, f2);

	}

	@RequestMapping(value = "/farmers")
	public ResponseEntity<Object> getAllFarmers() {
		return new ResponseEntity<>(farmers.values(), HttpStatus.OK);

	}

	@RequestMapping(value = "/farmers/{id}")
	public ResponseEntity<Object> getFarmerByID(@PathVariable("id") String id) {
		return new ResponseEntity<Object>(farmers.get(Integer.parseInt(id)), HttpStatus.OK);
	}

	@RequestMapping(value = "/farmers", method = RequestMethod.POST)
	public ResponseEntity<Object> createFarmer(@RequestBody Farmer farmer) {
		farmers.put(farmers.size() + 1, farmer);
		return new ResponseEntity<Object>("Farmer added successfully", HttpStatus.CREATED);
	}

}
