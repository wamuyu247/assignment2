package task1;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("0:sh20(30mins ,3hrs)");
		System.out.println("1:sh50(40Mins+50SMS ,24hrs)");
		System.out.println("2:Okoa Easy sh1000(800Mins,30days)");
		System.out.println("3:Okoa 1000");
		System.out.println("4:Okoa 500");
		System.out.println("5:Okoa 250");
		System.out.println("6:Okoa 100");
		System.out.println("7:Okoa 50");
		System.out.println("8:Okoa 20");
		System.out.println("98:More");
		
		int option=scanner.nextInt();
		switch(option) {
		case 0:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:20");
			break;
		case 1:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:50");
			break;
		case 2:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:1000");
			break;
		case 3:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:1000");
			break;
		case 4:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:500");
			break;
		case 5:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:250");
			break;
		case 6:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:100");
			break;
		case 7:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:50");
			break;
		case 8:
			System.out.println("Existing Unpaid Okoa :0");
			System.out.println("New Okoa request: 20Total DEBT will be:20");
			break;
		case 98:
			
			System.out.println("9:Okoa internet\n10:Okoa minutes\n11:Okoa SMS\n12:Lipa Okoa\n#:Check Balance0:BACK");
			break;
			
		}
	}

}
