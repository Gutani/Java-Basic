package entities;

public class Conta {
	private int account;
	private String titular;
	private double value;
	
	public Conta(int account, String titular) {
		super();
		this.account = account;
		this.titular = titular;
	}
	public Conta(int account, String titular, double value) {
		super();
		this.account = account;
		this.titular = titular;
		this.value = value;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getTitular() {
		return titular;
	}
	public String setTitular(String titular) {
		this.titular = titular;
	}
	public double getValue() {
		return value;
	}
	
	public void deposito(double deposito) {
		value += deposito;
	}
	public void retirada(double retirada) {
		value -= retirada + 5;
	}
	
	
}
