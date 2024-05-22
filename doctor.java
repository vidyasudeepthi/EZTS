package Hospital;

import Hospital.person;

public class doctor extends person {
	private String speciality;
	private String disease;
	private int bedno;
	private int roomno;
	private int floor;
	
	
	public doctor(String a,int b,String c,String t,String s,int v, int y,int x) {
		super(a,b,c);
		this.speciality=t;
		this.disease=s;
		this.bedno=v;
		this.roomno=y;
		this.floor=x;
	}
	void doctorOutput() {
		super.personOutput();
		System.out.println("doctor speciality = "+this.speciality);
		System.out.println("patient  disease = "+this.disease);
		System.out.println("patient  bedno = "+this.bedno);
		System.out.println("nurse  roomno = "+this.roomno);
		System.out.println("nurse  floor = "+this.floor);
	}

}


