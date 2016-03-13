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

        // Create ListView
        createListView();





    } //Main Method (สิ่งที่อยู่ใน method is statement จบด้วย ;)

    private void createListView() {


        int[] intIcon = {R.drawable.traffic_01 ,R.drawable.traffic_02, R.drawable.traffic_03 ,R.drawable.traffic_04 ,R.drawable.traffic_05,
                        R.drawable.traffic_06 ,R.drawable.traffic_07, R.drawable.traffic_08 ,R.drawable.traffic_09 ,R.drawable.traffic_10,
                        R.drawable.traffic_11 ,R.drawable.traffic_12, R.drawable.traffic_13 ,R.drawable.traffic_14 ,R.drawable.traffic_15,
                        R.drawable.traffic_16 ,R.drawable.traffic_17, R.drawable.traffic_18 ,R.drawable.traffic_19 ,R.drawable.traffic_20,};


        String[] titleStrings = new String[20];
        titleStrings[0] = "ห้ามเลี้ยวซ้าย";
        titleStrings[1] = "ห้ามเลี้ยวขวา";
        titleStrings[2] = "ให้ตรงไป";
        titleStrings[3] = "เลี้ยวขวา";
        titleStrings[4] = "เลี้ยวซ้าย";
        titleStrings[5] = "ทางออก";
        titleStrings[6] = "ทางเข้า";
        titleStrings[7] = "ทางออก";
        titleStrings[8] = "หยุดรถ";
        titleStrings[9] = "จำกัดความสูง 2.5 เมตร";
        titleStrings[10] = "เลี้ยวซ้ายขวา";
        titleStrings[11] = "ห้ามกลับรถ";
        titleStrings[12] = "ห้ามจอด";
        titleStrings[13] = "รถสวน";
        titleStrings[14] = "ห้ามแซง";
        titleStrings[15] = "ทางโค้ง";
        titleStrings[16] = "โปรดหยุดรถ";
        titleStrings[17] = "จำกัดความเร็ว 50km/hr";
        titleStrings[18] = "จำกัดความกล้าง 2.5 เมตร";
        titleStrings[19] = "จำกัดความสูง 5 เมตร";


        String[] detailStrings = getResources().getStringArray(R.array.detail_short);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, intIcon, titleStrings, detailStrings);
        trafficListView.setAdapter(myAdapter);


        //








    }   //CreateListView


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