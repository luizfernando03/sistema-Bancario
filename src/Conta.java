import java.math.BigDecimal;

public abstract class Conta {
    protected Cliente cliente;
    protected BigDecimal saldoi;
    protected String numeroConta;
    protected String agencia;
    protected TipoConta tipoConta;

    public Conta(Cliente cliente, BigDecimal saldoi, String numeroConta, String agencia, TipoConta tipoConta) {
        this.cliente = cliente;
        this.saldoi = saldoi;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
    }

    public  abstract void depositar(BigDecimal valor);

    public abstract void sacar(BigDecimal valor);

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getSaldoi() {
        return saldoi;
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
