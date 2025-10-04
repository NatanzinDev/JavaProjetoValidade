package model;

import java.time.LocalDate;
import java.util.Date;

public class Produto {
	private Integer id;
	private String nome;
	private LocalDate dataDeValidade;
	private String codigoDeBarras;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(LocalDate dataConvertida) {
		this.dataDeValidade = dataConvertida;
	}
	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}
	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}
}
