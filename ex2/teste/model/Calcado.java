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
public class Calcado {
    
    private String marca;
    private String modelo;
    private int preco;
    private String cor;
    private String tipo;
    
    public Calcado (String Marca, String modelo){
        marca = Marca;
        this.modelo = modelo;
    }
    
    public Calcado(){}

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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void calcar(){
        System.out.println("voce esta usando seu calçado");
    }
    
    public void descalcar(){
        System.out.println("Voce esta descalçado");
    }
    
    public void guardar(){
        System.out.println("Calçao guardado");
    }
    
}
