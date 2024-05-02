package exemploArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        ArrayList<String> nomes = new ArrayList <String> ();
        Scanner x =new Scanner(System.in);
        String palavra;
        for (int i = 0; i < 3; i++) {
      System.out.println("Digite uma palavra");
        palavra = x.nextLine();
          nomes.add(palavra);
        }
      nomes.remove(2);
      
      System.out.println(nomes);
      
      boolean tem = nomes.contains("kaua");
      if (tem == true) {
      System.out.println("Tem o nome selecionado");
    }
      if (tem == false) {
        System.out.println("Não tem o nome selecionado ");
      }
    System.out.println(nomes.get(1));
    System.out.println(nomes.size());
    }
}
