package src.projekt.ui;

import src.projekt.server.KitobServis.KitobServisImpl;
import src.projekt.server.databese.Database;
import src.projekt.server.model.Kitob;
import src.projekt.ui.ranglar.Rang;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class KitobUi {
    static Scanner scanner = new Scanner(System.in);
    public static void kitobQushish() {
        System.out.print(Rang.SARIQ.getRang()+"Kitobningi nomini kirting : ");
        String nomi = scanner.nextLine();
        System.out.print(Rang.SARIQ.getRang()+" Kitobning mualifini kirting : ");
        String mualif = scanner.nextLine();
        System.out.print(Rang.SARIQ.getRang()+"Kitobning narxini kiriting : ");
        int narxi = new Scanner(System.in).nextInt();
        System.out.print(Rang.SARIQ.getRang()+" Kitobdan nechta qushasiz : ");
        int soni = new Scanner(System.in).nextInt();
        Kitob kitob = new Kitob(nomi,mualif,narxi,soni);
        KitobServisImpl kitobServis = new KitobServisImpl();
        kitobServis.Add(kitob);
    }

     static KitobServisImpl kitobServis = new KitobServisImpl();
    public static void show(){
        kitobServis.kurish();
    }

    public static void deletKitob() {
        System.out.print(Rang.SARIQ.getRang()+"Uchirmoqchi bulgan Kitobningi nomini kirting : ");
        String nomi = scanner.nextLine();
        System.out.print(Rang.SARIQ.getRang()+"Uchirmoqchi bulgan Kitobning mualifini kirting : ");
        String mualif = scanner.nextLine();
        System.out.print(Rang.SARIQ.getRang()+" Kitobdan nechta Uchirasiz : ");
        int soni = new Scanner(System.in).nextInt();
        Kitob kitob = new Kitob(nomi,mualif,soni);
        KitobServisImpl kitobServis1 = new KitobServisImpl();
        kitobServis1.servisDelet(kitob);


    }
}
