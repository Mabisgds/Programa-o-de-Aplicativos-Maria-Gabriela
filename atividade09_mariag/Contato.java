
package atividade09_mariag;


public class Contato {
  private String nome;
    private int telefone;
    private String gmail;

    public Contato(String nome, int telefone, String gmail) {
        this.nome = nome;
        this.telefone = telefone;
        this.gmail = gmail;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
        }
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        if (gmail.contains("@") && gmail.contains(".")) {
            this.gmail = gmail;
        }
    }

    @Override
    public String toString() {
        return nome + " | " + telefone + " | " + gmail;
    }
}