package Domain;

/**
 * Created by robertszekely on 27/02/16.
 */
public class Client {

    private String CNP;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;


    //Constructor (id is automatically assigned by constructor)
    public Client(String _CNP, String _firstName, String _lastName, String _email, String _telephone) {
        this.CNP = _CNP;
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.email = _email;
        this.telephone = _telephone;
    }

    /*----------------------Getters-------------------------*/
    public String getCNP() {return CNP;}

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
    /*-----------------------Setters---------------------------*/
    public void setCNP(String new_CNP) {this.CNP = new_CNP;}

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

}
