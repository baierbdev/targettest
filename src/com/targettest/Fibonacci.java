package com.targettest;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		boolean continueLoop = true;
		int num;
		
		do {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.printf("Digite um número: ");
				num = sc.nextInt();
				fibonacci(num);
				sc.close();
				continueLoop = false;
			} catch (Exception numericValue) {
				System.out.println("Digite um valor númerico!");
			}
		} while (continueLoop);
	}
	
	public static void fibonacci(int number) {
		int num1 = 0, num2 = 1;
		boolean inSequence = false;		
		
		for (int i = 0; i < number; i++) {
			System.out.printf("%d ", num1);
			int aux = num1 + num2;
			num1 = num2;
			num2 = aux;
			if (number == num1 + num2 || number == 1) {
				inSequence = true;
			}
		}
		if (inSequence) {
			System.out.printf("%n%d pertence a sequência.", number);
		}else {
			System.out.printf("%n%d não pertence a sequência.", number);
		}
		
	}
	
}
