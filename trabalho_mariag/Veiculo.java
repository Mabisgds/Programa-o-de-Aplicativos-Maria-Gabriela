package trabalho_mariag;

public class Veiculo {
    private String placa;
    private String condutor;
    private String marca;
    private String modelo;
    private String cor;
    private int codigo;
    private int tipo;
    private int horaEntrada;
    private int minutoEntrada;

    public Veiculo(){}
    
    public Veiculo(int contador){
        contador++;
        this.codigo = contador;
    }
    
    public Veiculo(String placa, String condutor, String marca, String modelo, 
            String cor, int horaEntrada, int minutoEntrada, int tipo, int codigo){
        this.placa = placa;
        this.condutor = condutor;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.horaEntrada = horaEntrada;
        this.minutoEntrada = minutoEntrada;
        this.tipo = tipo;
        this.codigo = codigo;  
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getCondutor(){
        return condutor;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getCor(){
        return cor;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public int getHora(){
        return horaEntrada;
    }
    
    public int getMinutos(){
        return minutoEntrada;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setCondutor(String condutor){
        this.condutor = condutor;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public void setHora(int horaEntrada){
        this.horaEntrada = horaEntrada;
    }

    public void setMinuto(int minutoEntrada){
        this.minutoEntrada = minutoEntrada;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
}

