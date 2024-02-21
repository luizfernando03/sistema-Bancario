import java.math.BigDecimal;

public class ContaInvestimento extends Conta{

    private static final BigDecimal RENDIMENTO_EXTRA = new BigDecimal("0.02"); // Rendimento extra de 2%

    // Construtor
    public ContaInvestimento(Cliente cliente, String numero, String agencia) {
        super(cliente, numeroConta, agencia);
    }

    // Implementação do método depositar
    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
    }

    // Implementação do método sacar
    @Override
    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);
    }

    // Método para calcular os rendimentos
    public void calcularRendimentos() {
        saldo = saldo.multiply(RENDIMENTO_EXTRA.add(BigDecimal.ONE));
    }

}
