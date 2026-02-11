
public class Aluno {
    //atributos ou propriedades ou variáveis de instância(=objeto)
    String nome;
    String curso;
    int rm;
    double nota1;
    double nota2;

    public double media(){
        return (nota1+nota2)/2;
    }
    public boolean situacao(){
        boolean situacao=false;
        if (media()>=5){
            situacao=true;
            System.out.println("APROVADO");
        }
            System.out.println("REPROVADO");

        return situacao;

    }
    public void imprimir(){
        System.out.println("RM: "+rm);
        System.out.println("Nome: "+nome);
        System.out.println("Curso: "+curso);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);

    }



}



//Objeto é dinamico e não é STATIC;
//"Aluno a1"= Referência do objetos;
//"new Aluno"= Reserva espaço, que será o objeto.