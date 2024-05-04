package ntu.nguyenhominhthanh_63135460.chuyenmanhinhvoiintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    public void ChuyenSangMH2(View v){
    /// 1. tao doi tuong intent
        Intent thuKichHoatMH2 ;


        //phai co 2 tham so, tham so 2 la man hinh chuyen toi(.class)
        thuKichHoatMH2 = new Intent(MainActivity.this, MainActivity2.class);


        //gui thu ma khong doi phan hoi
        startActivity(thuKichHoatMH2 );


    }
}