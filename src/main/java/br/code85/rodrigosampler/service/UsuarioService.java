package br.code85.rodrigosampler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.code85.rodrigosampler.bean.Usuario;
import br.code85.rodrigosampler.bean.Veiculo;
import br.code85.rodrigosampler.repositorio.UsuarioRepositorio;
import br.code85.rodrigosampler.repositorio.VeiculoRepositorio;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepositorio usuarioRepo;
	
	@Autowired
	VeiculoRepositorio veiculoRepo;
	
	public Usuario salvarUsuario(Usuario user) {
		Usuario usuario = new Usuario();
		usuario.setName(user.getName());
		usuario.setEmail(user.getEmail());
		usuario.setSenha(user.getSenha());
		usuario.setData_nascimento(user.getData_nascimento());
		usuario.setSexo(user.getSexo());
		usuarioRepo.save(usuario);
		
		return usuario;
	}
	
	public Usuario getUsuario(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepo.findOne(id);
	}
	
	public List<Usuario> getAllUsuario() {
		// TODO Auto-generated method stub
		return usuarioRepo.findAll();
	}
	
	
	public Usuario editarUsuario(Integer id, Usuario user) {
		// TODO Auto-generated method stub
		Usuario usuario;
		usuario = getUsuario(id);
		usuario = user;
		usuarioRepo.save(usuario);
	
		return usuario;
	}
	
	public List<Usuario> deletarUsuario(Integer id) {
		// TODO Auto-generated method stub
		usuarioRepo.delete(id);
		List <Usuario> lista_usuario= getAllUsuario();
		return lista_usuario;
	}
	
	
}
