import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpfCnpj;
    private String endereco;
    private String email;
    private String tipo;

    private List<Conta> contas;

    public Cliente(String nome, String documento, String endereco, String email, String tipo, List<Conta> contas) {
        this.nome = nome;
        this.cpfCnpj = documento;
        this.endereco = endereco;
        this.email = email;
        this.tipo = tipo;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
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

    public List<Conta> getContas() {
        return contas;
    }

    // Método para adicionar uma conta ao cliente
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    // Método para remover uma conta do cliente
    public void removerConta(Conta conta) {
        contas.remove(conta);
    }
}
