package Postassessment2;


public class EmployeeBo {

	public void calincomeTax(EmployeeVo p) {
		double annualincome=p.getAnnualincome();
		
		if(annualincome<300000) {
			p.setIncometax(0);
		}
		else if(annualincome<600000){
			p.setIncometax(0.1*annualincome);
		}
		else{
			p.setIncometax(0.2*annualincome);
		}
		
		
	}

}