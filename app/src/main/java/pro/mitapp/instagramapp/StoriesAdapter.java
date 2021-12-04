package pro.mitapp.instagramapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.PostsViewHolder> {

    private List<StoriesModel> images = new ArrayList<>();
    private LayoutInflater inflater;

    public StoriesAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void setList(List<StoriesModel> list){
        this.images = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_stories, parent, false);
        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  StoriesAdapter.PostsViewHolder holder, int position) {
        if (images.get(position).isAddStory()){
            holder.imgAddStory.setVisibility(View.VISIBLE);
            holder.imgStory.setVisibility(View.GONE);
        } else {
            for (int i = 0; i < images.get(position).getImages().size(); i++) {
                Glide.with(holder.imgStory).load(images.get(position).getImages().get(i)).circleCrop().into(holder.imgStory);
            }
            holder.imgAddStory.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class PostsViewHolder extends RecyclerView.ViewHolder{
        ImageView imgStory, imgAddStory;

        public PostsViewHolder(@NonNull  View itemView) {
            super(itemView);
            imgStory = itemView.findViewById(R.id.img_item_stories);
            imgAddStory = itemView.findViewById(R.id.img_item_add_story);
        }
    }
}
