package com.estudo.controller;

import com.estudo.entity.Tarefas;
import com.estudo.service.TarefaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService){
        this.tarefaService = tarefaService;
    }

    @PostMapping
    List<Tarefas> createTarefa(@RequestBody Tarefas tarefa){
        return tarefaService.createTarefa(tarefa);
    }

    @GetMapping
    List<Tarefas> listTarefas(){
        return tarefaService.listTarefas();
    }

    @DeleteMapping("/{id}")
    List<Tarefas> deleteTarefa(@PathVariable Long id){
        return tarefaService.deleteTarefa(id);
    }





}
