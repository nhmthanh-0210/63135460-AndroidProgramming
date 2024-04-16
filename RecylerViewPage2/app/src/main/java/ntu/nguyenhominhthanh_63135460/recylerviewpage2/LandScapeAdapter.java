package ntu.nguyenhominhthanh_63135460.recylerviewpage2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter< LandScapeAdapter.ItemLandhoder> {


    Context context;
    ArrayList<LandScape> lstData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lstData) {
        this.context = context;
        this.lstData = lstData;
    }



    @NonNull
    @Override
    public ItemLandhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land, parent, false);
        ItemLandhoder viewhoderCreated = new ItemLandhoder(vItem);
        return viewhoderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandhoder holder, int position) {
            // lay  doi tuong hien thi
    LandScape landScapeHienThi =  lstData.get(position);
    //trich thong tin

        String caption = landScapeHienThi.getLandCation();
        String tenAnh = landScapeHienThi.getLandImageFileName();
        // dat vao cac truong thong tin cua holder
        holder.tvCaption.setText(caption);

        // dat anh
            String packageName = holder.itemView.getContext().getPackageName();
            int imageID = holder.itemView.getResources().getIdentifier(tenAnh, "mipmap", packageName);
            holder.imViewLandScape.setImageResource(imageID);


    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ItemLandhoder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tvCaption;
        ImageView imViewLandScape;


        public ItemLandhoder(@NonNull View itemView) {
            super(itemView);

            tvCaption= itemView.findViewById(R.id.textViewcation);
            imViewLandScape = itemView.findViewById(R.id.imageViewland);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
        //code o day
            int viTriDuocClick = getAdapterPosition();
            LandScape phanTuDuocClick =  lstData.get(viTriDuocClick);
            // boc thong tin
            String ten = phanTuDuocClick.getLandCation();
            String tenFile = phanTuDuocClick.getLandImageFileName();
            //Toast

            String Chuoithongbao = "Ban vua click vao : " + ten;

            Toast.makeText(v.getContext(), Chuoithongbao,Toast.LENGTH_SHORT).show();
        }
    }
}
