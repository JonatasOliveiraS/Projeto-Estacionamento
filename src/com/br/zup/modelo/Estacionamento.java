package com.br.zup.modelo;

import java.util.Scanner;
import com.br.zup.modelo.Vagas;

public class Estacionamento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas vagas deseja ter em seu estacionamento ? ");
		int vagasTotal = entrada.nextInt();
		
		System.out.println("Quantas vagas para motos você deseja ter em seu estacionamento ? ");
		int vagasMotos = entrada.nextInt();

	}

}
