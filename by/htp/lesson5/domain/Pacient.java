package by.htp.lesson5.domain;

public class Pacient{
	private String name;
	private String soname;
	private String secondname;
	private String adress;
	private int numKart;
	private String diagnoz;

	public Pacient(String name, String soname, String otchestvo, String adress, int numKart, String diagnoz) {
		super();
		this.name = name;
		this.soname = soname;
		this.secondname = otchestvo;
		this.adress = adress;
		this.numKart = numKart;
		this.diagnoz = diagnoz;
	}

	public Pacient() {
		super();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoname() {
		return soname;
	}

	public void setSoname(String soname) {
		this.soname = soname;
	}

	public String getOtchestvo() {
		return secondname;
	}

	public void setOtchestvo(String otchestvo) {
		this.secondname = otchestvo;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNumKart() {
		return numKart;
	}

	public void setNumKart(int numKart) {
		this.numKart = numKart;
	}

	public String getDiagnoz() {
		return diagnoz;
	}

	public void setDiagnoz(String diagnoz) {
		this.diagnoz = diagnoz;
	}

	@Override
	public String toString() {
		return "Pacient [name=" + name + ", soname=" + soname + ", secondname=" + secondname + ", adress=" + adress
				+ ", numKart=" + numKart + ", diagnoz=" + diagnoz + "]";
	}
	

	
	
}
