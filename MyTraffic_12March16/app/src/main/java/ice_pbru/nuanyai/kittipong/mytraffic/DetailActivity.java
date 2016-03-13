package ice_pbru.nuanyai.kittipong.mytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titileTextView, detailTextView;
    private ImageView trafficImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind widget
        bindWidget();

        //show view
        showView();



    }   //Main Method

    private void showView() {
        String strTitle = getIntent().getStringExtra("Title");
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        int intIndex = getIntent().getIntExtra("Index", 0);

        titileTextView.setText(strTitle);
        trafficImageView.setImageResource(intIcon);

        String[] strDetail = getResources().getStringArray(R.array.traffic_detail);
        detailTextView.setText(strDetail[intIndex]);


    }   //showView

    private void bindWidget() {

        titileTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);


    }

}   //Main Class
