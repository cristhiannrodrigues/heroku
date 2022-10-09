package br.com.cristhiannrodrigues.heroku.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class Heroku {
	
	@GetMapping(path = "/heroku")
	public String getHeroku() {
		
		return "OLÁ, ESTOU FUNCIONANDO NO HEROKU!";
		
	}

}
