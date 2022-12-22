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
    public void gerarAgenda(String titulo, String descricao){
        this.agenda = new Agenda(titulo,descricao);
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "\nnome='" + nome + '\'' +
                ", \ncpf='" + cpf + '\'' +
                ", \nsalario=" + salario +
                ", \nagenda=" + agenda +
                '}';
    }
}
