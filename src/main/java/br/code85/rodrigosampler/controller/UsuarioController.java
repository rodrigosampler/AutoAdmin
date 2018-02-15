package br.code85.rodrigosampler.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.code85.rodrigosampler.bean.Usuario;
import br.code85.rodrigosampler.service.UsuarioService;

@Controller
@RequestMapping(path="/usuarios/")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/{idUsuario}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> buscarUsuario(@PathVariable("idUsuario") Integer id_usuario){
		Usuario user = service.getUsuario(id_usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/editar/{idUsuario}", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario, @PathVariable("idUsuario") Integer id_usuario){	
		Usuario user = service.editarUsuario(id_usuario, usuario);
		return new ResponseEntity<Usuario>(user, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/cadastrar", consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody Usuario usuario){		
		service.salvarUsuario(usuario);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/deletar/{idUsuario}", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List> deletarUsuario(@PathVariable("idUsuario") Integer id_usuario){
		List<Usuario> lista_usuario = service.deletarUsuario(id_usuario);
		return new ResponseEntity<List>(lista_usuario, HttpStatus.OK);
	}
	
		
}
