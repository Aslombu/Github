package src.projekt.server.databese;

import src.projekt.server.model.Kitob;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class Database {
    public static List<Kitob> list(){
        Path path = Path.of("Kitoblar.txt");
        List<Kitob>kitobs1= new ArrayList<>();

        try {

            Files.readAllLines(path).forEach(s ->{
                String[] split = s.split("#");
                Kitob kitob1 = new Kitob(split[0],split[1],Integer.parseInt(split[2]),Integer.parseInt(split[3]));
                kitobs1.add(kitob1);
                kitob1=null;
            }  );
        } catch (Exception e) {
            e.printStackTrace();
        }

return kitobs1;
    }
   public List<Kitob> kitobList = new ArrayList<>(list());

    public List<Kitob> getKitobList() {
        return kitobList;
    }
}
