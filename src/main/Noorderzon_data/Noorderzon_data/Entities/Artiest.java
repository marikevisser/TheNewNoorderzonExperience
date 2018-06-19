package Noorderzon_data.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "artiest")
public class Artiest {
    @Column
    @Id
    private String naam;

    @Column
    private String genre;

    @OneToMany (mappedBy = "id")
    private List<Voorstelling> voorstellingenVanArtiest;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Voorstelling> getVoorstellingenVanArtiest() {
        return voorstellingenVanArtiest;
    }

    public void setVoorstellingenVanArtiest(List<Voorstelling> voorstellingenVanArtiest) {
        this.voorstellingenVanArtiest = voorstellingenVanArtiest;
    }
}
