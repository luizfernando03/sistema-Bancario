
import java.math.BigDecimal;

public abstract class ContaCorrente extends Conta{
    private static final BigDecimal TAXA_SAQUE = new BigDecimal("0.005"); // Taxa de 0.5% para saques


    // Construtor
    public ContaCorrente(Cliente cliente, String numero, String agencia) {
        super(cliente, numero, agencia);
    }

    // Implementação do método depositar
    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }


    // Implementação do método sacar
    @Override
    public void sacar(BigDecimal valor) {
        BigDecimal taxa = valor.multiply(TAXA_SAQUE);
        saldo = saldo.subtract(valor.add(taxa));
    }

}
