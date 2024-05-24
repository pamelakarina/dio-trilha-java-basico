public class ResultadoEscolar {
    public static void main(String[] args) {
        // condicionais compostas 
        int nota = 10; 

        if(nota >= 8){
        System.out.println("Aprovado");
        } else 
        System.out.println("Reprovado");


        // condicionais encadeadas 
        int notaDois = 3; 

        if(notaDois >= 7){
            System.out.println("Você foi: Aprovado.");
        }
        else if(notaDois >= 5 && notaDois < 7){
            System.err.println("Você foi: Recuperação.");
        }
        else 
        System.out.println("Você foi: Reprovado.");


    }
}
