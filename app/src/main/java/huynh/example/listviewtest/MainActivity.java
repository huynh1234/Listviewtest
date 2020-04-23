package huynh.example.listviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button Login;
    Intent intent = new Intent(MainActivity.this,DangNhap.class);
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Login = (Button)findViewById(R.id.DangNhap);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogLogin();
            }
        });
    }
    private void DialogLogin(){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_custom);
        // anh xa
        final EditText edtUsername = (EditText)dialog.findViewById(R.id.edittextUsername);
        final EditText edtPassword = (EditText)dialog.findViewById(R.id.edittextPassword);
        Button DongY = (Button)dialog.findViewById(R.id.buttonDongY);
        Button Huy = (Button)dialog.findViewById(R.id.buttonHuy);

        DongY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Ussname = edtUsername.getText().toString();
                String Password = edtPassword.getText().toString();
                if(Ussname.equals("huynh") && Password.equals("huynh123")){
                    // chuyen man hinh

                    startActivity(intent);
                }else {
                    Toast.makeText(MainActivity.this, "Sai Mk", Toast.LENGTH_SHORT).show();
                }
            }
        });
        Huy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });





//ádasdfsdfasdf
        //ádfasdfasdfasdfsa
//ádfasdfasdf


        dialog.show();

    }
}
