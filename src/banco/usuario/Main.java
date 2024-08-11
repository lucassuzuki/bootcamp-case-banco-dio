package banco.usuario;

import banco.Pessoa.Cliente;
import banco.conta.Conta;
import banco.conta.ContaCorrente;
import banco.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Conta contaCorrente = new ContaCorrente(lucas);
        Conta contaPoupanca = new ContaPoupanca(lucas);

        contaPoupanca.depositar(400);
        contaPoupanca.transferir(200, contaCorrente);

        contaCorrente.consultarSaldo();
        contaPoupanca.consultarSaldo();

    }
}