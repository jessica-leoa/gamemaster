
package hospitalcentral;

import java.awt.List;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersistenciaEmArquivoPaciente implements IPersistenciaPaciente {

    private final ArrayList<Paciente> pacienteCadastrado;

    public PersistenciaEmArquivoPaciente() {
        this.pacienteCadastrado = new ArrayList<Paciente>();
    }
    
    @Override
    public void cadastrarPaciente(Paciente p) {
        pacienteCadastrado.add(p);
    }

    @Override
    public String consutarPaciente(String cpf) {
       
    }

    @Override
    public boolean removerPaciente(boolean estado) {
       
    }

    @Override
    public void atualizarPaciente() {
    
    }
    
    private void salvarEmArquivo(Object cadastrarPaciente) throws FileNotFoundException, IOException
    {
        FileOutputStream fos = new FileOutputStream("Paciente.txt");
        try (ObjectOutputStream oss = new ObjectOutputStream(fos)) {
            oss.writeObject(cadastrarPaciente);
            oss.close();
        }
    }
    
}
