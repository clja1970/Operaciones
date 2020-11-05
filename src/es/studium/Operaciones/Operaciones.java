package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int numero1, numero2,suma,resta,producto;
		float cociente;
		System.out.println("Dame un número ");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número ");
		numero2 = teclado.nextInt();
		teclado.close();
		suma=numero1+numero2;
		resta=numero1-numero2;
		producto=numero1*numero2;
		System.out.println("La suma vale"+suma);
		System.out.println("La resta vale "+resta);
		System.out.println("El producto vale"+producto);
		if(numero2!=0) {
			cociente= (float)numero1/(float)numero2;
			System.out.println("La división es "+cociente);
		}
		else {
			System.out.println("La división no es posible");
		}
		}
	}

