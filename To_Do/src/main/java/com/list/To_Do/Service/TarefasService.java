package com.list.To_Do.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.list.To_Do.Repository.TarefasRepository;
import com.list.To_Do.dto.TarefasDTO;
import com.list.To_Do.entities.Status;
import com.list.To_Do.entities.Tarefas;

@Service
public class TarefasService {
	
	@Autowired
	TarefasRepository tarefasRepository;

	public void criarTarefa(TarefasDTO dto) {
		Tarefas task = new Tarefas(dto.getNome(), dto.getDescricao(), Status.PENDENTE);
		tarefasRepository.save(task);
	}
	public void criarTarefa1(TarefasDTO dto) {
		Tarefas task = new Tarefas(dto);
		tarefasRepository.save(task);
	}
	
	
}
