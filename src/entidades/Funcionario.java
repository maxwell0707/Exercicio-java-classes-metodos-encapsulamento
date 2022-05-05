package entidades;

public class Funcionario {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	//construtores
	public Funcionario(String nome, double salarioBruto, double imposto) {
		
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	//metodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumento(double aumento) {
		salarioBruto += (salarioBruto*aumento) / 100;
		
	}
	public String toString() {
		return "Funcionario: "
				+"\nNome: "
				+nome
				+"\nSalario Liquido R$ "
				+String.format("%.2f\n" ,salarioLiquido()) ;
	}
}
