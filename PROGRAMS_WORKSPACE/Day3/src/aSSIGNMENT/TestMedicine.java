package aSSIGNMENT;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine m[]=new Medicine[5];
		Random r=new Random();
		Date d=new Date();
		Scanner sc= new Scanner(System.in);
		
		int num=r.nextInt(3)+1;
		for(int i=0;i<5;i++)
		{
			if(num==1)
			{

				m[i]=new Tablet();
				System.out.println("Price of tablet");
				m[i].setPrice(sc.nextInt());
				
				d.setDate(sc.nextInt());
				d.setMonth(sc.nextInt()-1);
				d.setYear(sc.nextInt()-1900);
				m[i].setExpiry_date(d);
				
				m[i].getExpiry_date();
				m[i].getPrice();
				m[i].displayLabel();
				
			}
			else if (num==2) 
			{
				
				m[i]=new Syrup();
				System.out.println("Price of syrup");
				m[i].setPrice(sc.nextInt());
				
				d.setDate(sc.nextInt());
				d.setMonth(sc.nextInt()-1);
				d.setYear(sc.nextInt()-1900);
				m[i].setExpiry_date(d);
				m[i].getExpiry_date();
				m[i].getPrice();
				m[i].displayLabel();
				
			}
			else if (num==3) 
			{

				m[i]=new Ointment();
				System.out.println("Price of ointment");
				m[i].setPrice(sc.nextInt());
				
				d.setDate(sc.nextInt());
				d.setMonth(sc.nextInt()-1);
				d.setYear(sc.nextInt()-1900);
				m[i].setExpiry_date(d);
				m[i].getExpiry_date();
				m[i].getPrice();
				m[i].displayLabel();
				
			}
		}
		
	}

}
