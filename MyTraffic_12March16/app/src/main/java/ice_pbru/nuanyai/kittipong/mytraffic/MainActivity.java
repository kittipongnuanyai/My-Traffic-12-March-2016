package ice_pbru.nuanyai.kittipong.mytraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //2 Explicit --> access type name
    private ListView trafficListView;      //traffice + control space
    private Button aboutMeButton;


    @Override  //Method หลัก ทำก่อนเพื่อนเสมอ
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //3 Bind widget
        bindWidget(); //-->  shift control enter --> alt enter  --> create methhod

        //4 Button Controller
        buttonController();





    } //Main Method (สิ่งที่อยู่ใน method is statement จบด้วย ;)

    private void buttonController() {
        //Class obj = new class()
        aboutMeButton.setOnClickListener(new View.OnClickListener() {       //(new เว้นวรร control + space เลือก Oncl..  Enter
            @Override
            public void onClick(View v) {

                //Sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(),R.raw.mosquito);             //--> Control space --> shift command enter
                mediaPlayer.start();

                //Web View
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/DARpvEhULQc"));
                startActivity(intent);


            } //onClick
        });



    }   //ButtonController

    private void bindWidget() {

        //tra + enter = find + enter (R.id +cash to + completement
        trafficListView = (ListView) findViewById(R.id.listView);              // เลือก pacgage ของเรา  --> alt enter (cash tro) --> completment key
        aboutMeButton = (Button) findViewById(R.id.button);

    }


}   //Main Class


//1 หาขอบเขต
//2 Explicit
//3 Bind widget
//4 button controller


/*การทำ completment key  --> shift control enter for win
                        --> shift command enter for mac



*/