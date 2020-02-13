public class Conta {
    protected double saldo;
    private Cliente cliente;
    private ContaPoupanca contaPoupanca;
    private ContaCorrente contaCorrente;

    public Conta(Cliente cliente){
        this.cliente=cliente;
    }
    public Conta(){}
    public void depositoDinheiro(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println(saldo);
        } else {
            System.out.println("valor inválido para deposito");
        }

    }
    public void depositoCheque(double valor, String banco, String dataDePagamento) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso!"+saldo);
        } else {
            System.out.println("valor inválido para deposito");
        }

    }
    public void saque(double valor){
        if(this.saldo>=valor){
            this.saldo-=valor;
            System.out.println( "transação realizada, seu novo saldo é = "+saldo);
        }
        else{
            System.out.println( "saldo insuficiente, use crédito especial");
        }
    }
    public void saqueCreditoEspecial(double valor){
        double creditoEspecial =1000.00;
        if(this.saldo+creditoEspecial>=valor){
            this.saldo-=valor;
            System.out.println( "transação realizada, seu novo saldo é = "+saldo);
        }
        else{
            System.out.println( "Valor ultrapassa o uso do crédito especial");
        }
    }


    public double getSaldo() {
        if (contaCorrente != null && contaPoupanca != null) {
            double saldoTotal = contaPoupanca.getSaldo() + contaCorrente.getSaldo();
            System.out.println("Seu saldo total é" + saldoTotal);
            System.out.println("Seu saldo na conta Poupança é " + contaPoupanca.getSaldo());
            System.out.println("Seu saldo na conta corrente é " + contaCorrente.getSaldo());
            return this.saldo=saldoTotal;
        } else {
            if (contaCorrente != null) {
                System.out.println("Seu saldo total é " + contaCorrente.getSaldo());
                System.out.println("Seu saldo na conta Poupança é " + contaCorrente.getSaldo());
                return this.saldo=contaCorrente.getSaldo();
            }
            else if (contaPoupanca != null)  {
                System.out.println("Seu saldo total é" + contaPoupanca.getSaldo());
                System.out.println("Seu saldo na conta Corrente é "+contaPoupanca.getSaldo());
                return this.saldo=contaPoupanca.getSaldo();
            }
            else {
                return 0;
            }
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
