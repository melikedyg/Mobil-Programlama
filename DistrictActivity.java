package tr.edu.medipol.ybs95170017;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class DistrictActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district);

        ListView lvList = findViewById(R.id.lvList);
        String[] districts = {"Kaş", "Manavgat", "Finike", "Alanya", "Kemer", "Aksu", "Demre", "Elmalı", "Kumluca", "Serik"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout
                .simple_list_item_1, android.R.id.text1, districts);
        lvList.setAdapter(adapter);
        lvList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Snackbar.make(findViewById(R.id.lvList), districts[i], Snackbar.LENGTH_LONG).setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(DistrictActivity.this, R.string.successful_selection, Toast.LENGTH_SHORT).show();
                    }
                }).show();
            }

        });

    }
}
