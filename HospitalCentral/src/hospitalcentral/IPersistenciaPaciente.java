
package hospitalcentral;

public interface IPersistenciaPaciente {
    
    //Declarando métodos abstratos
    public void cadastrarPaciente(Paciente p);
    
    public String consutarPaciente(String cpf);
    
    public boolean removerPaciente(boolean estado);
    
    public void atualizarPaciente();
}
