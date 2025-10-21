
package atividade10_mariag;

import java.util.Scanner;
import java.util.List;

        
public class Atividade10_mariag {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ConexaoDAO conexaoBD = new ConexaoDAO();
        Aluno alunos = new Aluno();
        
        int opcao;
        char op = ' ';
        boolean confirmacao = true;
        String nome;
        int id;
        
        while(confirmacao){
            System.out.println("\n1 - Cadastrar aluno"
                    + "\n2 - Listar aluno"
                    + "\n3 - Atualizar dados"
                    + "\n4 - Deletar aluno"
                    + "\n5 - Sair");
            opcao = input.nextInt();
            
            switch(opcao){
                
                case 1 -> {
                    Aluno novoAluno = new Aluno();
                    input.nextLine();
                    
                    System.out.println("Insira o nome do aluno: ");
                  
                    nome = input.nextLine();
                    novoAluno.setNome(nome);
                    
                    conexaoBD.cadastrarAluno(novoAluno);
                    
                    System.out.println("Deseja voltar ao menu: s/n");
                    op = input.next().charAt(0);
                    
                    if(op == 's'){
                        confirmacao = true;
                    }
                    else{
                        System.out.println("Conexao terminada");
                        confirmacao = false;
                    }
                    
                }
                
                case 2 -> {
                    
                    List<Aluno> listaAlunos = conexaoBD.listarAlunos();
                    
                    for (Aluno a : listaAlunos) {
                        System.out.println("ID: " + a.getId() + " | Nome: " + a.getNome());
                    }
                    
                    System.out.println("Deseja voltar ao menu: s/n");
                    op = input.next().charAt(0);
                    
                    if(op == 's'){
                        confirmacao = true;
                    }
                    else{
                        System.out.println("Conexao terminada");
                        confirmacao = false;
                    }
                }
                    
                case 3 -> {
                    input.nextLine();
                    System.out.println("Insira o ID do aluno que deseja atualizar: ");
                    id = input.nextInt();
                    alunos.setId(id);
                    
                    input.nextLine();
                    System.out.println("Insira o nome ome do aluno: ");
                    nome = input.nextLine();
                    alunos.setNome(nome);
                    
                    conexaoBD.atualizarAlunos(alunos);
  
                    System.out.println("Deseja voltar ao menu: s/n");
                    
                    op = input.next().charAt(0);
                    
                    if(op == 's'){
                        confirmacao = true;
                    }
                    else{
                        System.out.println("Conexao terminada");
                        confirmacao = false;
                    }
                              
                }
                
                case 4 -> {
                    input.nextLine();
                    System.out.println("Insira o ID do aluno que deseja deletar: ");
                    id = input.nextInt();
                    alunos.setId(id);
                    
                    conexaoBD.deletarAluno(alunos.getId(), alunos);
                     
                    System.out.println("Deseja voltar ao menu: s/n");
                    op = input.next().charAt(0);
                    
                    if(op == 's'){
                        confirmacao = true;
                    }
                    else{
                        System.out.println("Conexao terminada");
                        confirmacao = false;
                    }
                }
                
                case 5 -> confirmacao = false;
                
                default -> System.out.print("Opcao invalida");
            }
            
        }
     
    }
    
}
