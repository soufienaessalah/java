import java.util.Scanner;
public class ZooMangment {
    int nbrCages;
    String zooName;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom souhaité:");
        String nomsaisie = sc.nextLine();
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        String nomsaisier = sc.nextLine();

//int nbrCagesSaisie = sc.nextInt();

        ZooMangment zm= new ZooMangment();
       // zm.nbrCages = nbrCagesSaisie;
        zm.zooName =nomsaisie;
        System.out.println(nomsaisie + " comporte " +nomsaisier );

    }
}
