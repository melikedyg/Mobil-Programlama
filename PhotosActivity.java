package tr.edu.medipol.ybs95170017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PhotosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photos);
        final ImageView ivImageView = new ImageView(this);
        ivImageView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        LinearLayout llPhotos = findViewById(R.id.llPhotos);

        ArrayList photos = new ArrayList();
        photos.add("https://gezipgordum.com/wp-content/uploads/2019/04/Manavgat-Selalesi.webp");
        photos.add("https://gezipgordum.com/wp-content/uploads/2019/04/Aspendos-Antik-Tiyatro.webp");
        photos.add("https://www.goturkeytourism.com/assets/img/hadrians-gate-antalya.jpg");
        photos.add("https://marcopoloturkey.com/wp-content/uploads/2018/10/Perge_Aspendos_and_Side_Tour-990x699.png");
        photos.add("https://indigodergisi.com/wp-content/uploads/2016/11/konyaalti-plaji-ihale-cikiyor-4-620x343.jpg");

        String[] photoName = {"Manavgat Waterfall", "Aspendos Antique Theater",
                "Hadrian's Gate", "Perge Ancient City", "Konyaalti Beach"};
        for (int i = 0; i < photos.size(); i++) {
            if (llPhotos != null) {
                final ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                TextView txt = new TextView(this);
                txt.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                txt.setText(photoName[i]);
                txt.setTextSize(25);
                Glide.with(PhotosActivity.this).load(photos.get(i)).into(imageView);
                llPhotos.addView(txt);
                llPhotos.addView(imageView);
                switch (i) {
                    case 0:
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                                intent.putExtra("connect", photos.get(0).toString());
                                startActivity(intent);
                            }
                        });
                        break;
                    case 1:
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                                intent.putExtra("connect", photos.get(1).toString());
                                startActivity(intent);
                            }
                        });
                        break;
                    case 2:
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                                intent.putExtra("connect", photos.get(2).toString());
                                startActivity(intent);
                            }
                        });
                        break;
                    case 3:
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                                intent.putExtra("connect", photos.get(3).toString());
                                startActivity(intent);
                            }
                        });
                        break;
                    case 4:
                        imageView.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                                intent.putExtra("connect", photos.get(4).toString());
                                startActivity(intent);
                            }
                        });
                        break;

                }

            }


        }
    }
}