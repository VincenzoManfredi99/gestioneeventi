package vincenzomanfredi.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {

    @Id
    private int id;
    private String titolo;
    private LocalDate dataEvento;
    private String descrizione;
    private TipoEvento tipoEvento;
    private int numMassimoPartecipanti;
}
