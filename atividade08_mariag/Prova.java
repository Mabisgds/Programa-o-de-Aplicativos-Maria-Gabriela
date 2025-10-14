
package atividade08_mariag;
public class Prova {
    
    char[] r;          
    Gabarito g;        
    int c;             
    
    
    static int N = 15; 
    
   
    public Prova(Gabarito gab) { 
        this.r = new char[N];
        this.g = gab;
        this.c = 0; 
    }
    
    
    public void add(char resp) { 
        if (this.c < N) {
            this.r[this.c] = Character.toUpperCase(resp);
            this.c++;
        } else {
            System.out.println("Maximo de " + N + " questoes atingido.");
        }
    }

   
    public int ac() {
        int a = 0; 
        
        for (int i = 0; i < N; i++) {
            int n = i + 1; 
            
            char certa = this.g.resp(n); 
            char aluno = this.r[i];
            
            if (aluno == certa) {
                a++;
            }
        }
        return a;
    }

    public double n() {
        double n = 0.0;
        
        for (int i = 0; i < N; i++) {
            int numQ = i + 1; 
            
            char certa = this.g.resp(numQ);
            char aluno = this.r[i];
            
            if (aluno == certa) {
                if (i < 10) { 
                    n += 0.5;
                } else { 
                    n += 1.0;
                }
            }
        }
        return n;
    }

    public double m(Prova outra) {
        
        int aE = this.ac();     
        int aO = outra.ac();    
 
        if (aE > aO) {
            return this.n();
        } 
        
        if (aO > aE) {
            return outra.n();
        } 

        else { 
            double nE = this.n();
            double nO = outra.n();
            
            if (nE > nO) {
                return nE;
            } 
            
            if (nO > nE) {
                return nO;
            } 
            
           
            else { 
                return nE; 
            }
        }
    }
}
