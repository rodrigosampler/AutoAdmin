package br.code85.rodrigosampler.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.code85.rodrigosampler.bean.Abastecer;
import br.code85.rodrigosampler.bean.Usuario;
import br.code85.rodrigosampler.bean.Veiculo;
import br.code85.rodrigosampler.repositorio.AbastecerRepositorio;
import br.code85.rodrigosampler.repositorio.VeiculoRepositorio;

public class AbastecerService {
	
	@Autowired
	VeiculoRepositorio veiculoRepo;
	
	@Autowired
	AbastecerRepositorio abastecerRepo;
	
	public Abastecer salvarAbastecer(Abastecer abast, Integer id_veiculo) {
		Abastecer abastecer = new Abastecer();
		Veiculo veiculo = veiculoRepo.findOne(id_veiculo);
		
		abastecer.setData(abast.getData());
		abastecer.setKm_abartecimento(abast.getKm_abartecimento());
		abastecer.setValor_abastecido(abast.getValor_abastecido());
		abastecer.setValor_combustivel(abast.getValor_combustivel());
		veiculo.getAbastecimentos().add(abastecer);
		abastecerRepo.save(abastecer);
		veiculoRepo.save(veiculo);
		return abastecer;
	}
	
	
}
