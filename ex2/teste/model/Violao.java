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
public class Violao {
    
    private String marca;
    private String modelo;
    private String tipo;
    private String pintura;
    private int ano;
    
    
    //construtor
    public Violao(String Marca, String modelo){
        marca=Marca;
        this.modelo=modelo;
        
    }
    public Violao(){}
    
    //metodos de acesso
    public void setPintura(String p){
        pintura=p;
    }
    
    public String getPintura(){
        return pintura;
    }
    
    public void setAno(int a){
        ano=a;
    }
    
    public int getAno(){
        return ano;
    }
    
    public String getTipo(){
        
        return tipo;
    }
    
    public void setTipo(String t){
        tipo=t;
    }

    public String getMarca() {
        return marca;
    }
   
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //toca o violao
    public void tocar(){
        
        System.out.println("O violão esta sendo tocado");
    
    }
    
    public void parar(){
        System.out.println("o violão Foi Guardado");
    }
    
    public void trocar(){
        System.out.println("Voce trocou as cordas do violão");
    }
}
