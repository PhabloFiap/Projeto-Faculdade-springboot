package com.estudo.controller;

import com.estudo.entity.Cliente;
import com.estudo.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private ClienteService clienteService;
    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }

    @PostMapping
    List<Cliente> createCliente(@RequestBody Cliente cliente){
        return clienteService.createCliente(cliente);
    }

    @GetMapping
    List<Cliente> listClientes(){
        return clienteService.listClientes();
    }

    @DeleteMapping("/{id}")
    List<Cliente> deleteCliente(@PathVariable Long id){
        return clienteService.deleteCliente(id);
    }





}
