package br.code85.rodrigosampler.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Manutenção {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	String data;
	Float valor_total;
	Float valor_mecanico;
	Integer km_manutenção;
	
	@ManyToOne
	Veiculo veiculo;
	
	@OneToMany
	List<Peça> peças;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Float getValor_total() {
		return valor_total;
	}

	public void setValor_total(Float valor_total) {
		this.valor_total = valor_total;
	}

	public Float getValor_mecanico() {
		return valor_mecanico;
	}

	public void setValor_mecanico(Float valor_mecanico) {
		this.valor_mecanico = valor_mecanico;
	}

	public Integer getKm_manutenção() {
		return km_manutenção;
	}

	public void setKm_manutenção(Integer km_manutenção) {
		this.km_manutenção = km_manutenção;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public List<Peça> getPeças() {
		return peças;
	}

	public void setPeças(List<Peça> peças) {
		this.peças = peças;
	}
	
	
	
	
}
