public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(123,"Moraes","5346431","536546754675");
        Conta conta = new Conta(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(1300,cliente);
        ContaCorrente corrente = new ContaCorrente(2000,cliente);
        conta.setContaCorrente(corrente);
        conta.setContaPoupanca(poupanca);
        poupanca.saque(800.00);
        System.out.println(poupanca.getSaldo());
        poupanca.saque(800.00);
        conta.getSaldo();
        poupanca.recolherJuros(20);
        corrente.saqueCreditoEspecial(3000);

    }
}
