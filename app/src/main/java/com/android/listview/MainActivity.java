package com.android.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;


import com.android.listview.databinding.ActivityMainBinding;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int[] imageId = {R.drawable.orange,R.drawable.cherry,R.drawable.banana,R.drawable.apple,R.drawable.kiwi,
                R.drawable.pear,R.drawable.strawberry,R.drawable.lemon,R.drawable.peach,R.drawable.apricot};
        String[] name = {"001","002","003","004","005","006","007","008","009","010"};
        String[] lastMessage = {"This is delicious","I like it","Umm Yummy","You like that?","Wow, i like it",
                "Delicious","Sweet","I like it","Woww","This is delicious"};
        String[] lastmsgTime = {"47 Calories","50 Calories","89 Calories","52 Calories","61 Calories",
                "57 Calories","33 Calories","29 Calories","39 Calories","48 Calories"};
        String[] phoneNo = {"Orange","Cherry","Banana","Apple","Kiwi",
                "Pear","Strawberry","Lemon","Peach","Apricot"};
        String[] country = {"This is delicious","I like it","Umm Yummy","You like that?","Wow, i like it",
                "Delicious","Sweet","I like it","Woww","This is delicious"};

        ArrayList<User> userArrayList = new ArrayList<>();

        for(int i = 0;i< imageId.length;i++){

            User user = new User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i], country[i],imageId[i]);
            userArrayList.add(user);

        }


        ListAdapter listAdapter = new ListAdapter(MainActivity.this,userArrayList);

        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent(MainActivity.this,UserActivity.class);
                i.putExtra("name",name[position]);
                i.putExtra("phone",phoneNo[position]);
                i.putExtra("country",country[position]);
                i.putExtra("imageid",imageId[position]);
                startActivity(i);

            }
        });

    }
}