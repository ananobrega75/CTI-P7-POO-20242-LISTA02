package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        double E, fat;
        E = 1;
        System.out.print("num: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fat = 1;
            for (int j = 1; j <= i; j++) {
                fat = fat * j;
            }
            E = E + 1/fat;
        }
        System.out.println();
        System.out.println("e: "+E);

	}

}
