public class Exercicio1 {
    public static void main(String[] args){
        Cliente cliente = new Cliente("josé","chico");
        Cliente cliente2 = new Cliente("maria","fernanda");
    Conta conta1=new Conta(2145,42346,1000.00,cliente);
    Conta conta2=new Conta(2145,3325,299,cliente2);
        System.out.println(conta1.getSaldo());
        conta1.deposito(300.00);
        conta1.saque(500);
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
        conta2.deposito(300.00);
        conta2.saque(500);
        System.out.println(conta2.getSaldo());

    }
}
