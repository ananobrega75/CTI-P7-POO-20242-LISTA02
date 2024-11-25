package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		
		double Salario, Salario_a_receber, Imposto;
		Salario = 1520;
		Imposto = Salario * 10/100;
		Salario_a_receber = Salario + 50 - Imposto;
		
		System.out.println(Salario_a_receber);

	}

}
