package br.com.questoes;

import java.util.Scanner;

public class Questao02 extends BaseQuestoes {

    protected int numero1;

    protected int numero2;

    protected int produto;

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

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public Questao02() {
        
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        this.setNumero1(scanner.nextInt());
        
        System.out.print("Digite o segundo número inteiro: ");
        this.setNumero2(scanner.nextInt());
        
        this.setProduto(this.getNumero1() * this.getNumero2());
       
        System.out.println("O produto dos números é: " + this.getProduto());

        
        scanner.close();
    }
    
}
