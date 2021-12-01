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

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.PostsViewHolder> {

    private List<PostsModel> list = new ArrayList<>();
    private LayoutInflater inflater;

    public PostsAdapter(Context context) {
        this.inflater = LayoutInflater.from(context);
    }

    public void addToList(PostsModel model){
        this.list.add(model);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_posts, parent, false);
        return new PostsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  PostsAdapter.PostsViewHolder holder, int position) {
        holder.txtUserName.setText(list.get(position).getUserName());
        holder.txtPostLocation.setText(list.get(position).getLocation());
        holder.txtPostDescription.setText(list.get(position).getDescription());
        holder.txtPostLikeAmount.setText("Liked by " + list.get(position).getLikeAmount());
        Glide.with(holder.imgPostImage).load(list.get(position).getPostImage()).centerCrop().into(holder.imgPostImage);
        Glide.with(holder.imgPostUserImage).load(list.get(position).getPostImage()).circleCrop().into(holder.imgPostUserImage);
//        holder.imgPostImage.setImageResource(list.get(position).getPostImage());
//        holder.imgPostUserImage.setImageResource(list.get(position).getPostImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PostsViewHolder extends RecyclerView.ViewHolder{
        TextView txtUserName, txtPostLocation, txtPostDescription, txtPostLikeAmount;
        ImageView imgPostImage;
        ImageView imgPostUserImage;

        public PostsViewHolder(@NonNull  View itemView) {
            super(itemView);
            txtUserName = itemView.findViewById(R.id.txt_item_user_name);
            txtPostLocation = itemView.findViewById(R.id.txt_item_post_location);
            txtPostDescription = itemView.findViewById(R.id.txt_item_post_user_name_and_description);
            txtPostLikeAmount = itemView.findViewById(R.id.txt_item_likes);
            imgPostImage = itemView.findViewById(R.id.img_post);
            imgPostUserImage = itemView.findViewById(R.id.img_item_user_profile);
        }
    }
}
