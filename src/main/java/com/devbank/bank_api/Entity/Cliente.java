package com.devbank.bank_api.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String primeiroNome;
    private String ultimoNome;
    private LocalDate dataNascimento;
    private String cpf;
    private String email;
    private String telefone;

    @Lob
    private byte[] identidadeFrente;

    @Lob
    private byte[] identidadeVerso;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public byte[] getIdentidadeFrente() {
        return identidadeFrente;
    }

    public void setIdentidadeFrente(byte[] identidadeFrente) {
        this.identidadeFrente = identidadeFrente;
    }

    public byte[] getIdentidadeVerso() {
        return identidadeVerso;
    }

    public void setIdentidadeVerso(byte[] identidadeVerso) {
        this.identidadeVerso = identidadeVerso;
    }
}