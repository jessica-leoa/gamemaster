
package hospitalcentral;

public interface ITiposPaciente {
    /* Métodos que obrigatoriamente devem ser implementados pela Classe que implementar esta Interface */
    
    public abstract float calculoIMC();
    public void adicionarExame(Exame exame);
    public abstract void removerExame(Exame exame);
}
