package com.devbank.bank_api.Service;

import com.devbank.bank_api.DTO.ClienteDTO;
import com.devbank.bank_api.Entity.Cliente;
import com.devbank.bank_api.Repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public Cliente criarCliente(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setPrimeiroNome(clienteDTO.getPrimeiroNome());
        cliente.setUltimoNome(clienteDTO.getUltimoNome());
        cliente.setDataNascimento(clienteDTO.getDataNascimento());
        cliente.setCpf(clienteDTO.getCpf());
        cliente.setEmail(clienteDTO.getEmail());
        cliente.setTelefone(clienteDTO.getTelefone());
        cliente.setIdentidadeFrente(clienteDTO.getIdentidadeFrente());
        cliente.setIdentidadeVerso(clienteDTO.getIdentidadeVerso());

        return clienteRepository.save(cliente);
    }

    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado."));
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
