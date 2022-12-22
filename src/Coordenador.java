import java.util.List;

public class Coordenador extends Funcionario{
    public Coordenador(String nome,
                       String cpf,
                       Double salario) {
        super(nome, cpf, salario);
    }

    public void alocarProfessor(Professor professor,Turma turma){
        professor.setTurmaPeriodo(turma);
    }
}
