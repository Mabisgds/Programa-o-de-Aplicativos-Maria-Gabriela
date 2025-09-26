/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade07_mariag;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class Atividade07_mariag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        
    //1
//        int [][] a = new int[4][4];
//        
//        for (int i =0; i<4; i++){
//            for (int j = 0; j<4; j++){
//              System.out.printf("Digite o numero [%d][%d]: ", i, j);
//              a [i][j] = e.nextInt();
//              
//            }
//        }
        
    //2
//        int [] b = new int[8];
//        int maior = 1;
//        
//        System.out.print("Insira o valor: ");
//        b[0] = e.nextInt();
//        maior = b[0];
//        
//        for (int i =1; i< b.length; i++){
//            System.out.print("Insira o valor: ");
//            b[i] = e.nextInt();
//            
//            if (b[i] > maior){
//                maior = b[i];
//                 
//            } 
//        }
//        System.out.println(maior);

    //3
//        int [] vet1 = new int[5],
//        vet2 = new int[5];
//        
//        
//        for (int i =0; i < vet1.length; i++){
//            System.out.printf("Insira o %d valor: ", i+1 );
//            vet1[i] = e.nextInt();
//            vet2[i] = vet1[i];
//        }
//        for (int i =0; i < vet1.length; i++){
//            System.out.println(vet1[i]);
//        }
//        for (int j =0; j < vet1.length; j++){
//            System.out.println('\n'+vet2[j]);
//        }     
                
    //4
//        double[] c = new double[20];
//        double media = 0, maior;
//        
//        
//        for(int i = 0; i < c.length; i++){
//            System.out.printf("Insira o %dº valor: ", i +1);
//            c[i] = e.nextDouble();
//            media += c[i];
//        }
//        media /= c.length;
//        
//        for(int i = 1; i < c.length; i++){
//            if(c[i]> media){
//                System.out.println(c[i]);
//            }
//        }

    //5
//        String senha;
//        boolean v, n = false;
//        
//        do{
//           System.out.print("Insira a senha: ");
//           senha = e.nextLine();
//           if(senha.length() != 8){
//               System.out.println("Senha invalida, deve conter 8 digitos"); 
//               v = false;
//               continue;
//           }   
//               for(int i = 0; i < senha.length(); i++){
//                   char letra = senha.charAt(i);
//                   if(letra >= '0' && letra <= '9' ){
//                       n = true;
//                       break;
//                   }
//               }
//               if (!n){
//                   System.out.println("Senha invalida, deve conter um numero");
//                   v = false;
//                }
//                else{
//                     v = true;
//                }
//        }
//        while(!v);
//        System.out.println("Senha válida!");

    //6
//        String frase;
//        char letra;
//        int con = 0, vol = 0, espaco =0, num = 0;
//        
//        System.out.print("Insira uma frase: ");
//        frase = e.nextLine();
//        
//        for( int i =0; i< frase.length(); i++){
//            letra = frase.charAt(i);
//             if(!(letra >= '0' && letra <= '9' )){
//
//                if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ){
//                    vol ++;
//                }
//                if(letra == ' '){
//                    espaco += 1;
//                }
//                if (!(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') && letra != ' ') {
//                    con++;
//                }
//             }
//             else{
//                 num +=1;
//             }
//        }
//        System.out.printf("vogais: %d \n consoantes: %d \n espaços: %d \n numeros: %d ", vol, con, espaco, num);
   
    // 7
        String texto, pa;
        
        System.out.print("Digite o texto: ");
        texto = e.nextLine();
        
        System.out.print("Insira a palavra: ");
        pa = e.nextLine();
    
        for (int i= 0; )
//       while(texto.indexOf(pa) != -1){ 
           
    }
}
