public class ContaCorrente extends Conta{
    public ContaCorrente(double saldo, Cliente cliente) {
        super(cliente);
        setSaldo(saldo);
    }
    @Override
    public double getSaldo() {
        return saldo;
    }
}
