package br.code85.rodrigosampler.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



@Entity
public class Peça {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	String nome;
	String data;
	String Observação;
	Float valor;
	
	@ManyToOne
	Manutenção manunteção;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public Manutenção getManunteção() {
		return manunteção;
	}

	public void setManunteção(Manutenção manunteção) {
		this.manunteção = manunteção;
	}

	public String getObservação() {
		return Observação;
	}

	public void setObservação(String observação) {
		Observação = observação;
	}
	
	
	
	
}
