package br.com.questoes;

import java.util.Scanner;

public class Questao04 extends BaseQuestoes {

    protected int numero1;

    protected int antecessor;

    protected int sucessor;

    public int getNumero1() {
        return numero1;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getAntecessor() {
        return antecessor;
    }

    public void setAntecessor(int antecessor) {
        this.antecessor = antecessor;
    }

    public int getSucessor() {
        return sucessor;
    }

    public void setSucessor(int sucessor) {
        this.sucessor = sucessor;
    }

    public Questao04() {

    }
    
    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        this.setNumero1(scanner.nextInt());

        this.setAntecessor(this.getNumero1() - 1);

        this.setSucessor(this.getNumero1() + 1);

       
        System.out.println("O seu antecessor é: " + this.getAntecessor());
        System.out.println("O seu sucessor é: " + this.getSucessor());

        
        scanner.close();
    }

}
