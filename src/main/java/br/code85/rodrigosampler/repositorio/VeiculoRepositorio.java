package br.code85.rodrigosampler.repositorio;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.code85.rodrigosampler.bean.Veiculo;

@Repository
@Transactional
public interface VeiculoRepositorio extends JpaRepository<Veiculo, Integer>  {

}
