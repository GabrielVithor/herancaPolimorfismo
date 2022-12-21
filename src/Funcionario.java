public class Funcionario {
    private String nome;
    private String cpf;
    private Double salario;
    private Agenda agenda;

    public Funcionario(String nome,
                       String cpf,
                       Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
}
