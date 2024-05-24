public class CaixaEletronico {
    public static void main(String[] args) {
        //condicionais simples 
        
        double saldo = 100;
        double valorSolicitado = 35.0;

        if(valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;
        }
            System.out.println("Saldo atual: "+ saldo);
    }
}
