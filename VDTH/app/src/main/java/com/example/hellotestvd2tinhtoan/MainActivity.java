package com.example.hellotestvd2tinhtoan;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


    public void XuLiCong(View view){
// tìm điều khiển
        EditText btna = findViewById(R.id.edta);
        EditText btnb = findViewById(R.id.edtb);
        EditText btnKQ = findViewById(R.id.editTextText3);

        // lấy điều khiển chuyển về String

        String nutA = btna.getText().toString();
        String nutB = btnb.getText().toString();


        int DLA = Integer.parseInt(nutA);
        int DLB = Integer.parseInt(nutB);

        int tong = DLA + DLB;

        String ketqua = String.valueOf(tong);

        // in ra màn hình

        btnKQ.setText(ketqua);

    }

}