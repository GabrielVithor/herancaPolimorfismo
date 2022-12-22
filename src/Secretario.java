import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Secretario extends  Funcionario{
    public Map<String,Agenda> agendaList = new HashMap<>();
    public void listarAgenda(Funcionario funcionario){
        agendaList.put(funcionario.getNome(),funcionario.getAgenda());
    }

    public void imprimirAgenda(Funcionario funcionario){
        System.out.println(String.format("Funcionario: %s " +
                "\n Titulo da agenda: %s" +
                "\n Descrição: %s",
                funcionario.getNome(),funcionario.getAgenda().getTitulo(),
                funcionario.getAgenda().getDescricao()));
    }
    public Secretario(String nome, String cpf, Double salario) {
        super(nome, cpf, salario);
    }
}
