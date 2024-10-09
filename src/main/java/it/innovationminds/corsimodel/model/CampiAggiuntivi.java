package it.innovationminds.corsimodel.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CampiAggiuntivi {

    private String campo;
    private String label;
    private String tipo;
    private String valore;
    private String descrizione;

}
