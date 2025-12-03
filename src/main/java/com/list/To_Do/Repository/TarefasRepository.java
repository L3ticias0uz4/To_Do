package com.list.To_Do.Repository;

import com.list.To_Do.entities.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {

}

