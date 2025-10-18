
package atividade09_mariag;

import java.util.*;

public class AgendaEletronica {
  private List<Contato> contatos;

    public AgendaEletronica() {
        this.contatos = new ArrayList<>();
    }

    public void cadastrar(String nome, int telefone, String gmail) {
        Contato novo = new Contato(nome, telefone, gmail);
        contatos.add(novo);
    }

    public void listar() {
        if (contatos.isEmpty()) {
            System.out.println("A agenda está vazia.");
            return;
        }
        System.out.println("\n--- LISTA DE CONTATOS ---");

        contatos.sort(Comparator.comparing(Contato::getNome)); // ordena por nome

        for (int i = 0; i < contatos.size(); i++) {
            System.out.println("#" + (i + 1) + " | " + contatos.get(i));
        }
    }

    public Contato buscarPorNome(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public boolean verificarTell(int telefone) {
        for (Contato contato : contatos) {
            if (contato.getTelefone() == telefone) {
                return true;
            }
        }
        return false;
    }

    public boolean editar(String nome, Scanner e) {
        Contato contato = buscarPorNome(nome);
        if (contato == null) {
            System.out.println("Contato não encontrado.");
            return false;
        }

        System.out.print("Novo nome (enter para manter): ");
        String novoNome = e.nextLine();
        if (!novoNome.isBlank()) {
            contato.setNome(novoNome);
        }

        System.out.print("Novo telefone (enter para manter): ");
        String telStr = e.nextLine();
        if (!telStr.isBlank()) {
            try {
                int novoTel = Integer.parseInt(telStr);
                if (!verificarTell(novoTel) || novoTel == contato.getTelefone()) {
                    contato.setTelefone(novoTel);
                } else {
                    System.out.println("Já existe um contato com esse número!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Telefone inválido.");
            }
        }

        System.out.print("Novo e-mail (enter para manter): ");
        String novoEmail = e.nextLine();
        if (!novoEmail.isBlank()) {
            if (novoEmail.contains("@") && novoEmail.contains(".")) {
                contato.setGmail(novoEmail);
            } else {
                System.out.println("E-mail inválido!");
            }
        }

        System.out.println("Contato atualizado com sucesso!");
        return true;
    }

    public boolean excluir(String nome, Scanner e) {
        Contato contato = buscarPorNome(nome);
        if (contato == null) {
            System.out.println("Contato não encontrado.");
            return false;
        }

        System.out.print("Confirmar exclusão de " + contato.getNome() + "? (S/N): ");
        char conf = e.next().charAt(0);
        e.nextLine();

        if (conf == 'S' || conf == 's') {
            contatos.remove(contato);
            System.out.println("Contato excluído com sucesso!");
            return true;
        } else {
            System.out.println("Exclusão cancelada.");
            return false;
        }
    }
}
