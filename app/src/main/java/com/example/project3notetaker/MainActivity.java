package com.example.project3notetaker;

import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {


    Button btnAdd;
    EditText txtContent;

    LinearLayout list;
    LayoutInflater layoutInflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        txtContent = findViewById(R.id.txtContent);
        list = findViewById(R.id.list);
        layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                View myview = layoutInflater.inflate(R.layout.note_added, null, false);
                EditText text = myview.findViewById(R.id.editedText);
                text.setText(txtContent.getText());
                list.addView(myview);
                ((EditText) findViewById(R.id.txtContent)).getText().clear();
            }
        });
    }


}
