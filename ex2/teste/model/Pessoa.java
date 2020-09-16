/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.model;

/**
 *
 * @author wallace
 */
public class Pessoa {
    
    private String nome;
    private String nacionalidade;
    private int idade;
    private int altura;
    public String hobby;
    
    //construtor
    
    public Pessoa(String Nome, String nacionalidade){
    
        nome=Nome;
        this.nacionalidade=nacionalidade;
    
    }
    
    public Pessoa(){}
    
    //metodos de acesso
    
    public void setHobby(String h){
        hobby=h;
    }

    public int getIdade() {
        return idade;
    }

    public String getHobby() {
        return hobby;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    
    public void setIdade(int i){
        idade=i;
    }
    
    public void setAltura(int a){
        this.altura=altura;
    }
    public int getAltura(){
        return altura;
    }
    
    // acorda a pessoa
    public void acordar(){
        System.out.println("Ja estou acordado");
    }
    
    // coloca a a dormir
    
    public void dormir(){
        System.out.println("Vou dormir em 3, 2, 1 ...");
    }
    
    public void comprimentar(){
        System.out.println("Ola, tudo bem ?");
    }
}
