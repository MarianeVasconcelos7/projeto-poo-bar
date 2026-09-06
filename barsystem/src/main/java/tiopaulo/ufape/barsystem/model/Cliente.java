package tiopaulo.ufape.barsystem.model;

import jakarta.persistence.Entity;

@Entity
public class Cliente extends Pessoa {

    private String cpf;

    public Cliente() {
        super();
    }

    public Cliente(Long id, String nome, String telefone, String cpf) {
        super(id, nome, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}