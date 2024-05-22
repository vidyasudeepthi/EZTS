package Hospital;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the person name");
	  String m=sc.next();
	  System.out.println("Enter the person age");
	  int p=sc.nextInt();
	  System.out.println("Enter the person gender");
	  String s=sc.next();
	  System.out.println("Enter the doctor speciality");
	  String t=sc.next();
	  System.out.println("Enter the patient disease");
	  String g=sc.next();
	  System.out.println("Enter the patient bedno");
	  int v=sc.nextInt();
	  System.out.println("Enter the nurse roomno");
	  int y=sc.nextInt();
	  System.out.println("Enter the nurse floor");
	  int x=sc.nextInt();
	  doctor d=new doctor(m,p,s,t,g,v,y,x);
	  d.doctorOutput();
	  
  }
}

