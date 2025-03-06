package entities;

public class ContaBancaria {
	
	private int numeroConta;
	private String nomeTitular;
	private double valorDepositoInicial;
	
	
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}


	public ContaBancaria(int numeroConta, String nomeTitular, double initialDeposit) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(initialDeposit);
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public int getNumeroConta() {
		return numeroConta;
	}


	public double getValorDepositoInicial() {
		return valorDepositoInicial;
	}
	
	public void deposito(double valorDeposito) {
		this.valorDepositoInicial += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.valorDepositoInicial -= valorSaque + 5.0;
	}
	
	public String toString() {
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ nomeTitular
				+ ", Balance: $ "
				+ valorDepositoInicial;
	}

}
