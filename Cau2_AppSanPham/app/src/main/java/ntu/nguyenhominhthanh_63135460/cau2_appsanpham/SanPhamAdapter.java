package ntu.nguyenhominhthanh_63135460.cau2_appsanpham;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SanPhamAdapter extends BaseAdapter {

    private ArrayList<SanPham> dsSanPham;
    private LayoutInflater layoutInflater;
    private Context context;

    public SanPhamAdapter( Context __context, ArrayList<SanPham> dsSanPham) {
        this.dsSanPham = dsSanPham;
        this.context = __context;
        this.layoutInflater = LayoutInflater.from(__context);
    }

    @Override
    public int getCount() {
        return dsSanPham.size();
    }

    @Override
    public Object getItem(int position) {
        return dsSanPham.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewHienHanh = convertView;

        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_sanpham, null);

        SanPham sanPhamhientai = dsSanPham.get(position);

        TextView textView_TenSanPham = (TextView) viewHienHanh.findViewById(R.id.TenSanPham);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.iddonGia);
        TextView textView_Mota = (TextView) viewHienHanh.findViewById(R.id.idmota);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.idAnhDaiDienxml);

        textView_TenSanPham.setText(sanPhamhientai.getTenSanPham());
        textView_DonGia.setText(String.valueOf(sanPhamhientai.getDonGia()));
        textView_Mota.setText(sanPhamhientai.getMoTaSanPham());
        imageView_Anh.setImageResource(sanPhamhientai.getIdAnhdaidien());

        return viewHienHanh;
    }
}
