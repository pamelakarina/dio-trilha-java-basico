public class SistemaDeMedida{
    public static void main(String[] args) {
        String sigla = "G"; 

        switch (sigla) {
            
            case "P" :{
                System.out.println("PEQUENO");
                break;
            }
            case "M" :{
                System.out.println("MÉDIO");
                break;
            }
            case "G" :{
                System.out.println("GRANDE");
                break;
            }
            default:
            System.out.println("INDEFINIDO");
        }


    }
}