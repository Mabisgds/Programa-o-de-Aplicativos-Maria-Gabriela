
package trabalho_maria_gabriela;

public class Pagamento {
    private int codigo;
    private double valor;
    private String metodo;
    
    public Pagamento(int codigo, double valor, String metodo){
        this.codigo = codigo;
        this.valor = valor;
        this.metodo = metodo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public double getValor(){
        return valor;
    }
    
    public String getMetodo(){
        return metodo;
    }
    
    public String recibo(){
        return "Codiogo do Veiculo:" + codigo + 
                "\nValor pago: R$" + valor +
                "\nForma de pagamento>: " + metodo;
    }
}
    
 
