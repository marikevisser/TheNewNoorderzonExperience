package application;

import javax.persistence.*;

@Entity
@Table (name = "voorstelling")
public class Voorstelling {

    @ManyToOne
    @Id
    @JoinColumn (name = "naam")
    private Artiest id;

    @Column
    private String naam;

    @Column
    private int capaciteit;

    public Artiest getId() {
        return id;
    }

    public void setId(Artiest id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }
}

