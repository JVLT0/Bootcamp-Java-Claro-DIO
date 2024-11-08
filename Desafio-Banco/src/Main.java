public class Main {
    public static void main(String[] args) {
        Cliente Joao = new Cliente();
        Joao.setNome("Joao");
        
        Conta cc = new ContaCorrente(Joao);
        Conta cp = new ContaPoupanca(Joao);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
