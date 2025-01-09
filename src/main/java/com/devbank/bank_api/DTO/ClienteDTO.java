package com.devbank.bank_api.DTO;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ClienteDTO {
    private String primeiroNome;
    private String ultimoNome;
    private LocalDate dataNascimento;
    private String cpf;
    private String email;
    private String telefone;
    private byte[] identidadeFrente;
    private byte[] identidadeVerso;

    public ClienteDTO(String primeiroNome, String ultimoNome, LocalDate dataNascimento, String cpf, String email, String telefone, byte[] identidadeFrente, byte[] identidadeVerso) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.identidadeFrente = identidadeFrente;
        this.identidadeVerso = identidadeVerso;
    }
}
