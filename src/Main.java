import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input;

        System.out.println("Digite o número: ");
        input=sc.nextInt();

        while(true){
                System.out.println(input+" ");
            if (input == 1) break;

            else if (input % 2 != 0){
                input= 3*input+1;
            }
            else {
                input= input/2;
            }

        }



    }
}