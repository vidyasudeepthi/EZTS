package Hospital;
import Hospital.person;
public class nurse extends person {
	private String disease;
	private String speciality;
	private int bedno;
	private int roomno;
	private int floor;
	
	public patient(String a,int b,String c,String t,String g,int v,int y,int x) {
		super(a,b,c,t,g,v,y,x);
		this.speciality=t;
		this.disease=g;
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
