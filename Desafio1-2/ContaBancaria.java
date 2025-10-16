
package desafio1.pkg2_mariag_davih;

public class ContaBancaria {
    double sr;
    double sd;
    ExtratoBancario extrato = new ExtratoBancario();
    

    public ContaBancaria(double sr, double sd) {
        this.sr = sr;
        this.sd = sd;
    }

    public void depositar(double deposito) {
        this.sr += deposito;
        System.out.println("\ndepósito realizado com sucesso!");
        extrato.adicionar(new Movimentacao("Depósito ",deposito));
    }

    public void comprar(double dol) {
        ServicoCambio cambio = new ServicoCambio(dol);
        double valorReal = cambio.custo(dol);

        if (valorReal <= this.sr) {
            this.sr -= valorReal;
            this.sd += dol;
            extrato.adicionar(new Movimentacao("Depósito em Dólar ",valorReal));
            System.out.println("Comprar realizada com sucesso!");
        }
        else{System.out.println("Saldo em Reais insuficiente!");
        }
        
    }

    public void mostrarSaldo() {
        System.out.printf("\nsaldo em reais: R$ %.2f", this.sr);
        System.out.printf("\nsaldo em dólares: US$ %.2f", this.sd);
    }
}