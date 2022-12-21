public class Coordenador extends Funcionario{
    private String titulo;
    private String descricao;

    public Coordenador(String nome,
                       String cpf,
                       Double salario,
                       Agenda agenda,
                       String titulo,
                       String descricao) {
        super(nome, cpf, salario);
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void alocarProfessor(Funcionario professor){}
}
