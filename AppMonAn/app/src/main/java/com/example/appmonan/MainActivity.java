package com.example.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

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

        ListView lvDSMonan = (ListView) findViewById(R.id.ListViewDSMA);
        // chuẩn bị dữ liệu
        ArrayList<MonAn> dsMonAn = new ArrayList<MonAn>();
        dsMonAn.add(new MonAn("Nấm Kim Chi", 25000, "Rất ngon", R.drawable.kimchi));
        dsMonAn.add(new MonAn("Gà Chiên Xù", 50000, "Favorite food of Thanh Bình", R.drawable.chickens));
        dsMonAn.add(new MonAn("Bắp", 25000, "Bắp Mỹ (Tho)", R.drawable.corn));
        dsMonAn.add(new MonAn("Thập Cẩm", 100000, "Mukbang đến tết", R.drawable.mukbang));
        dsMonAn.add(new MonAn("Pasta", 75000, "Thơm ngon mời bạn ăn nha", R.drawable.shrimp_pasta));


        MonAnAdapter adapter =  new MonAnAdapter(this, dsMonAn);
        lvDSMonan.setAdapter(adapter);


        // bắt xử lí sự kiện

        lvDSMonan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // lấy phần tử được chạm

                MonAn monAnchon = dsMonAn.get(position);

                Toast.makeText(MainActivity.this, monAnchon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}