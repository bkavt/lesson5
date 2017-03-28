package by.htp.lesson5.logic;

import by.htp.lesson5.domain.Hospital;
import by.htp.lesson5.domain.Pacient;

public abstract class Edit {
	
	
	
	public static Pacient[] findByCartDiapazon(Pacient[] myHosp, int min, int max) {
		int index=0;
		Pacient[] myList;
		myList=new Pacient[myHosp.length];
		for (int j=0; j<myHosp.length-1; j++){
			if (myHosp[j].getNumKart()>=min&&myHosp[j].getNumKart()<=max) {
				
				myList[index]=myHosp[j];
				index++;
			}
		}
		
		return myList;
	}
	
	
	
	
	

	public static Pacient[] findByDiagnoz(Pacient[] myHosp, String diagnoz) {
		
		int index=0;
		Pacient[] myList=new Pacient[myHosp.length];
		String myDiagnoz=new String();
		for (int j=0; j<myHosp.length-1; j++){
			myDiagnoz=myHosp[j].getDiagnoz();
			if (diagnoz==myDiagnoz) {
				myList[index]=myHosp[j];
				index++;
			}
		}
		
		return myList;
	}

	public static void showList(Pacient[] list) {
		for (int i=0; i<list.length-1; i++){
				if (list[i]!=null){
					System.out.println(list[i]);}
				}
			if (list.length==1){
			System.out.println("No pacient");
			}
			
	}
		
	


	
	

}
