
package atividade08_mariag;
public class AlunoMatricula {
    
    String nome;
    int matricula;
    double nota1;
    double nota2;
    double notat;
    
    AlunoMatricula(String nome, int matricula, double nota1, double nota2, double notat){
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notat = notat;  
    }
    
    public double media(){
       return (nota1 * 2.5 + nota2* 2.5 + notat + 2) / (2+2.5+2.5);
    }
   
    public double provafinal(){
        double m = media();
        if(m>=6){
            return 0;
        }
        else{
            double nota = 12-m;  
        
            if(nota > 10) 
            {nota =10;}
            return nota;
        }
    }
}