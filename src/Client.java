import java.util.Objects;

public class Client {

    private int clientID;
    private String firstName;
    private String lastName;
    private String email;

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Client client)) return false;
        return clientID == client.clientID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(clientID);
    }

    public Client(int clientID, String firstName, String lastName, String email) {
        this.setClientID(clientID);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
    }

    public int getClientID() {
        return clientID;
    }

    private void setClientID(int clientID) {
        if(clientID<=0){
            throw new IllegalArgumentException("Client ID cannot be less than 0");
        }
        this.clientID = clientID;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        if(firstName==null || firstName.isEmpty()){
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        if(lastName==null || lastName.isEmpty()){
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        if(email==null || email.isEmpty()){
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        this.email = email;
    }
}
