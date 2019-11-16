package ndcs.Model;


public class User {
    
    private int id;
    private String username;
    private String password;
    private String email;
    private String location;


    User(int inf_id, String inf_username, String inf_password, String inf_email, String inf_location) {

        id = inf_id;
        username = inf_username;
        password = inf_password;
        email = inf_email;
        location = inf_location;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = this.id;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        username = this.username;
    }

    public String getPassword() {
        return passsword;
    }

    public void setPassword(String password) {
        password = this.password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = this.email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        location = this.location;
    }


}