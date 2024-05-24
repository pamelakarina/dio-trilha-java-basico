public class CondicaoTernaria {
    public static void main(String[] args) {
        //exemplo 1
         int nota = 6; 
         String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
         
         System.out.println(resultado);

         
         //exemplo 2
         int nota2 = 10; 
        String resultado2 = nota2 >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado2);


   }
}
