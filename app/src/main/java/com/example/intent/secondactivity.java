package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.net.URI;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        TextView tv=findViewById(R.id.title);
        Button but1=findViewById(R.id.but1);
        Button but2=findViewById(R.id.but2);

        Bundle extra=getIntent().getExtras();

        if(extra!=null){
            String name=extra.getString("KEY");

            if(name!=null && name.isEmpty()){
                tv.setText("hello guest");
            }
            else {
                tv.setText("hello "+name+" !");
            }

        }

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri=Uri.parse("https://www.google.co.in/");
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(uri);
                startActivity(intent);
            }
        });

    }
}