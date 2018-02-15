package br.code85.rodrigosampler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.code85.rodrigosampler.bean.Veiculo;
import br.code85.rodrigosampler.service.VeiculoService;

@Controller
@RequestMapping(path="/veiculos/")
public class VeiculoController {
	
	@Autowired
	VeiculoService service;
	
	@RequestMapping(method=RequestMethod.POST, value="/{idUsuario}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Veiculo> cadastrarVeiculo(@RequestBody Veiculo veiculo, @PathVariable("idUsuario") Integer id_usuario){
		
		service.cadastrarVeiculo(veiculo, id_usuario);
		return new ResponseEntity<Veiculo>(veiculo, HttpStatus.CREATED);
	}
	
}
