package br.com.questoes;

import java.util.Scanner;

public class Questao03 extends BaseQuestoes {

    protected Double numero1;

    protected Double numero2;

    protected Double numero3;

    protected Double media;

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2){
        this.numero2 = numero2;
    }

    public Double getNumero3() {
        return numero3;
    }

    public void setNumero3(Double numero3) {
        this.numero3 = numero3;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public Questao03() {
        
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        this.setNumero1(scanner.nextDouble());
        
        System.out.print("Digite o segundo número: ");
        this.setNumero2(scanner.nextDouble());

        System.out.print("Digite o terceiro número:");
        this.setNumero3(scanner.nextDouble());
        
        this.setMedia((this.getNumero1() +  this.getNumero2() + this.getNumero3()) / 3);
       
        System.out.println("O média dos números é: " + this.getMedia());

        
        scanner.close();
    }
}
