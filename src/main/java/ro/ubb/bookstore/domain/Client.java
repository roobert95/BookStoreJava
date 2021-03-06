package main.java.ro.ubb.bookstore.domain;

import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by robertszekely on 27/02/16.
 */
public class Client extends BaseEntity<Long> {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    //private static long nrOfClients = 0;

    public Client() { }

    //Constructor (id is automatically assigned by constructor)
    public Client( String _firstName, String _lastName, String _email, String _telephone) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.telephone = _telephone;
        //nrOfClients++;
    }

    /*----------------------Getters-------------------------*/

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

   // public long getNrOfClients() {
//        return nrOfClients;
 //   }


    /*-----------------------Setters---------------------------*/

    public void setFirstName(String new_firstName) {
        this.firstName = new_firstName;
    }

    public void setLastName (String new_lastName) {this.lastName = new_lastName;}

    public void setEmail(String new_email) {
        this.email = new_email;
    }

    public void setTelephone(String new_telephone){
        this.telephone = new_telephone;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if(firstName != client.firstName) return false;
        if(lastName != client.lastName) return false;
        if(email != client.email) return false;
        if(telephone != client.telephone) return false;
        return firstName.equals(client.firstName);
    }


    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" +telephone +
                "} " + super.toString();
    }


}
