package oop_revision;
import java.util.Scanner;


public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter length:");
		int length=sc.nextInt();
		
		System.out.println("Enter width:");
		int width=sc.nextInt();
		
		System.out.println("Enter height");
		int height=sc.nextInt();
		
		int volume=length*width*height;
		
		System.out.println("Volume"+volume);
		
		
		
	}

}
