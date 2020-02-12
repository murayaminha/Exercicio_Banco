public class Conta {
    private int agencia;
    private int identificacao;
    private double saldo;
    private Cliente cliente;

    public Conta(int agencia, int identificacao, double saldo,Cliente cliente){
        this.agencia = agencia;
        this.identificacao=identificacao;
        this.saldo=saldo;
        this.cliente=cliente;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println(saldo);
        } else {
            System.out.println("valor inválido para deposito");
        }
    }
    public void saque(double valor){
        if(saldo>=valor){
        this.saldo-=valor;
            System.out.println( "transação realizada, seu novo saldo é = "+saldo);
    }
        else{
            System.out.println( "saldo insuficiente");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public double getSaldo() {
        return saldo;
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
}
