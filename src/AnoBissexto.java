
import java.util.Scanner;

public class AnoBissexto {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in); //para ler o que o usuário digitar

        System.out.println("Digite o ano:");
        int ano = entrada.nextInt(); //recebendo o ano

        if((ano%4==0)&&(ano%100!=0)) {
            System.out.println("É ano bissexto ");

            

        }
        else if((ano%4==0)&&(ano%400==0)){
            System.out.println("É ano bissexto ");

        }
        else{
            System.out.println("Não é ano bissexto ");

        }






    }

}




