package br.code85.rodrigosampler.repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.code85.rodrigosampler.bean.Usuario;

@Repository
@Transactional
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer> {
	
	//Usuario findByNome (String nome);
	
}
