package it.innovationminds.corsimodel.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Label {

    private String codice;
    private String valore;
    private String lingua;
    private String descrizione;

}
