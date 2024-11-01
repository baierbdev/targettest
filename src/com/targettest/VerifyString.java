package com.targettest;

import java.util.Scanner;

public class VerifyString {
	public static void main(String[] args) {
		String entrada;
		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite a sua string: ");
		entrada = sc.nextLine();
		sc.close();
		System.out.printf("A string tem um total de %d 'a'",verifyString(entrada));
		
	}
	public static int verifyString(String entrada) {
		int count = 0;
		for (int i = 0; i < entrada.length(); i++) {
			if ('a' == entrada.charAt(i)  || 'A' == entrada.charAt(i)){
				count += 1;
			}
		}
		return count;
	}
}
