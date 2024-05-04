package ntu.nguyenhominhthanh_63135460.chuyenmanhinhvoiintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //cach 2

        //xay dung bo lang nghe va xu li
        //ta co the lam theo cach giong mainActivity


        // cach khac
        //tim doi tuong can gan bo lang nghe

        Button btnManHinh2 = findViewById(R.id.btnMH2);
        //gan bo lang nghe
        btnManHinh2.setOnClickListener(BoLangNgheChuyenMH);
        //code ngay duoi

    }

    //code o day

    View.OnClickListener BoLangNgheChuyenMH = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
        //xu li cu the o day
            //1 tao thu
            Intent thuKichHoatMH1 = new Intent(MainActivity2.this, MainActivity.class);

            //khong doi phan hoi
            startActivity(thuKichHoatMH1);
        }
    };


}