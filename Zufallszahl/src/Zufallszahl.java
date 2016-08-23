import java.util.*;

public class Zufallszahl {

	public static void main (String[] args) {
		Random zufall = new Random();
		
		int a = zufall.nextInt(100);
		double x = zufall.nextDouble();
		
		for(int i =0 ; i <10;i++){
		System.out.printf("int %d%n", a);
		System.out.printf("int %.20f%n", x);
		}		

	}

}
