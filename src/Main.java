public class Main {
    public static void main(String[] args) {
        Agenda agenda =new Agenda("Matematica",
                "Aritimética, Geometria e Fisica");
        Professor professor = new Professor("Gabriel",
                "123.456.789-00",
                1212.00);
        Artigo artigo = new Artigo("Aritmética",
                "A importancia da aritmética na engenharia");
        Turma turma = new Turma("a12","Noturno",20);
        professor.cadastroArtigos(artigo);
        professor.cadastroTurma(turma);
        System.out.println(professor);

        Diretor diretor = new Diretor("Jarvis",
                "987.654.312.00",
                2345.00);
        diretor.orientaProfessor(professor);
        diretor.exibirProfessoresOrientados();
    }
}