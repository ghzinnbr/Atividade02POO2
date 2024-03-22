package br.com.questoes;

import java.util.Scanner;

public class Questao07 extends BaseQuestoes {

    protected Double base;

    protected Double altura;

    protected Double perimetro;

    protected Double area;

    public Double getBase(){
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    
    public Questao07() {

    }

    @Override
    public void executar() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base do triângulo: ");
        this.setBase(scanner.nextDouble());

        System.out.print("Digite a altura do triângulo: ");
        this.setAltura(scanner.nextDouble());

        this.setPerimetro(this.getBase() + this.getAltura());

        this.setArea(this.getBase() * this.getAltura());

        System.out.println("O perímetro do triângulo é igual a: " + this.getPerimetro());
        System.out.println("A área do triângulo é igual a: " + this.getArea());
        
        scanner.close();
    }
}
