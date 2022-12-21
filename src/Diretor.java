import java.util.ArrayList;
import java.util.List;

public class Diretor extends Funcionario{
    private List<Professor> professoresOrientados = new ArrayList<>();

    public Diretor(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }
    public void orientaProfessor(Professor professor){
        professoresOrientados.add(professor);
    }
    public void exibirProfessoresOrientados(){
        System.out.println(String.format("Profesores orientados por %s",this.getNome()));
        for(Professor professores : professoresOrientados){
            System.out.println(professores.getNome());
        }
    }
}
