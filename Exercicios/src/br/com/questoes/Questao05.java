package br.com.questoes;

import java.util.Scanner;

public class Questao05 extends BaseQuestoes {

    protected String nome;

    protected String endereco;

    protected String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Questao05() {

    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        this.setNome(scanner.nextLine());

        System.out.print("Digite o seu endereco: ");
        this.setEndereco(scanner.nextLine());

        System.out.print("Digite o seu telefone: ");
        this.setTelefone(scanner.nextLine());
       
        System.out.println("-----DADOS DO CLIENTE-----");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Telefone: " + this.getTelefone());
        
        scanner.close();
    }
}
