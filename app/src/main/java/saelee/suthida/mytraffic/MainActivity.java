package saelee.suthida.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    //Explicit
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget

        bindWidget();
    }//Main Method

    private void bindWidget() {

        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.button);

        //Button Controller
        buttonController();

        //Create ListView
        createListView();
    }

    private void createListView() {

        final int[] intIcon = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03,
                R.drawable.traffic_04, R.drawable.traffic_05, R.drawable.traffic_06,
                R.drawable.traffic_07, R.drawable.traffic_08, R.drawable.traffic_09,
                R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15,
                R.drawable.traffic_16, R.drawable.traffic_17, R.drawable.traffic_18,
                R.drawable.traffic_19, R.drawable.traffic_20};
        // กำหนดตัวแปร String รูปแบบที่ 1

        final String[] titleStrings = new String[20];
        // กำหนดตัวแปร String รูปแบบที่ 2
        titleStrings[0] = "หัวข้อหลัก 1";
        titleStrings[1] = "หัวข้อหลัก 2";
        titleStrings[2] = "หัวข้อหลัก 3";
        titleStrings[3] = "หัวข้อหลัก 4";
        titleStrings[4] = "หัวข้อหลัก 5";
        titleStrings[5] = "หัวข้อหลัก 6";
        titleStrings[6] = "หัวข้อหลัก 7";
        titleStrings[7] = "หัวข้อหลัก 8";
        titleStrings[8] = "หัวข้อหลัก 9";
        titleStrings[9] = "หัวข้อหลัก 10";
        titleStrings[10] = "หัวข้อหลัก 11";
        titleStrings[11] = "หัวข้อหลัก 12";
        titleStrings[12] = "หัวข้อหลัก 13";
        titleStrings[13] = "หัวข้อหลัก 14";
        titleStrings[14] = "หัวข้อหลัก 15";
        titleStrings[15] = "หัวข้อหลัก 16";
        titleStrings[16] = "หัวข้อหลัก 17";
        titleStrings[17] = "หัวข้อหลัก 18";
        titleStrings[18] = "หัวข้อหลัก 19";
        titleStrings[19] = "หัวข้อหลัก 20";


        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,
                intIcon, titleStrings, detailStrings);
        trafficListView.setAdapter(myAdapter);


        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("image", intIcon[i]);
                intent.putExtra("index", i);
                startActivity(intent);


            }   // onItemClick
        });



    }// CreateListView


    private void buttonController() {
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Sound Effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.dog);

                mediaPlayer.start();

                //Webview
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/1ttFmtm8K54"));
                startActivity(intent);


            }// onClick
        });
    }

}//Main Class นี่คือ คลาสหลัก
