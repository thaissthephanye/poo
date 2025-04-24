import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario = new Funcionario(1001, "Thais", "11122233344", "Rua pipipi popopo", "83991151519", 23, 1200.12f);

        System.out.println("---FUNCIONARIOS---");
        System.out.println(funcionario);

        System.out.println("Digite o valor do novo salario: ");

        float novoSalario = scanner.nextFloat();
        
        funcionario.setSalario(novoSalario); 

        System.out.println("---FUNCIONARIO ATUALIZADO---");
        System.out.println(funcionario);

        scanner.close();
    //a entrada do usuario só funcionou quando rodei no terminal integrado, n sei se é normal :(


    }


}
