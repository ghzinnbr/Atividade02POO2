package br.com.questoes;

import java.util.Scanner;

public class Questao01 extends BaseQuestoes {

    protected int numero1;

    protected int numero2;

    protected int soma;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public Questao01() {
        
    }
    
    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o segundo número inteiro: ");
        this.setNumero1(scanner.nextInt());
        
        System.out.print("Digite o primeiro número inteiro: ");
        this.setNumero2 (scanner.nextInt());

        this.setSoma(this.getNumero1() + this.getNumero2());

       
        System.out.println("A soma dos números é: " + this.getSoma());

        
        scanner.close();
    }

}