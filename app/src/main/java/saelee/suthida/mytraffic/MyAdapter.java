package saelee.suthida.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Test on 13/3/2559.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit ประกาศตัวแปร
    private Context context;
    private int[] iconInts;
    private String [] titleStrings, datailStrings;

    public MyAdapter(Context context, int[] iconInts, String[] titleStrings, String[] dataStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
        this.datailStrings = dataStrings;
    }   // Construtor

    @Override
    public int getCount() {
        return iconInts.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.traffic_listview, viewGroup, false);

        // for Icon
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        //for Title
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        //for Detail
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView3);
        detailTextView.setText(datailStrings[i]);

        return view1;
    }
}   // Main Class
