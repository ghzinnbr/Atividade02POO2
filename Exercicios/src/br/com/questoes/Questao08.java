package br.com.questoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao08 extends BaseQuestoes{

    protected Double salario;

    protected Double reajuste;

    protected Double valorReajuste;

    protected Double salarioAjustado;

    public Double getSalario() {
        return salario;
    }
    
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getReajuste() {
        return reajuste;
    }

    public void setReajuste(Double reajuste) {
        this.reajuste = reajuste;
    }

    public Double getValorReajuste() {
        return valorReajuste;
    }

    public void setValorReajuste(Double valorReajuste) {
        this.valorReajuste = valorReajuste;
    }

    public Double getSalarioAjustado() {
        return salarioAjustado;
    }

    public void setSalarioAjustado(Double salarioAjustado) {
        this.salarioAjustado = salarioAjustado;
    }

    public Questao08() {

    }

    @Override
    public void executar() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        this.setSalario(scanner.nextDouble());

        System.out.print("Digite o percentual de reajuste (em %): ");
        this.setReajuste((scanner.nextDouble()));

        this.setValorReajuste(this.getSalario() * (this.getReajuste() / 100));

        this.setSalarioAjustado(this.getValorReajuste() + this.getSalario());

        DecimalFormat formato = new DecimalFormat("#.##");
        this.salarioAjustado = Double.valueOf(formato.format(getSalarioAjustado()));

        System.out.println("O novo salário do funcionário é: " + this.getSalarioAjustado());

        scanner.close();
    }
}
