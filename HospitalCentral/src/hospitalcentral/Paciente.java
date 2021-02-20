package hospitalcentral;

import java.util.ArrayList;
/**
 * @author jessica
 */
public class Paciente extends Exame implements ITiposPaciente{
    String nome;
    String cpf;
    float altura;
    float peso;
    int indiceGlicemico;
    ArrayList<Exame> exame = new ArrayList<Exame>(); 

    public Paciente(String nome, String cpf, float altura, float peso, int indiceGlicemico, Exame examePaciente) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
        this.peso = peso;
        this.indiceGlicemico = indiceGlicemico;
    }


    @Override
    public String toString() {
        return "========== > Paciente < =========\r\n" + "Nome: " + nome + "\r\nCPF: " + cpf + "\r\nAltura: " + altura + "\r\nPeso: " + peso + "\r\nIndice glicemico: " + indiceGlicemico + "\r\nExame: " + exame + "\r\n";
    }

    @Override
    public float calculoIMC() {
        return this.peso/(this.altura*this.altura);
    }

    @Override
    public void adicionarExame(Exame exame) {
        this.exame.add(exame);
    }

    @Override
    public void removerExame(Exame exame) {
      if(this.exame.contains(exame))
          this.exame.remove(exame);
    }

}
