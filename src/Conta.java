import java.math.BigDecimal;

public abstract class Conta {
    protected Cliente cliente;
    protected String numeroConta;
    protected String agencia;
    protected BigDecimal saldo;

    public Conta(Cliente cliente, String numeroConta, String agencia, BigDecimal saldo) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    // Métodos abstratos a serem implementados pelas subclasses
    public abstract void depositar(BigDecimal valor);

    public abstract void sacar(BigDecimal valor);
}
