import java.util.HashMap;
import java.util.Map;

public class SimplificandoMap {
     public static void main(String[] args) {

      //  Map<Classe, Classe> nome_variavel = new HashMap<>();

//exemplo 1;

        // Map(Hashmap) { key : value }
        // Map [{"nome" : "Gabriel"}, {"nome" : "Pamela"}]

        Map<String, String> nomes = new HashMap<>();
        nomes.put("nome1", "Gabriel");
        nomes.put("nome2", "Pamela");


        System.out.println(nomes.get("nome1"));

        System.out.println(nomes);


//exemplo 2;
            // Map(Hashmap) { key : value }
            // map {nome : salario} = {"gabriel" : 4000.50}
    
            Map<String, Double> dados = new HashMap<>();
    
            dados.put("Gabriel", 4000.50);
            dados.put("Pamela", 20000.50);
    
            // Pamela ganha R$ 20000.50
            System.out.println("Pamela ganha R$ "+ dados.get("Pamela"));
    }
}
