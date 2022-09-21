package atividades.ativ03.ex02;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/*
Implemente uma estrutura de fila que corresponde a entrada de
pessoas em um show de rock.
• O programa deverá receber um arquivo de ingressos vendidos e
colocá-los na fila.
• Os 10 primeiros ingressos vendidos serão exibidos na tela para
entrada VIP.
• O programa também sorteará aleatoriamente uma posição da Fila
para exibir o ingresso com a  descrição "Pessoa de Sorteada para
conhecer a banda
 */



public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Random random = new Random();

        Queue<String> fila_ingressos = new LinkedList<>();

        Scanner scan = new Scanner(new File("./tools/nomes.txt"));
        while (scan.hasNextLine()){
            fila_ingressos.add(scan.nextLine());
        }

        for (int i=0; i < 10; i++){
            System.out.println("VIP : " + fila_ingressos.poll()); // Ingressos vips
        }

        List<String> ingressos_nao_vip = new ArrayList<>(fila_ingressos);
        int sorteado = random.nextInt( ingressos_nao_vip.size() - 1);

        System.out.println("A pessoa sorteada para conhecer a banda é: "+ ingressos_nao_vip.get(sorteado));


    }

}
