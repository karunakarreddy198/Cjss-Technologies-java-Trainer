package Customer.model.model;

public class Posts {
    int postId;
    String email;
    String heading;
    String description;

    public Posts(int postId, String email, String heading, String description) {
        this.postId = postId;
        this.email = email;
        this.heading = heading;
        this.description = description;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
