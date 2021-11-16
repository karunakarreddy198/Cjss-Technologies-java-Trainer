package Customer.model.model;

public class Comments {
    int postId;
    String email;
    String Comment;

    public Comments(int postId, String email, String comment) {
        this.postId = postId;
        this.email = email;
        Comment = comment;
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

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }
}
