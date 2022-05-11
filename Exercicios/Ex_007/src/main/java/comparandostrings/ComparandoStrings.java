
package comparandostrings;

public class ComparandoStrings {
    public static void main(String[] args) {
        
        String n1 = "Leonardo";
        String n2 = "Leonardo";
        String n3 = new String("Leonardo");
        String res;
        
        res = (n1.equals(n3)) ? "igual" : "diferente";
        
        System.out.println(res);
    }
}
