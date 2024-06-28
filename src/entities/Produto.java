package entities;

public class Produto {

	String codigoItem;
	String descricao;
	float valor;
	String unidade;
	
	
	public Produto(String codigoItem, String descricao, float valor, String unidade) {
		this.codigoItem = codigoItem;
		this.descricao = descricao;
		this.valor = valor;
		this.unidade = unidade;
	}
	
	
	public String getCodigoItem() {
		return codigoItem;
	}
	
	public void setCodigoItem(String codigoItem) {
		this.codigoItem = codigoItem;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getUnidade() {
		return unidade;
	}
	
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
	
}
