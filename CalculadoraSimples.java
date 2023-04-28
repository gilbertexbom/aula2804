import java.util.Scanner;

public class CalculadoraSimples{

    public static void main(String[] args){

        //Declaração de variáveis
        int n1, n2, total, op;

        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\n\t\t\t -- Calculadora Simples --\n");

            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");

            System.out.print("Opção: ");
            op = entrada.nextInt();

            if(op == 1){
                System.out.println("\n\t\t\t -- Soma --\n");
                System.out.print("Digite o primeiro número: ");
                n1 = entrada.nextInt();
                System.out.print("Digite o segundo número: ");
                n2 = entrada.nextInt();
                resultado = n1 + n2;
                System.out.println("O resultado da soma é: " + resultado);
            } else if(op == 2){
                System.out.println("\n\t\t\t -- Subtração --\n");
            } else if(op == 3){
                System.out.println("Forte abraço!");
            }else{
                System.out.println("Opção " + op + " incorreta!");
            }

        }while(op!=3);




    }


}
