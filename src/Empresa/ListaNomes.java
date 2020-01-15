package Empresa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNomes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        List<String> funcionario = new ArrayList<>();
        funcionario.add("José");
        funcionario.add("Josefa");
        funcionario.add("Jefferson");
        funcionario.add("Jroger");

        int contador = 0;
        for(String funcionarios : funcionario) {
            contador++;
            System.out.println(contador + " - " + funcionarios);
        }

             System.out.println("Digite o funcionário que você quer remover:");

            String remover = ler.nextLine();

        funcionario.remove(remover);

        int contador2 = 0;
        for(String funcionarios : funcionario) {
            contador2 ++;
            System.out.println(contador2 + " - " + funcionarios);
        }


    }
}
