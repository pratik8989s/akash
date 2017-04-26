package ExtraAssignment;

import java.util.Scanner;

public class AccountDemo {
	
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		Account acc[]=new Account[2];
		
		
		
		
		for (int i = 0; i < acc.length; i++) {
	
			System.out.println("Enter acc no: ");
			int accno=sc.nextInt();
			
			System.out.println("Enter your  name:");
			String pname= sc.next();
			
			System.out.println("Enter your  Balance:");
			int balance= sc.nextInt();
			acc[i]=new Account();
			acc[i].create(accno, pname, balance);
		
		}
		
		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i].toString());
		}
		
		//PRINTING
		System.out.println("which acc u want to print:");
		int printacc=sc.nextInt();
		
		for (int i = 0; i < acc.length; i++) {
			if (printacc==acc[i].getAccNo()) {
				System.out.println(acc[i].toString());
				
			}
		}
		
		
		
		
		//DELETING
		System.out.println("delete accno :");
		int delete=sc.nextInt();
		for (int i = 0; i < acc.length; i++) {
			
			if (acc[i].getAccNo()==delete) 
			{
				acc[i].delete(delete);
				System.out.println("acc no "+delete+" is deleted");
			}
		}

		for (int i = 0; i < acc.length; i++) {
			if(acc[i].getAccNo()>0)
		
			System.out.println(acc[i].toString());
		}

	}

}
