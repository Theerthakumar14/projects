package com.xworkz.xworkzapp.tester;


import com.xworkz.xworkzapp.dto.HospitalDto;
import com.xworkz.xworkzapp.service.HospitalService;
import com.xworkz.xworkzapp.service.HospitalServiceImpl;

public class HospitalTester {
	public static void main(String[] args) {
		
	
	HospitalDto hdto =new HospitalDto("123AST45", "ModiHospital", "Rajajinagar", "Santhosh", "ENThosp", "6363622695");
	HospitalDto hdto1 =new HospitalDto("987TSA65", "General", "vijayanagar", "Theertha", "Kidneyhosp", "6361622695");
	
	HospitalService himp = new HospitalServiceImpl();
	
	
	himp.validateHospitalDetails(hdto);
	himp.validateHospitalDetails(hdto1);
	himp.display();
	himp.display("General","987TSA65");
	himp.validationForUpdate("123AST45" , " 9964920489");
	himp.display();
	himp.validateForDelete("General");
	himp.display();
	}
}
