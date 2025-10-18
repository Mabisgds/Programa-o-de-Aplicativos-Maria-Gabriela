
package atividade09_mariag;

import java.util.Scanner;
import java.util.*;

public class Biblioteca {
  private List<Livro> acervo = new ArrayList<>();

    public Biblioteca() {
        acervo.add(new Livro(101, "POO em Java", "Silva, A."));
        acervo.add(new Livro(102, "Algoritmos Modernos", "Cormen, T."));
        acervo.add(new Livro(103, "Estruturas de Dados", "Weiss, M."));
        acervo.get(2).setEmprestado(true); // um já emprestado
    }

    public void consultarAcervo() {
        System.out.println("\n--- ACERVO ---");
        System.out.printf("%-5s | %-25s | %-15s | %s%n", "Cód", "Título", "Autor", "Status");
        for (Livro livro : acervo) {
            System.out.println(livro);
        }
    }

    public void pegarEmprestado(Scanner sc) {
        System.out.println("\n--- EMPRÉSTIMO ---");
        System.out.print("Leitor (nome): ");
        String leitor = sc.nextLine();

        System.out.print("Informe o código do livro: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        Livro escolhido = null;
        for (Livro l : acervo) {
            if (l.getCodigo() == codigo) {
                escolhido = l;
                break;
            }
        }

        if (escolhido == null) {
            System.out.println("Livro não encontrado!");
            return;
        }

        if (escolhido.isEmprestado()) {
            System.out.println("Este livro já está emprestado!");
            return;
        }

        System.out.printf("Livro disponível: \"%s\" (%s)%n", escolhido.getTitulo(), escolhido.getAutor());
        System.out.print("Confirmar empréstimo? (S/N): ");
        char conf = sc.next().charAt(0);
        sc.nextLine();

        if (conf == 'S' || conf == 's') {
            escolhido.setEmprestado(true);

            // Datas simuladas (sem LocalDate)
            String dataEmprestimo = "08/10/2025";
            String dataDevolucao = "17/10/2025";

            System.out.println("\n--- RECIBO ---");
            System.out.println("Leitor: " + leitor);
            System.out.printf("Livro: Código %d | \"%s\" (%s)%n", escolhido.getCodigo(), escolhido.getTitulo(), escolhido.getAutor());
            System.out.println("Empréstimo: " + dataEmprestimo);
            System.out.println("Devolução (7 dias úteis): " + dataDevolucao);
            System.out.println("Status do livro: Emprestado");
        } else {
            System.out.println("Operação cancelada.");
        }
    }
}