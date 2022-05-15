
package iniciodepoo;

public class Fatorial {
     
    static String formula = "";
    
    public static int fatorial(int n){

        if (n == 0 || n == 1){
            return 1;
        }else{
            formula += n + " x "; 
                    
            return n *fatorial(n - 1);
            
        }
        
    }
}
