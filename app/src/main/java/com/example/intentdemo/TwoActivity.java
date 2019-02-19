package com.example.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View;
import android.widget.ImageButton;

public class TwoActivity extends AppCompatActivity {

    private ImageView supermoonPic;
    private ImageView waterfallPic;

    private int imageID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        supermoonPic = findViewById(R.id.supermoonID);
        waterfallPic = findViewById(R.id.waterfallID);

        supermoonPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I clicked supermoon", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.supermoon;
                finish();
            }

        });

        waterfallPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I clicked supermoon", Toast.LENGTH_SHORT).show();
                imageID = R.drawable.waterfall;
                finish();
            }
        });

//    protected void onClickListener(){
//        protected void finish(){
//            //intent i
//            //i.putExtras(r.string.... get ID of the images)
//            //setResult to OK;
//            //super.finish();
//        }

    }
        public void finish() {
                Intent i = new Intent();
                i.putExtra("imgId", imageID); //in second activity, should have an onclick listener on the pictures that when you click it, it turns that into some int
                setResult(RESULT_OK, i);
                super.finish();  //takes you back to main activity

            }

}
