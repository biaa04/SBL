package sbl;

import java.util.Calendar;

public class Dados2JB {
	private String idbandas;
	private String idlocais;
	private String nome;
	private String genero;
	private String localidade;
	private String capacidade;
	private Calendar data;
	
	public Dados2JB() {
		super();
		
	}
	
	public Dados2JB(String idbandas, String idlocais, String nome, String genero, String localidade, String capacidade,
			Calendar data) {
		super();
		this.idbandas = idbandas;
		this.idlocais = idlocais;
		this.nome = nome;
		this.genero = genero;
		this.localidade = localidade;
		this.capacidade = capacidade;
		this.data = data;
	}

	public String getIdbandas() {
		return idbandas;
	}
	public void setIdbandas(String idbandas) {
		this.idbandas = idbandas;
	}
	public String getIdlocais() {
		return idlocais;
	}
	public void setIdlocais(String idlocais) {
		this.idlocais = idlocais;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}

}
