package br.code85.rodrigosampler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PrincipalController {
	@RequestMapping(path="/")
	public String index() {
		return "index";
	}
}