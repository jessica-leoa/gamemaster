
package hospitalcentral;

/**
 *
 * @author jessica
 */
public class Exame {
    
    String exame;

    public String fazerExame(String tipoExame){
        return this.exame = tipoExame;
    }
    
    public void removerExame(String exame)
    {
        if(this.exame.contains(exame))
         this.exame.remove(exame);
    }
}
