import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<Artigo> artigosPublicados = new ArrayList<>();
    private List<Turma> turmaPeriodo = new ArrayList<>();

    public Professor(String nome,
                     String cpf,
                     Double salario) {
        super(nome, cpf, salario);
    }
    public void cadastroArtigos(Artigo artigo){
        artigosPublicados.add(artigo);
    }

    public void cadastroTurma(Turma turma){
        turmaPeriodo.add(turma);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "\nartigosPublicados=" + artigosPublicados +
                ", \nturmaPeriodo=" + turmaPeriodo +
                "\n}";
    }
}
