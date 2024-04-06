package ntu.nguyenhominhthanh_63135460.tuontap;

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
import java.util.List;

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

        // tạo danh sách bài hat

        ArrayList<String> listbaihat = new ArrayList<String>();
        listbaihat.add("Hay Trao cho Anh");
        listbaihat.add("Dam Cuoi");


        ListView  lvdanhSachbaihatyeuthich = (ListView) findViewById(R.id.LVdsbaihat);


        ArrayAdapter<String> baihatAdapter = new ArrayAdapter<>( this, android.R.layout.simple_list_item_1, listbaihat);

        lvdanhSachbaihatyeuthich.setAdapter(baihatAdapter);

        lvdanhSachbaihatyeuthich.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giatri =     baihatAdapter.getItem(position);

                // ham hien thi
                Toast.makeText(MainActivity.this, giatri, Toast.LENGTH_SHORT).show();
            }
        });

    }
}