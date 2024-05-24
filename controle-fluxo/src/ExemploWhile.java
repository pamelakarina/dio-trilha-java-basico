
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
/* Joãozinho recebeu R$50,00 de mesada e foi em uma loja de doces gastar todo o 
 seu dinheiro, logo, enquanto o valor dos doces não igualar a R$50,00 ele vai  
 adicionando itens no seu carrinho.
*/      
      double mesada = 50.0; 

      while( mesada > 0){ 
        double valorDoce = valorAleatorio();

        if(valorDoce > mesada)
           valorDoce = mesada; 
           
        System.out.println("Doce do valor: " + valorDoce + "Adicionado ao carrinho" );
           mesada = mesada - valorDoce; 
      }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces.");


    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2 ,8);
    }
}

