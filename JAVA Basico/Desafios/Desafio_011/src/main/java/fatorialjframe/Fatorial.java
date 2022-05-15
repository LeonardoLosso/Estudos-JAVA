
package fatorialjframe;

public class Fatorial {
     
    private String formula = "";
    private int num = 0;
    private int fat = 1;
    
    public void fatorial(int n){

        num = n;
        int f = 1;
        String s ="";
        
        for(int i = n; i>1; i--){
            f*=i;
            s+=i+"x";
        }
        fat = f;
        formula = s;
    }
    public String getFormula(){
            return formula;
        }
    public int getFatorial(){
        return fat;
    }
}
