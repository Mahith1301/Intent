package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        EditText editText=findViewById(R.id.edittext);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText.getText().toString();
                if(name.isEmpty()){
                    Toast.makeText(MainActivity.this, "enter name ", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(getApplicationContext(),secondactivity.class);
                    String NAME_LABEL;
                    intent.putExtra("KEY",name);
                    startActivity(intent);

                }
            }
        });

    }
}