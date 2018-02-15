package br.code85.rodrigosampler.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Veiculo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String tipo;
	private String modelo;
	private String marca;
	private String cor;
	private String chassi;
	private String placa;
	private String renavam;
	private Integer km_inicial;
	private Integer ultimo_km;
	private Integer ano;
	
	
	@OneToMany
	List<Imposto> impostos;
	
	@OneToMany
	List<Manutenção> manutenções;
	
	@OneToMany
	List<Abastecer> abastecimentos;
	
	@ManyToOne
	Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public Integer getKm_inicial() {
		return km_inicial;
	}

	public void setKm_inicial(Integer km_inicial) {
		this.km_inicial = km_inicial;
	}

	public Integer getUltimo_km() {
		return ultimo_km;
	}

	public void setUltimo_km(Integer ultimo_km) {
		this.ultimo_km = ultimo_km;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public List<Imposto> getImpostos() {
		return impostos;
	}

	public void setImpostos(List<Imposto> impostos) {
		this.impostos = impostos;
	}

	public List<Manutenção> getManutenções() {
		return manutenções;
	}

	public void setManutenções(List<Manutenção> manutenções) {
		this.manutenções = manutenções;
	}

	public List<Abastecer> getAbastecimentos() {
		return abastecimentos;
	}

	public void setAbastecimentos(List<Abastecer> abastecimentos) {
		this.abastecimentos = abastecimentos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
