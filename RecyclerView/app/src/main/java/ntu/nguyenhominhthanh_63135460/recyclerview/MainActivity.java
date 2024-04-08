package ntu.nguyenhominhthanh_63135460.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> rycVData;

    RecyclerView recyclerViewLandScape;




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
        //3
        rycVData= getDataForRecyclerView();
        //4
        recyclerViewLandScape = findViewById(R.id.Recyclerland);
        //5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this, rycVData);
        recyclerViewLandScape.setAdapter(landScapeAdapter);

    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
       dsDuLieu.add(new LandScape( "anh1", "View dep"));
        dsDuLieu.add(new LandScape( "anh2", "View dep"));
        dsDuLieu.add(new LandScape( "anh3", "View dep"));
        dsDuLieu.add(new LandScape( "anh4", "View dep"));

return dsDuLieu;

    }
}