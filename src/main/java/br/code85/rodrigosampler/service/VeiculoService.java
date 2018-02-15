package br.code85.rodrigosampler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.code85.rodrigosampler.bean.Usuario;
import br.code85.rodrigosampler.bean.Veiculo;
import br.code85.rodrigosampler.repositorio.UsuarioRepositorio;
import br.code85.rodrigosampler.repositorio.VeiculoRepositorio;

@Service
public class VeiculoService {
	
	@Autowired
	UsuarioRepositorio usuarioRepo;
	
	@Autowired
	VeiculoRepositorio veiculoRepo;
	
	public Boolean cadastrarVeiculo(Veiculo veiculo, Integer id_usuario) {
		Veiculo automovel = new Veiculo();
		Usuario user = usuarioRepo.findOne(id_usuario);
		
		automovel.setAno(veiculo.getAno());
		automovel.setChassi(veiculo.getChassi());
		automovel.setCor(veiculo.getCor());	
		automovel.setKm_inicial(veiculo.getKm_inicial());
		automovel.setMarca(veiculo.getMarca());
		automovel.setPlaca(veiculo.getPlaca());
		automovel.setRenavam(veiculo.getRenavam());
		automovel.setTipo(veiculo.getTipo());
		user.getVeiculos().add(automovel);
		
		veiculoRepo.save(automovel);
		usuarioRepo.save(user);

		return true;
	}
	
	public Veiculo getVeiculo(Integer id) {
		// TODO Auto-generated method stub
		return veiculoRepo.findOne(id);
	}
	
}
