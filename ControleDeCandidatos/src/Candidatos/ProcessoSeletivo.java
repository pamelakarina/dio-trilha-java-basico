package Candidatos;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
 public static void main(String[] args) {
     System.out.println("Processo seletivo ");
   // analisarCandidato(2000.0);
   // valorPretendido();
   // selecaoCandidatos();
   // imprimindoSelecionados();
   // System.out.println(" ");

    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    for(String candidato : candidatos){
        entrandoEmContato(candidato);
    }

} 
  static void entrandoEmContato(String candidato){
    int tentativasRealizadas = 1; 
    boolean continuarTentando = true; 
    boolean atendeu = false; 
    do{
        atendeu = atender();
        continuarTentando = ! atendeu;
        if(continuarTentando){
            tentativasRealizadas++;
        }else 
        System.out.println("CONTATO REALIZADO COM SUCESSO");
    } while (continuarTentando && tentativasRealizadas <3);

       if(atendeu){
        System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
       }else
       System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " REALIZADA");
  
    }

    //método auxiliar
   static boolean atender(){
    return new Random().nextInt(3)==1;
   }

   static void imprimindoSelecionados() {
    String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    System.out.println("Imprimindo a lista de candidato informando o índice do elemento");
    for(int indice = 0; indice < candidatos.length; indice++){
    System.out.println("O candidato nº " + (indice + 1) + " é o " + candidatos[indice]);
     }
   }

   static void selecaoCandidatos() {
   String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JUNIOR"}; 
    
    int candidatosSelecionados = 0;
    int candidatosAtuais = 0; 
    Double salarioBase = 2000.0;
    while (candidatosSelecionados < 5 && candidatosAtuais < candidatos.length) { 
        String candidato = candidatos[candidatosAtuais];
        Double salarioPretendido = valorPretendido();
        System.out.println("O candidato  " + candidato + " solicitou este valor de pretendido: " + salarioPretendido);
        
        if( salarioBase >= salarioPretendido){
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
        }
        candidatosAtuais++;
    }
   }
    static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
   }
    static void analisarCandidato(double SalarioPretendido) {
    double salarioBase = 2000.0;
         if(salarioBase > SalarioPretendido){
             System.out.println("Ligar para candidato");
        } else if (salarioBase == SalarioPretendido) {
             System.out.println("Ligar para o candidato com contra proposta");        
        }else {
             System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }
}
