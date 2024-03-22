package br.com.questoes;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Questao10 extends BaseQuestoes{

    protected Double tempo;                     
                                                            // (D = T * V)  (L = D / 12)
    protected Double velocidade;
                                                            // D = distancia T = tempo / V = velocidade / L = litros de combustivel
    protected Double distancia;

    protected Double litros; 
  
    
    public Double getTempo() {
        return tempo;
    }

    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }

    public Double getVelocidade() {
        return velocidade;
    }
    
    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getDistancia() {
        return this.distancia;
    } 

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    public Questao10() {

    }

    @Override
    public void executar() {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tempo percorrido durante a viagem (em horas): ");
        this.setTempo(scanner.nextDouble());

        System.out.print("Digite a velocidade média durante a viagem (em km/h): ");
        this.setVelocidade(scanner.nextDouble());

        Double temp = (this.getTempo()) * (this.getVelocidade());
        this.setDistancia(temp);

        this.setLitros((this.getDistancia() / 12));

        DecimalFormat formato = new DecimalFormat("#.##");
        this.litros = Double.valueOf(formato.format(getLitros()));
        
        System.out.println("A distância percorrida é: " + this.getDistancia() + "km" + " e a quantidade de litros consumidos na viagem foi de: " + this.getLitros() + "L");

        scanner.close();
    }
}