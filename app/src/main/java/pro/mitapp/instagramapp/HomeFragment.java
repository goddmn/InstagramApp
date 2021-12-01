package pro.mitapp.instagramapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private RecyclerView rvPosts;
    private PostsAdapter adapter;
    private List<PostsModel> list = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initFakeList();
        rvPosts = view.findViewById(R.id.rv_posts);
        adapter = new PostsAdapter(requireContext());
        for (PostsModel model : list){
            if (!list.isEmpty()){
                adapter.addToList(model);
            }
        }
        rvPosts.setAdapter(adapter);
        return view;
    }

    private void initFakeList() {
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
    }
}