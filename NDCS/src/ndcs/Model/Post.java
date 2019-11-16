package ndcs.Model;

public class Post {
    
    private int postNumber;
    private String title;
    private String description;
    private Date date;
    private User user;
    private Location location;
    private User volunteer;


    User(int inf_postNumber, String inf_title, String inf_description, Date inf_date, User inf_user, Location inf_location, User volunteer) {


        postNumber = inf_postNumber;
        title = inf_title;
        description = inf_description;
        date = inf_date;
        user = inf_user;
        location = inf_location;
        volunteer = inf_volunteer;

    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        postNumber = this.postNumber;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        title = this.title;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        description = this.description;
    }

    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        date = this.date;
    }

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        user = this.user;

    }
    
    public User getVolunteer(){
        return volunteer;
    }

    public void setVolunteer(User volunteer){
        volunteer = this.volunteer;

    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        location = this.location;
    }


}