package by.htp.lesson5.domain;

public class Hospital {

	private int index = 0;
	private int size = 1;
	private Pacient[] myHospital;

	public Hospital() {
	}

	public Hospital(Pacient[] myHospital) {
		super();
		this.myHospital = myHospital;
	}

	public Pacient[] getMyHospital() {
		return myHospital;
	}

	public void addPacient(Pacient pacient) {
		if (index == 0) {
			myHospital = new Pacient[size];
		}
		myHospital[index] = pacient;
		index++;
		if (index >= size) {
			size++;
			Pacient[] myArrayCopy = new Pacient[size];
			for (int i = 0; i < myHospital.length; i++) {
				myArrayCopy[i] = myHospital[i];
			}
			myHospital = myArrayCopy;
		}
	}

}