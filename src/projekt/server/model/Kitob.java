package src.projekt.server.model;

import java.util.UUID;

public class Kitob {
    private final  String id;
    private String name;
    private String mualif;
    private int narxi ;
    private int kitoblarsoni;

    public Kitob() {
        id = UUID.randomUUID().toString();
    }

    public Kitob( String name, String mualif, int kitoblarsoni) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.mualif = mualif;
        this.kitoblarsoni = kitoblarsoni;
    }

    public Kitob(String name, String mualif, int narxi, int kitoblarsoni) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.mualif = mualif;
        this.narxi = narxi;
        this.kitoblarsoni = kitoblarsoni;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMualif() {
        return mualif;
    }



    public int getNarxi() {
        return narxi;
    }

    public void setNarxi(int narxi) {
        this.narxi = narxi;
    }

    public int getKitoblarsoni() {
        return kitoblarsoni;
    }

    public void setKitoblarsoni(int kitoblarsoni) {
        this.kitoblarsoni = kitoblarsoni;
    }

    @Override
    public String toString() {
        return "Kitob{" +
                "name='" + name + '\'' +
                ", mualif='" + mualif + '\'' +
                ", narxi=" + narxi +
                ", kitoblarsoni=" + kitoblarsoni +
                '}';
    }
}
