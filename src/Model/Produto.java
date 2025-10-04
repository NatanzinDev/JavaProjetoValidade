package Model;

import java.util.Date;

public class Produto {
	private String nome;
	private Date dataDeValidade;
	private String codigoDeBarras;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
}
