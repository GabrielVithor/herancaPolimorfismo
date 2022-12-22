public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Gabriel",
                "123.456.789-00",
                1212.00);
        Turma turma = new Turma("a12","Noturno",20);
        Diretor diretor = new Diretor("Jarvis",
                "987.654.312.00",
                2345.00);
        Coordenador coordenador = new Coordenador("Joao",
                "78945613200",
                2300.00);
        Secretario secretario = new Secretario("Tobias",
                "321654987",
                1500.00);
        Artigo artigo = new Artigo("Aritmética",
                "A importancia da aritmética na engenharia");

        coordenador.alocarProfessor(professor,turma);
        professor.cadastroArtigos(artigo);

        professor.gerarAgenda("Matematica",
                "Aulas de geometria analitica");
        System.out.println(professor);


        diretor.orientaProfessor(professor);
        diretor.exibirProfessoresOrientados();
        secretario.imprimirAgenda(professor);
    }
}