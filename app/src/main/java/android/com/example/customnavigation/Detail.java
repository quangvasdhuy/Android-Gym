package android.com.example.customnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {
    TextView tvTimer;
    Button  btnGo;
    private Boolean countIsActive = false;
    private CountDownTimer countDownTimer;
    Button btnVideo;
    ImageView imgDetail;
    TextView txtHuongDan;
    String video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

          initUI();
          Bundle bundle = getIntent().getExtras();
//
//        String id = bundle.getString("id");
//        String name = bundle.getString("name");
//        String rep = bundle.getString("rep");
          String image = bundle.getString("picture");
          String description = bundle.getString("description");
          video = bundle.getString("video");
//

          txtHuongDan.setText(description);
          Glide.with(this).load(image).into(imgDetail);
    }

    public void resertTimer(){
        tvTimer.setText("0:30");
        countDownTimer.cancel();

        btnGo.setText("Go");
        countIsActive = false;
    }

    private void initUI(){
        btnVideo = findViewById(R.id.btnPlay);
        imgDetail =findViewById(R.id.img_detail_ex);
        txtHuongDan = findViewById(R.id.txt_huongdan);
        tvTimer = findViewById(R.id.tvCountDown);
        btnGo = findViewById(R.id.btn_go);

    }

    public void ShowVideo(View view) {
        Intent intent = new Intent(Detail.this, VideoActivity.class);
        intent.putExtra("linkvideo",video);
        startActivity(intent);
    }

    public void StartTime(View view) {
        if(countIsActive){
            resertTimer();
        }else {
            countIsActive = true;
            btnGo.setText("Stop");
            countDownTimer = new CountDownTimer(30000, 1000) {
                @Override
                public void onTick(long l) {
                    updataTimer((int) l / 1000);
                }

                @Override
                public void onFinish() {
                    resertTimer();
                }
            }.start();
        }
    }

    private void updataTimer(int secondsLeft) {
        int minutes = secondsLeft / 60;
        int seconds = secondsLeft - (minutes * 60);
        String secondString = Integer.toString(seconds);
        if (seconds <= 9){
            secondString = "0" + secondString;
        }
        tvTimer.setText(Integer.toString(minutes) + ":" + secondString);
    }
}