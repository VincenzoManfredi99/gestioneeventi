package vincenzomanfredi.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {

    @Id
    private int id;
    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;

    @Column(name = "tipo_evento")
    @Enumerated(EnumType.STRING)
    private TipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti")
    private int numMassimoPartecipanti;

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public LocalDate getData() {
        return dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public TipoEvento getTipo() {
        return tipoEvento;
    }

    public int getNumMassimoPartecipanti() {
        return numMassimoPartecipanti;
    }
}
