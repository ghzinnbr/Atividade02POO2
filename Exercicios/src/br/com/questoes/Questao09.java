package br.com.questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao09 extends BaseQuestoes {

    protected Double celsius;

    protected Double celsiusFahreinheit;

    public Double getCelsius() {
        return celsius;
    }
    
    public void setCelsius(Double celsius) {
        this.celsius = celsius;
    }

    public Double getCelsiusFahreinheit() {
        return celsiusFahreinheit;
    }

    public void setCelsiusFahreinheit(Double celsiusFahreinheit) {
        this.celsiusFahreinheit = celsiusFahreinheit;
    }

    public Questao09() {

    }

    @Override
    public void executar() {
        this.menu();
    }
    
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Converter C para F");
            System.out.println("2 - Converter F para C");
            System.out.println("3 - Sair");
            System.out.println();
            System.out.printf("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.CtoF(scanner);
                    break;
                case 2:
                    this.FtoC(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 3);
        scanner.close();
    }

    public void CtoF(Scanner scanner) {
        System.out.println("Digite a temperatura em Celsius:");
        this.setCelsius(scanner.nextDouble());

        this.setCelsiusFahreinheit((this.getCelsius() * 9 / 5) + 32);

        DecimalFormat formato = new DecimalFormat("#.##");
        this.celsiusFahreinheit = Double.valueOf(formato.format(getCelsiusFahreinheit()));

        System.out.println();
        System.out.println(this.getCelsius() + "°C = " + this.getCelsiusFahreinheit() + "°F");
    }

    public void FtoC(Scanner scanner) {

        System.out.println("Digite a temperatura em Fahrenheit:");
        this.setCelsiusFahreinheit(scanner.nextDouble());

        this.setCelsius((this.getCelsiusFahreinheit() - 32) * 5 / 9);

        DecimalFormat formato = new DecimalFormat("#.##");
        this.celsius = Double.valueOf(formato.format(getCelsius()));

        System.out.println();
        System.out.println(this.getCelsiusFahreinheit() + "°F = " + this.getCelsius() + "°C");
    }
}
