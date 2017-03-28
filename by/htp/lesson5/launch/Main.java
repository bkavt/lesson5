package by.htp.lesson5.launch;


import by.htp.lesson5.domain.Hospital;
import by.htp.lesson5.domain.Pacient;
import by.htp.lesson5.logic.Edit;

public class Main {

	public static void main(String[] args) {
		
		Hospital hosp=new Hospital();
		Pacient[] listByDiagnoz; 
		Pacient[] listByKart; 
		
		Pacient p1=new Pacient("a","a","a","a",1,"a");
		Pacient p2=new Pacient("b","b","b","b",22,"c");
		Pacient p3=new Pacient("b","b","b","b",33,"a");
		Pacient p4=new Pacient("ba","ab","ab","ab",2,"b");
		Pacient p5=new Pacient("bc","bc","bc","bc",42,"c");
		
		hosp.addPacient(p1);
		hosp.addPacient(p2);
		hosp.addPacient(p3);
		hosp.addPacient(p4);
		hosp.addPacient(p5);
		
		System.out.println("List hospital");	
		Edit.showList(hosp.getMyHospital());
			
		System.out.println("list by diagnoz");	
		listByDiagnoz=Edit.findByDiagnoz(hosp.getMyHospital(),"b");
		Edit.showList(listByDiagnoz);
		System.out.println("list by diapazon kart");		
		
		listByKart=Edit.findByCartDiapazon(hosp.getMyHospital(),22,50);
		Edit.showList(listByKart);
		
		

		
		
		
		

	}

}
