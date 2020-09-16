package teste;

import java.util.Random;
import javax.swing.JOptionPane;
import teste.model.Aluno;
import teste.model.Calcado;
import teste.model.Lugar;
import teste.model.Pessoa;
import teste.model.Profissao;
import teste.model.Violao;

/**
 *
 * @author wallace
 */
public class Teste {

    
    Random random = new Random();
    int sorte = random.nextInt(2);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op;
        
        
        op = Integer.parseInt(JOptionPane.showInputDialog("1/Aluno \n2/Calcado \n3/Lugar "
                + "\n4/Pessoa \n5/Profissao \n6/Violao"));
        
        switch (op) {
            case 1:
                Teste ta = new Teste();
                ta.testeAluno();
                break;
            case 2:
                Teste tc = new Teste();
                tc.testeCalcado();
                break;
            case 3:
                Teste tl = new Teste();
                tl.testeLugar();
                break;
            case 4:
                Teste tp = new Teste();
                tp.testePessoa();
                break;
            case 5:
                Teste tprof = new Teste();
                tprof.testeProfissao();
                break;
            default:
                Teste tv = new Teste();
                tv.testeViolao();
                break;
        }
        
        
    }
    public void testeViolao() {
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantos objetos deseja criar ?"));
        
        Violao[] lista = new Violao[x];
        
        for (int i = 0; i<lista.length; ++i){
            lista[i] = new Violao();
            lista[i].setMarca(JOptionPane.showInputDialog("Marca do violao"));
            lista[i].setModelo(JOptionPane.showInputDialog("Qual o modelo ?"));
            lista[i].setTipo(JOptionPane.showInputDialog("Qual o Tipo ?"));
            lista[i].setPintura(JOptionPane.showInputDialog("Qual a pintura ?"));
            lista[i].setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano de lançamento ?")));
            
            System.out.println(lista[i].getMarca());
            switch (sorte){
                case 0:
                    lista[i].tocar();
                    break;
                case 1:
                    lista[i].parar();
                    break;
                default:
                    lista[i].trocar();
                    break;
            }
        }
    }
    
    public void testeAluno(){
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantos objetos deseja criar ?"));
        
        Aluno[] alunol = new Aluno[x];
        
        for (int i = 0; i<alunol.length; ++i){
            alunol[i] = new Aluno();
            alunol[i].setNome(JOptionPane.showInputDialog("Digite seu Nome"));
            alunol[i].setCurso(JOptionPane.showInputDialog("Qual o curso ?"));
            alunol[i].setModulo(Integer.parseInt(JOptionPane.showInputDialog("Qual o modulo ?")));
            alunol[i].setPeriodo(JOptionPane.showInputDialog("Qual o periodo ?"));
            alunol[i].setRa(Integer.parseInt(JOptionPane.showInputDialog("Qual o seu RA ?")));
            
            System.out.println(alunol[i].getNome());
            switch (sorte){
                case 0:
                    alunol[i].assistir();
                    break;
                case 1:
                    alunol[i].duvida();
                    break;
                default:
                    alunol[i].responder();
                    break;
            }
            
        }
        
    }
    
    public void testeCalcado(){
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantos objetos deseja criar ?"));
        Calcado[] calcadol = new Calcado[x];
        
        for (int i = 0; i<calcadol.length; ++i){
            calcadol[i] = new Calcado();
            calcadol[i].setMarca(JOptionPane.showInputDialog("Qual a marca do calçado ?"));
            calcadol[i].setModelo(JOptionPane.showInputDialog("Qual o modelo ?"));
            calcadol[i].setPreco(Integer.parseInt(JOptionPane.showInputDialog("Valor R$")));
            calcadol[i].setCor(JOptionPane.showInputDialog("Qual a cor ?"));
            calcadol[i].setTipo(JOptionPane.showInputDialog("Qual o tipo de calçado ?"));
            
            System.out.println(calcadol[i].getMarca());
            switch (sorte){
                case 0:
                    calcadol[i].calcar();
                    break;
                case 1:
                    calcadol[i].descalcar();
                    break;
                default:
                    calcadol[i].guardar();
                    break;
            }
        }
    }
    
    public void testeLugar(){
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantos objetos deseja criar ?"));
        Lugar[] lugarl = new Lugar[x];
        
        for (int i = 0; i<lugarl.length; ++i){
            lugarl[i] = new Lugar();
            lugarl[i].setPais(JOptionPane.showInputDialog("Qual o país"));
            lugarl[i].setContinente(JOptionPane.showInputDialog("Qual o continente ?"));
            lugarl[i].setCapital(JOptionPane.showInputDialog("Qual a capital ?"));
            lugarl[i].setClima(JOptionPane.showInputDialog("Qual oClima ?"));
            lugarl[i].setIdioma(JOptionPane.showInputDialog("Qual o idioma alado ?"));
            
            System.out.println(lugarl[i].getPais());
            switch (sorte){
                case 0:
                    lugarl[i].receber();
                    break;
                case 1:
                    lugarl[i].despedir();
                    break;
                default:
                    lugarl[i].avisar();
                    break;
            }
        }
    }
    
    public void testePessoa(){
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantos objetos deseja criar ?"));
        Pessoa[] pessoal = new Pessoa[x];
        
        for (int i = 0; i<pessoal.length; ++i){
            pessoal[i] = new Pessoa();
            pessoal[i].setNome(JOptionPane.showInputDialog("INsira seu nome: "));
            pessoal[i].setNacionalidade(JOptionPane.showInputDialog("Qual sua nacionalidade ?"));
            pessoal[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade ?")));
            pessoal[i].setAltura(Integer.parseInt(JOptionPane.showInputDialog("Qual sua altura ?")));
            pessoal[i].setHobby(JOptionPane.showInputDialog("Qual seu hobby?"));
            
            System.out.println(pessoal[i].getNome());
            switch (sorte){
                case 0:
                    pessoal[i].acordar();
                    break;
                case 1:
                    pessoal[i].dormir();
                    break;
                default:
                    pessoal[i].comprimentar();
                    break;
            }
            
        }
    }
    
    public void testeProfissao(){
        int x;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Quantos objetos deseja criar ?"));
        Profissao[] profl = new Profissao[x];
        
        for (int i = 0; i<profl.length; ++i){
            profl[i] = new Profissao();
            profl[i].setProfissional(JOptionPane.showInputDialog("Qual sua profissao ?"));
            profl[i].setArea(JOptionPane.showInputDialog("Qual sua área de atuação ?"));
            profl[i].setRegistro(Integer.parseInt(JOptionPane.showInputDialog("Insira seu Registro")));
            profl[i].setCargo(JOptionPane.showInputDialog("Qual o seu cargo ?"));
            profl[i].setSalario(Integer.parseInt(JOptionPane.showInputDialog("Qual o seu salário ?")));
            
            System.out.println(profl[i].getProfissional());
            switch (sorte){
                case 0:
                    profl[i].trabalhar();
                    break;
                case 1:
                    profl[i].descansar();
                    break;
                default:
                    profl[i].almocar();
                    break;
            }
        }
    }    
}
