import java.math.BigDecimal;

public class ContaPoupanca extends Conta{

    private static final BigDecimal Rendimentos = BigDecimal.valueOf(0.02);

    public ContaPoupanca(Cliente cliente, String numeroConta, String agencia) {
        super(cliente,numeroConta, agencia, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(BigDecimal valor) {
        saldo = saldo.add(valor);
        System.out.println("deposito de " + valor + "Realizado com sucesso" + saldo );
    }

    @Override
    public void sacar(BigDecimal valor) {
        saldo = saldo.subtract(valor);
        System.out.println("saque de " + valor + " realizado com sucesso! " + saldo);

    }

    public void aplicarRendimento() {
        BigDecimal redimento = saldo.multiply(Rendimentos);
        saldo =saldo.add(redimento);
        System.out.println("Rendiemnto aplicado, novo saldo : " + saldo );
    }

}
