package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome do funcionario: ");
		String nome = sc.nextLine();
		System.out.println("salario Bruto R$: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Imposto cobrado no salario R$: ");
		double imposto = sc.nextDouble();

		// instanciação do objeto
		Funcionario fc = new Funcionario(nome, salarioBruto, imposto);

		System.out.println(fc);

		System.out.println("digite o aumento do salario: (numero Real) R$ ");
		double aumento = sc.nextDouble();
		fc.aumento(aumento);
		System.out.println(fc);

		sc.close();

	}

}
