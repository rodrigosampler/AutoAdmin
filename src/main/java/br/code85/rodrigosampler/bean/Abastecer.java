package br.code85.rodrigosampler.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Abastecer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String data;
	private Float valor_abastecido;
	private Integer km_abartecimento;
	private Float valor_combustivel;
	
	@ManyToOne
	Veiculo veiculo;

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

	public Float getValor_abastecido() {
		return valor_abastecido;
	}

	public void setValor_abastecido(Float valor_abastecido) {
		this.valor_abastecido = valor_abastecido;
	}

	public Integer getKm_abartecimento() {
		return km_abartecimento;
	}

	public void setKm_abartecimento(Integer km_abartecimento) {
		this.km_abartecimento = km_abartecimento;
	}

	public Float getValor_combustivel() {
		return valor_combustivel;
	}

	public void setValor_combustivel(Float valor_combustivel) {
		this.valor_combustivel = valor_combustivel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
}
