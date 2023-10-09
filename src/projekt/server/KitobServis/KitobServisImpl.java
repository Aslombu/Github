package src.projekt.server.KitobServis;

import src.projekt.server.databese.Database;
import src.projekt.server.model.Kitob;
import src.projekt.ui.ranglar.Rang;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class KitobServisImpl {

    public void Add(Kitob kitob) {

        Database database = new Database();
        List<Kitob> kitobs= database.kitobList;
        int i=0;
        for (Kitob kitob1 : kitobs) {
            if(kitob.getName().equals(kitob1.getName())){
                kitob1.setKitoblarsoni(kitob.getKitoblarsoni()+kitob.getKitoblarsoni());
                System.out.println(Rang.YASHIL.getRang()+"Siz muvaqiyatli qushdingiz ");
                i++;
            }
        }
        if(i==0){
        kitobs.add(kitob);



        System.out.println(Rang.YASHIL.getRang()+"Siz Muvaqiyatli qushdingiz ");
        }
        Path path = Path.of("Kitoblar.txt");
        for (Kitob kitob1 : kitobs) {
            String str = kitob1.getName()+"#"+kitob1.getMualif()+"#"+kitob1.getNarxi()+"#"+kitob1.getKitoblarsoni()+"\n";
            try (FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(path))){
                fileOutputStream.write(str.getBytes());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    public void kurish() {
        Database database = new Database();
        List<Kitob>kitobs =database.kitobList;
        if(!kitobs.isEmpty()){
        kitobs.forEach(System.out::println);
    }else {
        System.out.println("hali kitob yuq");
        }
        }
}
