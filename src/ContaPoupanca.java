public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldo, Cliente cliente) {
        super(cliente);
        setSaldo(saldo);
    }

    @Override
    public void saque(double valor) { ;
        if(saldo>=valor){
            setSaldo(saldo-=valor);
            System.out.println( "transação realizada, seu novo saldo é = "+saldo);

        }
        else{
            System.out.println( "saldo insuficiente");
        }
    }
    @Override
    public void saqueCreditoEspecial(double valor) {
        System.out.println( "Essa conta não possui crédito especial");
    }
    public void recolherJuros(int meses){
        setSaldo(saldo*(0.005*meses)+saldo);
        System.out.println(saldo);
    }
    @Override
    public double getSaldo() {
        return saldo;
    }

}

