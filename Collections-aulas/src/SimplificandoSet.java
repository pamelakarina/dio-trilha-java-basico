import java.util.HashSet;
import java.util.Set;
public class SimplificandoSet {
    public static void main(String[] args) {
        //  Set<Classe> nome_variavel = new HashSet<>();

//exemplo 1; 
        // Set idades1 -> [10, 12, 13]

        Set<Integer> idades = new HashSet<>();
        idades.add(10);
        idades.add(12);
        idades.add(13);
        idades.add(10);

        System.out.println(idades);

        for(Integer idade : idades){
            System.out.println(idade);
        }

//exemplo 2; 
 // Set nomes [Maria, Chico, Shu, Pamela, Gabriel]
        Set<String> nomes = new HashSet<>();
        nomes.add("Maria");
        nomes.add("Chico");
        nomes.add("Shu");
        nomes.add("Pamela");
        nomes.add("Gabriel");

        for(String nome : nomes) {
            System.out.println("Nome: " + nome);
        }


    }   
}
