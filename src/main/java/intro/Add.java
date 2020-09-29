package intro;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Introduce dos numeros: ");
		int param1 = in.nextInt();
		int param2 = in.nextInt();
		
		int sum = param1 + param2;
		
		System.out.println(sum);
		
		
in.close();
	}

}
