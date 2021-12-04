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
    private RecyclerView rvStories;
    private PostsAdapter adapter;
    private StoriesAdapter storyAdapter;
    private List<PostsModel> list = new ArrayList<>();
    private List<StoriesModel> storiesList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initFakeList();
        initStoriesFakeList();
        rvPosts = view.findViewById(R.id.rv_posts);
        rvStories = view.findViewById(R.id.rv_stories);
        adapter = new PostsAdapter(requireContext());
        storyAdapter = new StoriesAdapter(requireContext());
        for (PostsModel model : list){
            if (!list.isEmpty()){
                adapter.addToList(model);
            }
        }
        storyAdapter.setList(storiesList);
        rvPosts.setAdapter(adapter);
        rvStories.setAdapter(storyAdapter);
        return view;
    }

    private void initStoriesFakeList() {
        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.img_ulan);
        images.add(R.drawable.img_ulan);
        storiesList.add(new StoriesModel(true));
        storiesList.add(new StoriesModel(images, false));
        storiesList.add(new StoriesModel(images, false));
        storiesList.add(new StoriesModel(images, false));
    }

    private void initFakeList() {
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
        list.add(new PostsModel("_as1rov", "Osh, Kyrgyzstan", "Жизнь ворам, смерть мусорам", 1, R.drawable.img_ulan));
    }
}