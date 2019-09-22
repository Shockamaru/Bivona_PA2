import java.util.Scanner;
public class Bivona_p1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type a 4 digit integer to decrypt and encrypt: ");
		int en = scan.nextInt();
		int de = scan.nextInt();
		int a1 = en / 1000;
		int a2 = de / 1000;
		int b1 = (en % 1000) / 100;
		int b2 = (de % 1000) / 100;
		int c1 = (en % 100) / 10; 
		int c2 = (de % 100) / 10; 
		int d1 = en % 10; 
		int d2 = de % 10; 
		int temp;
		int temp2;
		int temp3;
		int temp4;
		a1 = (a1+7) % 10;
		a2 = (a2+3) % 10;
		b1 = (b1+7) % 10;
		b2 = (b2+3) % 10;
		c1 = (c1+7) % 10;
		c2 = (c2+3) % 10;
		d1 = (d1+7) % 10;
		d2 = (d2+3) % 10;
		temp = a1;
		temp3 = a2;
		a1 = c1;
		a2 = c2;
		c1 = temp;
		c2 = temp3;
		temp2 = b1;
		temp4 = b2;
		b1 = d1;
		b2 = d2;
		d1 = temp2;
		b2 = temp4;
		System.out.println((c1 * 1000) + (d1 * 100) + (a1 * 10) + b1);
		System.out.println((c2 * 1000) + (d2 * 100) + (a2 * 10) + b2);
		}
	}

