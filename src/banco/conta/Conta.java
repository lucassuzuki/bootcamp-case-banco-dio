package banco.conta;

import banco.Pessoa.Cliente;

public abstract class Conta implements IConta {
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected double limiteEspecial;
    protected Cliente cliente;
    private static int SEQUENCIAL = 01;
    private static final int AGENCIA_PADRAO = 1;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }



    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valorSaque) {
        if(saldo + limiteEspecial >= valorSaque){
            saldo -= valorSaque;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    @Override
    public void transferir(double valorTransferir, Conta contaDestino) {
        if(saldo + limiteEspecial >= valorTransferir){
        this.sacar(valorTransferir);
        contaDestino.depositar(valorTransferir);
        }else{
            System.out.println("saldo insuficiente para transferencia");
        }
    }

    protected void imprimirInfosConta() {

        System.out.println(String.format("Titular: %s: ", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d: ", this.agencia));
        System.out.println(String.format("Numero Conta: %d: ", this.numero));
        System.out.println(String.format("Saldo: %.2f: ", this.saldo));
    }

}
