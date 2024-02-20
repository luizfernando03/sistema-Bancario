import conta.Conta;

import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String tipo;
    private String dataNascimento;
    private List<Conta> contas;

    public Cliente(String nome, String cpf, String endereco, String email, String tipo, String dataNascimento, List<Conta> contas) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.tipo = tipo;
        this.dataNascimento = dataNascimento;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public List<Conta> getContas() {
        return contas;
    }
    
}
