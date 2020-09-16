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
public class Lugar {
    
    private String pais;
    private String continente;
    private String capital;
    private String clima;
    private String idioma;
    
    //construtor
    
    public Lugar(){}
    
    public Lugar(String Pais,String capital ,String continente){
        this.continente=continente;
        this.capital=capital;
        pais=Pais;
    }
    //metodos de acesso
    public void setClima(String clima){
        this.clima=clima;
    }

    public String getClima() {
        return clima;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    
    public void setIdioma(String idioma){
    
        this.idioma=idioma;
    }
    public String getIdioma(){
        return idioma;
    }
  
    //receber
    public void receber(){
        System.out.println("Bem vindo");
    }
    //despedir
    public void despedir(){
        System.out.println("Volte sempre");
    }    
    public void avisar(){
        System.out.println("Área de acesso pribido");
    }
}
