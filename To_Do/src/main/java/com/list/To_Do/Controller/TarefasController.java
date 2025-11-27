package com.list.To_Do.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.list.To_Do.Service.TarefasService;
import com.list.To_Do.dto.TarefasDTO;

import jakarta.validation.Valid;

@RequestMapping("tarefas")
@RestController
public class TarefasController {
	
	private final TarefasService tarefasService;

	public TarefasController(TarefasService tarefasService) {
		this.tarefasService = tarefasService;
	}
	
	@PostMapping
	public ResponseEntity<?> criarTarefa(@Valid @RequestBody TarefasDTO dto){
		tarefasService.criarTarefa1(dto);
		return ResponseEntity.ok("Tarefa Criada com Sucesso!");
	
}
}
