package android.com.example.customnavigation.Adapter;

import android.app.Activity;
import android.com.example.customnavigation.CircleTransform;
import android.com.example.customnavigation.Model.DataModel;
import android.com.example.customnavigation.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

public class DataAdapter extends ArrayAdapter<DataModel.Data> {
    Activity context;
    int resources;


    public DataAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.context = (Activity) context;
        this.resources =resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View v =layoutInflater.inflate(resources, null);
        ImageView image =v.findViewById(R.id.imageView);
        TextView txtName =v.findViewById(R.id.txtName);
        TextView txtRep= v.findViewById(R.id.txtRep);

        DataModel.Data data =getItem(position);
        Picasso.get().load(data.getImage()).into(image);

        txtName.setText(data.getName());
        txtRep.setText( data.getRep() +" REP");
        return v;
    }
}
