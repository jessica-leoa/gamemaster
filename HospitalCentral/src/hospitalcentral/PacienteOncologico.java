package hospitalcentral;

/**
 * @author jessica
 */

public class PacienteOncologico extends Paciente implements ITiposPaciente {
    
    int quantidadeQuimioterapia;
    int quantidadeRadioterapia;
    
    public PacienteOncologico(String nome, String cpf, float altura, float peso, int indiceGlicemico, Exame examePaciente, int quantidadeQuimioterapia, int quantidadeRadioterapia) {
        super(nome, cpf, altura, peso, indiceGlicemico, examePaciente);
        this.quantidadeQuimioterapia = quantidadeQuimioterapia;
        this.quantidadeRadioterapia = quantidadeRadioterapia;
        
    }
    

    @Override
    public float calculoIMC() {
        return (this.peso/(this.altura*this.altura))*0.85f;
    }

    
}
