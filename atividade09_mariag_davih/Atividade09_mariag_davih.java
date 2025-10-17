
package atividade09_mariag_davih;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Atividade09_mariag_davih {

    private static Object nome;
    
    public static void main(String[] args) {
        String gmail;
        String nome;
        int telefone;
        char opcao = ' ';
        
//         Contato novo = new Contato(nome, telefone, gmail);
         
        
        Scanner e = new Scanner(System.in);
        AgendaEletronica agenda = new AgendaEletronica();
        
        
        do{
            System.out.println("1 - Cadastrar novo contato"
                    + "\n2 - Consultar agenda"
                    + "\n3 - Editar contato"
                    + "\n4 - excluir contato"
                    + "\n5 - Sair"
                    + "\n Selecione uma opcao: ");
            char op = e.next().charAt(0);
            e.nextLine();

            switch(op){

                case '1' -> {

                    do{
                        System.out.println("Insira o nome do contato: ");
                        nome = e.nextLine();

                        if(nome.isBlank()){
                            System.out.println("O nome não pode estar em branco");
                        }
                    }while(nome.isBlank());

                    do{    
                        try{
                            do{
                                System.out.println("Insira o numero do contato: ");
                                telefone = e.nextInt();
                                if(agenda.verificarTell(telefone)){
                                    System.out.println("Ja existe um contato cadastrado com esse numero"); 
                                }
                                else {
                                    break;
                                }
                            }
                            
                            while(true);
                            e.nextLine();
                            break;
                        }
                        catch(InputMismatchException a){
                            System.out.println("O telefone deve conter apenas numeros");
                             e.nextLine();
                        }
                    }
                    while(true);

                    boolean email;
                    do{
                        System.out.println("Insira o email do contato: ");
                        gmail = e.nextLine();
                        email =  gmail.endsWith("@gmail.com");

                        if(email == false){
                            System.out.println("O email deve ser @gmail.com");
                        }
                    }
                    while(email == false);

                    
                    agenda.cadastro(nome, telefone, gmail);
                    System.out.println("Contato cadastrado com sucesso");
                    System.out.println("Deseja voltar ao menu (s/n)?");
                    opcao = e.next().charAt(0);

                }

                case 2 -> {
                    agenda.listar();

                }
            }
       
    }while(opcao == 's');
        
    }  
}
