package android.com.example.customnavigation;

import static android.com.example.customnavigation.RetrofitClient.getRetrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.com.example.customnavigation.Adapter.DataAdapter;
import android.com.example.customnavigation.InterfaceResponsitory.Methods;
import android.com.example.customnavigation.Model.DataModel;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListExerciseActivity extends AppCompatActivity {
    ImageView imageView;
    ListView listView;
    DataAdapter dataAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_exercise);

        listView = findViewById(R.id.listViewAdvance);
        imageView = findViewById(R.id.imageView);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Methods methods = getRetrofit().create(Methods.class);
        Call<DataModel> call = methods.getProduct();
        call.enqueue(new Callback<DataModel>() {
            @Override
            public void onResponse(Call<DataModel> call, Response<DataModel> response) {
                List<DataModel.Data> data = response.body().getData();
                dataAdapter = new DataAdapter(ListExerciseActivity.this, R.layout.data_item);
                for (DataModel.Data dt : data) {
                    dataAdapter.add(new DataModel.Data(dt.getId(), dt.getRep(), dt.getName(), dt.getDescription(), dt.getImage(),dt.getLinkVideo()));
                }
                listView.setAdapter(dataAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(ListExerciseActivity.this, Detail.class);
                        intent.putExtra("id", dataAdapter.getItem(position).getId());
                        intent.putExtra("name", dataAdapter.getItem(position).getName());
                        intent.putExtra("rep", dataAdapter.getItem(position).getRep());
                        intent.putExtra("description", dataAdapter.getItem(position).getDescription());
                        intent.putExtra("picture", dataAdapter.getItem(position).getImage());
                        intent.putExtra("video", dataAdapter.getItem(position).getLinkVideo());
                        startActivity(intent);

                    }
                });
            }

            @Override
            public void onFailure(Call<DataModel> call, Throwable t) {

            }
        });
    }
}