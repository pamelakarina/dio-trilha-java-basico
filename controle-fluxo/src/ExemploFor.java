public class ExemploFor {
    public static void main(String[] args) {
 /* A estrutura de controle de fluxo do for: 
*  for(inicialização; expressão booleana de valudação; bloco de atualização)
*  comando que será executado até que a expressão de validação torne-se falsa. */ 



//vamos imaginar que joãozinho precisa contar até 20 carneirinhos para pegar no sono. 
     for (int carneirinho = 1; carneirinho <= 20; carneirinho++){
        System.out.println("Contando carneirinho: " + carneirinho);
     }
        System.out.println("Joãozinho dormiu. ZzZzZzZz");
    
    }

}