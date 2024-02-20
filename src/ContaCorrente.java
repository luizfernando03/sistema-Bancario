
import java.math.BigDecimal;

public abstract class ContaCorrente extends Conta{
    private  static final BigDecimal TAXA_SAQUE_PF = BigDecimal.valueOf(0.02);
    private  static final BigDecimal TAXA_SAQUE_PJ = BigDecimal.valueOf(0.005);


    public ContaCorrente(Cliente cliente, String numeroConta, String agencia) {
        super(cliente, numeroConta, agencia, TipoConta.CORRENTE);
    }

    public void sacar(BigDecimal valor){
        BigDecimal taxaSaque = cliente.getTipo().equals("PF") ? TAXA_SAQUE_PF : TAXA_SAQUE_PJ;
        BigDecimal valorConTaxa = valor.multiply(BigDecimal.ONE.subtract(taxaSaque));
        saldo=saldo.subtract(valorConTaxa);
        System.out.println("saque de : " + valor + "realizaado com sucesso . Novosaldo: " + saldo);

    }
    @Override
    public void depositar(BigDecimal valor){
        saldo = saldo.add(valor);
    }

}
