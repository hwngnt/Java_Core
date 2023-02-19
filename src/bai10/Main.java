package bai10;

import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		Document doc = new Document(str);
		System.out.println("Number of characters: "+ doc.count(str));
        System.out.println("Number of A (or a): "+ doc.countA(str));
        System.out.println("Normalized: "+ doc.normalize(str));
	}
}
