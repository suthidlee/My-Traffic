package saelee.suthida.mytraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    }

    private void buttonController() {
     aboutMeButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             //Sound Effect
             MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.dog);
             mediaPlayer.start();


         }// onClick
     });
    }

}//Main Class นี่คือ คลาสหลัก
