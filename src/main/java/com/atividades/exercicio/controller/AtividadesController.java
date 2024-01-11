package com.atividades.exercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("atividades")
public class AtividadesController {

	@GetMapping("/olamundo")
	public String olaMundo() {
		return "Olá Mundo!!!";
	}
	@GetMapping("/BSM")
	public String bsm() {
		return "Responsabilidade Pessoal, "
				+ "\n Mentalidade de Crescimento, "
				+ "\n Orientação ao futuro, "
				+ "\n Comunicação, "
				+ "\n Proatividade, "
				+ "\n Atenção aos detalhes, "
				+ "\n Trabalho em equipe, "
				+ "\n Persistência, ";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Conseguir compreender os conteúdos e representalos";
	}
}
