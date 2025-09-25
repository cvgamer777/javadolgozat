import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<String> partokLista = new ArrayList<>();


        File fbe = new File("files/voksok.txt");
        Scanner sbe = new Scanner(fbe);

        while (sbe.hasNextLine()) {
            String fileLine = sbe.nextLine();
            partokLista.add(fileLine);
        }
        System.out.println("1. fealdat: ");
        System.out.println(partokLista);
        System.out.println("3. fealdat: " + partokLista.size()+ " polgár szavazott.");
        Scanner in = new Scanner(System.in);
        System.out.println("4. fealdat: Kérek egy induló szervezetet: " );
        String id = in.nextLine();
        int count = 0;

        for (String s : partokLista) {
            if (s.equals(id)) {
                count++;
            }
        }

        System.out.println(id +" "+ count + " szavazatott kapott");
    }
}