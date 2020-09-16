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
public class Aluno {
    
    private String nome;
    private String curso;
    private int modulo;
    private String periodo;
    private int ra;
    
    //construtor
    public Aluno (String Nome, int ra){
        this.ra = ra;
        nome = Nome;
    }
    
    public Aluno (){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
    
    public void assistir(){
        System.out.println("Estou assistindo aula");
    }
    
    public void duvida(){
        System.out.println("Estou com uma duvida");
    }
    
    public void responder(){
        System.out.println("Presente");
    }
    
    
}
