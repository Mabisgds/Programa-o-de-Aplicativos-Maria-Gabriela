/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade05_maria_gabriela;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Aluno
 */
public class Atividade05_maria_gabriela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
    //1 
//        int cont = 0, N;
//        System.out.print("Inisra um valor:");
//        N = input.nextInt();
//        
//        while(cont < N){
//            cont++;
//            System.out.println(cont);
            
//        }

    //2
//        int cont =0, a = 0, total = 0;
//        
//        System.out.print("Insira um valor ou digite '-1' para parar: ");
//        a = input.nextInt();
//        
//        while (a != -1){
//            total = a+total;
//            cont++;
//            System.out.print("Insira um valor ou digite '-1' para parar: ");
//            a = input.nextInt();
//        }
//        
//        if (cont !=0){
//            System.out.print("A soma dos digitos foi: " +total );
//        }
//        else {System.out.print("Nenhum valor foi inserido");}

    //3
//        String senha = " ";
//        System.out.print("Insira a senha: ");
//        senha = input.next();       
//        
//        while(!senha.equals("Java123")){
//            System.out.println("Sennha incorreta");
//            System.out.print("Insira a senha: ");
//            senha = input.next();
//                
//        };
//        System.out.print("Acesso permitido");
//        
    //4
//        int b = 1;
//        double v1, v2;
        
        
        
//        while (b != 0){
//            System.out.print("1 - Somar \n2 - Subtrair \n3- Multiplicar \n0 -Sair\n");
//            b = input.nextInt();
//            
//        
//            if (b  > 0 && b < 4){
//                System.out.print("Insira o primeiro valor: ");
//                v1 = input.nextDouble();
//                System.out.print("Insira o segundo numero: ");
//                v2 = input.nextDouble();
//
//                switch (b){
//                    case 1 -> System.out.println(v1+v2);
//                    case 2 -> System.out.println(v1-v2);
//                    case 3 -> System.out.println(v1*v2);
//                }
//            }
//            if (b < 0 || b>4){ System.out.println("opcao inexistente");}
//        }

    //5 
//        int n = 0,
//        cont = 1,
//        resul = 1;
//        
//        System.out.print("Insira um numero: ");
//        n = input.nextInt();
//        while(cont <= n){
//            resul *=cont;
//            cont++;
//        }
//        
//        System.out.print(resul);

    //6
//        int n,
//        v1 = 0,
//        v2 = 1,
//        p;
//        
//        System.out.print("Insira o valor: ");
//        n = input.nextInt();
//        
//        p = v1+v2;
//        
//        while(p <= n){
//            System.out.print(p+ ",");
//            v1 = v2;
//            v2 = p;
//            p = v1 +v2 ;
//        }

    //7
//        System.out.print("Insira o valor: ");
//        int n = input.nextInt();
//
//        int i = 2;
//        int divisores = 0;
//
//        if (n <= 1) {
//            System.out.println(n + " não é primo");
//        } else {
//            while (i <= Math.sqrt(n)) {
//                if (n % i == 0) {
//                    divisores++; 
//                    break;       
//                }
//                i++;
//            }
//
//            if (divisores == 0) {
//                System.out.println(n + " é primo");
//            } else {
//                System.out.println(n + " não é primo");
//            }
//        
//    }

    //8
//        double a,b =0,i;
//        System.out.print("Insira um valor: ");
//        a = input.nextDouble();
//        
//        i = a;
//        while(a>0){
//            
//          
//            System.out.print("Insira um valor: ");
//            a = input.nextDouble();
//            if(a>0){
//            
//            i+=a;}
//        }
//        
//        System.out.print(i);
        
        
        
    //9
//        int a,b,i = 1;
//        System.out.print("Insira um valor: ");
//        a = input.nextInt();
//        System.out.print("Insira a quantidade de vezes pra repetir:  ");
//        b = input.nextInt();
//        if(b>0){
//        a *=b;}
//        System.out.print(a);


    //10
        int a,b;
        System.out.print("Insira um valor: ");
        a = input.nextInt();
        while(a>1){
            b = a % 2;
            
            if(b == 0){
                a /=2;
            }
            
            else{
                a = 3* a + 1;
            }
            System.out.println(a);
            
            }
        
}
}    

        
        
        
         
        
        
        
    
 
