package pro.mitapp.instagramapp;

import java.util.List;

public class StoriesModel {
    private List<Integer> images;
    private boolean isAddStory;

    public StoriesModel(List<Integer> images, boolean isAddStory) {
        this.images = images;
        this.isAddStory = isAddStory;
    }

    public StoriesModel(boolean isAddStory) {
        this.isAddStory = isAddStory;
    }

    public List<Integer> getImages() {
        return images;
    }

    public boolean isAddStory() {
        return isAddStory;
    }
}
