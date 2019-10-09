package se.nackademin;
import java.util.*;

public class Lists {
    public static List<Kund> kunder = new ArrayList<>();
    public static List<Personal> personal = new ArrayList<>();

    public static void printLists () {
        System.out.println("Kunder: ");
        for (Kund k:kunder) {
            k.printUppgifter();
            k.printKonton();
            k.printLån();
        }

        System.out.println("Personal: ");
        for (Personal p:personal) {
            p.printUppgifter();
        }
    }
}
