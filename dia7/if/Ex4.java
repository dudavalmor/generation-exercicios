package dia_7;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		String car1, car2, car3; 
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Seu animal � Vertebrado ou Invertebrado? ");
		car1 = scanner.nextLine();
		
		if(car1.equals("Vertebrado")) {
			System.out.println("Seu animal � uma Ave ou um Mam�fero? ");
			car2 = scanner.nextLine();
			if(car2.equals("Ave")) {
				System.out.println("Seu animal � Carn�voro ou On�voro? ");
				car3 = scanner.nextLine();
				if (car3.equals("Carn�voro")) {
					System.out.println("Seu animal � uma �guia.");
				} else {
					System.out.println("Seu animal � uma Pomba");
				}
				
			} else {
				System.out.println("Seu animal � On�voro ou Herb�voro? ");
				car3 = scanner.nextLine();
				if (car3.equals("On�voro")) {
					System.out.println("Seu animal � um Homem.");
				} else {
					System.out.println("Seu animal � uma Vaca.");
				}
			} 
		} else {
			System.out.println("Seu animal � um Inseto ou um Anal�deo? ");
			car2 = scanner.nextLine();
			if(car2.equals("Inseto")){
				System.out.println("Seu animal � um Hemat�fago ou Heb�voro? ");
				car3 = scanner.nextLine();
				if(car3.equals("Hemat�fafo")) {
					System.out.printf("Seu animal � uma Pulga.");
				} else {
					System.out.printf("Seu animal � uma Lagarta.");
				}
			} else {
				System.out.printf("Seu animal � um Hemat�fago ou On�voro? ");
				car3 = scanner.nextLine();
				if(car3.equals("Hemat�fago")){
					System.out.println("Seu animal � uma Sanguessuga.");
				} else {
					System.out.printf("Seu animal � uma minhoca.");
				}
			}
		}
	
		scanner.close();
	}

}
