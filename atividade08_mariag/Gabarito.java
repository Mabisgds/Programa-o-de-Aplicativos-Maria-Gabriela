
package atividade08_mariag;
public class Gabarito {
    

    char[] r = 
        {'A', 'C', 'B', 'D', 'E', 'A', 'A', 'C', 'B', 'D', 'E', 'E', 'A', 'C', 'B'};

   
    public char resp(int n) { 
        if (n >= 1 && n <= 15) {
            return r[n - 1];
        }
        return '?'; 
    }
}

