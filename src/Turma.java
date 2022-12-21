public class Turma{
    private String sala;
    private String periodo;
    private Integer numeroAlunos;

    public Turma(String sala, String periodo, Integer numeroAlunos) {
        this.sala = sala;
        this.periodo = periodo;
        this.numeroAlunos = numeroAlunos;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "sala='" + sala + '\'' +
                ", periodo='" + periodo + '\'' +
                ", numeroAlunos=" + numeroAlunos +
                "}";
    }
}
