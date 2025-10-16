 package desafio1.pkg2_mariag_davih;

public class ServicoCambio {
    double dol;
    double cotacao = 5.32;

    public ServicoCambio(double dol) {
        this.dol = dol;
    }

    public double custo(double dol) {
        return dol * cotacao;
    }
}