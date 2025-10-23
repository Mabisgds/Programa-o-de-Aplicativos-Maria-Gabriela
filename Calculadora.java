package trabalho_maria_gabriela;

public class Calculadora {
    
    Veiculo veiculos = new Veiculo();
    
    public static double calcularValor(int minutos, int tipoVeiculo){
      double valor = 0.0;
      double extra = 0.0;
      
        switch(tipoVeiculo){
            case 1 ->{  
                if (minutos <= 15) {
                   valor = 6.00; 
                }
                else if (minutos <= 30) {
                    valor = 17.00; 
                } 
                else if (minutos <= 60) {
                    valor = 20.00; 
                } 
                else { 
                    valor = 20.00;
                    extra = 1.35; 
                }
                break;
            }


            case 2 ->{
                if (minutos <= 15) {
                    valor = 3.00; 
                }
                else if (minutos <= 30) {
                    valor = 7.00; 
                }
                else if (minutos <= 60) {
                    valor = 10.00; 
                }
                else { 
                    valor = 10.00;
                    extra = 1.00; 
                }
                break;
            }

            case 3 ->{
                if (minutos <= 15) {
                    valor = 16.00; 
                }
                else if (minutos <= 30) {
                    valor = 27.00; 
                }
                else if (minutos <= 60) {
                    valor = 30.00; 
                }
                else { 
                    valor = 30.00;
                    extra = 2.35; 
                }
                break;
            }

            default ->{
                valor = 0.0; 
                break;
            }
        }    
        if (minutos> 60) {
            int minutosExcedentes = minutos - 60;
            valor += (minutosExcedentes * extra); 
        }

        return valor;
    }
}
