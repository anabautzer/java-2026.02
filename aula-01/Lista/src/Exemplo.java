import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exemplo {
    static void main() {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        List<String> lista = new ArrayList<String>();
        System.out.println("Digite 5 nomes: ");
        while (contador < 5) {
            lista.add(input.nextLine());
            contador++;
        }
        System.out.println("Nomes: " + lista);

        for (String nome : lista) { // mostra separadamente pelo valor
            System.out.println("Nome: " + nome);
        }

        System.out.println("Nomes que começam com A: ");
        for (String nome : lista){
            if (nome.startsWith("a") || nome.startsWith("A")){
                System.out.println(nome);
            }
        }

        /* for ( int i = 0; i < lista.size(); i++){ // outra forma de fazer
            if (lista.get(i).startsWith("a") || lista.get(i).startsWith("A")){
                System.out.println(lista.get(i));
            } */

        System.out.println("Digite um nome para ver se está na lista: ");
        String n6 = input.nextLine();
        if (lista.contains(n6)){
            System.out.println("Está na lista");
        } else {
            System.out.println("Não está na lista");
        }
    }
}
