public class App {

    public static void main(String[] args) throws Exception {

        cliente cl = new cliente();
        curso cu = new curso();

        cl.nome = "Diego";
        cl.sobrenome = "Ferreira";
        cl.idade = 25;
        cl.sexo = true;
        cl.email = "Diih.Ferreiira@icloud.com";
        cl.RGM = 25543077;

        cu.curso = "Ciência da Computação";
        cu.instituicao = "Cruzeiro do Sul";
        cu.anoinicio = 2019;
        cu.semestres = 8;
        cu.modalidade = true;
        cu.mensalidade = 249.99F;

        System.out.println("\n# Dados do Aluno ");

        System.out.println("\n\tNome: " +cl.nome+ " " +cl.sobrenome+ 
                           "\n\tIdade: " +cl.idade+ 
                           "\n\tGenero: " +cl.sexo+ 
                           "\n\tE-Mail: " +cl.email+ 
                           "\n\tRGM: " +cl.RGM+ "\n");


        System.out.println("# Dados do Curso ");

        System.out.println("\n\tCurso: " +cu.curso+ 
                           "\n\tInstituição: " +cu.instituicao+ 
                           "\n\tAno de Inicio: " +cu.anoinicio+ 
                           "\n\tQuantos Semestres: " +cu.semestres+ 
                           "\n\tModalidade: " +cu.modalidade+ 
                           "\n\tMensalidade: R$" +cu.mensalidade+ "\n");

    }
}
