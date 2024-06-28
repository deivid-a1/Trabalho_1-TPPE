package entities;

abstract public class Cliente {

	String tipoCliente;
	String regiaoBrasil;
	boolean isCapital;
	float valorMensalidade;
	
	public Cliente(String regiaoBrasil, boolean isCapital, float valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}
	
	abstract void realizaCompra();
	
	void calculaTipo() {
		System.out.println("CalculaTipo()");
	}
	
}
