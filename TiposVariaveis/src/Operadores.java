public class Operadores {
        public static void main(String[] args) {
        //concatenação de palavras 
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);


        //concatenação de números
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        //unários
        int numero = 5; 
        numero = - numero;
        System.out.println(numero);

        numero = numero * -1; 
        System.out.println(numero);


        //boolean
        boolean variavel = true;

        variavel = !variavel; 

        System.out.println(variavel);

        //ternário
        int a, b;
        a = 6;
        b = 8;

        String resultado = a == b ? "verdadeoro" : "falso";

        System.out.println(resultado);

        // Relacionais.
        // > maior : a > b
        // > = maior ou igual
        //  < menor 
        // < = menor ou igual 
        // != diferente 
        // == igual 


        // agora com objeto é necessário usar equals:
        String nomeUm = "Pamela";
        String nomeDois = new String("Karina");

        System.out.println(nomeUm.equals(nomeDois));


        // Lógicas 

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições são verdadeiras");

        }




    }
}
