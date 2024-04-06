package com.example.listview;

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

        //hiển thị dữ liệu lên list View
        //b1: chuẩn bị nguồn dữ liệu: (tạo sẵn (hard code) ,  lấy từ tệp, or csdl)

        ArrayList<String> nguonDuLieu = new ArrayList<String>();

        nguonDuLieu.add("Một Triệu Like");
        nguonDuLieu.add("Hãy Trao Cho Anh");
        nguonDuLieu.add("Thanh Xuân");
        nguonDuLieu.add("Ban doi");

        // b2 tìm tham chiếu đến list View

        ListView listViewBH = (ListView) findViewById(R.id.lvDanhSachBaiHat);


        //B3 tạo adapter

        ArrayAdapter<String> baihat_Adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                nguonDuLieu);

        //b4 gắn và nạp dữ liệu vào  ListView

        listViewBH.setAdapter(baihat_Adapter);


// xử lí sự kiện thêm

        listViewBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // position là vị trí của Item đc Click trên List View

                // lấy giá trị của Item vừa click
                String value = baihat_Adapter.getItem(position);
                // xử lí khác theo yêu cầu


                // hàm hiện thông báo đã chọn một bài hát
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_LONG).show();

            }
        });


    }
}