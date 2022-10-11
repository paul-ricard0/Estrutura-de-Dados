package Prova01.Q01;

public class main {

    public static void main(String[] args) {
        int vetor[] = {3,8,7,9,10,11,80,2,1,50};

        for(int i = 0; i <= vetor.length-1; i++){

            int valor = vetor[0];
            int j = i - 1;

            while( (j>=1) && (valor < vetor[j]) ) {


                int x = vetor[j+1];
                vetor[j+1] = vetor[j];
                vetor[j] = x;


                j = j -1;

                if(j == 0){
                    break;
                }

            }
        }

        for (Integer t: vetor){
            System.out.printf("%d \t",t);
        }

    }
}
