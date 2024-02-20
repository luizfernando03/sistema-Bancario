import java.math.BigDecimal;

public abstract class Conta {
    protected Cliente cliente;
    protected BigDecimal saldo;
    protected String numeroConta;
    protected String agencia;
    protected TipoConta tipoConta;

    public Conta(Cliente cliente, String numeroConta, String agencia, TipoConta tipoConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldo = BigDecimal.ZERO;
    }

    public  abstract void depositar(BigDecimal valor);

    public abstract void sacar(BigDecimal valor);

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }
    
}
