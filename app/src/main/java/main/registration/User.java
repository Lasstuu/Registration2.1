package main.registration;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String degreeProgram;

    private ArrayList<String> diplomas = new ArrayList<String>();

    public static int UserCounter = 0;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public String getDiplomas(){
        String diploma = "";
        if(diplomas.size() != 0){
            diploma ="Suoritetut tutkinnot:\n";
            for(String d : diplomas){
                diploma += "-" + d + "\n";
            }
        }
        return diploma;}
    public User(String firstName, String lastName, String email, String degreeProgram, ArrayList<String> diplomas){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = degreeProgram;
        this.diplomas = diplomas;
        UserCounter++;
    }
}
