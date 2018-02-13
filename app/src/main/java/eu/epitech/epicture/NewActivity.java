package eu.epitech.epicture;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
public class NewActivity extends Activity {


    private ArrayList<ImageContener> imageList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        imageList = MainActivity.favoriteList;

        LinearLayout layout = findViewById(R.id.linear);
        for (int i = 0; i < imageList.size(); i++) {
            ImageView imageView = new ImageView(this);
            imageView.setId(i);
            imageView.setImageBitmap(imageList.get(i).getPhoto());
            layout.addView(imageView);
        }

    }
}
