import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Aluno aluno = new Aluno();
        double media;


        System.out.print("Me diga seu nome--> ");
        aluno.nome= sc.nextLine();

        System.out.println("Me informe--> ");
        aluno.curso=sc.nextLine();

        System.out.println("Me fale seu rm--> ");
        aluno.rm=sc.nextInt();

        System.out.println("Me de a sua primeira 1° nota--> ");
        aluno.nota1= sc.nextDouble();
        System.out.println("Me de a sua primeira 2° nota--> ");
        aluno.nota2= sc.nextDouble();

        media= aluno.media();
        System.out.println(media);
        aluno.situacao();
        aluno.imprimir();


    }
}
