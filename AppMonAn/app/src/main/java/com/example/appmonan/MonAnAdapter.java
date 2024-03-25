package com.example.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {


        private ArrayList<MonAn> dsMonAn;
        private LayoutInflater layoutInflater;
        private Context context;

    // hàm tạo

// lay outflater sẽ lấy từ hệ thống.


    public MonAnAdapter( Context _context, ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        // sử dụng phương thức tĩnh
        this.layoutInflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return dsMonAn.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // view hiện hành
        View viewHienHanh = convertView;

        // kiểm tra
        if (viewHienHanh == null)
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan, null);
                    // lấy dữ liệu

        MonAn monAnhientai = dsMonAn.get(position);
        // gắn lên các điều khiển

        // Tìm điều khiển
        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.TenmonAn);
        TextView textView_DonGia = (TextView) viewHienHanh.findViewById(R.id.iddonGia);
        TextView textView_Mota = (TextView) viewHienHanh.findViewById(R.id.idmota);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.idAnhDD);

        // set lên
        textView_TenMon.setText(monAnhientai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnhientai.getDonGia()));
        textView_Mota.setText(monAnhientai.getMoTaMonAn());
        imageView_Anh.setImageResource(monAnhientai.getIdAnhdaidien());

        return viewHienHanh;
    }
}
