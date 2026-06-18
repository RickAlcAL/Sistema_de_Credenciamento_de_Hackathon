package Menu;

import LeitorEEscritor.Leitor;

import java.util.Scanner;

public class Menu {

    public void menuUsuario () {
        Scanner sc = new Scanner(System.in);
        Leitor leito = new Leitor();
        leito.leitorAquivo();

    }
}
