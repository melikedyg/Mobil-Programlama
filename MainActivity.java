package tr.edu.medipol.ybs95170017;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("ANTALYA");
        ImageView ivWeather = findViewById(R.id.ivWeather);
        Glide.with(this).load("https://www.mgm.gov.tr/sunum/tahmin-klasik-5070.aspx?m=ANTALYA&basla=1&bitir=5&rC=111&rZ=fff").into(ivWeather);

        Button btnPhoto = findViewById(R.id.btnPhoto);
        btnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PhotosActivity.class));
            }
        });
        Button btnDistrict = findViewById(R.id.btnDistrict);
        btnDistrict.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DistrictActivity.class));
            }
        });
        Button btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), WebViewActivity.class);
                intent.putExtra("connect", "http://www.antalya.gov.tr/");
                startActivity(intent);

            }
        });


    }
}