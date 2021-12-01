package pro.mitapp.instagramapp;

public class PostsModel {
    private String userName, location, description;
    private int likeAmount, postImage;

    public PostsModel(String userName, String location, String description, int likeAmount, int postImage) {
        this.userName = userName;
        this.location = location;
        this.description = description;
        this.likeAmount = likeAmount;
        this.postImage = postImage;
    }

    public int getPostImage() {
        return postImage;
    }

    public String getUserName() {
        return userName;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public int getLikeAmount() {
        return likeAmount;
    }
}
