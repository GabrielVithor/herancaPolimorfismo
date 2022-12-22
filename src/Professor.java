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

    public void setTurmaPeriodo(Turma turmaPeriodo) {
        this.turmaPeriodo.add(turmaPeriodo);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "\nnome='" + super.getNome() + '\'' +
                ", \ncpf='" + super.getCpf() + '\'' +
                ", \nsalario=" + super.getSalario() +
                ", \nagenda=" + super.getAgenda() +
                "\nartigosPublicados=" + artigosPublicados +
                ", \nturmaPeriodo=" + turmaPeriodo +
                "\n}";
    }
}
