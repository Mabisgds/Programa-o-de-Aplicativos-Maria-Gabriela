/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade06_maria_davih;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Aluno
 */
public class Atividade06_maria_davih {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
    //1
//        int nota = 0;
//        
//       do{
//           System.out.print("Insira a nota: ");
//           nota = input.nextInt();
//           if(nota<10 || nota<0){
//               System.out.println("A nota deve estar entre 0 e 10");
//           }
//       }
//       while(nota>10 || nota<0);
//        System.out.printf("nota valida: %d ", nota);

    //2
//        int v1, cont = 0, v2, soma = 0;
//        double media = 0;
//        
//        System.out.print("Insira o valor: ");
//        v1 = input.nextInt();
//        do{
//           
//            System.out.print("Insira o valor: ");
//            v2 = input.nextInt();
//            
//            ++cont;
//            soma += v1 + v2;
//            
//        }
//        while(v2 != 0);
//        
//        if(cont != 0){
//            media = (double) soma/cont;}
//        
//        System.out.printf("Soma: %d \nQuantidade: %d \nMedia: %2f", soma, cont, media);
   
    //3
//        int a = 0,s,d = (int)(Math.random()*100)+1;
//        do{
//            System.out.print("Insira um valor: ");
//            s = input.nextInt();
//            a++;
//            if(s == d){
//                System.out.printf("Acertou em %d ",a);
//            }if(s > d){
//                System.out.println("Muito alto");
//            }if(s < d){
//                System.out.println("Muito baixo");
//            }
//              
//        }    
//        while(s != d);     
            
    //4
//        int n;
//        String op;
//        do{
//            do{
//                System.out.print("Digite um numero: ");
//                n = input.nextInt();
//                if(n<=0){
//                    System.out.print("Numero invalido.");
//                }}
//                
//            while(n<=0); 
//            
//            for(int i = 0;i<n;i++){
//                System.out.println(n - i);
//            }
//            System.out.print("Digite s/n: ");
//            op = input.nextLine();
//        }while(op.equalsIgnoreCase("s"));
        
    //5
//        String S, senha="s1234";
//        int T = 3;
//        
//        do{
//            System.out.print("Insira a senha: ");
//            S = input.nextLine();
//            
//            
//            if(!S.equals(senha)){
//                T--;
//                if(T>0){
//                    System.out.printf("Incorreta. Tentativas restantes: %d \n", T);                
//                }
//            }
//        }
//        while(T > 0 && !S.equals(senha) );
//        
//        if (S.equals(senha)){
//            System.out.print("Acesso concedido");
//        }
//        else{
//            System.out.print("Conta bloqueada");
//        }

    //6
//        int n, r;
//        
//        System.out.print("Digite um numero: ");
//        n = input.nextInt();
//        
//        for(int i = 1; i<=10; i++){
//            r = n * i;
//            System.out.printf("%d x %d = %d \n", n, i, r);}
      
    //7
//        int n, si = 0, sp = 0;
//        
//        System.out.print("Insira um valor: ");
//        n = input.nextInt();
//        
//        for(int i = 0; i<=n; i++){
//            if(i % 2 == 0){
//                sp +=i;
//            }
//            else{
//                si += i;
//            }
//        }
//        System.out.printf("Pares: %d \nImpares: %d", sp, si);

    //8
//            int n;
//            
//            System.out.print("Inisra um valor: ");
//            n = input.nextInt();
//            if(n<= 1){
//                System.out.print("O numero deve ser maior que 1");
//            }
//            else{
//                for(int i = 2; i<=n; i++){
//                    boolean primo = true;
//                    for(int k = 2; k*k<=i; k++){
//                        if(i%k ==0){
//                            primo = false;
//                            break;
//                        }
//                    }
//                
//                    if(primo == true){
//                    System.out.print(i+",");  
//                    }
//                }
//            }
//    
}
    
}
