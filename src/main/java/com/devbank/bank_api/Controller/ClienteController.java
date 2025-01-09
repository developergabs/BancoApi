package com.devbank.bank_api.Controller;

import com.devbank.bank_api.DTO.ClienteDTO;
import com.devbank.bank_api.Entity.Cliente;
import com.devbank.bank_api.Service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Cliente> criarCliente(@Valid @RequestBody ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setPrimeiroNome(clienteDTO.getPrimeiroNome());
        cliente.setUltimoNome(clienteDTO.getUltimoNome());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setIdentidadeFrente(clienteDTO.getIdentidadeFrente());
        cliente.setIdentidadeVerso(clienteDTO.getIdentidadeVerso());
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.salvarCliente(cliente));
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarCliente(@PathVariable Long id) {
        return clienteService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
        return ResponseEntity.noContent().build();
    }
}
