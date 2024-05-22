package Hospital;

public class person {
	private String name;
	private int age;
	private String gender;
	public person(String a,int b, String c) {
		this.name=a;
		this.age=b;
		this.gender=c;
	}
	void personOutput() {
		System.out.println("name= " + this.name);
		System.out.println("age= " + this.age);
		System.out.println("gender= " + this.gender);
		
	}

}



