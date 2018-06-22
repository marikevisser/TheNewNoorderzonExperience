package Noorderzon_data.Entities;

import javax.persistence.*;

@Entity
@Table (name = "tijd")
public class Tijd {

    @Column
    @Id
    private int id;

    @Column
    private String dag;

    @Column
    private String tijdstip;

    @ManyToOne
    @JoinColumn (name = "id")
    private Voorstelling voorstellingPerTijd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDag() {
        return dag;
    }

    public void setDag(String dag) {
        this.dag = dag;
    }

    public String getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(String tijdstip) {
        this.tijdstip = tijdstip;
    }

    public Voorstelling getVoorstellingPerTijd() {
        return voorstellingPerTijd;
    }

    public void setVoorstellingPerTijd(Voorstelling voorstellingPerTijd) {
        this.voorstellingPerTijd = voorstellingPerTijd;
    }
}
