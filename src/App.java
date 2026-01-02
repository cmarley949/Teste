import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> produtos = new ArrayList<String>();
        produtos.add("Pão");
        produtos.add("Café");
        produtos.add("Leite");
        produtos.add("Ovos");
        produtos.add("Farinha");

        // Imprimir ArrayList
        System.out.println("=".repeat(50));
        System.out.println("Antes: ");
        System.out.println("=".repeat(50));
        for (String x : produtos) {
            System.out.println(x);
        }

        // Manipular ArrayList
        System.out.println("=".repeat(50));
        System.out.println("Depois: ");
        System.out.println("=".repeat(50));
        for (String x : produtos) {
            System.out.println(x);
        }

        // Manipular ArrayList
        System.out.println("=".repeat(50));
        System.out.println("Tamanho: ");
        System.out.println(produtos.size());
        produtos.remove(1);

        // Manipular ArrayList
        System.out.println("=".repeat(50));
        System.out.println("Substituição:");
        System.out.println("=".repeat(50));

        produtos.set(1, "Açucar");
        for (String x : produtos) {
            System.out.println(x);
        }

       

    }
}
