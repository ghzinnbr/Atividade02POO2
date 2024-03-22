package br.com.questoes;

import java.util.Scanner;

public class Questao06 extends BaseQuestoes {

    protected double saldo;

    protected double valorReajustado;

    public Double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getValorReajustado() {
        return valorReajustado;
    }

    public void setValorReajustado(Double valorReajustado) {
        this.valorReajustado = valorReajustado;
    }

    public Questao06() {

    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o saldo atual da conta poupança: ");
        this.setSaldo(scanner.nextDouble());

        this.setValorReajustado((this.getSaldo() * 2 / 100) + this.getSaldo());
        
        System.out.println("O novo saldo da poupança é: " + this.getValorReajustado());
        
        scanner.close();
    }

}
