
package atividade08_mariag_davih;

public class Gabarito {
    
    // Atributo: Array de respostas
    char[] r = 
        {'A', 'C', 'B', 'D', 'E', 'A', 'A', 'C', 'B', 'D', 'E', 'E', 'A', 'C', 'B'};

    // Método: Retorna a resposta (renomeado de respostaQuestao)
    public char resp(int n) { // n: número da questão
        if (n >= 1 && n <= 15) {
            return r[n - 1];
        }
        return '?'; 
    }
}

