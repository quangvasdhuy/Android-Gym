package android.com.example.customnavigation.fragment;

import android.com.example.customnavigation.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HistoryFragment extends Fragment {
    Button btnTDEE;
    TextView tvTDEE;
    Spinner spinner, spinner1;
    EditText edtChieuCao, edtCanNang, edtTuoi;
    ArrayAdapter<CharSequence> adapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history, container, false);
        edtChieuCao =view.findViewById(R.id.edtChieuCao);
        edtCanNang =view.findViewById(R.id.edtCanNang);
        edtTuoi =view.findViewById(R.id.edtTuoi);
        btnTDEE=view.findViewById(R.id.btnTDEE);
        tvTDEE =view.findViewById(R.id.tvTDEE);

        spinner =(Spinner)view.findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Group_Name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinner1=(Spinner)view.findViewById(R.id.spinner1);
        adapter =ArrayAdapter.createFromResource(getActivity(), R.array.Gioi_Tinh, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnTDEE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weitght1;
                double heitght1;
                double Tuoi;
                double tdee;
                if (edtChieuCao.getText().toString().equals("") || edtCanNang.getText().toString().equals("")) {
                    Toast.makeText(getActivity(), "Hãy Nhập Giá Trị", Toast.LENGTH_LONG).show();
                } else {
                    weitght1 = Double.parseDouble(edtCanNang.getText().toString());
                    heitght1 = Double.parseDouble(edtChieuCao.getText().toString());
                    Tuoi = Double.parseDouble(edtTuoi.getText().toString());


                    if (spinner.getSelectedItemPosition() == 0 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.2;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    } else if (spinner.getSelectedItemPosition() == 0 && spinner1.getSelectedItemPosition() == 1) {
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.2;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }
                    if (spinner.getSelectedItemPosition() == 1 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.375;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    } else if (spinner.getSelectedItemPosition() == 1 && spinner1.getSelectedItemPosition() == 1) {
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.375;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }
                    if (spinner.getSelectedItemPosition() == 2 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.55;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }else if (spinner.getSelectedItemPosition() == 2 && spinner1.getSelectedItemPosition() == 1){
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.55;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }
                    if (spinner.getSelectedItemPosition() == 3 && spinner1.getSelectedItemPosition() == 0){
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.725;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }else if (spinner.getSelectedItemPosition() == 3 && spinner1.getSelectedItemPosition() == 1){
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.725;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }
                    if (spinner.getSelectedItemPosition() == 4 && spinner1.getSelectedItemPosition() == 0) {
                        tdee = ((13.387 * weitght1) + (4.799 * heitght1) - (5.677 * Tuoi) + 88.362) * 1.9;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }else if (spinner.getSelectedItemPosition() == 4 && spinner1.getSelectedItemPosition() == 1){
                        tdee =((9.247 * weitght1) + (3.098 * heitght1) - (4.330 * Tuoi) + 447.593) * 1.9;
                        tdee = Math.round(tdee*10)/10;
                        tvTDEE.setText(String.valueOf(tdee));
                    }
                }
            }
        });
        return view;
    }
}
