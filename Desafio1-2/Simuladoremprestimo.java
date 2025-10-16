package desafio1.pkg2_mariag_davih;

public class Simuladoremprestimo {
    double juros = 0.02; // 2% ao mês
    int[] permitido = {6, 12, 18, 24, 30, 36, 40, 48, 56, 60, 72};
    double salarioapro, emprestimo, emprestimo_total;
    int qtd;

    Simuladoremprestimo(double emprestimo, int qtd) {
        this.emprestimo = emprestimo;
        this.qtd = qtd;
    }

    // Calcula o valor da parcela com juros simples
    public double parcelafinal() {
        // Fórmula de juros simples: total = valor + (valor * juros * parcelas)
        emprestimo_total = emprestimo + (emprestimo * juros * qtd);
        return emprestimo_total / qtd;
    }

    // Verifica se a quantidade de parcelas é válida
    public boolean parcelavalida() {
        for (int p : permitido) {
            if (p == qtd) {
                return true;
            }
        }
        System.out.println("❌ Quantidade de parcelas inválida.");
        return false;
    }

    // Faz o cálculo completo e mostra o resultado
    public void conta(double salario) {
        if (!parcelavalida()) {
            return; // sai se a quantidade for inválida
        }

        double parfin = parcelafinal(); // valor da parcela
        salarioapro = salario * 0.30; // 30% do salário

        if (parfin <= salarioapro) {
            int pro = (int) (Math.random() * 90000) + 10000;
            System.out.printf("\n✅ Empréstimo disponível! Protocolo: EM%d\n", pro);
        } else {
            System.out.printf("\n❌ Empréstimo indisponível. O valor da parcela (R$ %.2f) ultrapassa 30%% do salário (R$ %.2f)\n",
                    parfin, salarioapro);
        }

        System.out.printf("\n📊 Detalhes do Empréstimo:"
                + "\nValor solicitado: R$ %.2f"
                + "\nParcelas: %d"
                + "\nValor da parcela: R$ %.2f"
                + "\nValor total a pagar: R$ %.2f\n",
                emprestimo, qtd, parfin, emprestimo_total);
    }
}
