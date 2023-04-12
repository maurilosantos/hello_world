package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/* @RestController deﬁne que a Classe é do tipo controladora rest, que receberá requisições que serão compostas por
        URL: Endereço da requisição (/hello-world)
       	Verbo: Define qual Método HTTP será acionado na Classe controladora.
		Corpo da requisição (Request Body): Objeto que contém os dados que serão criados ou atualizados.
 * */

@RestController

/*
 * @RequestMapping é usada para mapear solicitações para os Métodos da Classe controladora 
 * HelloWorldController, ou seja, definir a URL (endereço) padrão do recurso (em nosso exemplo: /hello-world).
 */

@RequestMapping("/hello-world")

public class HelloWorldController {
	/*
	 *  @GetMapping mapeia solicitações HTTP GET para Métodos de tratamento específicos, ou seja, indica que o Método helloWorld()
	 *   responderá a todas as requisições do tipo HTTP GET, enviadas no endereço http://localhost:8080/hello-world, do recurso hello-world.
	 */
	@GetMapping
	public String helloWorld() {
		return "Hello World!";	
	}
	
	@GetMapping ("/bsm")
	public String bsm() {
		return " Mentalidade de Crescimento, Persistência,\n "
				+ "Responsabilidade Pessoal, Orientação ao Futuro,\n "
				+ "Comunicação, Orientação ao Detalhe,\n "
				+ "Proatividade, Trabalho em Equipe.";	
	}
	
	@GetMapping ("/objetivos-da-semana")
	public String objetivoSemanal() {
		return " 1. Aprender Spring,\n "
				+ "2. Organizar matéria Java,\n "
				+ "3. Organizar matéria MySQL,\n "
				+ "4. Atualizar Código Projeto Integrador.";	
	}
	
}

