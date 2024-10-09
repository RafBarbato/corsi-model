package it.innovationminds.corsimodel.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Utenti {

    private String id;
    private String username;
    private String email;
    private String nome;
    private String cognome;
    private String password;

    // toString method for easy printing
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
