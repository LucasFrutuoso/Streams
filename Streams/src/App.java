import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Banana", "Maçã", "Laranja");

        frutas.stream().forEach(f -> System.out.println(f));

        String[] outrasFrutas = { "Pêra", "Mamão" };

        Stream.of(outrasFrutas).forEach(o -> System.out.println(o));

        System.out.println("----------------------------------------------");

        
        String[] nomes = new String[3];

        nomes[0] = "Pedro";
        nomes[1] = "Marcos";
        nomes[2] = "Paulo";

        Arrays.stream(nomes).forEach(nome -> System.out.println(nome));

        System.out.println("----------------------------------------------");

        Arrays.stream(nomes)
                .filter(nome -> nome == "Pedro")
                .forEach(nome -> System.out.println(nome));

    }
}
