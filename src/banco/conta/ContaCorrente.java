package banco.conta;

import banco.Pessoa.Cliente;

public class ContaCorrente extends Conta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("===== Extrato Conta Corrente =====");
        imprimirInfosConta();
    }
}
