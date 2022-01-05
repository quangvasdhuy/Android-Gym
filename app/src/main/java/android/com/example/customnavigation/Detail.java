package android.com.example.customnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {
    Button btnVideo;
    ImageView imgDetail;
    TextView txtHuongDan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();

        String id = bundle.getString("id");
        String name = bundle.getString("name");
        String rep = bundle.getString("rep");
        String image = bundle.getString("picture");
        String description = bundle.getString("description");
        String video = bundle.getString("video");

        Log.v("test",video);
        txtHuongDan.setText(description);
//        Glide.with(this).load(image).into(imgDetail);

        initUI();
//        btnVideo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Detail.this, VideoActivity.class);
//                startActivity(intent);
//            }
//        });
    }

    private void initUI(){
        btnVideo = findViewById(R.id.btnPlay);
        imgDetail =findViewById(R.id.img_detail_ex);
        txtHuongDan = findViewById(R.id.txt_huongdan);
    }
}