/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade08_mariag;

import java.util.Scanner;
import java.lang.Math;

public class Atividade08_mariag{



    //1
//    public int delta(int a, int b, int c){
//        int calculo = (int) (Math.pow(b, 2)) - (4*a*c);
//        return calculo;
//    }
//    
//    // 2
//    public int soma(int n1, int n2){
//        return n1 + n2;
//    }
//    
//    public int sub(int n1,int n2){
//        return n1 - n2;
//    }
//
//    public int mult(int n1, int n2){
//        return n1 * n2;
//    }
//            
//    public double div(int n1, int n2){
//        return n1 / n2;
//    }
   
      //4
      public String nome(int mes) {
        switch (mes) {
            case 1:  return "Janeiro";
            case 2:  return "Fevereiro";
            case 3:  return "Março";
            case 4:  return "Abril";
            case 5:  return "Maio";
            case 6:  return "Junho";
            case 7:  return "Julho";
            case 8:  return "Agosto";
            case 9:  return "Setembro";
            case 10: return "Outubro";
            case 11: return "Novembro";
            case 12: return "Dezembro";
            default: return "Mês inválido";
        }
      }
      
      public String mess(int mes){
            String[] n = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
            
           

        if (mes >= 1 && mes <= 12) {
            return n[mes - 1]; 
        } 
        else {
            return "Número inválido!"; 
        }

    }
      
      public int media(int num, double total, double[] salarios){
          double medias = total /num;
          int cont =0;
          for(int i = 0; i<num; i++){
             if(salarios[i]> medias){
                cont++;
             }   
         }
          if(cont==0){
              System.out.println("Não existe funcionarios com salario acima da media");
          }
          return cont;
          
          
      }
      
      public double menor(double[] pesos){
         double m = pesos[0];
         for (int i = 1; i < pesos.length; i++) {
            if (pesos[i] < m) {
                m = pesos[i];
        }
    }
         return m;
      }
       
      public static int[] fib(int n){
          int[] num = new int[n];
          if (n > 0) num[0] = 0; 
          if (n > 1) num[1] = 1;
          
          for (int i = 2; i < n; i++) {
          num[i] = num[i - 1] + num[i - 2];
    }

         return num; 
}
      
      public static int n(String[] nomes, String a){
          for(int i =0; i<10; i++){
              if(nomes[i].equals(a)){
                  return i;
              }
              
          }
          return -1;
      }
      
     
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Atividade08_mariag def  = new Atividade08_mariag();
       
       //1
//        System.out.println("Dada a equação de 2º grau -3x^2 +4x - 2 = 0. Qual o resultado para x1 e x2");
//        double d = def.delta(-3,4,2);
//        double x1 = ( -(-4) + Math.sqrt(d)) / 2 * (-3);
//        double x2 = ( -(-4) - Math.sqrt(d)) / 2 * (-3);
//        System.out.printf("x1 = %.2f e x2= %.2f", x1, x2);
 
       //2
//          System.out.println("Calculadora"
//                  + "\n1 - Somar"
//                  + "\n2 - Subtrair"
//                  + "\n3 - Multiplicar"
//                  + "\n4 - Dividir");
//          
//          int opcao = 0, v1, v2;
//          
//          opcao = e.nextInt();
//          double resultado;
//          
//          System.out.print("Insira o 1º numero: ");
//          v1 = e.nextInt();
//          System.out.print("Insira o 1º numero: ");
//          v2 = e.nextInt();
//
//          
//          switch(opcao){
//          
//              case 1 -> {
//                  resultado = def.soma(v1, v2);
//                  System.out.printf("\nA soma dos numeros é: %.2f", resultado);
//              }
//              
//              case 2 -> {
//                  resultado = def.sub(v1, v2);
//                  System.out.printf("\nA subtracao dos numeros é: %.2f", resultado);
//              }
//          
//              case 3 -> {
//                  resultado = def.mult(v1, v2);
//                  System.out.printf("\nA multiplicação dos numeros é: %.2f", resultado);
//              }
//              
//              case 4 -> {
//                  resultado = def.div(v1, v2);
//                  System.out.printf("\nA divisão dos numeros é: %.2f", resultado);
//          }
//              default -> System.out.print("Opção invalida");
//        }

       //3
       
/*            System.out.print("Insira o numero que representa o mes: ");
            int mes;
            mes = e.nextInt();
            System.out.print("");
            String x;
            //a
            System.out.println(def.nome(mes));
           
            //b
            System.out.println(def.mess(mes));
*/           
        //4
/*        int num, cont = 0;

        double salario, total =0, medias = 0;
        System.out.println("Inisra o numero de funcionarios: ");
        num = e.nextInt();
        
        double[] salarios = new double[num];
        
        for(int i =0; i<num; i++){
            System.out.println("Insira o valor do salario do funcionario: ");
            salario = e.nextDouble();
            salarios[i] = salario;
            total += salario;
        }
        
        System.out.println(def.media(num,total,salarios));
 */       
        
        
        //5
/*        double[] pesos = new double[10];
        double peso;
        int cont = 0;
        
        for(int i=0; i<10; i++){
            System.out.printf("Insira o peso do funcionario %d: ", i+1);
            peso = e.nextDouble();
            pesos[i]= peso;
        }
        
        System.out.println(def.menor(pesos));
*/

        //6
/*        int n;
        System.out.println("Insira a quantidade: ");
        n = e.nextInt();
        int[] fibonacci = fib(n);
        for (int num : fibonacci) {
            System.out.print(num + " "); 
       }  
*/

        //7
/*        String[] nomes = new String[10] ;
        String nome, a =" ";
        
        for(int i =0; i<10; i++){
            System.out.printf("Insira o %d nome: ", i+1);
            nome = e.nextLine();
            nomes[i] = nome;           
        }
        System.out.println("Insira o nome que deseja procurar: ");
        a = e.nextLine();
        System.out.println(n(nomes, a));
*/
        //8
//            String nome, raca, dono, contato;
//            int idade, op;
//            
//            System.out.println("=== Cadastro Pet Shop Amigo Fierla ===");
//            System.out.println("Nome do animal: ");
//            nome = e.nextLine();
//            System.out.println("Raça: ");
//            raca = e.nextLine();
//            System.out.println("Idade do pet: ");
//            idade = e.nextInt();
//            System.out.println("Nome do dono: ");
//            dono = e.nextLine();
//            System.out.println("Contato: ");
//            contato = e.nextLine();
//            
//            Cachorro novo_pet = new Cachorro (nome, raca, idade, dono, contato);
//            
//            System.out.println(" ==== menu de serviços ==="
//                    + "\n1. Banho"
//                    + "\n2. Tosa"
//                    + "\n3. Banho e tosa"
//                    + "\n4. Consulta veterinaria");
//            op = e.nextInt();
//            System.out.println("===================\nFICHA DE ATENDIMENTO - AMIGO FIEL \n===================");
//             
//           switch(op){
//               case 1-> System.out.println("Procedimento....: Banho");
// 
//               case 2 -> System.out.println("Procedimento...: Tosa");
//                       
//               case 3-> System.out.println("Procedimento...: Banho e Tosa");
//                        
//               case 4-> System.out.println("Procedimento...: Consulta veterinaria");
//               
//               default -> System.out.println("Opção invalida");
//           };
//           System.out.println("==========================================");
//

        //9

/*        System.out.println("Insira o nome do aluno: ");
        String nome = e.nextLine();
        System.out.println("Insira o numero da matricula: ");
        int matricula = e.nextInt();
        System.out.println("Insira a nota da prova 1:");
        double nota1 = e.nextDouble();
        System.out.println("Insira a nota da prova 2:");
        double nota2 = e.nextDouble();
        System.out.println("Insira a nota do trabalho:");
        double notat = e.nextDouble();
        
        AlunoMatricula a1 = new AlunoMatricula(nome, matricula, nota1, nota2, notat);
        System.out.println("media: " +a1.media());
        System.out.println("nota necessaria na prova final: "+a1.provafinal());
*/

        //10
        Gabarito gab = new Gabarito();
        System.out.println("--- Teste de Prova ---");

       
        Prova p1 = new Prova(gab);
   
        p1.add('A');
        p1.add('C'); 
        p1.add('B');
        p1.add('D'); 
        p1.add('E'); 
        p1.add('A');
        p1.add('A'); 
        p1.add('C'); 
        p1.add('B');
        p1.add('D');
        p1.add('A'); 
        p1.add('A');
        p1.add('B');
        p1.add('B');
        p1.add('A');

        System.out.println("\nAluno 1: Acertos = " + p1.ac() + ", Nota = " + p1.n()); 
        
        
       
        Prova p4 = new Prova(gab); 
        p4.add('A'); 
        p4.add('C'); 
        p4.add('B');
        p4.add('D'); 
        p4.add('E'); 
        p4.add('A');
        p4.add('A'); 
        p4.add('C'); 
        p4.add('B'); 
        p4.add('Z'); 
        p4.add('E'); 
        p4.add('Z'); 
        p4.add('Z'); 
        p4.add('Z');
        p4.add('Z');
        
        System.out.println("Aluno 4: Acertos = " + p4.ac() + ", Nota = " + p4.n()); 

        
   
        double nTeste = p1.m(p4);
        System.out.println("\nTeste p1.m(p4): " + nTeste + " (Esperado: 5.5)");

    }
}
