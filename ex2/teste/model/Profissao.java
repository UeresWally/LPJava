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
public class Profissao {
    private String profissional;
    private String area;
    private int registro;
    private String cargo;
    private int salario;

    public Profissao(String profissional, String area, int registro) {
        this.profissional = profissional;
        this.area = area;
        this.registro = registro;
    }
    
    public Profissao(){}

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
   //criar metodos
    
    //
    public void trabalhar(){
        System.out.println("Turno de trabalho iniciado");
    }
    
    public void descansar(){
        System.out.println("Serviço concluido, bora pra casa descansar");
    }
    
    public void almocar(){
        System.out.println("Funcionario esta pegando a comida");
    }
}
