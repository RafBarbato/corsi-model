package it.innovationminds.corsimodel.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Export {

    private String codiceExport;
    private String query;
    private String listaColonne;
    private String descrizione;

}
