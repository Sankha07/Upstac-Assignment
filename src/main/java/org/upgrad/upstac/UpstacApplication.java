package org.upgrad.upstac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UpstacApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpstacApplication.class, args);
	}
@getMapping
	@PreAuthorize("hasAnyRole('Tester')");
	public List<TestRequest> getForTester (){
public class 'LabRequestController';
User tester=userLoggedinService.getLoggedInuser();
return testrequestupdateservice.updateLabTest(id,createLabResult,tester);
		@GetMapping("/in-queue")
				@Preauthorize(hasAnyRole('DOCTOR')")
						public class 'ConsultationController';
						public List<TestRequest> getForConsultations(){
						User Doctor=userLoggedinService.getforDoctor();
						User Doctor=userLoggedinService.assignforconsultaion();
						User Doctor=userLoggedinService.updateconsultaion();
						return testrequestupdateservice.updateLabTest(id,createLabResult,tester);
						}
	}


}
