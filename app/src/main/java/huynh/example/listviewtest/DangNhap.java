package huynh.example.listviewtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DangNhap extends AppCompatActivity {


    ListView lvTraiCay;
    ArrayList<TraiCay> arrayTraiCay;
    TraiCayAdater adater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);


        Anhxa();
        adater = new TraiCayAdater(this,R.layout.dong_trai_cay,arrayTraiCay);
        lvTraiCay.setAdapter(adater);

        lvTraiCay.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                XacNhanXoa(position);


                return false;
            }
        });
    }
    private void  XacNhanXoa(final int possition){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Thong Bao");
        alertDialog.setIcon(R.mipmap.ic_launcher);
        alertDialog.setMessage("ban co mon xoa !!! ");

       alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                arrayTraiCay.remove(possition);
                adater.notifyDataSetChanged();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.show();
    }
    private void Anhxa(){
        lvTraiCay = (ListView)findViewById(R.id.listviewTraiCay);
        arrayTraiCay = new ArrayList<>();
        arrayTraiCay.add(new TraiCay("Dau Tay","Dau tay ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Dua Sap","Dua Sap ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Mang Cut","Mang Cut ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Thanh Long","Thanh Long ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Xoai Cat","Xoai Cat ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Xoai Cat","Xoai Cat ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Xoai Cat","Xoai Cat ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Xoai Cat","Xoai Cat ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Xoai Cat","Xoai Cat ngon so 1 ",R.drawable.dautay));
        arrayTraiCay.add(new TraiCay("Xoai Cat","Xoai Cat ngon so 1 ",R.drawable.dautay));
    }

}
