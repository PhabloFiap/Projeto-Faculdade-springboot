package com.estudo.service;

import com.estudo.entity.Tarefas;
import com.estudo.repository.TarefaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    private TarefaRepository tarefaRepository;
    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }


    public List<Tarefas> createTarefa(Tarefas tarefa) {
        tarefaRepository.save(tarefa);
        return listTarefas();

    }

    public List<Tarefas> listTarefas() {
        Sort sort = Sort.by(Sort.Direction.DESC, "prioridade").and(Sort.by(Sort.Direction.ASC, "nome"));
        return tarefaRepository.findAll(sort);

    }

    public List<Tarefas> deleteTarefa(Long id) {
        tarefaRepository.deleteById(id);
        return listTarefas();
    }

    public List<Tarefas> updateTarefa(Tarefas tarefa) {
        tarefaRepository.save(tarefa);
        return listTarefas();
    }

}
