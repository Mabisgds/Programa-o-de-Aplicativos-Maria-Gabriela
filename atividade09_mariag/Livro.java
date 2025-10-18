
package atividade09_mariag;
import java.util.*;
import java.time.*;

public class Livro {
   private int codigo;
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(int codigo, String titulo, String autor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public int getCodigo() { return codigo; }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isEmprestado() { return emprestado; }
    public void setEmprestado(boolean emprestado) { this.emprestado = emprestado; }

    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return String.format("%-5d | %-25s | %-15s | %s", codigo, titulo, autor, status);
    }
}