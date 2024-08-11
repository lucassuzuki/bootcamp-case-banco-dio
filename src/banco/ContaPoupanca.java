package banco;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("===== Extrato Conta Poupanca =====");
        imprimirInfosConta();
    }


}
