package entities;

public class Funcionario {
	
	private int id;
	private String name;
	private double salario;
	
	
	
	public Funcionario(int id, String name, double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
	public Funcionario() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double aumentoSalario (double percentage) {
		double result = percentage / 100 * this.salario;
		return this.salario + result;
	}
	@Override
	public String toString() {
		return id + ", " + name + ", " + salario;
	}
	
	
	

}
