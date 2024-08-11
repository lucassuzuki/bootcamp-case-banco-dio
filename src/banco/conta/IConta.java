package banco.conta;

public interface IConta {

    void sacar(double valorSaque);

    void depositar(double valorDeposito);

    void transferir(double valorTransferir, Conta contaDestino);

    void consultarSaldo();


}
