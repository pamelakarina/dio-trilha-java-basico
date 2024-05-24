public class ExemploDeArray {
    public static void main(String[] args) {
    // arrays sempre iniciam com ZERO
        String pet [] = { "SHU", "PITTY", "CHICO", "MARIA" };

        for (int x = 0; x < pet.length; x++){
            System.out.println("O Pet no indice x = " + x + " é " + pet[ x ]);
        }

    //for / each 
        String alunos [] = { "ERICK", "PAMELA", "EDER", "SAMANTHA"};

        for( String aluno : alunos){
            System.out.println("O nome do aluno é: " + aluno);
        }     
    

        }
    }

