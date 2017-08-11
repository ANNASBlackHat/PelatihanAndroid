package com.gitsolution.androidbeginner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set saat tombol diklik
        Button btnLogin = (Button) findViewById(R.id.button);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtUsername = (EditText) findViewById(R.id.editText2);
                EditText edtPswd = (EditText) findViewById(R.id.editText3);

                String username = edtUsername.getText().toString();
                String pswd = edtPswd.getText().toString();

                if(username.equals("amikom") && pswd.equals("amikom")){
                    Toast.makeText(MainActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
