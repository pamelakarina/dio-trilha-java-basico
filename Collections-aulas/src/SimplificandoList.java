import java.util.ArrayList;
import java.util.List;

public class SimplificandoList {
 
    public static void main(String[] args) {
                // List<Classe> nome_variavel = new List<>();

    //exemplo 1; 
            // Listas [1, 2]
            List<Integer> numeros = new ArrayList<>();
            numeros.add(1);
            numeros.add(2);
    
            //System.out.println(numeros);
    
            List<String> nomes = new ArrayList<>();
            nomes.add("Maria");
            nomes.add("Chico");
    
            //System.out.println(nomes);
    
            //System.out.println(nomes.get(0));
            //nomes.remove(1);
            //System.out.println(nomes);
    
            for(int i = 0; i < nomes.size(); i++) {
                System.out.println("Nome: " + nomes.get(i));
            }
    
            for(String gato : nomes) {
                System.out.println("Nome: " + gato);
            }


    //exemplo 2; 

             // salarios [100.0, 200.0, 300.0, 400.0]
        List<Double> salarios = new ArrayList<>();
        salarios.add(100.0);
        salarios.add(200.0);
        salarios.add(300.0);
        salarios.add(400.0);

        salarios.remove(2);

        for(Double salario : salarios) {
            System.out.println("Salário: " + salario);
        }

             
        }
    }
