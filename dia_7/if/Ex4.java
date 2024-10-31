package dia_7;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		String car1, car2, car3; 
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Seu animal é Vertebrado ou Invertebrado? ");
		car1 = scanner.nextLine();
		
		if(car1.equals("Vertebrado")) {
			System.out.println("Seu animal é uma Ave ou um Mamífero? ");
			car2 = scanner.nextLine();
			if(car2.equals("Ave")) {
				System.out.println("Seu animal é Carnívoro ou Onívoro? ");
				car3 = scanner.nextLine();
				if (car3.equals("Carnívoro")) {
					System.out.println("Seu animal é uma Águia.");
				} else {
					System.out.println("Seu animal é uma Pomba");
				}
				
			} else {
				System.out.println("Seu animal é Onívoro ou Herbívoro? ");
				car3 = scanner.nextLine();
				if (car3.equals("Onívoro")) {
					System.out.println("Seu animal é um Homem.");
				} else {
					System.out.println("Seu animal é uma Vaca.");
				}
			} 
		} else {
			System.out.println("Seu animal é um Inseto ou um Analídeo? ");
			car2 = scanner.nextLine();
			if(car2.equals("Inseto")){
				System.out.println("Seu animal é um Hematófago ou Hebívoro? ");
				car3 = scanner.nextLine();
				if(car3.equals("Hematófafo")) {
					System.out.printf("Seu animal é uma Pulga.");
				} else {
					System.out.printf("Seu animal é uma Lagarta.");
				}
			} else {
				System.out.printf("Seu animal é um Hematófago ou Onívoro? ");
				car3 = scanner.nextLine();
				if(car3.equals("Hematófago")){
					System.out.println("Seu animal é uma Sanguessuga.");
				} else {
					System.out.printf("Seu animal é uma minhoca.");
				}
			}
		}
	
		scanner.close();
	}

}
