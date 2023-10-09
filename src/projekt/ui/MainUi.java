package src.projekt.ui;

import java.util.Scanner;

public class MainUi {
    public  void  mainWendow(){
        while (true){
        System.out.println("\u001B[33m"+"1.kitob qo'shish \n2.kitoblarni kurish \n3.kitobni olib tashlash ");

        System.out.print("\u001B[33m>>>>>");
        String kirit = new Scanner(System.in).nextLine();
        switch (kirit){
            case "1"-> KitobUi.kitobQushish();
            case "2"-> KitobUi.show();
        }
        }
    }
}
