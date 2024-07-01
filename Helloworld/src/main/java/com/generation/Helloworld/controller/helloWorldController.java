package com.generation.Helloworld.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class helloWorldController {
	
	@GetMapping
	public String helloword() {
		return "Hello world!";
	}
	@GetMapping("/BSM")

	public String BSM() {
		return "HABILIDADES\r\n"
				+ "\r\n"
				+ "TRABALHO EM EQUIPE\r\n"
				+ "ORIENTAÇÃO AO DETALHE\r\n"
				+ "PROATIVIDADE\r\n"
				+ "COMUNICAÇÃO\r\n\n"
				+ 
				"MENTALIDADES \r\n"
				+ "\r\n"
				+ "ORIENTAÇÃO AO FUTURO\r\n"
				+ "RESPONSABILIDADE PESSOAL\r\n"
				+ "MENTALIDADE DE CRESCIMENTO\r\n"
				+ "PERSISTÊNCIA";
	}
	@GetMapping("/objetivos")
	public String objetivos () {
		return "Eu sinto um vazio, como se tivesse faltando algo.\r\n"
				+ "Nada parece preencher, parece um hotel com quartos vagos.\r\n"
				+ "\r\n"
				+ "Muitas pessoas no saguão, muitos que vêm, e todos se vão. \r\n"
				+ "Talvez o hotel não seja confortável, talvez não seja tão bom.\r\n"
				+ "\r\n"
				+ "Será que as pessoas visitam apenas por curiosidade?\r\n"
				+ "Talvez estavam viajando e saindo da cidade, precisavam de um lugar pra ficar, um lugar para suas mentes acalmar.\r\n"
				+ "\r\n"
				+ "E esse hotel à beira da estrada foi onde resolveram ficar.\r\n"
				+ "Mas não ficaram, deixaram sua fadiga, seus problemas e logo se puseram a andar.\r\n"
				+ "\r\n"
				+ "Talvez não seja um hotel";
	}
	

}
